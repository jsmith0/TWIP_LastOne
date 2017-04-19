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

        int [] nums = new int[500];
        int [] grade1 = new int[500];
        int [] grade2 = new int[500];
        int [] gradeTotal = new int[500];

        Scanner sc = new Scanner(br);

        int n = 0;
        while (sc.next() != null){
            String w = sc.nextLine();
            String [] broken = w.split("\t");
            int q = Integer.parseInt(broken[0]);
            nums[n] = q;
            n++;
        }
        System.out.println(nums);
    }
}
