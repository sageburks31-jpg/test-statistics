package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int[] scoreList = {100,50,70,60,90,80,40,30,20,10};
    static String[] scoreNameList = {"average","high score","low score"};

    public static void main(String[] args) {
        //int scorekey
        for (int score : scoreList) {
            if (score >= 80) {
                System.out.println(scoreNameList[1] + ": " + score);
            } else if (score > 50) {
                System.out.println(scoreNameList[0] + ": " + score);
            } else {System.out.println(scoreNameList[2] + ": " + score);}
        }
    }
}