package controller;

import javax.swing.*;

public class ImageLoader {
    private final String title;

    private final ImageIcon image;

    public ImageLoader(String title, ImageIcon img) {
        this.title = title;
        this.image = img;
    }

    public String getTitle() {
        return title;
    }

    public ImageIcon getImage() {
        return image;
    }

    public String toString() {
        return title;
    }
}
