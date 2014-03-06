package com.nico;

import java.io.File;

import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getsdcardStorage();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	@SuppressLint("NewApi")
	public void getsdcardStorage(){
//		Log.v("caodongquan", " "+Environment.getExternalStorageDirectory().getAbsolutePath());
//		Log.v("caodongquan", " /n");
		File[] ff = Environment.getExternalStorageDirectory().getParentFile().getParentFile().listFiles();
		for(File f :ff)
		{
			StatFs sts = new StatFs(f.getAbsolutePath());
			long blksize = sts.getBlockSizeLong();
			long avsize = sts.getAvailableBlocksLong();
			Log.v("caodongquan", f.getAbsolutePath()+"  "+(float)((blksize*avsize)/(1024*1024)));
		}
//		Environment.getRootDirectory();
//		if(Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED))
//		{
//			Log.v("caodongquan", " mounted ");
//		}
//		else
//		{
//			Log.v("caodongquan", " unmounted ");
//		}
//		
//		Environment.get
		
		
		
//		StatFs sts = new StatFs(Environment.getDataDirectory().getAbsolutePath());
//		long blksize = sts.getBlockSizeLong();
//		long avsize = sts.getAvailableBlocksLong();
//		Log.v("caodongquan", "data "+(blksize*avsize)/(1024*1024*1024));
//		
//		
//		StatFs sts1 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
//		long blksize1 = sts1.getBlockSizeLong();
//		long avsize1 = sts1.getAvailableBlocksLong();
//		Log.v("caodongquan", "ext "+(blksize1*avsize1)/(1024*1024*1024));
	}
}
