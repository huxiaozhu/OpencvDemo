package com.huxiaozhu.opencvdemo

object MyDemo {
    // Used to load the 'opencvdemo' library on application startup.
    init {
        System.loadLibrary("opencvdemo")
    }
    /**
     * A native method that is implemented by the 'opencvdemo' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String
}