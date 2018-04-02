package com.ser210_02_asazhin.ser210_starbuzz;

/**
 * Created by alexa on 2/19/2018.
 */

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Drink[] drinks = {
            new Drink("Latte", "A couple of espresso shots with steamed milk",
                    R.drawable.latteart),
            new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam",
                    R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh",
                    R.drawable.filter)
    };

    private Drink(String nname, String ndescription, int imageResourceID){
        this.name=nname;
        this.description=ndescription;
        this.imageResourceId=imageResourceID;
    }

    public String getDescription(){
        return description;
    }
    public String getName(){
        return name;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }
    public String toString(){
        return this.name;
    }
}
