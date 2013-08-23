package com.example.menutest;
/**
 * 
 * 专门为某一元素设定的menu，启动时，长按该元素即可
 * 
 * **/
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private TextView textView = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		textView = (TextView)findViewById(R.id.show);
		//为文本框注册上下文菜单
		registerForContextMenu(textView);
		
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		MenuInflater m = new MenuInflater(this);
		//解析菜单文件
		m.inflate(R.menu.main, menu);
		//为菜单头设置图标
		menu.setHeaderIcon(R.drawable.ic_launcher);
		menu.setHeaderTitle("请选择文字颜色");
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.color1:
			textView.setTextColor(Color.rgb(255, 0, 0));
			textView.setText("红色");
			Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
			break;
		case R.id.color2:
			textView.setTextColor(Color.rgb(0, 255, 0));
			textView.setText("绿色");
			Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();
			break;
		case R.id.color3:
			textView.setTextColor(Color.rgb(0, 0, 255));
			textView.setText("蓝色");
			Toast.makeText(this, "3", Toast.LENGTH_SHORT).show();
			break;
		case R.id.color4:
			textView.setTextColor(Color.rgb(255, 180, 0));
			textView.setText("橙色");
			Toast.makeText(this, "4", Toast.LENGTH_SHORT).show();
			break;
		case R.id.color5:
			textView.setTextColor(Color.rgb(255, 255, 255));
			textView.setText("恢复默认");
			Toast.makeText(this, "5", Toast.LENGTH_SHORT).show();
			break;

		default:
			break;
		}
		return true;
	}
/**
 * 
 * 注意：当为content中的元素添加menu时，下面的这个函数需要更改xml对象，本例中没有用到，故此省略
 * 
 * */
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.main, menu);
//		return true;
//	}

}
