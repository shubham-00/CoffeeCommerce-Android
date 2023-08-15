package com.example.coffeecommerce20;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ListItemHolder> {
    private List<Product> mProductList;

    public ProductAdapter(List<Product> productList) {
        this.mProductList = productList;
    }

    @NonNull
    @Override
    public ProductAdapter.ListItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return new ProductAdapter.ListItemHolder(layoutInflater, parent);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ListItemHolder holder, int position) {
        Product product = mProductList.get(position);

        Context myContext = holder.itemView.getContext();

        // all the code to make individual product interactive
        holder.mTitle.setText(product.getTitle());
        holder.mPrice.setText(product.getPrice().toString());
        holder.mButton1.setText("Add to cart");
        holder.mCount.setVisibility(View.GONE);
        holder.mButton2.setVisibility(View.GONE);
        int resid = myContext.getResources().getIdentifier(product.getThumbnail(), "drawable", myContext.getPackageName());
        holder.mThumbnail.setImageResource(resid);

        // Listener for mButton1
        holder.mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // if the count is 0, then increment it.
                if (product.getCount() == 0) {
                    product.setCount(product.getCount() + 1);

                    // Set buttons to - and +
                    holder.mButton1.setText("-");
                    holder.mButton2.setText("+");
                    holder.mCount.setText("" + product.getCount());

                    // Display count and button2
                    holder.mCount.setVisibility(View.VISIBLE);
                    holder.mButton2.setVisibility(View.VISIBLE);
                }

                // if the count is >0, then decrement it.
                else {
                    product.setCount(product.getCount() - 1);

                    // if the counter is 0
                    if (product.getCount() == 0) {
                        // then change button text, and visibility
                        holder.mButton1.setText("Add to cart");

                        holder.mCount.setVisibility(View.GONE);
                        holder.mButton2.setVisibility(View.GONE);
                    }
                    else {
                        // update the counter
                        holder.mCount.setText("" + product.getCount());
                    }
                }
            }
        });

        // Listener for mButton2
        holder.mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                product.setCount(product.getCount() + 1);
                holder.mCount.setText("" + product.getCount());
            }
        });
    }

    @Override
    public int getItemCount() {
        return mProductList.size();
    }

    public class ListItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView mTitle;
        TextView mPrice;
        ImageView mThumbnail;
        Button mButton1;
        Button mButton2;
        TextView mCount;

        public ListItemHolder(LayoutInflater layoutInflater, ViewGroup parent) {
            super(layoutInflater.inflate(R.layout.product, parent, false));

            mTitle = itemView.findViewById(R.id.title);
            mPrice = itemView.findViewById(R.id.price);
            mThumbnail = itemView.findViewById(R.id.thumbnail);
            mButton1 = itemView.findViewById(R.id.button1);
            mButton2 = itemView.findViewById(R.id.button2);
            mCount = itemView.findViewById(R.id.count);

            // itemView.setClickable(true);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            Context c = view.getContext();

            Product passProduct = mProductList.get(getAdapterPosition());

            Intent i = new Intent(c, ProductDisplayActivity.class);

            i.putExtra("thumbnail", passProduct.getThumbnail());
            i.putExtra("title", passProduct.getTitle());
            i.putExtra("price", passProduct.getPrice());
            i.putExtra("count", passProduct.getCount());
            i.putExtra("description", passProduct.getDescription());

            c.startActivity(i);
        }
    }
}
