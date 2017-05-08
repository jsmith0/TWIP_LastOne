package com.company;

import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        //need to make the filereader stuff.
        //the data is separated by a tab "\t"
        //there is a space between the + and grate (ex. + .5 + 1 + 2 + .5 + .5 + 1 + .5 + )

        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> nums = new ArrayList<>();
        ArrayList<Double> grade1 = new ArrayList<>();
        ArrayList<Double> grade1Syntax = new ArrayList<>();
        ArrayList<Double> grade2 = new ArrayList<>();
        ArrayList<Double> grade2Syntax = new ArrayList<>();
        ArrayList<Double> gradeTotal = new ArrayList<>();

        int n = 0;

        String filename = "tester.txt";
        File file = new File(filename);
        Scanner sc1 = new Scanner(file);




        while (sc1.hasNextLine()) {
            String nxt = sc1.nextLine();
            String e[] = nxt.split(":");
            String name = e[1];
            String secretnum = e[0];
            String fr1 = e[2];
            String g1S = e[3];
            String fr2 = e[4];
            String g2S = e[5];
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

            //Finds the syntax errors in FR1
            double tempSyntax = Double.parseDouble(g1S);
            tempSyntax = tempSyntax*0.25;
            grade1Syntax.add(tempSyntax);

            fr1Score = fr1Score - grade1Syntax.get(n);
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
            //find the syntax errors in the FR2
            double tempSyntax44 = Double.parseDouble(g2S);
            tempSyntax44 = tempSyntax44*0.25;
            grade2Syntax.add(tempSyntax44);

            fr2Score = fr2Score - grade2Syntax.get(n);
            grade2.add(fr2Score);

            double both = grade1.get(n) + grade2.get(n);
            gradeTotal.add(both);

            n++;


        }
        System.out.println(nums);
        System.out.println(names);
        System.out.println(grade1);
        System.out.println(grade1Syntax);
        System.out.println(grade2);
        System.out.println(grade2Syntax);
        System.out.println(gradeTotal);


    }
}
