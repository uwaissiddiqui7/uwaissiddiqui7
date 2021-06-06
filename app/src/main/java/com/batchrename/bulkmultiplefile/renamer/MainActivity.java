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
import java.util.*;
import java.text.*;
import java.util.ArrayList;
import java.util.HashMap;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Switch;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.content.Intent;
import android.content.ClipData;
import android.net.Uri;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import java.text.DecimalFormat;
import android.Manifest;
import android.content.pm.PackageManager;

public class MainActivity extends Activity {
	
	public final int REQ_CD_FILE = 101;
	
	private double newname = 0;
	private double autoindex = 0;
	private double customsep1 = 0;
	private double customsep2 = 0;
	private double date = 0;
	private double n = 0;
	private String oldfile = "";
	private String newfile = "";
	private String path = "";
	private String one = "";
	private String two = "";
	private String four = "";
	private String five = "";
	private String three = "";
	private double autostart = 0;
	private double autoincreased = 0;
	private double start = 0;
	private String zero = "";
	private String dday = "";
	private String ddate = "";
	private String dhour = "";
	private String dmin = "";
	private String dsec = "";
	private String dyear = "";
	private String format = "";
	private String six = "";
	private String oneone = "";
	private double checking = 0;
	private double proceed = 0;
	private double number = 0;
	
	private ArrayList<String> list1 = new ArrayList<>();
	private ArrayList<String> list2 = new ArrayList<>();
	private ArrayList<String> list3 = new ArrayList<>();
	private ArrayList<String> list4 = new ArrayList<>();
	private ArrayList<String> list5 = new ArrayList<>();
	private ArrayList<String> oldextension = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> filemap = new ArrayList<>();
	private ArrayList<String> l1 = new ArrayList<>();
	private ArrayList<String> l2 = new ArrayList<>();
	private ArrayList<String> l3 = new ArrayList<>();
	private ArrayList<String> l4 = new ArrayList<>();
	private ArrayList<String> l5 = new ArrayList<>();
	private ArrayList<String> example = new ArrayList<>();
	private ArrayList<String> picked = new ArrayList<>();
	private ArrayList<String> l6 = new ArrayList<>();
	private ArrayList<String> just = new ArrayList<>();
	private ArrayList<String> brandnew = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> getfile = new ArrayList<>();
	
	private LinearLayout linearone;
	private LinearLayout lineartwo;
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private LinearLayout linear55;
	private LinearLayout linear57;
	private TextView textview1;
	private TextView textview2;
	private TextView textview62;
	private LinearLayout linear2;
	private LinearLayout linear47;
	private LinearLayout linear4;
	private LinearLayout linear8;
	private LinearLayout linear24;
	private LinearLayout linear25;
	private LinearLayout linear23;
	private LinearLayout linear26;
	private LinearLayout linear48;
	private LinearLayout linear49;
	private LinearLayout linear50;
	private LinearLayout linear51;
	private LinearLayout linear52;
	private LinearLayout linear53;
	private LinearLayout linear54;
	private Switch customold;
	private TextView textview45;
	private Switch changecase;
	private TextView textview46;
	private CheckBox oldlower;
	private TextView textoldlower;
	private CheckBox olduppers;
	private TextView oldupper;
	private Switch findnrep;
	private TextView textview49;
	private EditText previous;
	private TextView textview51;
	private EditText editnew;
	private CheckBox oldmatch;
	private TextView textview52;
	private LinearLayout linear7;
	private EditText editnewname;
	private Switch realname;
	private TextView textview3;
	private LinearLayout linear9;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private Switch indexing;
	private TextView textview4;
	private LinearLayout linear10;
	private TextView textview5;
	private EditText editauto_start;
	private TextView textview8;
	private EditText editauto_incresedby;
	private CheckBox checkzeropad;
	private TextView textview9;
	private Switch cusepate1;
	private TextView textview26;
	private EditText editcustomsep1;
	private Switch cuseparate2;
	private TextView textview28;
	private EditText editcustomsep2;
	private LinearLayout linear14;
	private LinearLayout linear39;
	private LinearLayout linear17;
	private Switch filedate;
	private TextView textview13;
	private LinearLayout linear42;
	private LinearLayout linear15;
	private LinearLayout linear44;
	private LinearLayout linear45;
	private TextView textview38;
	private TextView day;
	private CheckBox checkday;
	private TextView month;
	private CheckBox checkmonth;
	private TextView textview16;
	private CheckBox year;
	private TextView textview39;
	private TextView textview40;
	private CheckBox checkbox5;
	private TextView textview41;
	private CheckBox checkbox6;
	private TextView textview42;
	private CheckBox checkbox7;
	private CheckBox checkbox2;
	private TextView textview19;
	private EditText editdate_sep;
	private LinearLayout linear28;
	private Switch change_extension;
	private TextView textview30;
	private TextView textview31;
	private EditText editchangedext;
	private TextView textview37;
	private TextView textview43;
	private TextView textview53;
	private TextView textview54;
	private TextView textview55;
	private TextView textview56;
	private TextView textview57;
	private LinearLayout linear58;
	private ListView listview1;
	private LinearLayout linear34;
	private LinearLayout linear35;
	private LinearLayout linear60;
	private ListView listview4;
	private LinearLayout linear61;
	private LinearLayout linear63;
	private TextView textview32;
	private LinearLayout linear36;
	private LinearLayout linear37;
	private LinearLayout linear38;
	private Spinner spinnerv1;
	private Spinner spinnerv2;
	private Spinner spinner3;
	private Spinner spinner4;
	private Spinner spinner5;
	private TextView textview44;
	private Spinner oldextensio;
	private TextView textview34;
	private TextView textview58;
	private LinearLayout linear62;
	private CheckBox checkbox9;
	private TextView textview59;
	private CheckBox checkbox8;
	private TextView textview60;
	private TextView textview61;
	
	private Intent file = new Intent(Intent.ACTION_GET_CONTENT);
	private Intent screen = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
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
		
		linearone = (LinearLayout) findViewById(R.id.linearone);
		lineartwo = (LinearLayout) findViewById(R.id.lineartwo);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear55 = (LinearLayout) findViewById(R.id.linear55);
		linear57 = (LinearLayout) findViewById(R.id.linear57);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview62 = (TextView) findViewById(R.id.textview62);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear47 = (LinearLayout) findViewById(R.id.linear47);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		linear48 = (LinearLayout) findViewById(R.id.linear48);
		linear49 = (LinearLayout) findViewById(R.id.linear49);
		linear50 = (LinearLayout) findViewById(R.id.linear50);
		linear51 = (LinearLayout) findViewById(R.id.linear51);
		linear52 = (LinearLayout) findViewById(R.id.linear52);
		linear53 = (LinearLayout) findViewById(R.id.linear53);
		linear54 = (LinearLayout) findViewById(R.id.linear54);
		customold = (Switch) findViewById(R.id.customold);
		textview45 = (TextView) findViewById(R.id.textview45);
		changecase = (Switch) findViewById(R.id.changecase);
		textview46 = (TextView) findViewById(R.id.textview46);
		oldlower = (CheckBox) findViewById(R.id.oldlower);
		textoldlower = (TextView) findViewById(R.id.textoldlower);
		olduppers = (CheckBox) findViewById(R.id.olduppers);
		oldupper = (TextView) findViewById(R.id.oldupper);
		findnrep = (Switch) findViewById(R.id.findnrep);
		textview49 = (TextView) findViewById(R.id.textview49);
		previous = (EditText) findViewById(R.id.previous);
		textview51 = (TextView) findViewById(R.id.textview51);
		editnew = (EditText) findViewById(R.id.editnew);
		oldmatch = (CheckBox) findViewById(R.id.oldmatch);
		textview52 = (TextView) findViewById(R.id.textview52);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		editnewname = (EditText) findViewById(R.id.editnewname);
		realname = (Switch) findViewById(R.id.realname);
		textview3 = (TextView) findViewById(R.id.textview3);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		hscroll1 = (HorizontalScrollView) findViewById(R.id.hscroll1);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		indexing = (Switch) findViewById(R.id.indexing);
		textview4 = (TextView) findViewById(R.id.textview4);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		textview5 = (TextView) findViewById(R.id.textview5);
		editauto_start = (EditText) findViewById(R.id.editauto_start);
		textview8 = (TextView) findViewById(R.id.textview8);
		editauto_incresedby = (EditText) findViewById(R.id.editauto_incresedby);
		checkzeropad = (CheckBox) findViewById(R.id.checkzeropad);
		textview9 = (TextView) findViewById(R.id.textview9);
		cusepate1 = (Switch) findViewById(R.id.cusepate1);
		textview26 = (TextView) findViewById(R.id.textview26);
		editcustomsep1 = (EditText) findViewById(R.id.editcustomsep1);
		cuseparate2 = (Switch) findViewById(R.id.cuseparate2);
		textview28 = (TextView) findViewById(R.id.textview28);
		editcustomsep2 = (EditText) findViewById(R.id.editcustomsep2);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear39 = (LinearLayout) findViewById(R.id.linear39);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		filedate = (Switch) findViewById(R.id.filedate);
		textview13 = (TextView) findViewById(R.id.textview13);
		linear42 = (LinearLayout) findViewById(R.id.linear42);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear44 = (LinearLayout) findViewById(R.id.linear44);
		linear45 = (LinearLayout) findViewById(R.id.linear45);
		textview38 = (TextView) findViewById(R.id.textview38);
		day = (TextView) findViewById(R.id.day);
		checkday = (CheckBox) findViewById(R.id.checkday);
		month = (TextView) findViewById(R.id.month);
		checkmonth = (CheckBox) findViewById(R.id.checkmonth);
		textview16 = (TextView) findViewById(R.id.textview16);
		year = (CheckBox) findViewById(R.id.year);
		textview39 = (TextView) findViewById(R.id.textview39);
		textview40 = (TextView) findViewById(R.id.textview40);
		checkbox5 = (CheckBox) findViewById(R.id.checkbox5);
		textview41 = (TextView) findViewById(R.id.textview41);
		checkbox6 = (CheckBox) findViewById(R.id.checkbox6);
		textview42 = (TextView) findViewById(R.id.textview42);
		checkbox7 = (CheckBox) findViewById(R.id.checkbox7);
		checkbox2 = (CheckBox) findViewById(R.id.checkbox2);
		textview19 = (TextView) findViewById(R.id.textview19);
		editdate_sep = (EditText) findViewById(R.id.editdate_sep);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		change_extension = (Switch) findViewById(R.id.change_extension);
		textview30 = (TextView) findViewById(R.id.textview30);
		textview31 = (TextView) findViewById(R.id.textview31);
		editchangedext = (EditText) findViewById(R.id.editchangedext);
		textview37 = (TextView) findViewById(R.id.textview37);
		textview43 = (TextView) findViewById(R.id.textview43);
		textview53 = (TextView) findViewById(R.id.textview53);
		textview54 = (TextView) findViewById(R.id.textview54);
		textview55 = (TextView) findViewById(R.id.textview55);
		textview56 = (TextView) findViewById(R.id.textview56);
		textview57 = (TextView) findViewById(R.id.textview57);
		linear58 = (LinearLayout) findViewById(R.id.linear58);
		listview1 = (ListView) findViewById(R.id.listview1);
		linear34 = (LinearLayout) findViewById(R.id.linear34);
		linear35 = (LinearLayout) findViewById(R.id.linear35);
		linear60 = (LinearLayout) findViewById(R.id.linear60);
		listview4 = (ListView) findViewById(R.id.listview4);
		linear61 = (LinearLayout) findViewById(R.id.linear61);
		linear63 = (LinearLayout) findViewById(R.id.linear63);
		textview32 = (TextView) findViewById(R.id.textview32);
		linear36 = (LinearLayout) findViewById(R.id.linear36);
		linear37 = (LinearLayout) findViewById(R.id.linear37);
		linear38 = (LinearLayout) findViewById(R.id.linear38);
		spinnerv1 = (Spinner) findViewById(R.id.spinnerv1);
		spinnerv2 = (Spinner) findViewById(R.id.spinnerv2);
		spinner3 = (Spinner) findViewById(R.id.spinner3);
		spinner4 = (Spinner) findViewById(R.id.spinner4);
		spinner5 = (Spinner) findViewById(R.id.spinner5);
		textview44 = (TextView) findViewById(R.id.textview44);
		oldextensio = (Spinner) findViewById(R.id.oldextensio);
		textview34 = (TextView) findViewById(R.id.textview34);
		textview58 = (TextView) findViewById(R.id.textview58);
		linear62 = (LinearLayout) findViewById(R.id.linear62);
		checkbox9 = (CheckBox) findViewById(R.id.checkbox9);
		textview59 = (TextView) findViewById(R.id.textview59);
		checkbox8 = (CheckBox) findViewById(R.id.checkbox8);
		textview60 = (TextView) findViewById(R.id.textview60);
		textview61 = (TextView) findViewById(R.id.textview61);
		file.setType("*/*");
		file.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
		
		linearone.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		textview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				startActivityForResult(file, REQ_CD_FILE);
			}
		});
		
		textview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview2.setText(getfile.get((int)0).get("data").toString());
			}
		});
		
		textview62.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		linear52.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		customold.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					realname.setChecked(false);
					changecase.setEnabled(true);
					findnrep.setEnabled(true);
				}
				else {
					realname.setChecked(true);
					changecase.setEnabled(false);
					olduppers.setEnabled(false);
					oldlower.setEnabled(false);
					oldlower.setChecked(false);
					olduppers.setChecked(false);
					findnrep.setEnabled(false);
					previous.setEnabled(false);
					editnew.setEnabled(false);
					oldmatch.setEnabled(false);
				}
				_ccvvv();
			}
		});
		
		changecase.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					olduppers.setEnabled(true);
					oldlower.setEnabled(true);
				}
				else {
					olduppers.setEnabled(false);
					oldlower.setEnabled(false);
					oldlower.setChecked(false);
					olduppers.setChecked(false);
				}
			}
		});
		
		oldlower.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					olduppers.setChecked(false);
				}
				else {
					
				}
			}
		});
		
		olduppers.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		olduppers.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					oldlower.setChecked(false);
				}
				else {
					
				}
			}
		});
		
		findnrep.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					previous.setEnabled(true);
					editnew.setEnabled(true);
					oldmatch.setEnabled(true);
				}
				else {
					previous.setEnabled(false);
					editnew.setEnabled(false);
					oldmatch.setEnabled(false);
				}
			}
		});
		
		editnewname.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		realname.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					editnewname.setEnabled(true);
					customold.setChecked(false);
				}
				else {
					editnewname.setEnabled(false);
					customold.setChecked(true);
				}
				_ccvvv();
			}
		});
		
		indexing.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				_ccvvv();
				if (_isChecked) {
					editauto_start.setEnabled(true);
					editauto_incresedby.setEnabled(true);
					checkzeropad.setEnabled(true);
				}
				else {
					editauto_start.setEnabled(false);
					editauto_incresedby.setEnabled(false);
					checkzeropad.setEnabled(false);
				}
			}
		});
		
		cusepate1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				_ccvvv();
				if (_isChecked) {
					editcustomsep1.setEnabled(true);
				}
				else {
					editcustomsep1.setEnabled(false);
				}
			}
		});
		
		cuseparate2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				_ccvvv();
				if (_isChecked) {
					editcustomsep2.setEnabled(true);
				}
				else {
					editcustomsep2.setEnabled(false);
				}
			}
		});
		
		editcustomsep2.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		filedate.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				_ccvvv();
				if (_isChecked) {
					checkday.setEnabled(true);
					checkmonth.setEnabled(true);
					year.setEnabled(true);
					checkbox2.setEnabled(true);
					checkbox5.setEnabled(true);
					checkbox6.setEnabled(true);
					checkbox7.setEnabled(true);
				}
				else {
					checkday.setEnabled(false);
					checkmonth.setEnabled(false);
					year.setEnabled(false);
					checkbox5.setEnabled(false);
					checkbox6.setEnabled(false);
					checkbox7.setEnabled(false);
					checkbox2.setEnabled(false);
				}
			}
		});
		
		checkday.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					dday = "dd";
				}
				else {
					dday = "";
				}
			}
		});
		
		checkmonth.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					ddate = "MM";
				}
				else {
					ddate = "";
				}
			}
		});
		
		year.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					dyear = "yyyy";
				}
				else {
					dyear = "";
				}
			}
		});
		
		checkbox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					dhour = "hh";
				}
				else {
					dhour = "";
				}
			}
		});
		
		checkbox6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					dmin = "mm";
				}
				else {
					dmin = "";
				}
			}
		});
		
		checkbox7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					dsec = "ss";
				}
				else {
					dsec = "";
				}
			}
		});
		
		checkbox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					editdate_sep.setEnabled(true);
				}
				else {
					editdate_sep.setEnabled(false);
					editdate_sep.setText("");
				}
			}
		});
		
		change_extension.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				_spinner();
				if (_isChecked) {
					editchangedext.setEnabled(true);
				}
				else {
					editchangedext.setEnabled(false);
				}
			}
		});
		
		editchangedext.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (".".contains(_charSeq)) {
					SketchwareUtil.showMessage(getApplicationContext(), "remember : we also add dot (.) before new extension");
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview37.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (("Customized Old Name".equals(list1.get((int)(spinnerv1.getSelectedItemPosition()))) || "Customized Old Name".equals(list2.get((int)(spinnerv2.getSelectedItemPosition())))) || ("Customized Old Name".equals(list3.get((int)(spinner3.getSelectedItemPosition()))) || ("Customized Old Name".equals(list4.get((int)(spinner4.getSelectedItemPosition()))) || "Customized Old Name".equals(list5.get((int)(spinner5.getSelectedItemPosition())))))) {
					n = 0;
					if (findnrep.isChecked()) {
						if ((previous.getText().toString().equals("") || editnew.getText().toString().contains("/")) || previous.getText().toString().contains("/")) {
							SketchwareUtil.showMessage(getApplicationContext(), "Please Enter a valid input in \"Previous\" and \"New\" fields");
							checking = 1;
						}
						else {
							if (previous.getText().toString().equals(".") && oldmatch.isChecked()) {
								SketchwareUtil.showMessage(getApplicationContext(), "Please Disable \"Match Case\" option or change \"previous\" text field");
								checking = 1;
							}
							else {
								example.clear();
								path = Uri.parse(picked.get((int)(n))).getLastPathSegment();
								if (path.contains(".")) {
									one = path.substring(0, path.lastIndexOf("."));
								}
								else {
									one = path;
								}
								if (findnrep.isChecked()) {
									if (oldmatch.isChecked()) {
										one = one.replaceAll("(?i)" + previous.getText().toString(), editnew.getText().toString());
									}
									else {
										one = one.replace(previous.getText().toString(), editnew.getText().toString());
									}
								}
								else {
									
								}
								if (olduppers.isChecked()) {
									one = one.toUpperCase();
								}
								if (oldlower.isChecked()) {
									one = one.toLowerCase();
								}
								example.add(one);
								n++;
								if ("Customized Old Name".equals(list1.get((int)(spinnerv1.getSelectedItemPosition())))) {
									_copylist(l1, example);
								}
								if ("Customized Old Name".equals(list2.get((int)(spinnerv2.getSelectedItemPosition())))) {
									_copylist(l2, example);
								}
								if ("Customized Old Name".equals(list3.get((int)(spinner3.getSelectedItemPosition())))) {
									_copylist(l3, example);
								}
								if ("Customized Old Name".equals(list4.get((int)(spinner4.getSelectedItemPosition())))) {
									_copylist(l4, example);
								}
								if ("Customized Old Name".equals(list5.get((int)(spinner5.getSelectedItemPosition())))) {
									_copylist(l5, example);
								}
							}
						}
					}
					else {
						
					}
				}
				else {
					
				}
				textview37.setText(one);
				textview1.setText(path);
			}
		});
		
		textview43.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
				
			}
		});
		
		textview53.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				screen.setClass(getApplicationContext(), PickerActivity.class);
				startActivity(screen);
			}
		});
		
		textview54.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
				
			}
		});
		
		textview55.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
				
			}
		});
		
		textview56.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
				
			}
		});
		
		textview57.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
				
			}
		});
		
		textview32.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				format = dday.concat(editdate_sep.getText().toString().concat(ddate.concat(editdate_sep.getText().toString().concat(dyear.concat(editdate_sep.getText().toString().concat(dhour.concat(editdate_sep.getText().toString().concat(dmin.concat(editdate_sep.getText().toString().concat(dsec.concat(editdate_sep.getText().toString()))))))))))).replace(editdate_sep.getText().toString().concat(editdate_sep.getText().toString().concat(editdate_sep.getText().toString())).concat(editdate_sep.getText().toString().concat(editdate_sep.getText().toString().concat(editdate_sep.getText().toString()))), editdate_sep.getText().toString()).replace(editdate_sep.getText().toString().concat(editdate_sep.getText().toString()).concat(editdate_sep.getText().toString().concat(editdate_sep.getText().toString().concat(editdate_sep.getText().toString()))), editdate_sep.getText().toString()).replace(editdate_sep.getText().toString().concat(editdate_sep.getText().toString().concat(editdate_sep.getText().toString().concat(editdate_sep.getText().toString()))), editdate_sep.getText().toString()).replace(editdate_sep.getText().toString().concat(editdate_sep.getText().toString().concat(editdate_sep.getText().toString())), editdate_sep.getText().toString()).replace(editdate_sep.getText().toString().concat(editdate_sep.getText().toString()), editdate_sep.getText().toString());
			}
		});
		
		spinnerv1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (0 == _position) {
					if (realname.isEnabled()) {
						
					}
					else {
						spinnerv1.setSelection((int)(0));
					}
				}
				if (1 == _position) {
					
				}
				if (2 == _position) {
					
				}
				if (3 == _position) {
					
				}
				if (4 == _position) {
					
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		spinnerv2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		textview34.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (picked.size() == 0) {
					SketchwareUtil.showMessage(getApplicationContext(), "Please Select Files");
				}
				else {
					filemap.clear();
					brandnew.clear();
					l1.clear();
					l2.clear();
					l3.clear();
					l4.clear();
					l5.clear();
					l6.clear();
					n = 0;
					one = "";
					path = "";
					checking = 0;
					
					if (("New Name".equals(list1.get((int)(spinnerv1.getSelectedItemPosition()))) || "New Name".equals(list2.get((int)(spinnerv2.getSelectedItemPosition())))) || ("New Name".equals(list3.get((int)(spinner3.getSelectedItemPosition()))) || ("New Name".equals(list4.get((int)(spinner4.getSelectedItemPosition()))) || "New Name".equals(list5.get((int)(spinner5.getSelectedItemPosition())))))) {
						if (editnewname.getText().toString().equals("") || editnewname.getText().toString().contains("/")) {
							SketchwareUtil.showMessage(getApplicationContext(), "please Enter a valid input in \"New Name\" field or deselect New Name option it");
							checking = 1;
						}
						else {
							one = editnewname.getText().toString();
							example.clear();
							for(int _repeat851 = 0; _repeat851 < (int)(picked.size()); _repeat851++) {
								example.add(one);
							}
							if ("New Name".equals(list1.get((int)(spinnerv1.getSelectedItemPosition())))) {
								_copylist(l1, example);
							}
							if ("New Name".equals(list2.get((int)(spinnerv2.getSelectedItemPosition())))) {
								_copylist(l2, example);
							}
							if ("New Name".equals(list3.get((int)(spinner3.getSelectedItemPosition())))) {
								_copylist(l3, example);
							}
							if ("New Name".equals(list4.get((int)(spinner4.getSelectedItemPosition())))) {
								_copylist(l4, example);
							}
							if ("New Name".equals(list5.get((int)(spinner5.getSelectedItemPosition())))) {
								_copylist(l5, example);
							}
						}
					}
					else {
						
					}
					if (checking == 0) {
						if (("Auto Index Series".equals(list1.get((int)(spinnerv1.getSelectedItemPosition()))) || "Auto Index Series".equals(list2.get((int)(spinnerv2.getSelectedItemPosition())))) || ("Auto Index Series".equals(list3.get((int)(spinner3.getSelectedItemPosition()))) || ("Auto Index Series".equals(list4.get((int)(spinner4.getSelectedItemPosition()))) || "Auto Index Series".equals(list5.get((int)(spinner5.getSelectedItemPosition())))))) {
							if (editauto_incresedby.getText().toString().equals("") || editauto_start.getText().toString().contains("/")) {
								SketchwareUtil.showMessage(getApplicationContext(), "please Enter a valid name in both\n\"Start\" and \"Increased by\" field or deselect \"Auto Index\" option");
								checking = 1;
							}
							else {
								start = Double.parseDouble(editauto_start.getText().toString());
								autoincreased = Double.parseDouble(editauto_incresedby.getText().toString());
								if (checkzeropad.isChecked()) {
									zero = "00";
								}
								else {
									zero = "0";
								}
								example.clear();
								for(int _repeat875 = 0; _repeat875 < (int)(picked.size()); _repeat875++) {
									one = new DecimalFormat(zero).format(start);
									example.add(one);
									start = start + autoincreased;
								}
								if ("Auto Index Series".equals(list1.get((int)(spinnerv1.getSelectedItemPosition())))) {
									_copylist(l1, example);
								}
								if ("Auto Index Series".equals(list2.get((int)(spinnerv2.getSelectedItemPosition())))) {
									_copylist(l2, example);
								}
								if ("Auto Index Series".equals(list3.get((int)(spinner3.getSelectedItemPosition())))) {
									_copylist(l3, example);
								}
								if ("Auto Index Series".equals(list4.get((int)(spinner4.getSelectedItemPosition())))) {
									_copylist(l4, example);
								}
								if ("Auto Index Series".equals(list5.get((int)(spinner5.getSelectedItemPosition())))) {
									_copylist(l5, example);
								}
							}
						}
						else {
							
						}
					}
					if (checking == 0) {
						if (("Custom Separator 1".equals(list1.get((int)(spinnerv1.getSelectedItemPosition()))) || "Custom Separator 1".equals(list2.get((int)(spinnerv2.getSelectedItemPosition())))) || ("Custom Separator 1".equals(list3.get((int)(spinner3.getSelectedItemPosition()))) || ("Custom Separator 1".equals(list4.get((int)(spinner4.getSelectedItemPosition()))) || "Custom Separator 1".equals(list5.get((int)(spinner5.getSelectedItemPosition())))))) {
							if (editcustomsep1.getText().toString().equals("") || editnewname.getText().toString().contains("/")) {
								SketchwareUtil.showMessage(getApplicationContext(), "please Enter a valid input in \"Custom Separator 1\" field or deselect this option");
								checking = 1;
							}
							else {
								one = editcustomsep1.getText().toString();
								example.clear();
								for(int _repeat913 = 0; _repeat913 < (int)(picked.size()); _repeat913++) {
									example.add(one);
								}
								if ("Custom Separator 1".equals(list1.get((int)(spinnerv1.getSelectedItemPosition())))) {
									_copylist(l1, example);
								}
								if ("Custom Separator 1".equals(list2.get((int)(spinnerv2.getSelectedItemPosition())))) {
									_copylist(l2, example);
								}
								if ("Custom Separator 1".equals(list3.get((int)(spinner3.getSelectedItemPosition())))) {
									_copylist(l3, example);
								}
								if ("Custom Separator 1".equals(list4.get((int)(spinner4.getSelectedItemPosition())))) {
									_copylist(l4, example);
								}
								if ("Custom Separator 1".equals(list5.get((int)(spinner5.getSelectedItemPosition())))) {
									_copylist(l5, example);
								}
							}
						}
						else {
							
						}
					}
					if (checking == 0) {
						if (("Custom Separator 2".equals(list1.get((int)(spinnerv1.getSelectedItemPosition()))) || "Custom Separator 2".equals(list2.get((int)(spinnerv2.getSelectedItemPosition())))) || ("Custom Separator 2".equals(list3.get((int)(spinner3.getSelectedItemPosition()))) || ("Custom Separator 2".equals(list4.get((int)(spinner4.getSelectedItemPosition()))) || "Custom Separator 2".equals(list5.get((int)(spinner5.getSelectedItemPosition())))))) {
							if (editcustomsep2.getText().toString().equals("") || editcustomsep2.getText().toString().contains("/")) {
								SketchwareUtil.showMessage(getApplicationContext(), "please Enter a valid input in \"Custom Separator 2\" field or deselect this option");
								checking = 1;
							}
							else {
								one = editcustomsep2.getText().toString();
								example.clear();
								for(int _repeat973 = 0; _repeat973 < (int)(picked.size()); _repeat973++) {
									example.add(one);
								}
								if ("Custom Separator 2".equals(list1.get((int)(spinnerv1.getSelectedItemPosition())))) {
									_copylist(l1, example);
								}
								if ("Custom Separator 2".equals(list2.get((int)(spinnerv2.getSelectedItemPosition())))) {
									_copylist(l2, example);
								}
								if ("Custom Separator 2".equals(list3.get((int)(spinner3.getSelectedItemPosition())))) {
									_copylist(l3, example);
								}
								if ("Custom Separator 2".equals(list4.get((int)(spinner4.getSelectedItemPosition())))) {
									_copylist(l4, example);
								}
								if ("Custom Separator 2".equals(list5.get((int)(spinner5.getSelectedItemPosition())))) {
									_copylist(l5, example);
								}
							}
						}
						else {
							
						}
					}
					if (checking == 0) {
						if (("Add Date".equals(list1.get((int)(spinnerv1.getSelectedItemPosition()))) || "Add Date".equals(list2.get((int)(spinnerv2.getSelectedItemPosition())))) || ("Add Date".equals(list3.get((int)(spinner3.getSelectedItemPosition()))) || ("Add Date".equals(list4.get((int)(spinner4.getSelectedItemPosition()))) || "Add Date".equals(list5.get((int)(spinner5.getSelectedItemPosition())))))) {
							n = 0;
							example.clear();
							for(int _repeat1002 = 0; _repeat1002 < (int)(picked.size()); _repeat1002++) {
								path = picked.get((int)(n));
								try {
									
									java.io.File file = new java.io.File(path); 
									SimpleDateFormat sdf = new SimpleDateFormat(dday.concat(editdate_sep.getText().toString().concat(ddate.concat(editdate_sep.getText().toString().concat(dyear.concat(editdate_sep.getText().toString().concat(dhour.concat(editdate_sep.getText().toString().concat(dmin.concat(editdate_sep.getText().toString().concat(dsec.concat(editdate_sep.getText().toString()))))))))))).replace(editdate_sep.getText().toString().concat(editdate_sep.getText().toString().concat(editdate_sep.getText().toString())).concat(editdate_sep.getText().toString().concat(editdate_sep.getText().toString().concat(editdate_sep.getText().toString()))), editdate_sep.getText().toString()).replace(editdate_sep.getText().toString().concat(editdate_sep.getText().toString()).concat(editdate_sep.getText().toString().concat(editdate_sep.getText().toString().concat(editdate_sep.getText().toString()))), editdate_sep.getText().toString()).replace(editdate_sep.getText().toString().concat(editdate_sep.getText().toString().concat(editdate_sep.getText().toString().concat(editdate_sep.getText().toString()))), editdate_sep.getText().toString()).replace(editdate_sep.getText().toString().concat(editdate_sep.getText().toString().concat(editdate_sep.getText().toString())), editdate_sep.getText().toString()).replace(editdate_sep.getText().toString().concat(editdate_sep.getText().toString()), editdate_sep.getText().toString()));  one = sdf.format(file.lastModified());
								}
								catch (Exception e) {
									SketchwareUtil.showMessage(getApplicationContext(), "there is some error");
								}
								example.add(one);
								n++;
							}
							if ("Add Date".equals(list1.get((int)(spinnerv1.getSelectedItemPosition())))) {
								_copylist(l1, example);
							}
							if ("Add Date".equals(list2.get((int)(spinnerv2.getSelectedItemPosition())))) {
								_copylist(l2, example);
							}
							if ("Add Date".equals(list3.get((int)(spinner3.getSelectedItemPosition())))) {
								_copylist(l3, example);
							}
							if ("Add Date".equals(list4.get((int)(spinner4.getSelectedItemPosition())))) {
								_copylist(l4, example);
							}
							if ("Add Date".equals(list5.get((int)(spinner5.getSelectedItemPosition())))) {
								_copylist(l5, example);
							}
						}
						else {
							
						}
					}
					if (checking == 0) {
						if (("old name".equals(list1.get((int)(spinnerv1.getSelectedItemPosition()))) || "old name".equals(list2.get((int)(spinnerv2.getSelectedItemPosition())))) || ("old name".equals(list3.get((int)(spinner3.getSelectedItemPosition()))) || ("old name".equals(list4.get((int)(spinner4.getSelectedItemPosition()))) || "old name".equals(list5.get((int)(spinner5.getSelectedItemPosition())))))) {
							n = 0;
							example.clear();
							for(int _repeat1036 = 0; _repeat1036 < (int)(picked.size()); _repeat1036++) {
								path = Uri.parse(picked.get((int)(n))).getLastPathSegment();
								if (path.contains(".")) {
									one = path.substring(0, path.lastIndexOf("."));
								}
								else {
									one = path;
								}
								example.add(one);
								n++;
							}
							if ("old name".equals(list1.get((int)(spinnerv1.getSelectedItemPosition())))) {
								_copylist(l1, example);
							}
							if ("old name".equals(list2.get((int)(spinnerv2.getSelectedItemPosition())))) {
								_copylist(l2, example);
							}
							if ("old name".equals(list3.get((int)(spinner3.getSelectedItemPosition())))) {
								_copylist(l3, example);
							}
							if ("old name".equals(list4.get((int)(spinner4.getSelectedItemPosition())))) {
								_copylist(l4, example);
							}
							if ("old name".equals(list5.get((int)(spinner5.getSelectedItemPosition())))) {
								_copylist(l5, example);
							}
						}
						else {
							
						}
					}
					if (checking == 0) {
						if (("Customized Old Name".equals(list1.get((int)(spinnerv1.getSelectedItemPosition()))) || "Customized Old Name".equals(list2.get((int)(spinnerv2.getSelectedItemPosition())))) || ("Customized Old Name".equals(list3.get((int)(spinner3.getSelectedItemPosition()))) || ("Customized Old Name".equals(list4.get((int)(spinner4.getSelectedItemPosition()))) || "Customized Old Name".equals(list5.get((int)(spinner5.getSelectedItemPosition())))))) {
							if (findnrep.isChecked()) {
								if ((previous.getText().toString().equals("") || editnew.getText().toString().contains("/")) || previous.getText().toString().contains("/")) {
									SketchwareUtil.showMessage(getApplicationContext(), "Please Enter a valid input in \"Previous\" and \"New\" fields");
									checking = 1;
								}
								else {
									
								}
							}
							else {
								
							}
							if (previous.getText().toString().equals(".") && oldmatch.isChecked()) {
								SketchwareUtil.showMessage(getApplicationContext(), "Please Disable \"Match Case\" option or change \"previous\" text field");
								checking = 1;
							}
							else {
								
							}
							if (checking == 0) {
								n = 0;
								example.clear();
								for(int _repeat1645 = 0; _repeat1645 < (int)(picked.size()); _repeat1645++) {
									path = Uri.parse(picked.get((int)(n))).getLastPathSegment();
									if (path.contains(".")) {
										one = path.substring(0, path.lastIndexOf("."));
									}
									else {
										one = path;
									}
									if (findnrep.isChecked()) {
										if (oldmatch.isChecked()) {
											one = one.replaceAll("(?i)" + previous.getText().toString(), editnew.getText().toString());
										}
										else {
											one = one.replace(previous.getText().toString(), editnew.getText().toString());
										}
									}
									else {
										
									}
									if (olduppers.isChecked()) {
										one = one.toUpperCase();
									}
									if (oldlower.isChecked()) {
										one = one.toLowerCase();
									}
									example.add(one);
									n++;
								}
								if ("Customized Old Name".equals(list1.get((int)(spinnerv1.getSelectedItemPosition())))) {
									_copylist(l1, example);
								}
								if ("Customized Old Name".equals(list2.get((int)(spinnerv2.getSelectedItemPosition())))) {
									_copylist(l2, example);
								}
								if ("Customized Old Name".equals(list3.get((int)(spinner3.getSelectedItemPosition())))) {
									_copylist(l3, example);
								}
								if ("Customized Old Name".equals(list4.get((int)(spinner4.getSelectedItemPosition())))) {
									_copylist(l4, example);
								}
								if ("Customized Old Name".equals(list5.get((int)(spinner5.getSelectedItemPosition())))) {
									_copylist(l5, example);
								}
							}
						}
						else {
							
						}
					}
					if (("None".equals(list1.get((int)(spinnerv1.getSelectedItemPosition()))) || "None".equals(list2.get((int)(spinnerv2.getSelectedItemPosition())))) || ("None".equals(list3.get((int)(spinner3.getSelectedItemPosition()))) || ("None".equals(list4.get((int)(spinner4.getSelectedItemPosition()))) || "None".equals(list5.get((int)(spinner5.getSelectedItemPosition())))))) {
						example.clear();
						for(int _repeat1315 = 0; _repeat1315 < (int)(picked.size()); _repeat1315++) {
							example.add("");
						}
						if ("None".equals(list1.get((int)(spinnerv1.getSelectedItemPosition())))) {
							_copylist(l1, example);
						}
						if ("None".equals(list2.get((int)(spinnerv2.getSelectedItemPosition())))) {
							_copylist(l2, example);
						}
						if ("None".equals(list3.get((int)(spinner3.getSelectedItemPosition())))) {
							_copylist(l3, example);
						}
						if ("None".equals(list4.get((int)(spinner4.getSelectedItemPosition())))) {
							_copylist(l4, example);
						}
						if ("None".equals(list5.get((int)(spinner5.getSelectedItemPosition())))) {
							_copylist(l5, example);
						}
					}
					_exten();
				}
			}
		});
		
		textview61.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) { Intent i = new Intent(Intent.ACTION_OPEN_DOCUMENT_TREE); i.addCategory(Intent.CATEGORY_DEFAULT); startActivityForResult(Intent.createChooser(i, "Choose directory"), 9999); }
				SketchwareUtil.showMessage(getApplicationContext(), "Please select Empty folder to avoid error");
			}
		});
	}
	private void initializeLogic() {
		list1.add("None");
		list2.add("None");
		list3.add("None");
		list4.add("None");
		list5.add("None");
		list1.add("old name");
		list2.add("old name");
		list3.add("old name");
		list4.add("old name");
		list5.add("old name");
		oldextension.add("old extension");
		oldextension.add("old ext. lowercase");
		oldextension.add("old ext. UPPERCASE");
		oldextension.add("no extension");
		customold.setChecked(true);
		oldextensio.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, oldextension));
		((ArrayAdapter)oldextensio.getAdapter()).notifyDataSetChanged();
		_spinrefresh();
		n = 0;
		checking = 0;
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			case REQ_CD_FILE:
			if (_resultCode == Activity.RESULT_OK) {
				ArrayList<String> _filePath = new ArrayList<>();
				if (_data != null) {
					if (_data.getClipData() != null) {
						for (int _index = 0; _index < _data.getClipData().getItemCount(); _index++) {
							ClipData.Item _item = _data.getClipData().getItemAt(_index);
							_filePath.add(FileUtil.convertUriToFilePath(getApplicationContext(), _item.getUri()));
						}
					}
					else {
						_filePath.add(FileUtil.convertUriToFilePath(getApplicationContext(), _data.getData()));
					}
				}
				getfile.clear();
				n = 0;
				for(int _repeat72 = 0; _repeat72 < (int)(_filePath.size()); _repeat72++) {
					if (picked.contains(_filePath.get((int)(n)))) {
						SketchwareUtil.showMessage(getApplicationContext(), "Some Files is Already Exist in previously Picked File");
						n++;
					}
					else {
						picked.add(_filePath.get((int)(n)));
						n++;
					}
				}
				n = 0;
				for(int _repeat88 = 0; _repeat88 < (int)(picked.size()); _repeat88++) {
					{
						HashMap<String, Object> _item = new HashMap<>();
						_item.put("data", picked.get((int)(n)));
						getfile.add(_item);
					}
					
					n++;
				}
				listview1.setAdapter(new Listview1Adapter(getfile));
				((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
				textview1.setText("Add More Files");
				n = 0;
			}
			else {
				
			}
			break;
			default:
			break;
		}
	}
	
	private void _spinner () {
		oldextension.clear();
		if (change_extension.isChecked()) {
			oldextension.add("New Extension");
		}
		else {
			oldextension.add("old extension");
			oldextension.add("old ext. lowercase");
			oldextension.add("old ext. UPPERCASE");
		}
		oldextension.add("no extension");
		oldextensio.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, oldextension));
		((ArrayAdapter)oldextensio.getAdapter()).notifyDataSetChanged();
	}
	
	
	private void _ccvvv () {
		list1.clear();
		list2.clear();
		list3.clear();
		list4.clear();
		list5.clear();
		list1.add("None");
		list2.add("None");
		list3.add("None");
		list4.add("None");
		list5.add("None");
		if (customold.isChecked()) {
			list1.add("Customized Old Name");
			list2.add("Customized Old Name");
			list3.add("Customized Old Name");
			list4.add("Customized Old Name");
			list5.add("Customized Old Name");
		}
		if (realname.isChecked()) {
			list1.add("New Name");
			list2.add("New Name");
			list3.add("New Name");
			list4.add("New Name");
			list5.add("New Name");
		}
		if (indexing.isChecked()) {
			list1.add("Auto Index Series");
			list2.add("Auto Index Series");
			list3.add("Auto Index Series");
			list4.add("Auto Index Series");
			list5.add("Auto Index Series");
		}
		if (cusepate1.isChecked()) {
			list1.add("Custom Separator 1");
			list2.add("Custom Separator 1");
			list3.add("Custom Separator 1");
			list4.add("Custom Separator 1");
			list5.add("Custom Separator 1");
		}
		if (cuseparate2.isChecked()) {
			list1.add("Custom Separator 2");
			list2.add("Custom Separator 2");
			list3.add("Custom Separator 2");
			list4.add("Custom Separator 2");
			list5.add("Custom Separator 2");
		}
		if (filedate.isChecked()) {
			list1.add("Add Date");
			list2.add("Add Date");
			list3.add("Add Date");
			list4.add("Add Date");
			list5.add("Add Date");
		}
		list1.add("old name");
		list2.add("old name");
		list3.add("old name");
		list4.add("old name");
		list5.add("old name");
		_spinrefresh();
	}
	
	
	private void _setfilename (final String _text) {
		path = filemap.get((int)n).get("file").toString();
		java.io.File directory = new java.io.File(path.substring(0, path.lastIndexOf("/"))); java.io.File oldfile = new java.io.File(path); java.io.File newfile = new java.io.File(directory, _text.trim()); oldfile.renameTo(newfile);
		n++;
	}
	
	
	private void _spinrefresh () {
		spinnerv2.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, list2));
		((ArrayAdapter)spinnerv2.getAdapter()).notifyDataSetChanged();
		spinnerv1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, list1));
		((ArrayAdapter)spinnerv1.getAdapter()).notifyDataSetChanged();
		spinner3.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, list3));
		((ArrayAdapter)spinner3.getAdapter()).notifyDataSetChanged();
		spinner5.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, list5));
		((ArrayAdapter)spinner5.getAdapter()).notifyDataSetChanged();
		spinner4.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, list4));
		((ArrayAdapter)spinner4.getAdapter()).notifyDataSetChanged();
	}
	
	
	private void _exten () {
		n = 0;
		if (checking == 0) {
			if ("old extension".equals(oldextension.get((int)(oldextensio.getSelectedItemPosition())))) {
				for(int _repeat119 = 0; _repeat119 < (int)(picked.size()); _repeat119++) {
					path = Uri.parse(picked.get((int)(n))).getLastPathSegment();
					if (path.contains(".")) {
						six = path.substring((int)(path.lastIndexOf(".")), (int)(path.length()));
					}
					else {
						six = "";
					}
					l6.add(six);
					n++;
				}
			}
			else {
				
			}
			if ("old ext. lowercase".equals(oldextension.get((int)(oldextensio.getSelectedItemPosition())))) {
				for(int _repeat133 = 0; _repeat133 < (int)(picked.size()); _repeat133++) {
					path = Uri.parse(picked.get((int)(n))).getLastPathSegment();
					if (path.contains(".")) {
						six = path.substring((int)(path.lastIndexOf(".")), (int)(path.length())).toLowerCase();
					}
					else {
						six = "";
					}
					l6.add(six);
					n++;
				}
			}
			else {
				
			}
			if ("old ext. UPPERCASE".equals(oldextension.get((int)(oldextensio.getSelectedItemPosition())))) {
				for(int _repeat139 = 0; _repeat139 < (int)(picked.size()); _repeat139++) {
					path = Uri.parse(picked.get((int)(n))).getLastPathSegment();
					if (path.contains(".")) {
						six = path.substring((int)(path.lastIndexOf(".")), (int)(path.length())).toUpperCase();
					}
					else {
						six = "";
					}
					l6.add(six);
					n++;
				}
			}
			else {
				
			}
			if ("New Extension".equals(oldextension.get((int)(oldextensio.getSelectedItemPosition())))) {
				if (editchangedext.getText().toString().equals("") || editchangedext.getText().toString().contains("/")) {
					SketchwareUtil.showMessage(getApplicationContext(), "please enter a valid input in \"New Extension\" field");
					checking = 1;
				}
				else {
					for(int _repeat144 = 0; _repeat144 < (int)(picked.size()); _repeat144++) {
						six = editchangedext.getText().toString();
						l6.add(six);
						n++;
					}
				}
			}
			else {
				
			}
			if (checking == 0) {
				if ("no extension".equals(oldextension.get((int)(oldextensio.getSelectedItemPosition())))) {
					for(int _repeat149 = 0; _repeat149 < (int)(picked.size()); _repeat149++) {
						six = "";
						l6.add(six);
						n++;
					}
				}
				number = 0;
				for(int _repeat274 = 0; _repeat274 < (int)(picked.size()); _repeat274++) {
					{
						HashMap<String, Object> _item = new HashMap<>();
						_item.put("data", l1.get((int)(number)).concat(l2.get((int)(number)).concat(l3.get((int)(number))).concat(l4.get((int)(number)).concat(l5.get((int)(number)).concat(l6.get((int)(number)))))));
						filemap.add(_item);
					}
					
					number++;
				}
				listview4.setAdapter(new Listview4Adapter(filemap));
				((BaseAdapter)listview4.getAdapter()).notifyDataSetChanged();
			}
		}
	}
	
	
	private void _copylist (final ArrayList<String> _list, final ArrayList<String> _fromlist) {
		_list.addAll(_fromlist);
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
				_v = _inflater.inflate(R.layout.get, null);
			}
			
			final LinearLayout linear1 = (LinearLayout) _v.findViewById(R.id.linear1);
			final TextView textview1 = (TextView) _v.findViewById(R.id.textview1);
			final TextView textview2 = (TextView) _v.findViewById(R.id.textview2);
			
			textview1.setText(String.valueOf((long)(1 + _position)).concat(")"));
			textview2.setText(getfile.get((int)_position).get("data").toString());
			
			return _v;
		}
	}
	
	public class Listview4Adapter extends BaseAdapter {
		ArrayList<HashMap<String, Object>> _data;
		public Listview4Adapter(ArrayList<HashMap<String, Object>> _arr) {
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
				_v = _inflater.inflate(R.layout.list, null);
			}
			
			final LinearLayout linear1 = (LinearLayout) _v.findViewById(R.id.linear1);
			final TextView textview3 = (TextView) _v.findViewById(R.id.textview3);
			final TextView textview1 = (TextView) _v.findViewById(R.id.textview1);
			final LinearLayout linear2 = (LinearLayout) _v.findViewById(R.id.linear2);
			final TextView textview2 = (TextView) _v.findViewById(R.id.textview2);
			
			textview2.setText(filemap.get((int)_position).get("data").toString());
			textview1.setText(getfile.get((int)_position).get("data").toString());
			textview3.setText(String.valueOf((long)(1 + _position)).concat(")"));
			
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
