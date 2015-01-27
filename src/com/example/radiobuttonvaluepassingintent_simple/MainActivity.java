package com.example.radiobuttonvaluepassingintent_simple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity 
{
	RadioButton r1;
	
	Button b;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		r1=(RadioButton)findViewById(R.id.radioButton1);
		b=(Button)findViewById(R.id.button1);
		
		b.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				
				//String radiovalue=arg0.toString();
				String radiovalue=r1.getText().toString();
				
				Bundle bundle=new Bundle();
				
				bundle.putString("key_radio",radiovalue);
				
				
				Intent i=new Intent(MainActivity.this,Activity2.class);
				
				i.putExtras(bundle);
				
				startActivity(i);
				
				Toast.makeText(MainActivity.this,"The Value Passed is "+radiovalue,Toast.LENGTH_LONG).show();
				
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
