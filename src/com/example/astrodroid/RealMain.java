package com.example.astrodroid;

import com.example.astrodroid.adapter.TabsPagerAdapter;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.AlertDialog;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class RealMain extends FragmentActivity implements ActionBar.TabListener {

	private ViewPager viewPager;
	private TabsPagerAdapter mAdapter;
	private ActionBar actionBar;

	private String[] tabs = { "About Us", "Home", "Update" };

	@SuppressWarnings("deprecation")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.real_main);

		// Initilization
		viewPager = (ViewPager) findViewById(R.id.pager);
		actionBar = getActionBar();
		mAdapter = new TabsPagerAdapter(getSupportFragmentManager());

		viewPager.setAdapter(mAdapter);
		actionBar.setHomeButtonEnabled(false);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		// Adding Tabs
		for (String tab_name : tabs) {
			actionBar.addTab(actionBar.newTab().setText(tab_name).setTabListener(this));
		}
		viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

			@Override
			public void onPageSelected(int position) {
				// on changing the page
				// make respected tab selected
				actionBar.setSelectedNavigationItem(position);
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
			}
		});

		viewPager.setCurrentItem(1);
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

	private void CompanyAbout() {
		Intent i = new Intent(RealMain.this, CompanyAbout.class);
		startActivity(i);
	}

	private void MainActivity() {
		Intent i = new Intent(RealMain.this, ListofPlanets.class);
		startActivity(i);
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		viewPager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {

	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {

	}

	public void onBackPressed() {
		new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert).setTitle("Closing the App?")
				.setMessage("Are you sure you want to close Pocket Universe?")
				.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						finish();

					}

				}).setNegativeButton("No", null).show();
	}
}
