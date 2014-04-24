package com.gnuhub;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class Main {
    public static void getProperties(){
        Properties properties;
        properties = System.getProperties();
        properties.list(System.out);
    }
    public static void getenv() {
        Map<String,String> map = System.getenv();
        Iterator<String> iterator = map.keySet().iterator();
        String key,value;
        while (iterator.hasNext()){
            key = iterator.next();
            value = map.get(key);
            System.out.println(key + "=" + value);
        }

    }
    public static void main(String[] args) {
	    //System in out err getenv getProperties getProperty
        //getProperties();
        getenv();
    }
}
