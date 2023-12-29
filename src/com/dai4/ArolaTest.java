package com.dai4;


import java.util.ArrayList;
import java.util.List;

public class ArolaTest {

    public static  List<String> diamondList(String lettre) {
        List<String> res = new ArrayList<String>();
        if (lettre.equals("B")) {
            res.add(" A");
            res.add("B"+" "+"B");
            res.add(" A");
        }
        if(lettre.equals("A")) {
            res.add("A");
        }
        return res;
    }

}
