package com.test.justfragment;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends FragmentActivity {
	
	ListsScreen listsScreen;
	MyFragment2 myFrag2;
	MyFragment3 myFrag3;
	MyFragment4 myFrag4;
	MyFragment5 myFrag5;
	FragmentTransaction fTrans;
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    listsScreen= new ListsScreen();
    myFrag2 = new MyFragment2();
    myFrag3 = new MyFragment3();
    myFrag4 = new MyFragment4();
    myFrag5 = new MyFragment5();
    getSupportFragmentManager().beginTransaction().add(R.id.sec, myFrag2).commit();
    fTrans = getSupportFragmentManager().beginTransaction();
    fTrans.add(R.id.cont, listsScreen).commit();
  }
  public void onClick(View view){
	  fTrans = getSupportFragmentManager().beginTransaction();
	  switch (view.getId()) {
	    
	    case R.id.first_screen:
	    	fTrans.replace(R.id.cont, listsScreen).commit();
	    	break;
	    case R.id.second_screen:
	    	fTrans.replace(R.id.cont, myFrag5).commit();
	    	break;
	    case R.id.third_screen:
	    	fTrans.replace(R.id.cont, myFrag3).commit();
	    	break;
	    case R.id.forth_screen:
	    	fTrans.replace(R.id.cont, myFrag4).commit();
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