package com.example.astrodroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash1 extends Activity{
public static int SPLASH_TIME_OUT = 3000;

	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run(){
				//This method will be exectude once the timer is over
				//Start your app main activity
				Intent i = new Intent(Splash1.this, Splash2.class);
				startActivity(i);
				
				//close this activity
				finish();
			}
		}, SPLASH_TIME_OUT);
	}
}
