package com.test.justfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;


public class Equalizer extends Fragment {
	public View onCreatView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		return inflater.inflate(R.layout.equalizer, null);
	}
	
	
}
