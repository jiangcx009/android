package com.example.android02;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;


public class ThirdActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("ThirdActivity", "create activity");
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.third_layout);
		
		Button button = (Button) findViewById(R.id.button_3);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.putExtra("data_return", "Hello FirstActivity");
				setResult(RESULT_OK, intent);
				Log.d("ThirdActivity", "task id" + getTaskId());
				finish();
				}
		});
		
		Button btn_finish = (Button)findViewById(R.id.button_4);
		btn_finish.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ActivityCollector.finishAll();
			}
		});
	}
}
