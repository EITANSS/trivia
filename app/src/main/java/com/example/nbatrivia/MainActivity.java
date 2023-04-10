package com.example.nbatrivia;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.nbatrivia.R;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView backgroundImage;
    private TextView questionText;
    private Button[] answerButtons = new Button[4];
    private QuestionBank questionBank;
    private List<Question> currentQuestions;
    private Question currentQuestion;
    private int currentLevel = 1;
    private String[] backgroundImages = {"image1.jpg", "image2.jpg", "image3.jpg", "image4.jpg", "image5.jpg"};
    private Random random = new Random();

    private int currentWins = 0; // Add this variable to track wins



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backgroundImage = findViewById(R.id.backgroundImage);
        questionText = findViewById(R.id.questionText);
        answerButtons[0] = findViewById(R.id.answerButton1);
        answerButtons[1] = findViewById(R.id.answerButton2);
        answerButtons[2] = findViewById(R.id.answerButton3);
        answerButtons[3] = findViewById(R.id.answerButton4);

        questionBank = new QuestionBank();
        currentQuestions = new ArrayList<>(questionBank.getQuestions());
        Collections.shuffle(currentQuestions);

        startGame();
    }

    private void startGame() {
        if (currentLevel <= 5) {
            updateBackgroundImage();
            loadNextQuestion();
        } else {
            endGame();
        }
    }

    private void updateBackgroundImage() {
        String imageName = backgroundImages[random.nextInt(backgroundImages.length)];
        AssetManager assetManager = getAssets();
        try (InputStream inputStream = assetManager.open(imageName)) {
            Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
            backgroundImage.setImageBitmap(bitmap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadNextQuestion() {
        if (!currentQuestions.isEmpty()) {
            currentQuestion = currentQuestions.remove(0);
            questionText.setText(currentQuestion.getQuestion());
            String[] options = currentQuestion.getOptions();
            for (int i = 0; i < 4; i++) {
                answerButtons[i].setText(options[i]);
                final int answerIndex = i;
                answerButtons[i].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(answerIndex);
                    }
                });
            }
            answerButtons[1].setText("Answer 1"); // Add this line
        } else {
            Toast.makeText(this, "No more questions available.", Toast.LENGTH_LONG).show();
            finish();
        }
    }


    private void checkAnswer(int answerIndex) {
        if (answerIndex == currentQuestion.getCorrectAnswerIndex()) {
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
            currentLevel++;
            startGame();
        } else {
            Toast.makeText(this, "Incorrect. Restarting from the first question!", Toast.LENGTH_SHORT).show();
            currentLevel = 1; // Restart from the first question if the answer is incorrect
            currentQuestions = new ArrayList<>(questionBank.getQuestions()); // Reset the questions
            Collections.shuffle(currentQuestions); // Shuffle the questions again
            startGame();
        }
    }




    private void endGame() {
        Toast.makeText(this, "Congratulations! You won the game!", Toast.LENGTH_LONG).show();
        currentWins++; // Increment the win count
        // You can show the number of wins to the user if you want:
        // Toast.makeText(this, "You have won " + currentWins + " times!", Toast.LENGTH_LONG).show();
        finish();
    }
}
