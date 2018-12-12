package com.example.evelynkrasnik.triviagamefinal;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class fetchData extends AsyncTask<Void, Void, String> {

    String data = "";
    String dataParsed = "";
    String questionParsed = "";
    String correctAnswerParsed = "";
    String wrongAnswerParsed1 = "";
    String wrongAnswerParsed2 = "";
    String wrongAnswerParsed3 = "";
    int a = 0;


    @Override
    protected String doInBackground(Void... voids) {


        try {
            URL triviaURL = new URL("https://opentdb.com/api.php?amount=10");

            HttpURLConnection triviaConnection = (HttpURLConnection) triviaURL.openConnection();

            InputStream inputStream = triviaConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String line = "";
            while (line != null) {
                line = bufferedReader.readLine();
                data = data + line;
            }

            JSONArray jsonArray = new JSONArray(data);


            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject JO = (JSONObject) jsonArray.get(i);
                questionParsed = "Question: " + JO.get("question");
                correctAnswerParsed = "" + JO.get("correct_answer");
                String wrongAnswers = "" + JO.get("incorrect_answers");
                String[] wrongAnswersArray = wrongAnswers.split(",");
                wrongAnswerParsed1 = wrongAnswersArray[0];
                wrongAnswerParsed2 = wrongAnswersArray[1];
                wrongAnswerParsed3 = wrongAnswersArray[3];

                dataParsed = ""+ dataParsed + questionParsed + correctAnswerParsed + wrongAnswerParsed1 + wrongAnswerParsed2 + wrongAnswerParsed3;
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }



        return dataParsed;
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

    @Override
    protected void onPostExecute(String category) {
        super.onPostExecute(category);


        Science.questionData.setText(getQuestion(a));
        Science.correctAnswerData.setText(getCorrectAnswer(a));
        Science.wrongAnswerData1.setText(getWrongAnswer1(a));
        Science.wrongAnswerData2.setText(getWrongAnswer2(a));
        Science.wrongAnswerData3.setText(getWrongAnswer3(a));
    }
}
