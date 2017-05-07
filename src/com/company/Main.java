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
        ArrayList<Double> grade1 = new ArrayList<>();
        ArrayList<Double> grade2 = new ArrayList<>();
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
            String fr2 = e[3];
            names.add(name);
            nums.add(secretnum);

            //fixing up fr1
            String redone = "";
            for (int i = 0; i <fr1.length(); i++){
                char letter = fr1.charAt(i);
                int asc = (int)letter;
                if (asc == 44 || asc == 46 || asc == 48 || asc == 49 || asc == 50 || asc == 51 || asc == 52
                        || asc == 53 || asc == 54 || asc == 55 || asc == 56 || asc == 57){
                    redone += letter;

                }
            }
            String []almost = redone.split(",");
            double fr1Score = 0;
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
                double soClose = Double.parseDouble(almost[i]);
                fr1Score += soClose;

            }
            grade1.add(fr1Score);


            //same as fr1 but needs to be for fr2... adding 44 to all variables... made fr1 -> fr2
            String redone44 = "";
            for (int i = 0; i <fr2.length(); i++){
                char letter44 = fr2.charAt(i);
                int asc44 = (int)letter44;
                if (asc44 == 44 || asc44 == 46 || asc44 == 48 || asc44 == 49 || asc44 == 50 || asc44 == 51 || asc44 == 52
                        || asc44 == 53 || asc44 == 54 || asc44 == 55 || asc44 == 56 || asc44 == 57){
                    redone44 += letter44;

                }
            }
            String []almost44 = redone44.split(",");
            double fr2Score = 0;
            for (int i = 0; i < almost44.length; i++){
                String temp44 = almost44[i];
                String temp244 = "";
                for (int v = 0; v < temp44.length(); v++){
                    char u = temp44.charAt(v);
                    if (u != 43){
                        temp244 += u;
                    }

                }
                almost44[i] = temp244;
                double soClose44 = Double.parseDouble(almost44[i]);
                fr2Score += soClose44;

            }
            grade2.add(fr2Score);
            n++;
        }
        System.out.println(names);
        System.out.println(nums);
        System.out.println(grade1);
        System.out.println(grade2);
    }
}
