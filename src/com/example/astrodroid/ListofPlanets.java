package com.example.astrodroid;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListofPlanets extends ListActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Storing resources into array
		String[] list_planets = getResources().getStringArray(R.array.Planets);
		// Binding resources Array to ListAdapter
		this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.label, list_planets));

		ListView lv = getListView();
		// Listening to single list item on click
		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				String mystring = (String) parent.getAdapter().getItem(position);
				if (mystring.equals("Mercury")) {
					Intent nextScreen = new Intent(getApplicationContext(), Mercury.class);
					startActivity(nextScreen);
				}
				if (mystring.equals("Venus")) {
					Intent nextScreen = new Intent(getApplicationContext(), Venus.class);
					startActivity(nextScreen);
				}
				if (mystring.equals("Earth")) {
					Intent nextScreen = new Intent(getApplicationContext(), Earth.class);
					startActivity(nextScreen);
				}
				if (mystring.equals("Mars")) {
					Intent nextScreen = new Intent(getApplicationContext(), Mars.class);
					startActivity(nextScreen);

				}
				if (mystring.equals("Jupiter")) {
					Intent nextScreen = new Intent(getApplicationContext(), Jupiter.class);
					startActivity(nextScreen);
				}
				if (mystring.equals("Saturn")) {
					Intent nextScreen = new Intent(getApplicationContext(), Saturn.class);
					startActivity(nextScreen);
				}
				if (mystring.equals("Uranus")) {
					Intent nextScreen = new Intent(getApplicationContext(), Uranus.class);
					startActivity(nextScreen);
				}
				if (mystring.equals("Neptune")) {
					Intent nextScreen = new Intent(getApplicationContext(), Neptune.class);
					startActivity(nextScreen);
				}
				if (mystring.equals("Pluto(Dwarf Planet)")) {
					Intent nextScreen = new Intent(getApplicationContext(), Pluto.class);
					startActivity(nextScreen);
				}

			}
		});
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
			CompanyAbout();
			return true;
		case R.id.home:
			RealMain();
			return true;
		case R.id.allplanets:
			return true;
		case R.id.created:
			return true;

		default:
			return super.onOptionsItemSelected(item);
		}

	}

	private void RealMain() {
		Intent i = new Intent(ListofPlanets.this, RealMain.class);
		startActivity(i);
	}

	private void CompanyAbout() {
		Intent i = new Intent(ListofPlanets.this, CompanyAbout.class);
		startActivity(i);
	}

}
