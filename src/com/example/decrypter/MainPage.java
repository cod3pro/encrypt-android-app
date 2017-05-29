package com.example.decrypter;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class MainPage extends Activity implements OnItemSelectedListener {
	double random1,random2,random3,random4,random5;
	int check1,check2,check3,check4,check5;
	
	EditText textbox;
	int guess;
	String s1,s2,s3,s4,s5;
	Spinner spinner1,spinner2,spinner3,spinner4,spinner5;
	TextView display1,display2,display3,display4,display5;
	Integer[] numbers = {1,2,3,4,5,6,7,8,9};
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
       
    	super.onCreate(savedInstanceState);
        
    	ArrayAdapter <Integer> adapter1 = new ArrayAdapter <Integer>(this, android.R.layout.simple_spinner_item, numbers);
    	
    	setContentView(R.layout.activity_main_page);
    	
    	spinner1 =(Spinner) findViewById(R.id.spinner01);
    	spinner2= (Spinner) findViewById(R.id.spinner02);
    	spinner3= (Spinner) findViewById(R.id.spinner03);
    	spinner4= (Spinner) findViewById(R.id.spinner04);
    	spinner5= (Spinner) findViewById(R.id.spinner05);
    	
    	
    	 display1 = (TextView) findViewById(R.id.txtdisplay1);
    	 display2 = (TextView) findViewById(R.id.txtdisplay2);
    	 display3 = (TextView) findViewById(R.id.txtdisplay3);
    	 display4 = (TextView) findViewById(R.id.txtdisplay4);
    	 display5 = (TextView) findViewById(R.id.txtdisplay5);
    	Button btnrandom = (Button) findViewById(R.id.btnrandom);
    	Button btn1 = (Button) findViewById(R.id.btn1);
    	
    	
    	
    	
    	
    	
        spinner1.setAdapter(adapter1);
    	spinner1.setOnItemSelectedListener(this);
    	spinner2.setAdapter(adapter1);
    	spinner2.setOnItemSelectedListener(this);
    	spinner3.setAdapter(adapter1);
    	spinner3.setOnItemSelectedListener(this);
    	spinner4.setAdapter(adapter1);
    	spinner4.setOnItemSelectedListener(this);
    	spinner5.setAdapter(adapter1);
    	spinner5.setOnItemSelectedListener(this);
            
       
        
        
        
        btnrandom.setOnClickListener( new View.OnClickListener() 
       { 
    	   
    	   
    	   
    	   public void onClick(View v) {
			// TODO Auto-generated method stub
			random1 = Math.floor(Math.random()*10);
			random2 = Math.floor(Math.random()*10);
			random3 = Math.floor(Math.random()*10);
			random4 = Math.floor(Math.random()*10);
			random5 = Math.floor(Math.random()*10);
			//display.setText("random:" + random1);
			
			
	
			/*check1 = Integer.parseInt(spinner1.getSelectedItem().toString()) ;
			
			*/
			
				
		}
       });
        

        btn1.setOnClickListener( new View.OnClickListener() 
       { 
    	   
    	   
    	   
    	   public void onClick(View v) {
			// TODO Auto-generated method stub
			
    		  
	
			
			if(check1==random1){
				display1.setTextColor(Color.GREEN);
				s1= Integer.toString(check1);
				display1.setText(s1);
			}
			else{
				display1.setTextColor(Color.RED);
				s1= Integer.toString(check1);
				display1.setText(s1);
				}
			
			if(check2==random2){
				display2.setTextColor(Color.GREEN);
				s2= Integer.toString(check2);
				display2.setText(s2);
				}
			else{
				display2.setTextColor(Color.RED);
				s2= Integer.toString(check2);
				display2.setText(s2);
				}
			
			if(check3==random3){
				display3.setTextColor(Color.GREEN);
				s3= Integer.toString(check3);
				display3.setText(s3);
				}
			else{
				display3.setTextColor(Color.RED);
				s3= Integer.toString(check3);
				display3.setText(s3);
				}
			
			if(check4==random4){
				display4.setTextColor(Color.GREEN);
				s4= Integer.toString(check4);
				display4.setText(s4);
				}
			else{
				display4.setTextColor(Color.RED);
				s4= Integer.toString(check4);
				display4.setText(s4);
				}
			
			if(check5==random5){
				display5.setTextColor(Color.GREEN);
				s5= Integer.toString(check5);
				display5.setText(s5);
				}
			else{
				display5.setTextColor(Color.RED);
				s5= Integer.toString(check5);
				display5.setText(s5);
				}
				
		}
       });

    }
    
    

    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_page, menu);
        return true;
    
   
    
}





	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		
	
		check1 = Integer.parseInt(spinner1.getSelectedItem().toString());
		
		
		check2 = Integer.parseInt(spinner2.getSelectedItem().toString()) ;
		
		
		check3 = Integer.parseInt(spinner3.getSelectedItem().toString()) ;
		
		check4 = Integer.parseInt(spinner4.getSelectedItem().toString()) ;
		
		
		check5 = Integer.parseInt(spinner5.getSelectedItem().toString()) ;
		
		}
		
	





	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}





	}

    

