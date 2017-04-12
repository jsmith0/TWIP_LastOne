package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        //need to make the filereader stuff.
        //the data is separated by a tab "\t"
        //there is a space between the + and grate (ex. + .5 + 1 + 2 + .5 + .5 + 1 + .5 + )

        BufferedReader br = new BufferedReader(new FileReader(new File("names.txt")));

        Array[] nums = new Array[500];
        Array [] grade1 = new Array[500];
        Array [] grade2 = new Array[500];
        Array [] gradeTotal = new Array[500];

        Scanner sc = new Scanner(br);


    }
}
