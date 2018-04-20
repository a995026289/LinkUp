package com.example.android.linkup;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.github.chrisbanes.photoview.PhotoView;



public class Map extends AppCompatActivity {

    public ImageButton terrain,label;
    public ImageView map_basic,map_notxt,map_text,map_txtb;
    public boolean terrain1=true,label1=true;
    public int x,y;
    private final int WRAP_CONTENT = ViewGroup.LayoutParams.WRAP_CONTENT;


    public boolean onTouchEvent(MotionEvent event) {
         x = (int)event.getX();
         y = (int)event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_MOVE:
            case MotionEvent.ACTION_UP:
        }
        return false;
    }


    public void changeTerrain() {
        PhotoView photoView = findViewById(R.id.photo_view);
        if (terrain1) {
            terrain.setImageResource(R.drawable.terrain_mono);
            terrain1 = false;


            if (label1) {
//                        map_txtb.setVisibility(View.VISIBLE);
//                        map_text.setVisibility(View.INVISIBLE);
//                        map_notxt.setVisibility(View.INVISIBLE);
//                        map_basic.setVisibility(View.INVISIBLE);

//                        Attacher = new PhotoViewAttacher(map_txtb);
//                        Attacher.update();
                photoView.setImageResource(R.drawable.map_txtb);

            }
            if (!label1) {
//                        map_txtb.setVisibility(View.INVISIBLE);
//                        map_text.setVisibility(View.INVISIBLE);
//                        map_notxt.setVisibility(View.INVISIBLE);
//                        map_basic.setVisibility(View.VISIBLE);
                photoView.setImageResource(R.drawable.map_basic);
            }
        } else if (!terrain1) {
            terrain.setImageResource(R.drawable.terrain);
            terrain1 = true;


            if (label1) {
//                            map_txtb.setVisibility(View.INVISIBLE);
//                            map_text.setVisibility(View.VISIBLE);
//                            map_notxt.setVisibility(View.INVISIBLE);
//                            map_basic.setVisibility(View.INVISIBLE);
                photoView.setImageResource(R.drawable.map_text);

            }
            if (!label1) {
//                            map_txtb.setVisibility(View.INVISIBLE);
//                            map_text.setVisibility(View.INVISIBLE);
//                            map_notxt.setVisibility(View.VISIBLE);
//                            map_basic.setVisibility(View.INVISIBLE);
                photoView.setImageResource(R.drawable.map_notxt);
            }


        }

    }


    public void changeLabel () {
        PhotoView photoView = findViewById(R.id.photo_view);
        if (label1) {
            label.setImageResource(R.drawable.label_mono);
            label1 = false;


            if (terrain1) {
//                            map_txtb.setVisibility(View.INVISIBLE);
//                            map_text.setVisibility(View.INVISIBLE);
//                            map_notxt.setVisibility(View.VISIBLE);
//                            map_basic.setVisibility(View.INVISIBLE);
                            photoView.setImageResource(R.drawable.map_notxt);

            }
            if (!terrain1) {
//                            map_txtb.setVisibility(View.INVISIBLE);
//                            map_text.setVisibility(View.INVISIBLE);
//                            map_notxt.setVisibility(View.INVISIBLE);
//                            map_basic.setVisibility(View.VISIBLE);
                            photoView.setImageResource(R.drawable.map_basic);
            }
        }


        else if (!label1) {
            label.setImageResource(R.drawable.label);
            label1 = true;


            if (terrain1) {
//                            map_txtb.setVisibility(View.INVISIBLE);
//                            map_text.setVisibility(View.VISIBLE);
//                            map_notxt.setVisibility(View.INVISIBLE);
//                            map_basic.setVisibility(View.INVISIBLE);
                            photoView.setImageResource(R.drawable.map_text);

            }
            if (!terrain1) {
//                            map_txtb.setVisibility(View.VISIBLE);
//                            map_text.setVisibility(View.INVISIBLE);
//                            map_notxt.setVisibility(View.INVISIBLE);
//                            map_basic.setVisibility(View.INVISIBLE);
                            photoView.setImageResource(R.drawable.map_txtb);
            }
        }


    }


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_map);
            RelativeLayout rLayout = findViewById(R.id.rLayout);




            terrain1=true;label1=true;


//            zoomin =  findViewById(R.id.zoomin);
//            zoomout =  findViewById(R.id.zoomout);
            terrain = findViewById(R.id.terrain);
            label = findViewById(R.id.label);

            map_basic = findViewById(R.id.map_basic);
            map_notxt = findViewById(R.id.map_notxt);
            map_text = findViewById(R.id.map_text);
            map_txtb = findViewById(R.id.map_txtb);

            PhotoView photoView = findViewById(R.id.photo_view);
            photoView.setImageResource(R.drawable.map_text);
            photoView.setMaximumScale(7);



//            TextView tv2 = new TextView(this);
//            tv2.setText("Android");
//            tv2.setBackgroundColor(Color.GREEN);
//            tv2.setX(100);
//            tv2.setY(100);
//            tv2.setTextSize(10);
//            tv2.setPadding(1, 1, 1, 1);
//            setContentView(tv2);


//            LinearLayout linearLayout = new LinearLayout(this);
//            linearLayout.setOrientation(LinearLayout.VERTICAL);
//            linearLayout.setBackgroundColor(Color.TRANSPARENT);
//            getLayoutInflater().inflate(rLayout, linearLayout);
//            setContentView(linearLayout);


            TextView tv2 = new TextView(this);
            tv2.setText("Campus Map");
            tv2.setBackgroundColor(Color.parseColor("#41aeff"));
            tv2.setPadding(5, 5, 5, 5);
            rLayout.addView(tv2,
                    new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));


            terrain.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    changeTerrain();

                }
            });


            label.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) { changeLabel() ;} });
            


//            final  float initialX = findViewById(R.id.map_basic).getScaleX();


//            zoomin.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    float x = map_basic.getScaleX();
//                    float y = map_basic.getScaleY();
//
//
//
//
//
//                    map_basic.setScaleX((int) (x+1));
//                    map_basic.setScaleY((int) (y+1));
//
//                    map_notxt.setScaleX((int) (x+1));
//                    map_notxt.setScaleY((int) (y+1));
//
//                    map_text.setScaleX((int) (x+1));
//                    map_text.setScaleY((int) (y+1));
//
//                    if(x>initialX-1){
//                        zoomout.setVisibility(View.VISIBLE);
//                    }
//
//
//                    if(x>=initialX+4){
//                        zoomin.setVisibility(View.INVISIBLE);
//                    }
//                }
//            });


//            zoomout.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    float x = map_basic.getScaleX();
//                    float y = map_basic.getScaleY();
//
//
//
//
//                    map_basic.setScaleX((int) (x-1));
//                    map_basic.setScaleY((int) (y-1));
//
//                    map_notxt.setScaleX((int) (x-1));
//                    map_notxt.setScaleY((int) (y-1));
//
//                    map_text.setScaleX((int) (x-1));
//                    map_text.setScaleY((int) (y-1));
//                    if(x<=initialX+5){
//                        zoomin.setVisibility(View.VISIBLE);
//                    }
//
//                    if(x<=initialX+1){
//                        zoomout.setVisibility(View.INVISIBLE);
//                    }
//                }
//            });





        }
}
