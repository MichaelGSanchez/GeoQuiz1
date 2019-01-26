package edu.cnm.deepdive.geoquiz1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Quiz extends AppCompatActivity {

  private Button mTrueButton;
  private Button mFalseButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_quiz);

    mTrueButton = (Button) findViewById(R.id.true_button);
    mTrueButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(Quiz.this,
            R.string.correct_toast,
            Toast.LENGTH_SHORT).show();

      }
    });
    mFalseButton = (Button) findViewById(R.id.false_button);
    mFalseButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(Quiz.this,
            R.string.incorrect_toast,
            Toast.LENGTH_SHORT).show();
      }
    });
  }
}
