package edu.cnm.deepdive.geoquiz1;

public class Question {

  private int mTextResId;
  private boolean mAnswerTrue;

  public int getTextResId() {
    return mTextResId;
  }

  public void setTextResId(int textResId) {
    mTextResId = textResId;
  }

  public boolean isAnswerTrue() {
    return mAnswerTrue;
  }

  public void setAnswerTrue(boolean answerTrue) {
    mAnswerTrue = answerTrue;
  }

  //Constructor below may need to move above, below getTextResId
  public Question(int textResId, boolean answerTrue){
    mTextResId = textResId;
    mAnswerTrue = answerTrue;
  }
}
