package com.mlf.testspinner;

public class CustomItem
{
    private final String text;
    private final int image;

    public CustomItem(String text, int image)
    {
        this.text = text;
        this.image = image;
    }
    public String getText()
    {
        return text;
    }
    public int getImage()
    {
        return image;
    }
}
