package com.dai4;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Diamond {



    @Test
    public void diamondTest() {
        List<String> res =new ArrayList<String>();
        res.add("A");
        assertEquals(res,ArolaTest.diamondList("A"));
           }

           @Test
           public void diamondTest1(){
               List<String> res =new ArrayList<String>();

               res.add(" A");
               res.add("B"+" "+"B");
               res.add(" A");
               assertEquals(res, ArolaTest.diamondList("B"));
               for (String e: res
                    ) {
                   System.out.println(e);
               }

           }
}
