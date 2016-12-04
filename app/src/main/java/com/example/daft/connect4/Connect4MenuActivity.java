package com.example.daft.connect4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * Created by shukfunwong on 4/12/2016.
 */

public class Connect4MenuActivity extends Activity{
    private Button buttonPlay;
    private Button buttonSettings;
    private Button buttonHelp;

    /** Called when the activity is first created. */
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.mainmenu);
            buttonPlay = (Button)findViewById(R.id.button1);
            buttonSettings = (Button)findViewById(R.id.button2);
            buttonHelp = (Button)findViewById(R.id.button3);

            buttonPlay.setOnClickListener(new Button.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(v.getContext(), GameActivity.class);
                    startActivityForResult(myIntent, 0);
                }
            });

            buttonSettings.setOnClickListener(new Button.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(v.getContext(), SettingActivity.class);
                    startActivityForResult(myIntent, 0);
                }
            });

            buttonHelp.setOnClickListener(new Button.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(v.getContext(), HelpActivity.class);
                    startActivityForResult(myIntent, 0);
                }
            });
        }


}

