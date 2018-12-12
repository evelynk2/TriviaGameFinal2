package com.example.evelynkrasnik.triviagamefinal;



public class QuestionAnswer extends Activity2 {

    private String category;
    int a = 0;

    QuestionAnswer() {
        super();
        category = "";
    }

    public void setQuestionAnswer() {
        a++;
        Science.questionData.setText(getQuestion(a));
        Science.correctAnswerData.setText(getCorrectAnswer(a));
        Science.wrongAnswerData1.setText(getWrongAnswer1(a));
        Science.wrongAnswerData2.setText(getWrongAnswer2(a));
        Science.wrongAnswerData3.setText(getWrongAnswer3(a));

    }

    public String getQuestion(int a) {
        if (a == 1) {
            return "MYTHOLOGY";
        } else if (a == 2) {
            return "SCIENCE";
        } else if (a == 3) {
            return "MUSIC";
        } else if (a == 4) {
            return "HISTORY";
        } else {
            return "BOOKS";
        }
    }
    public String getCorrectAnswer(int a) {
        if (a == 1) {
            return "mythCorrect";
        } else if (a == 2) {
            return "scienceCorrect";
        } else if (a == 3) {
            return "musicCorrect";
        } else if (a == 4) {
            return "historyCorrect";
        } else {
            return "booksCorrect";
        }
    }
    public String getWrongAnswer1(int a) {
        if (a == 1) {
            return "mythWrong1";
        } else if (a == 2) {
            return "scienceWrong1";
        } else if (a == 3) {
            return "musicWrong1";
        } else if (a == 4) {
            return "historyWrong1";
        } else {
            return "booksWrong1";
        }

    }
    public String getWrongAnswer2(int a) {
        if (a == 1) {
            return "mythWrong2";
        } else if (a == 2) {
            return "scienceWrong2";
        } else if (a == 3) {
            return "musicWrong2";
        } else if (a == 4) {
            return "historyWrong2";
        } else {
            return "booksWrong2";
        }
    }
    public String getWrongAnswer3(int a) {
        if (a == 1) {
            return "mythWrong3";
        } else if (a == 2) {
            return "scienceWrong3";
        } else if (a == 3) {
            return "musicWrong3";
        } else if (a == 4) {
            return "historyWrong3";
        } else {
            return "booksWrong3";
        }
    }



}
