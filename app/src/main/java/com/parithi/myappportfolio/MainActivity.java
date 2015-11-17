package com.parithi.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button spotifyStreamBtn;
    private Button scoresAppBtn;
    private Button libraryAppBtn;
    private Button buildItBiggerBtn;
    private Button xyzReaderBtn;
    private Button capStoneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotifyStreamBtn = (Button) findViewById(R.id.spotify_streamer_button);
        scoresAppBtn = (Button) findViewById(R.id.scores_app_button);
        libraryAppBtn = (Button) findViewById(R.id.library_app_button);
        buildItBiggerBtn = (Button) findViewById(R.id.build_it_bigger_button);
        xyzReaderBtn = (Button) findViewById(R.id.xyz_reader_button);
        capStoneBtn = (Button) findViewById(R.id.capstone_button);

        spotifyStreamBtn.setOnClickListener(this);
        scoresAppBtn.setOnClickListener(this);
        libraryAppBtn.setOnClickListener(this);
        buildItBiggerBtn.setOnClickListener(this);
        xyzReaderBtn.setOnClickListener(this);
        capStoneBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.spotify_streamer_button:
                displayToast(getString(R.string.app_name_one));
                break;
            case R.id.scores_app_button:
                displayToast(getString(R.string.app_name_two));
                break;
            case R.id.library_app_button:
                displayToast(getString(R.string.app_name_three));
                break;
            case R.id.build_it_bigger_button:
                displayToast(getString(R.string.app_name_four));
                break;
            case R.id.xyz_reader_button:
                displayToast(getString(R.string.app_name_five));
                break;
            case R.id.capstone_button:
                displayToast(getString(R.string.app_name_six));
                break;
        }
    }

    private void displayToast(String message){
        Toast.makeText(this, "This button will launch my " + message + "!", Toast.LENGTH_SHORT).show();
    }
}
