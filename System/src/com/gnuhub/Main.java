package com.gnuhub;

import java.util.Properties;

public class Main {
    public static void getProperties(){
        Properties properties;
        properties = System.getProperties();
        properties.list(System.out);
    }
    public static void main(String[] args) {
	// write your code here
        getProperties();
    }
}
