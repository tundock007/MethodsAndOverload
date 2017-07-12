package com.olatunde;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double centimeters = calcFeetAndInchesToCentimeters(12.2,2);
        calcFeetAndInchesToCentimeters(10.02);
        //int newScore = calculateScore("Tim", 500);
        // System.out.println("New score is " + newScore);
        //calculateScore(100);
        //calculateScore("100",100);
        //calculateScore();
    }

    private static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet < 0 || !(inches >= 0 && inches <= 12)) {
            System.out.println("Invalid feet or Inches parameter");
            return -1;
        }
        else {
            double centimeters = (feet * 2.54 * 12) + (inches * 2.54);
            System.out.println(feet + " feet " + inches + " inches" + " = " + centimeters + " cm");
            return centimeters;
        }
    }

    private static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0 ) {
            double feets = (int) (inches / 12);
            double newInches = (int) inches%12;
            // System.out.println("The value is " + feets + " feets and " + newInches + " inches");
            return calcFeetAndInchesToCentimeters(feets, newInches);
        }
        else {
            System.out.println("Invalid feet or Inches parameter");
            return -1;
        }
    }

    private static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    private static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    private static int calculateScore() {
        System.out.println("Unnamed Player scored, No player score.");
        return 0;
    }
}
