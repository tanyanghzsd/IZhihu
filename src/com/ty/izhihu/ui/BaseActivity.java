package com.ty.izhihu.ui;

import android.app.Activity;
import android.widget.Toast;

public class BaseActivity extends Activity {

	void showMsg(String msg){
		Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
	}
	
	
}
