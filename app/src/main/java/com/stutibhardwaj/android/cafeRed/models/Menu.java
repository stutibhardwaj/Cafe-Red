package com.stutibhardwaj.android.cafeRed.models;

/**
 * Created by prithviraj on 20/01/18.
 */
public class Menu {
    private String item;
    private String img;
    public Menu(String img, String item)
    {
        this.item = item;
        this.img = img;
    }

    public String getItem()
    {
        return this.item;
    }

    public String getImg()
    {
        return this.img;
    }
}
