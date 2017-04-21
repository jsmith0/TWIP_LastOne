package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        //need to make the filereader stuff.
        //the data is separated by a tab "\t"
        //there is a space between the + and grate (ex. + .5 + 1 + 2 + .5 + .5 + 1 + .5 + )

        BufferedReader br = new BufferedReader(new FileReader("tester.txt"));

        ArrayList<String> line = new ArrayList();
        String [] names = new String[500];
        String [] nums = new String[500];
        int [] grade1 = new int[500];
        int [] grade2 = new int[500];
        int [] gradeTotal = new int[500];

        Scanner sc = new Scanner(br);

        int n = 0;
        int p = 0;
        while (sc.hasNextLine()){
            String w = sc.nextLine();
            line.add().split("\t");
            names[n] = line.get(0);
            nums[n] = line.get(1);
/*
            //break it all up with a delimiter...
            String [] broken = new String [500];
            //ASCII code for tab is.. 9

            String e;
            for (int i = 0; i <w.length(); i++){
                char a = w.charAt(i);
                if (a == 9){
                    e = w.substring(0,a);
                }
            }

            e = broken[n];
            nums[n] = e;
            n++;
*/
            line.clear();
            n++;
        }
        System.out.println(nums);
    }
}
