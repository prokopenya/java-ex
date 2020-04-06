package com.codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

//https://www.codewars.com/kata/550554fd08b86f84fe000a58
public class WhichAreIn {
    
    public static <Set> String[] inArray(String[] array1, String[] array2) {

        ArrayList<String> tempList = new ArrayList<String>();

        for (String str2 : array2) {
            for (String str1 : array1) {
                if (str2.contains(str1)) tempList.add(str1);
            }
        }

        Collections.sort(tempList);

        java.util.Set<String> rset = new LinkedHashSet<String>(tempList);
        String[] r = rset.toArray(new String[rset.size()]);

        return r;
    }
}
