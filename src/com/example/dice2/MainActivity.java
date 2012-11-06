package com.example.dice2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	ImageView img_c, img_u;
	Button button;
	TextView textview;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		img_c = (ImageView) findViewById(R.id.ImageView2);
		img_u = (ImageView) findViewById(R.id.imageView1);
		button = (Button) findViewById(R.id.button1);
		textview = (TextView) findViewById(R.id.textView2);
		
		button.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void onClick(View v) {
		int ran_c = (int) Math.round(Math.random() * 5);
		int ran_u = (int) Math.round(Math.random() * 5);
		
		img_c.setImageResource(R.drawable.dice21 + ran_c);
		img_u.setImageResource(R.drawable.dice21 + ran_u);
		
		if(ran_c > ran_u ) {
			textview.setText("컴퓨터가 이겼어용");
		}else if(ran_c < ran_u) {
			textview.setText("너가 이겼어용");
		} else {
			textview.setText("비겼어요 다시하세용");
		}
	}
}
