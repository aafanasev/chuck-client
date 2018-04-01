package com.aafanasev.chucknorrissample;

import com.aafanasev.chucknorris.ChuckNorrisApiFactory;
import com.aafanasev.chucknorris.ChuckNorrisApiService;

public class JavaSample {

    public static void main(String[] args) {
        ChuckNorrisApiService api = new ChuckNorrisApiFactory().create();
        api.getCategories().subscribe(System.out::println);
    }

}
