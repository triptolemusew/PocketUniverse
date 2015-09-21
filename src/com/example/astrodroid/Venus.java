package com.example.astrodroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Venus extends Activity{

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.venus_layout);
		
		Button btnClose = (Button) findViewById(R.id.btnClose);
		
		btnClose.setOnClickListener(new View.OnClickListener(){
			public void onClick(View arg0){
				finish();
			}
		});
	}
}
