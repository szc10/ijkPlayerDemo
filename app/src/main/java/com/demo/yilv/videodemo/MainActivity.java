package com.demo.yilv.videodemo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.demo.yilv.videodemo.media.IRenderView;
import com.demo.yilv.videodemo.media.IjkVideoView;
import com.demo.yilv.videodemo.media.PlayerManager;



public class MainActivity extends AppCompatActivity {

    private IjkVideoView mVideoView;
    private PlayerManager player;

    private String url5 = "http://stream1.grtn.cn/tvs2/sd/live.m3u8?_ts&time=1518428696629";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mVideoView = (IjkVideoView) findViewById(R.id.video_view);


        /** 普通播放 start **/
        mVideoView.setAspectRatio(IRenderView.AR_ASPECT_FIT_PARENT);
        mVideoView.setVideoURI(Uri.parse(url5));
        mVideoView.start();

        /** 普通播放 end **/

        //initVideo();
    }

}
