package com.esraa.hp.gridlayoutrecyclerview;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class AppAdapter extends RecyclerView.Adapter<AppAdapter.MyViewHolder>{

    ArrayList<App> apps;
    App app;
    Context context;
    AppListener appListener;

    public AppAdapter (ArrayList<App> apps,Context context,AppListener appListener){
        this.apps=apps;
        this.context=context;
        this.appListener=appListener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_grid,parent,false);
        MyViewHolder holder=new MyViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        app=apps.get(position);
        holder.textView.setText(app.getAppname());
        holder.imageView.setImageResource(app.getImgId());
    }

    @Override
    public int getItemCount() {
        return apps.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView imageView,menu;
        public MyViewHolder(View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.txt);
            imageView=itemView.findViewById(R.id.img);
            menu=itemView.findViewById(R.id.menu);

            menu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(appListener!=null)
                        appListener.onAppClicked(menu);
                }
            });
        }
    }
}
