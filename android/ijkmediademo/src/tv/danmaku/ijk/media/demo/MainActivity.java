package tv.danmaku.ijk.media.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	private String rtmpAddress;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
        Button btn = (Button) this.findViewById(R.id.StartPlay1);
        final EditText et = (EditText) this.findViewById(R.id.RtmpAddress1);

        et.setText("http://live.3gv.ifeng.com/zixun.m3u8");
//        et.setText("rtmp://pull1.arenazb.hupu.com/test/789");
//        et.setText("http://172.16.52.31/test1.mp4");

        btn.setOnClickListener(new OnClickListener(){

        	public void onClick(View v) {
				
        		rtmpAddress = et.getText().toString();
        		
        		Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
        		intent.putExtra("videoPath", rtmpAddress);
        		startActivity(intent);
			}
        });
	}
}
