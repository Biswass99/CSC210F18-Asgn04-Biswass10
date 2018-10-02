package com.test.roadsignquiz;



public class QuestionLibrary {
    private int mImages [] = {
            R.drawable.divided100, R.drawable.stop100, R.drawable.winding100, R.drawable.yield100, R.drawable.byeblue100

    };


    private String mChoices [][] = {
            {"Divided highway begins", "Divided highway ends", "Drive around rocks"},
            {"Stop for 10 seconds", "Come to a rolling stop", "Come to a full stop"},
            {"Winding road", "Steep road", "Wet road"},
            {"Yield right-of-way", "Slow down a little", "Come to a full stop"},
            {"End of Quiz", "End of Quiz", "End of Quiz"}
    };



    private String mCorrectAnswers[] = {"Divided highway ends", "Come to a full stop", "Winding road", "Yield right-of-way", "End of Quiz"};




    public int getImage(int a) {
        int image = mImages[a];
        return image;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
