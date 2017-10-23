package com.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class AppActivity extends Activity {
	String tag = "lifecycle";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.appactivity);
		Log.d(tag, "In the OnCreate() event");
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.d(tag, "In the onStart() event");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d(tag, "In the onRestart() event");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d(tag, "In the onResume() event");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.d(tag, "In the onPause() event");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.d(tag, "In the onStop() event");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(tag, "In the onDestroy() event");
	}
}
