package org.techtown.webtoon;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onClick(View v){
        Intent intent;
        String webtoon_url=null;

        switch (v.getId()){
            case R.id.btn_daum_webtoon:
                webtoon_url="http://m.webtoon.daum.net";
                break;
            case R.id.btn_naver_webtoon:
                webtoon_url="http://m.comic.naver.com/webtoon/weekday.nhn";
                break;
        }
        intent = new Intent(Intent.ACTION_VIEW, Uri.parse(webtoon_url));
        startActivity(intent);
    }
}
