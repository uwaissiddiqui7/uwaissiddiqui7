package com.batchrename.bulkmultiplefile.renamer;

import android.app.Activity;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;

import java.io.File;
import java.util.*;
import java.text.*;
import java.util.ArrayList;
import java.util.HashMap;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.AdapterView;
import android.net.Uri;
import android.Manifest;
import android.content.pm.PackageManager;

public class PickerActivity extends Activity {
	
	
	private double n = 0;
	private String folder = "";
	private String UPfolder = "";
	private String path = "";
	
	private ArrayList<String> list = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> listmap = new ArrayList<>();
	
	private LinearLayout linear7;
	private ListView listview1;
	private LinearLayout linear8;
	private Button button1;
	private Button button2;
	private TextView pathtext;
	private TextView textview3;
	
	private SharedPreferences place;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.picker);
		initialize(_savedInstanceState);
		if (Build.VERSION.SDK_INT >= 23) {
			if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
			|| checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
				requestPermissions(new String[] {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1000);
			}
			else {
				initializeLogic();
			}
		}
		else {
			initializeLogic();
		}
	}
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		listview1 = (ListView) findViewById(R.id.listview1);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		pathtext = (TextView) findViewById(R.id.pathtext);
		textview3 = (TextView) findViewById(R.id.textview3);
		place = getSharedPreferences("place", Activity.MODE_PRIVATE);
		
		listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (FileUtil.isDirectory(list.get((int)(_position)))) {
					path = list.get((int)(_position));
					folder = list.get((int)(_position));
					_refreshing();
				}
				else {
					
				}
			}
		});
		
		listview1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
			@Override
			public boolean onItemLongClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				
				return true;
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (folder.equals("/storage")) {
					SketchwareUtil.showMessage(getApplicationContext(), "acces denied");
				}
				else {
					UPfolder = folder.substring((int)(0), (int)(folder.lastIndexOf("/")));
					folder = UPfolder;
					_refreshing();
				}
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				folder = FileUtil.getExternalStorageDir();
				_refreshing();
			}
		});
		
		pathtext.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				FileUtil.makeDir(FileUtil.getExternalFilesDir()+"/xxxx/");
				s
			}
		});
		
		textview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview3.setText(getExternalFilesDir());

				File sdcard = Environment.getExternalStorageDirectory();
				pathtext.setText(File);
			}
		});
	}
	private void initializeLogic() {
		setTitle("Select Folder");
		folder = FileUtil.getExternalStorageDir();
		pathtext.setText(FileUtil.getExternalStorageDir());
		place.edit().putString("place", FileUtil.getExternalStorageDir()).commit();
		_refreshing();
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		
	}
	private void _refreshing () {
		listmap.clear();
		FileUtil.listDir(folder, list);
		Collections.sort(list, new MyComparator());
		n = 0;
		for(int _repeat29 = 0; _repeat29 < (int)(list.size()); _repeat29++) {
			{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put("file", list.get((int)(n)));
				listmap.add(_item);
			}
			
			n++;
		}
		listview1.setAdapter(new Listview1Adapter(listmap));
		((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
	}
	
	
	private void _extra () {
	}
	
	private class MyComparator
	implements Comparator<String>{
		public int compare(String s1, String s2){
			if (s1==s2){ return 0; }
			
			if (FileUtil.isDirectory(s1) &&
			FileUtil.isFile(s2)){ return -1; }
			
			if (FileUtil.isFile(s1) && FileUtil.isDirectory(s2)){ return 1;}
			
			return s1.compareToIgnoreCase(s2);
		}
	}
	
	
	private void _setfilename (final String _text) {
		
		java.io.File directory = new java.io.File(path.substring(0, path.lastIndexOf("/"))); java.io.File oldfile = new java.io.File(path); java.io.File newfile = new java.io.File(directory, _text.trim()); oldfile.renameTo(newfile);
	}
	
	
	private void _setold () {
		
		
		
	}
	
	
	public class Listview1Adapter extends BaseAdapter {
		ArrayList<HashMap<String, Object>> _data;
		public Listview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		@Override
		public View getView(final int _position, View _view, ViewGroup _viewGroup) {
			LayoutInflater _inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View _v = _view;
			if (_v == null) {
				_v = _inflater.inflate(R.layout.cview, null);
			}
			
			final LinearLayout linear1 = (LinearLayout) _v.findViewById(R.id.linear1);
			final ImageView imageview3 = (ImageView) _v.findViewById(R.id.imageview3);
			final TextView textview1 = (TextView) _v.findViewById(R.id.textview1);
			final TextView textview2 = (TextView) _v.findViewById(R.id.textview2);
			
			textview1.setText(Uri.parse(list.get((int)(_position))).getLastPathSegment());
			if (FileUtil.isDirectory(list.get((int)(_position)))) {
				imageview3.setImageResource(R.drawable.ic_folder_black);
			}
			else {
				imageview3.setImageResource(R.drawable.ic_insert_drive_file_black);
			}
			textview2.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					path = list.get((int)(_position));
					place.edit().putString("place", list.get((int)(_position))).commit();
				}
			});
			
			return _v;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
