package com.esraa.hp.gridlayoutrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HorizontalScrolling extends AppCompatActivity {
RecyclerView recyclerView1,recyclerView2;
ArrayList<App> apps1,apps2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_scrolling);

        recyclerView1=findViewById(R.id.recycler1);
        recyclerView2=findViewById(R.id.recycler2);

        apps1=new ArrayList<>();
        apps2=new ArrayList<>();

        apps1.add(new App("Facebook",R.drawable.facebook));
        apps1.add(new App("Instagram",R.drawable.instagram));
        apps1.add(new App("Messenger",R.drawable.messenger));
        apps1.add(new App("Whatsapp",R.drawable.whatsapp));
        apps1.add(new App("Youtube",R.drawable.youtube));
        apps1.add(new App("Skype",R.drawable.skype));
        apps2.add(new App("SoundCloud",R.drawable.soundcloud));
        apps2.add(new App("Twitter",R.drawable.twitter));
        apps2.add(new App("Viber",R.drawable.viber));
        apps2.add(new App("Vimeo",R.drawable.vimeo));
        apps2.add(new App("Music",R.drawable.music));

        AppAdapter adapter=new AppAdapter(apps1,this,null);
        recyclerView1=findViewById(R.id.recycler1);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView1.setAdapter(adapter);

        AppAdapter adapter2=new AppAdapter(apps2,this,null);
        recyclerView2=findViewById(R.id.recycler2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView2.setAdapter(adapter2);
    }
}
