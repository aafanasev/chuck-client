package com.aafanasev.chucknorrissample;

import com.aafanasev.chucknorris.ChuckNorrisApiClient;

public class JavaSample {

    public void main(String[] args) {
        ChuckNorrisApiClient.getCategories().subscribe(System.out::println);
    }

}
