package br.com.dev.logutils

import android.util.Log

class LogUtil {
    companion object {
        fun LogD(message: String, id: String = "LogUtil"): Unit {
            Log.d(id, message)
        }
        fun LogI(message: String, id: String = "LogUtil"): Unit {
            Log.i(id, message)
        }
    }


}