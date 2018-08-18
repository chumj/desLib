package com.k3dx.game.zlib;

/**
 * Description: <br/>
 *
 * @author cmj
 * @since 2018/8/7
 */
public class NativeLib {
    static {
        System.loadLibrary("libdes");
    }
	
    public static native String desEncode(String src);
    public static native String desDecode(String src);
}
