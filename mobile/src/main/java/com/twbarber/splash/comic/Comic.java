package com.twbarber.splash.comic;

import android.graphics.Bitmap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tyler on 10/21/15.
 */
public class Comic {

    private String title;
    private List<Page> pages;

    public Comic (String comicTitle, List<Bitmap> comicImages) {
        this.title = comicTitle;
        convertToPages(comicImages);
    }

    private List<Page> convertToPages(List<Bitmap> imagesToConvert) {
        return new ArrayList<Page>();
    }



}



