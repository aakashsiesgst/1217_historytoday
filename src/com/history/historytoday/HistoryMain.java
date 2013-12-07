package com.history.historytoday;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


public class HistoryMain extends Activity {
String[] hist_events = {
		"1814 - 1st plastic surgery is performed in England",
		"1824 - 1st steam locomotive is introduced",
		"1915 - 25,000 women march in NYC, demanding right to vote",
		"1917 - 1st Infantry division 'Big Red One' shoots 1st US shot in WW I",
		"1941 - Walt Disney's 'Dumbo' released",
		"1942 - During WW II, Britain launches major offensive at El Alamein, Egypt",
		"1956 - 1st video recording on magnetic tape televised coast-to-coast",
		"1956 - Revolt against Stalinist policies begins in Hungary",
		"1959 - Chinese troops move into India, 17 die",
		"1989 - Hungary proclaims itself a republic & declares communist rule ended",
		"1993 - Paramilitia kills 22 demonstrators at Bijbihara Kashmir",
		"1981 - US national debt hits $1 trillion",
		"2001 - Apple releases the iPod",
		"2004 - A powerful earthquake and its aftershocks hit Niigata prefecture, northern Japan, killing 35 people, injuring 2,200, and leaving 85,000 homeless or evacuated",
		"2012 - 12 people are killed and 40 are injured in a hospital fire in Tainan, Taiwan"
	};
Button dateBtn;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ListView l = (ListView) findViewById(android.R.id.list);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		        android.R.layout.simple_list_item_1, hist_events);
		l.setAdapter(adapter);
		
		/*getListView().setChoiceMode(0);
		setListAdapter(new ArrayAdapter<String>(this, 
				
				android.R.layout.simple_list_item_1, hist_events));*/
		
		dateBtn = (Button) findViewById(R.id.button1);
		 //Intent i = new Intent(this, DatePickerActivity.class);
		dateBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               
				startActivity(new Intent(HistoryMain.this, DatePickerActivity.class)); 
            }
        });
	
	}

	/*public void onListItemClick(ListView parent, View v, int position, long id)
	{
		Toast.makeText(this, hist_events[position] + " selected ", Toast.LENGTH_SHORT).show();
	}*/
	
	
}