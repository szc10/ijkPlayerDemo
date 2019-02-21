package com.demo.yilv.videodemo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.demo.yilv.videodemo.media.IRenderView;
import com.demo.yilv.videodemo.media.IjkVideoView;
import com.demo.yilv.videodemo.media.PlayerManager;



public class MainActivity extends AppCompatActivity {

    private IjkVideoView mVideoView;
    RelativeLayout relativeLayout;

    private String url5 = "rtmp://release.wowza.mofangvr.com/live/shenghuo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        relativeLayout =  this.findViewById(R.id.laout);
    }

    /**
     * 打开当前的拉流
     * @param view
     */
    public void start(View view){
        Log.v("start","start");
        IjkVideoView ijkVideoView = new IjkVideoView(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,RelativeLayout.LayoutParams.MATCH_PARENT);
        ijkVideoView.setLayoutParams(layoutParams);

        relativeLayout.addView(ijkVideoView);

        mVideoView = ijkVideoView;
//        /** 普通播放 start **/
        mVideoView.setAspectRatio(IRenderView.AR_ASPECT_FIT_PARENT);
        mVideoView.setVideoURI(Uri.parse(url5));
        mVideoView.start();

    }

    /**
     * 关闭当前的推流
     * @param view
     */
    public void close(View view){
        Log.v("close","close");
        mVideoView.release(true);
        relativeLayout.removeView(mVideoView);
    }



}
