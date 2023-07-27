package com.example.servicesexample

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings

class MusicService : Service() {

    private lateinit var mp : MediaPlayer

    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        mp = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI)
        mp.isLooping = true
        mp.start()
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        mp.stop()
    }
}