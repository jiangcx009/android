package com.example.android02;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.textservice.SentenceSuggestionsInfo;
import android.widget.Button;

public class SecondActivity extends BaseActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceStat) {
		super.onCreate(savedInstanceStat);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.second_layout);
		
		Button button = (Button)findViewById(R.id.button_2);
		button.setOnClickListener(new View.OnClickListener() {	
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Intent intent = new Intent(Intent.ACTION_VIEW);
				//intent.setData(Uri.parse("http://www.baidu.com"));
				//startActivity(intent);
				Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
				startActivityForResult(intent, 1);
			}
		});
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch (requestCode) {
		case 1:
			if (resultCode == RESULT_OK) {
				String returnedData = data.getStringExtra("data_return");
				Log.d("SecondActivity", returnedData);
			}
			break;
		default:
	}
	}
}
