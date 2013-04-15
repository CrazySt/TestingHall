package com.test.justfragment;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.*;
import android.support.v4.app.FragmentTransaction;
import android.widget.Button;
public class MainActivity extends FragmentActivity {
	
	ListMenu listMenu;
	PlayBar playBar;
	Console console;
	Equalizer equalizer;
	MyFragment5 myFrag5;
	FragmentTransaction fTrans;
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    listMenu= new ListMenu(this);
    playBar = new PlayBar();
    console = new Console();
    equalizer = new Equalizer();
    myFrag5 = new MyFragment5();
    getSupportFragmentManager().beginTransaction().add(R.id.sec, playBar).commit();
    getSupportFragmentManager().beginTransaction().add(R.id.cont, listMenu).commit();
  }
  public void onClick(View view){
	  fTrans = getSupportFragmentManager().beginTransaction();
	  switch (view.getId()) {
	    case R.id.listsMenuBtn:
	    	fTrans.replace(R.id.cont, listMenu).commit();
	    	break;
	    case R.id.second_screen:
	    	fTrans.replace(R.id.cont, myFrag5).commit();
	    	break;
	    case R.id.third_screen:
	    	fTrans.replace(R.id.cont, equalizer).commit();
	    	break;
	    case R.id.forth_screen:
	    	fTrans.replace(R.id.cont, console).commit();
	    	break;
	    default:
	      break;
	    }
  }
  
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }
}