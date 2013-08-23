package com.example.menutest;
/**
 * 
 * ר��ΪĳһԪ���趨��menu������ʱ��������Ԫ�ؼ���
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
		//Ϊ�ı���ע�������Ĳ˵�
		registerForContextMenu(textView);
		
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		MenuInflater m = new MenuInflater(this);
		//�����˵��ļ�
		m.inflate(R.menu.main, menu);
		//Ϊ�˵�ͷ����ͼ��
		menu.setHeaderIcon(R.drawable.ic_launcher);
		menu.setHeaderTitle("��ѡ��������ɫ");
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.color1:
			textView.setTextColor(Color.rgb(255, 0, 0));
			textView.setText("��ɫ");
			Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
			break;
		case R.id.color2:
			textView.setTextColor(Color.rgb(0, 255, 0));
			textView.setText("��ɫ");
			Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();
			break;
		case R.id.color3:
			textView.setTextColor(Color.rgb(0, 0, 255));
			textView.setText("��ɫ");
			Toast.makeText(this, "3", Toast.LENGTH_SHORT).show();
			break;
		case R.id.color4:
			textView.setTextColor(Color.rgb(255, 180, 0));
			textView.setText("��ɫ");
			Toast.makeText(this, "4", Toast.LENGTH_SHORT).show();
			break;
		case R.id.color5:
			textView.setTextColor(Color.rgb(255, 255, 255));
			textView.setText("�ָ�Ĭ��");
			Toast.makeText(this, "5", Toast.LENGTH_SHORT).show();
			break;

		default:
			break;
		}
		return true;
	}
/**
 * 
 * ע�⣺��Ϊcontent�е�Ԫ�����menuʱ����������������Ҫ����xml���󣬱�����û���õ����ʴ�ʡ��
 * 
 * */
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.main, menu);
//		return true;
//	}

}
