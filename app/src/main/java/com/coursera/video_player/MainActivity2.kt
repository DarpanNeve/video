package com.coursera.video_player

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView


class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val videoview =findViewById<VideoView>(R.id.videoView)
        val mediaController=MediaController(this)
        print("Hello")
        mediaController.setAnchorView(videoview)
        val uri:Uri= Uri.parse("android.resource://$packageName/raw/demo_1")
        videoview.setMediaController(mediaController)
        videoview.setVideoURI(uri)
        videoview.requestFocus()
        videoview.start()


    }
}