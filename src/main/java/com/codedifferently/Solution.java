package com.codedifferently;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public String howManyLettersDoYouSee(String input){
        String[] inputs = input.split("");

        Map<String, Integer> wordCount = new TreeMap<>();

        for (String in : inputs) {
            if (!wordCount.containsKey(in))
                wordCount.put(in, 1);
            else {
                int count = wordCount.get(in);
                wordCount.put(in, count + 1);
            }
        }

        Iterator<Map.Entry<String, Integer>> iterator = wordCount.entrySet().iterator();
        StringBuilder builder = new StringBuilder();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            builder.append(entry.getKey() + ":" + entry.getValue()+ " ");
        }

        return builder.toString();
    }
}
