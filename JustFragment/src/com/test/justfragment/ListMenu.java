package com.test.justfragment;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ListMenu extends Fragment implements OnClickListener{
	private MainActivity parent;
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View v = inflater.inflate(R.layout.lists_main_menu, null);
    Button b = (Button) v.findViewById(R.id.compositionsBtn);
    b.setOnClickListener(this);
    return v;
  }

  @Override
  public void onClick(View v) {
	  parent.getSupportFragmentManager().beginTransaction().replace(R.id.cont, parent.console).commit();
	
  }
  public ListMenu(MainActivity activity){
	  parent = activity;
  }
}