package com.example.android.mymusicalstructure;

/**
 * Created by B SAI SREE DEEPTHI on 01-11-2018.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlayingActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            int currentPlaying = extras.getInt(MainActivity.KEY_POSITION);
            CustomSongArrayList nowPlayingSong = MainActivity.mMusicData.get(currentPlaying);

            TextView textView = findViewById(R.id.now_playing_song_name);
            textView.setText(nowPlayingSong.getSongName());

            ImageView imageView = findViewById(R.id.now_playing_song_image);
            imageView.setImageResource(nowPlayingSong.getImageId());

            textView = findViewById(R.id.now_playing_song_artist);
            textView.setText(nowPlayingSong.getArtistName());

            textView = findViewById(R.id.now_playing_song_album);
            textView.setText(nowPlayingSong.getAlbumName());
        }
    }
}
