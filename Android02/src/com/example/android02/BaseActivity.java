package com.example.android02;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class BaseActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceStat) {
		super.onCreate(savedInstanceStat);
		Log.d("BaseActivity", getClass().getSimpleName());
		ActivityCollector.addActivity(this);
	}
}


