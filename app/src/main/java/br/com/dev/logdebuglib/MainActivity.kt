package br.com.dev.logdebuglib

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.dev.logutils.LogUtil

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        LogUtil.LogD("onResume Log Coverage")
    }

}
