package com.xuexiang.libmp3lame;

/**
 * @author xuexiang
 * @since 2018/11/20 下午1:25
 */
public class Lame {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("lame-lib");
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public static native String getVersion();
}
