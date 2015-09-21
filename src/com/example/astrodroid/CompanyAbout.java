package com.example.astrodroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class CompanyAbout extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about_company);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.activity_main_actions, menu);

		return super.onCreateOptionsMenu(menu);
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.communities:
			
			return true;
		case R.id.home:
			RealMain();
			return true;
		case R.id.allplanets:
			MainActivity();
			return true;
		case R.id.created:
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}

	}
	private void RealMain() {
		Intent i = new Intent(CompanyAbout.this, RealMain.class);
		startActivity(i);
	}
	
	private void MainActivity(){
		Intent i = new Intent(CompanyAbout.this, ListofPlanets.class);
		startActivity(i);
	}
	
}

