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
        ArrayList<String> working = new ArrayList();

        Scanner sc = new Scanner("tester.txt");

        int n = 0;
        int p = 0;

        String filename = "tester.txt";
        File file = new File(filename);
        Scanner sc1 = new Scanner(file);

        while (sc1.hasNextLine()) {
            String nxt = sc1.nextLine();
            String e[] = nxt.split(":");
            String name = e[0];
            String secretnum = e[1];
            String fr1 = e[2];
            names.add(name);
            nums.add(secretnum);

            //fixing up fr1
            String redone = "";
            for (int i = 0; i <fr1.length(); i++){
                char letter = fr1.charAt(i);
                int asc = (int)letter;
                if (asc == 44 || asc == 46 || asc == 48 || asc == 49 || asc == 50 || asc == 51 || asc == 52
                        || asc == 53 || asc == 54 || asc == 55 || asc == 56 || asc == 57){
                    String r = Character.toString(letter);
                    redone += letter;

                }
            }
            String []almost = redone.split(",");
            for (int i = 0; i < almost.length; i++){
                String temp = almost[i];
                String temp2 = "";
                for (int v = 0; v < temp.length(); v++){
                    char u = temp.charAt(v);
                    if (u != 43){
                     temp2 += u;
                    }
                }
                almost[i] = temp2;

            }
            n++;
        }
        System.out.println(names);
        System.out.println(nums);
        System.out.println(grade1);
    }
}
