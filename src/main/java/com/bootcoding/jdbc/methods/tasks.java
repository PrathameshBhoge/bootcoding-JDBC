package com.bootcoding.jdbc.methods;

import java.util.*;

public class tasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("jhon");

        Map<Integer ,String> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            map.put(i, list.get(i));
        }

//
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }

        int keyToPrint = sc.nextInt();
        if (map.containsKey(keyToPrint)) {
            System.out.println("Value for key " + keyToPrint + ": " + map.get(keyToPrint));
        } else {
            System.out.println("Key " + keyToPrint + " not found in the map.");
        }
    }
}
