package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int[] scoreList = {100,50,70,60,90,80,40,30,20,10};
    static String[] scoreNameList = {"average: ","high score: ","low score: "};
    static double sum = 0;
    static int high = scoreList[0];
    static int low = scoreList[0];

    public static void main(String[] args) {
        for (int score : scoreList) {
            sum += score;
            if (score > high) {high = score;}
            if (score < low) {low = score;}
        }
        double average = sum / scoreList.length;

        System.out.println(scoreNameList[0] + average);
        System.out.println(scoreNameList[1] + high);
        System.out.print(scoreNameList[2] + low);
    }
}