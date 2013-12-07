package com.history.historytoday;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.DatePicker;


public class DatePickerActivity extends Activity{

	DatePicker datePicker;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity2);

	
	datePicker = (DatePicker) findViewById(R.id.datePicker);

	//---Button view---
	Button btnOpen = (Button) findViewById(R.id.btnSet);
	btnOpen.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			Toast.makeText(getBaseContext(),
			"Date selected:" + (datePicker.getMonth()+1) +    // getMonth() returns 0 for Jan, 1 for FEb....
			"/" + datePicker.getDayOfMonth() +
			"/" + datePicker.getYear() + "\n" ,
			Toast.LENGTH_LONG).show();
			startActivity(new Intent(DatePickerActivity.this, HistoryMain.class)); 
			}
	});
	}


	

}
