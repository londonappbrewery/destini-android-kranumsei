package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mTopButton, mBottomButton;
    private int mStoryIndex;
    private Story[] storyList = {
            //ACCTUAL STORYTELLING
            new Story(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2),
            new Story(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2),
            new Story(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2),
            //ENDINGS
            new Story(R.string.T4_End, R.string.T1_Ans1, R.string.T1_Ans2),
            new Story(R.string.T5_End, R.string.T1_Ans1, R.string.T1_Ans2),
            new Story(R.string.T6_End, R.string.T1_Ans1, R.string.T1_Ans2)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mStoryTextView = findViewById(R.id.storyTextView);
        mTopButton = findViewById(R.id.buttonTop);
        mBottomButton = findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 0){
                    mStoryIndex = 2;
                    updateLayout();
                }
                else if(mStoryIndex == 1){
                    mStoryIndex = 2;
                    updateLayout();
                }
                else if(mStoryIndex == 2){
                    mStoryIndex = 5;
                    updateLayout();
                }

            }
        });
        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 0){
                    mStoryIndex = 1;
                    updateLayout();
                }
                else if(mStoryIndex == 1){
                    mStoryIndex = 3;
                    updateLayout();
                }
                else if(mStoryIndex == 2){
                    mStoryIndex = 4;
                    updateLayout();
                }
            }
        });
    }

    private void updateLayout(){
        if(mStoryIndex > 2){
            mStoryTextView.setText(storyList[mStoryIndex].getText());
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
        }else{
            mStoryTextView.setText(storyList[mStoryIndex].getText());
            mTopButton.setText(storyList[mStoryIndex].getTopAwnserId());
            mBottomButton.setText(storyList[mStoryIndex].getBottomAwnserId());
        }
    }

}
