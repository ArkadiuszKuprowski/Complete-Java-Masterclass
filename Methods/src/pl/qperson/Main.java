package pl.qperson;

public class Main {

    public static void main(String[] args) {

//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
////        if (score < 5000 && score > 1000) {
////
////            System.out.println("Your score was less than 5000 but greater than 1000");
////
////        } else if (score < 1000) {
////
////            System.out.println("Score was less than 1000");
////
////        } else {
////
////            System.out.println("Got here!");
////
////        }
//
//        if(gameOver) {
//
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("Your final score was " + finalScore);
//
//        }
//
//        //ex1
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        if(gameOver) {
//
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver,score,levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver,score,levelCompleted, bonus);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver) {

            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);

            return finalScore;

        }

        return -1;

    }


}
