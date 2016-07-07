package com.example.android02;

import android.R.bool;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends BaseActivity {
	@Override
	
	protected void onCreate(Bundle savedInstanceStat) {
		super.onCreate(savedInstanceStat);
		//当下面这句执行时，onOptionsItemSelected函数失效
		//requestWindowFeature(Window.FEATURE_NO_TITLE); 
		setContentView(R.layout.first_layout);
		
		Button button1 = (Button) findViewById(R.id.button_1);
		button1.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Toast.makeText(FirstActivity.this, "you click button 1", Toast.LENGTH_SHORT).show();
				//Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
				Intent intent = new Intent("com.example.android02.ACTION_START");
				startActivity(intent);
			}
		});
	}
	
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		Log.d("Android02", "Get Menu");
		return true;
	}
	
	
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId()) {
		case R.id.add_item:
			Log.d("Android02", "add item");
			Toast.makeText(FirstActivity.this, "you clicked Add", Toast.LENGTH_SHORT).show();
			break;
		case R.id.remove_item:
			Toast.makeText(FirstActivity.this, "you clicked Remove", Toast.LENGTH_SHORT).show();
			break;
		default:
		}
		return true;
	}
		
}
