package com.test.justfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class Console extends Fragment implements OnClickListener{

  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    return inflater.inflate(R.layout.console, null);
  }

@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	
}
}