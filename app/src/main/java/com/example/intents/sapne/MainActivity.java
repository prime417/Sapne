package com.example.intents.sapne;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;


public class MainActivity extends BaseActivity {

    public Button btnJoinUs1,btnSubmit1,explore;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  setContentView(R.layout.activity_main);
        getLayoutInflater().inflate(R.layout.activity_main, frameLayout);
      /*  viewPager = (ViewPager) findViewById(R.id.viewpager);
        adapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(adapter);*/
        img=(ImageView)findViewById(R.id.mainimgview);
      // img.setImageResource(R.drawable.logo_sapne);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder().setDefaultFontPath("fonts/Roboto-Regular.ttf").setFontAttrId(R.attr.fontPath).build());


        // toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
       final int []imageArray={R.drawable.p11,R.drawable.p12,R.drawable.p3,R.drawable.p13,R.drawable.p6,R.drawable.p7,R.drawable.p8,R.drawable.p5,R.drawable.p14,R.drawable.p1};


        final Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            int i=0;
            public void run() {
                img.setImageResource(imageArray[i]);
                i++;
                if(i>imageArray.length-1)
                {
                    i=0;
                }
                handler.postDelayed(this, 4000);  //for interval...
            }
        };
       handler.postDelayed(runnable, 50); //for initial delay..


        explore=(Button)findViewById(R.id.explore);
            btnJoinUs1= (Button) findViewById(R.id.btnJoinUs1);
        btnSubmit1= (Button) findViewById(R.id.btnDonate1);





    /*  btnJoinUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),JoinUs.class);
                startActivity(intent);
            }
        });
*/


    }

        public void explore(View v)
        {

            Intent intent=new Intent(getApplicationContext(),NewFrag.class);
            startActivity(intent);

        }
    public void donate1(View v)
    {

        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.payumoney.com/paybypayumoney/#/206415"));
        startActivity(myIntent);

    }

    public void join1(View v)
    {
        Intent intent=new Intent(getApplicationContext(),JoinUs.class);
        startActivity(intent);




    }




}

