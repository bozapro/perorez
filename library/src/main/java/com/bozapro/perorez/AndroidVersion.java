package com.bozapro.perorez;

import android.os.Build;

/**
 * Helper class for resolving Android Version.
 */
public class AndroidVersion {
    private static final int _ANDROID_SDK_VERSION = Build.VERSION.SDK_INT;

    /**
     * Returns true if running on development or preview version of Android.
     */
    public static boolean isPreviewVersion() {
        return _ANDROID_SDK_VERSION >= Build.VERSION_CODES.CUR_DEVELOPMENT;
    }

    /**
     * Gets the SDK Level available to the device.
     */
    public static int getSdkVersion() {
        return _ANDROID_SDK_VERSION;
    }

    /**
     * Returns true if running on Android 1.5 or higher.
     */
    public static boolean isCupcakeOrHigher() {
        return _ANDROID_SDK_VERSION >= Build.VERSION_CODES.CUPCAKE;
    }

    /**
     * Returns true if running on Android 1.6 or higher.
     */
    public static boolean isDonutOrHigher() {
        return _ANDROID_SDK_VERSION >= Build.VERSION_CODES.DONUT;
    }

    /**
     * Returns true if running on Android 2.0 or higher.
     */
    public static boolean isEclairOrHigher() {
        return _ANDROID_SDK_VERSION >= Build.VERSION_CODES.ECLAIR;
    }

    /**
     * Returns true if running on Android 2.1-update1 or higher.
     */
    public static boolean isEclairMr1OrHigher() {
        return _ANDROID_SDK_VERSION >= Build.VERSION_CODES.ECLAIR_MR1;
    }

    /**
     * Returns true if running on Android 2.2 or higher.
     */
    public static boolean isFroyoOrHigher() {
        return _ANDROID_SDK_VERSION >= Build.VERSION_CODES.FROYO;
    }

    /**
     * Returns true if running on Android 2.3 or higher.
     */
    public static boolean isGingerbreadOrHigher() {
        return _ANDROID_SDK_VERSION >= Build.VERSION_CODES.GINGERBREAD;
    }

    /**
     * Returns true if running on Android 2.3.3 or higher.
     */
    public static boolean isGingerbreadMr1OrHigher() {
        return _ANDROID_SDK_VERSION >= Build.VERSION_CODES.GINGERBREAD_MR1;
    }

    /**
     * Returns true if running on Android 3.0 or higher.
     */
    public static boolean isHoneycombOrHigher() {
        return _ANDROID_SDK_VERSION >= Build.VERSION_CODES.HONEYCOMB;
    }

    /**
     * Returns true if running on Android 3.1 or higher.
     */
    public static boolean isHoneycombMr1OrHigher() {
        return _ANDROID_SDK_VERSION >= Build.VERSION_CODES.HONEYCOMB_MR1;
    }

    /**
     * Returns true if running on Android 3.2 or higher.
     */
    public static boolean isHoneycombMr2OrHigher() {
        return _ANDROID_SDK_VERSION >= Build.VERSION_CODES.HONEYCOMB_MR2;
    }

    /**
     * Returns true if running on Android 4.0 or higher.
     */
    public static boolean isIceCreamSandwichOrHigher() {
        return _ANDROID_SDK_VERSION >= Build.VERSION_CODES.ICE_CREAM_SANDWICH;
    }

    /**
     * Returns true if running on Android 4.0.3 or higher.
     */
    public static boolean isIceCreamSandwichMr1OrHigher() {
        return _ANDROID_SDK_VERSION >= Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1;
    }

    /**
     * Returns true if running on Android 4.1 or higher.
     */
    public static boolean isJellyBeanOrHigher() {
        return _ANDROID_SDK_VERSION >= Build.VERSION_CODES.JELLY_BEAN;
    }

    /**
     * Returns true if running on Android 4.2 or higher.
     */
    public static boolean isJellyBeanMr1OrHigher() {
        return _ANDROID_SDK_VERSION >= Build.VERSION_CODES.JELLY_BEAN_MR1;
    }

    /**
     * Returns true if running on Android 4.3 or higher.
     */
    public static boolean isJellyBeanMr2OrHigher() {
        return _ANDROID_SDK_VERSION >= Build.VERSION_CODES.JELLY_BEAN_MR2;
    }

    /**
     * Returns true if running on Android 4.4 or higher.
     */
    public static boolean isKitKatOrHigher() {
        return _ANDROID_SDK_VERSION >= Build.VERSION_CODES.KITKAT;
    }

    /**
     * Returns true if running on Android 5.0 or higher.
     */
    public static boolean isLolipopOrHigher() {
        return _ANDROID_SDK_VERSION >= Build.VERSION_CODES.LOLLIPOP;
    }

    /**
     * Returns true if running on Android 5.1 or higher.
     */
    public static boolean isLolipopMr1OrHigher() {
        return _ANDROID_SDK_VERSION >= Build.VERSION_CODES.LOLLIPOP_MR1;
    }

    /**
     * Returns true if running on Android 6.0 or higher.
     */
    public static boolean isMarshmallowHigher() {
        return _ANDROID_SDK_VERSION >= Build.VERSION_CODES.M;
    }

    /**
     * Returns true if running on an earlier version than Android 5.1.
     */
    public static boolean isBeforeMarshmallow() {
        return _ANDROID_SDK_VERSION < Build.VERSION_CODES.M;
    }

    /**
     * Returns true if running on an earlier version than Android 5.1.
     */
    public static boolean isBeforeLolipopMr1() {
        return _ANDROID_SDK_VERSION < Build.VERSION_CODES.LOLLIPOP_MR1;
    }

    /**
     * Returns true if running on an earlier version than Android 5.0.
     */
    public static boolean isBeforeLolipop() {
        return _ANDROID_SDK_VERSION < Build.VERSION_CODES.LOLLIPOP;
    }

    /**
     * Returns true if running on an earlier version than Android 4.4.
     */
    public static boolean isBeforeKitkat() {
        return _ANDROID_SDK_VERSION < Build.VERSION_CODES.KITKAT;
    }

    /**
     * Returns true if running on an earlier version than Android 4.3.
     */
    public static boolean isBeforeJellyBeanMr2() {
        return _ANDROID_SDK_VERSION < Build.VERSION_CODES.JELLY_BEAN_MR2;
    }

    /**
     * Returns true if running on an earlier version than Android 4.2.
     */
    public static boolean isBeforeJellyBeanMr1() {
        return _ANDROID_SDK_VERSION < Build.VERSION_CODES.JELLY_BEAN_MR1;
    }

    /**
     * Returns true if running on an earlier version than Android 4.1.
     */
    public static boolean isBeforeJellyBean() {
        return _ANDROID_SDK_VERSION < Build.VERSION_CODES.JELLY_BEAN;
    }

    /**
     * Returns true if running on an earlier version than Android 4.0.3.
     */
    public static boolean isBeforeIceCreamSandwichMr1() {
        return _ANDROID_SDK_VERSION < Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1;
    }

    /**
     * Returns true if running on an earlier version than Android 4.0.
     */
    public static boolean isBeforeIceCreamSandwich() {
        return _ANDROID_SDK_VERSION < Build.VERSION_CODES.ICE_CREAM_SANDWICH;
    }

    /**
     * Returns true if running on an earlier version than Android 3.2.
     */
    public static boolean isBeforeHoneycombMr2() {
        return _ANDROID_SDK_VERSION < Build.VERSION_CODES.HONEYCOMB_MR2;
    }

    /**
     * Returns true if running on an earlier version than Android 3.1.
     */
    public static boolean isBeforeHoneycombMr1() {
        return _ANDROID_SDK_VERSION < Build.VERSION_CODES.HONEYCOMB_MR1;
    }

    /**
     * Returns true if running on an earlier version than Android 3.0.
     */
    public static boolean isBeforeHoneycomb() {
        return _ANDROID_SDK_VERSION < Build.VERSION_CODES.HONEYCOMB;
    }

    /**
     * Returns true if running on an earlier version than Android 2.3.3.
     */
    public static boolean isBeforeGingerbreadMr1() {
        return _ANDROID_SDK_VERSION < Build.VERSION_CODES.GINGERBREAD_MR1;
    }

    /**
     * Returns true if running on an earlier version than Android 2.3.
     */
    public static boolean isBeforeGingerbread() {
        return _ANDROID_SDK_VERSION < Build.VERSION_CODES.GINGERBREAD;
    }

    /**
     * Returns true if running on an earlier version than Android 2.2.
     */
    public static boolean isBeforeFroyo() {
        return _ANDROID_SDK_VERSION < Build.VERSION_CODES.FROYO;
    }

    /**
     * Returns true if running on an earlier version than Android 2.1-update.
     */
    public static boolean isBeforeEclairMr1() {
        return _ANDROID_SDK_VERSION < Build.VERSION_CODES.ECLAIR_MR1;
    }

    /**
     * Returns true if running on an earlier version than Android 2.0.
     */
    public static boolean isBeforeEclair() {
        return _ANDROID_SDK_VERSION < Build.VERSION_CODES.ECLAIR;
    }

    /**
     * Returns true if running on an earlier version than Android 1.6.
     */
    public static boolean isBeforeDonut() {
        return _ANDROID_SDK_VERSION < Build.VERSION_CODES.DONUT;
    }

    /**
     * Returns true if running on an earlier version than Android 1.5.
     */
    public static boolean isBeforeCupcake() {
        return _ANDROID_SDK_VERSION < Build.VERSION_CODES.CUPCAKE;
    }

    private AndroidVersion() {
        // Prevent users from instantiating this class.
    }
}