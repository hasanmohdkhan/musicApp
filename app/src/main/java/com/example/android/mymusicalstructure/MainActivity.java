package com.example.android.mymusicalstructure;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.TabLayout;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {
    public static ArrayList<CustomSongArrayList> mMusicData;
    public static ArrayList<CustomAlbumArrayList> mAlbumData;
    public static final String KEY_POSITION = "position";
    public static final String KEY_ALBUMNAME = "albumName";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMusicData = new ArrayList<>();
        mMusicData.add(new CustomSongArrayList(R.drawable.geetha_govindam,getString(R.string.song_inkem_inkem_kavale),getString(R.string.artist_sid_sriram),getString(R.string.album_geetha_govindam)));
        mMusicData.add(new CustomSongArrayList(R.drawable.raabta,getString(R.string.song_ik_vaariya),getString(R.string.artist_arijit),getString(R.string.album_raabta)));
        mMusicData.add(new CustomSongArrayList(R.drawable.aashiqui_2,getString(R.string.song_tum_hi_ho),getString(R.string.artist_arijit),getString(R.string.album_aashiqui_2)));
        mMusicData.add(new CustomSongArrayList(R.drawable.bharat_ane_nenu,getString(R.string.song_vasumathi),getString(R.string.artist_Dsp),getString(R.string.album_bharat_ane_nenu)));

        mAlbumData = new ArrayList<>();
        mAlbumData.add(new CustomAlbumArrayList(R.drawable.geetha_govindam,getString(R.string.album_geetha_govindam),4));
        mAlbumData.add(new CustomAlbumArrayList(R.drawable.aashiqui_2,getString(R.string.album_aashiqui_2),1));
        mAlbumData.add(new CustomAlbumArrayList(R.drawable.raabta,getString(R.string.album_raabta),1));
        mAlbumData.add(new CustomAlbumArrayList(R.drawable.bharat_ane_nenu,getString(R.string.album_bharat_ane_nenu),1));


        ViewPager viewPager = findViewById(R.id.viewpager);

        FragmentPagerAdapter adapter = new FragmentPagerAdapter(MainActivity.this, getSupportFragmentManager());

        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(1);

        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
