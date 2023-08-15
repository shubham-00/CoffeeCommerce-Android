package com.example.coffeecommerce20;

import java.util.ArrayList;
import java.util.List;

public class ProductSingleton {
    private final List<Product> mProductList = new ArrayList<>();
    private static ProductSingleton mProductSingleton;
    public static ProductSingleton getProductSingleton() {
        if (mProductSingleton == null) {
            mProductSingleton = new ProductSingleton();
        }
        return mProductSingleton;
    }
    private ProductSingleton () {
        Product p1 = new Product();
        p1.setThumbnail("makita");
        p1.setTitle("MELITTA Traditional Medium Roast Coffee");
        p1.setPrice("$17.97");
        p1.setCount(0);
        p1.setDescription("MEDIUM ROAST COFFEE: Complex, deep full flavour with smoky overtones yet delightfully smooth\n" +
                "GROUND COFFEE: 930 g of ground coffee blended with 100% premium coffee beans from the world's best coffee producing regions\n" +
                "100% PREMIUM ARABICA BEANS: Blended with 100% high grown Arabica coffee beans from the world's best coffee producing regions, this coffee is whole bean to release the best coffee flavour\n" +
                "MELITTA COFFEE: MELITTA offers a truly world-class collection of premium coffees each distinctively rich, uniquely flavourful, and velvety smooth. This coffee is Kosher certified\n" +
                "MELITTA: Compare premium MELITTA coffee to other pantry essentials, including Keurig K-Cups and other coffee pods, ground coffee, organic coffee, dark roast coffee and organic coffee grounds\n" +
                "COMMITTED TO SUSTAINABILITY: MELITTA makes an annual donation to American Forests Global ReLeaf ecosystem restoration projects to fund the replenishment of trees used in the production of its filters\n" +
                "BUILT ON QUALITY: The MELITTA Company was founded in 1908, after Melitta Bentz grew tired of the bitterness and troublesome grounds in her coffee. Since then, we have continued to build on our values of quality, innovation and great taste\n");
        mProductList.add(p1);

        Product p2 = new Product();
        p2.setThumbnail("mccafe");
        p2.setTitle("McCafé Premium Medium Dark Roast");
        p2.setPrice("$30.35");
        p2.setCount(0);
        p2.setDescription("ROAST: This blend is roasted slightly darker than medium, which yields a balanced flavour and rich aroma.\n" +
                "TASTE: Enjoy the taste of McCafé in the comfort of your own home. McCafé Premium Roast coffee has a rich aroma, smooth body and clean finish.\n" +
                "QUALITY: McCafé Premium Roast coffee beans are 100% ethically sourced from Rainforest Alliance Certified farms, which means our beans are grown and harvested with great respect and care for people, wildlife and the environment.\n" +
                "QUANTITY: With the purchase of this McCafé Premium Roast product, you’ll receive 48 K-Cup pods made specifically for Keurig coffee makers.\n");
        mProductList.add(p2);

        Product p3 = new Product();
        p3.setThumbnail("tim");
        p3.setTitle("Tim Hortons Original Coffee blend");
        p3.setPrice("$29.99");
        p3.setCount(0);
        p3.setDescription("Medium Roast: 48 Keurig K-Cup pods of our Original coffee, expertly roasted to deliver a perfectly balanced flavor with a smooth finish.\n" +
                "Compatible with Keurig: our capsules are made for use with Keurig single-serve coffee Brewers\n" +
                "Top-quality beans: we only use 100% Arabica beans that are carefully selected by our experts to consistently deliver the best blend possible\n" +
                "Doing our part: K-Cup Pods Recyclable In Select Locations\n" +
                "Cup of Canada: Whether you like a dark roast, a classic cup of tea, or the rich flavor of french vanilla, we have a wide variety of coffee, tea, and specialty beverages that feature our signature flavors, ready for you to enjoy any time of day.\n");
        mProductList.add(p3);

        Product p4 = new Product();
        p4.setThumbnail("kickinghorse");
        p4.setTitle("Kicking Horse Coffee");
        p4.setPrice("12.49");
        p4.setCount(0);
        p4.setDescription("DARK ROAST, GROUND: Rich, dark chocolate, decadent. From the heart of the mountains, a strong spirit roars. The most magical hand mother nature can deal.\n" +
                "TASTING NOTES, BREW METHOD: Rich, dark chocolate, cacao nibs, brown sugar and roasted hazelnuts. Recommended methods: drip machine, pour over and cold brew.\n" +
                "ORIGIN CENTRAL & SOUTH AMERICA: Grown in a socially and environmentally responsible way, by farmers with sustainable businesses they can depend on.\n" +
                "ORGANIC, FAIRTRADE, KOSHER, SHADE GROWN, ARABICA COFFEE: Coffee that is good and fair for the coffee drinkers, the farmers and the planet. 100% Certified.\n" +
                "ROASTED IN THE ROCKY MOUNTAINS: It’s all deep, dark and delicious, roasted right below the towering Canadian Rocky Mountain peaks.\n");
        mProductList.add(p4);

        Product p5 = new Product();
        p5.setThumbnail("nescafe");
        p5.setTitle("Nescafé Rich, Instant Coffee");
        p5.setPrice("13.97");
        p5.setCount(0);
        p5.setDescription("475g tin of Instant coffee\n" +
                "Made from 100% natural coffee beans\n" +
                "Free of additives or preservatives\n" +
                "Has been waking up Canadians for over 75 years\n" +
                "Makes over 260 servings\n");
        mProductList.add(p5);

        Product p6 = new Product();
        p6.setThumbnail("nabob");
        p6.setTitle("Nabob 100% Colombian Coffee");
        p6.setPrice("30.39");
        p6.setCount(0);
        p6.setDescription("56 Pods of Nabob Organic Reserve Coffee\n" +
                "Made with 100 percent Arabica beans\n" +
                "Nabob Coffee is Rainforest Certified\n" +
                "K-Cup pods are compatible with Keurig K-Cup and Keurig 2.0 brewers\n");
        mProductList.add(p6);

        Product p7 = new Product();
        p7.setThumbnail("lavazza");
        p7.setTitle("Lavazza Crema E Gusto Ground Coffee Blend");
        p7.setPrice("4.67");
        p7.setCount(0);
        p7.setDescription("One 250g bag of Lavazza Crema e Gusto Italian ground coffee\n" +
                "Crema e Gusto produces a full, rich flavoured coffee with hints of chocolate undertones\n" +
                "Intensity: 7/10\n" +
                "Composition: Mix of Arabica and Robusta beans\n" +
                "Blended and roasted in Italy\n" +
                "Compatible with any coffee maker (for best results we suggest espresso)\n");
        mProductList.add(p7);

        Product p8 = new Product();
        p8.setThumbnail("van");
        p8.setTitle("Van Houtte Vanilla Hazelnut Ground Coffee");
        p8.setPrice("9.49");
        p8.setCount(0);
        p8.setDescription("TASTE: This blend is a light roast that combines subtle hints of both vanilla and hazelnut flavour profiles\n" +
                "ROAST: Van Houtte Vanilla Hazelnut coffee is made from 100% responsibly sourced coffee beans\n" +
                "REPUTATION: Van Houtte is the most sold premium coffee brand in Canada and the biggest coffee supplier in North America\n" +
                "COMPATIBILITY: This product can be used with certain Keurig coffee maker models as well as standard drip coffee machines\n" +
                "QUANTITY: With the purchase of this Van Houtte product, you’ll receive 340g of ground coffee\n");
        mProductList.add(p8);

        Product p9 = new Product();
        p9.setThumbnail("bones");
        p9.setTitle("Bones Coffee Company Jamaican Me Crazy Whole Coffee Beans");
        p9.setPrice("28.99");
        p9.setCount(0);
        p9.setDescription("Brand\tBones Coffee Company\n" +
                "Item form\tWhole Bean\n" +
                "Flavour\tVanilla Caramel\n" +
                "Roast level\tmedium_roast\n" +
                "Package information\tBag\n" +
                "Unit count\t340.00 gram\n");
        mProductList.add(p9);

    }
    public List<Product> getProductList () {
        return mProductList;
    }
}
