package com.esraa.hp.gridlayoutrecyclerview;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AppListener{
ArrayList<App> apps;
RecyclerView recyclerView;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,HorizontalScrolling.class);
                startActivity(i);
            }
        });

        apps=new ArrayList<>();
        apps.add(new App("Facebook",R.drawable.facebook));
        apps.add(new App("Instagram",R.drawable.instagram));
        apps.add(new App("Messenger",R.drawable.messenger));
        apps.add(new App("Whatsapp",R.drawable.whatsapp));
        apps.add(new App("Youtube",R.drawable.youtube));
        apps.add(new App("Skype",R.drawable.skype));
        apps.add(new App("SoundCloud",R.drawable.soundcloud));
        apps.add(new App("Twitter",R.drawable.twitter));
        apps.add(new App("Viber",R.drawable.viber));
        apps.add(new App("Vimeo",R.drawable.vimeo));
        apps.add(new App("Music",R.drawable.music));



        AppAdapter adapter=new AppAdapter(apps,this,MainActivity.this);
        recyclerView=findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(adapter);


    }

    @Override
    public void onAppClicked(ImageView imageView) {
        PopupMenu popupMenu=new PopupMenu(MainActivity.this,imageView);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu,popupMenu.getMenu());
        popupMenu.show();
    }
}
