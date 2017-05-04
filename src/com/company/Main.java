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
       ArrayList<String> names = new ArrayList<>();
        ArrayList<String> nums = new ArrayList<>();
        ArrayList<String> grade1 = new ArrayList<>();
        ArrayList<String> grade2 = new ArrayList<>();
        ArrayList<String> gradeTotal = new ArrayList<>();

        Scanner sc = new Scanner("tester.txt");

        int n = 0;
        int p = 0;

        String w = sc.nextLine();



        while (sc.hasNextLine()){
                String[] temp;
                temp = w.split(":");
                names.add(temp[0]);
                nums.add(temp[1]);
                grade1.add(temp[2]);
                w = (sc.nextLine());
                n++;
        }


        System.out.println(names);
        System.out.println(nums);
        System.out.println(grade1);
    }
}
