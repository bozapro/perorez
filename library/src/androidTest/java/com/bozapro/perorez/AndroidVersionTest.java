package com.bozapro.perorez;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Android Version test optimised for Nexus 5 running Android 6.0.
 * Created by bozapro on 2/28/16.
 */
@RunWith(AndroidJUnit4.class)
public class AndroidVersionTest {

    @Test
    public void testIsPreviewVersion() throws Exception {
        assertEquals(false, AndroidVersion.isPreviewVersion());
    }

    @Test
    public void testGetSdkVersion() throws Exception {
        assertEquals(23, AndroidVersion.getSdkVersion());
    }

    @Test
    public void testIsCupcakeOrHigher() throws Exception {
        assertEquals(true, AndroidVersion.isCupcakeOrHigher());
    }

    @Test
    public void testIsDonutOrHigher() throws Exception {
        assertEquals(true, AndroidVersion.isDonutOrHigher());
    }

    @Test
    public void testIsEclairOrHigher() throws Exception {
        assertEquals(true, AndroidVersion.isEclairOrHigher());
    }

    @Test
    public void testIsEclairMr1OrHigher() throws Exception {
        assertEquals(true, AndroidVersion.isEclairMr1OrHigher());
    }

    @Test
    public void testIsFroyoOrHigher() throws Exception {
        assertEquals(true, AndroidVersion.isFroyoOrHigher());
    }

    @Test
    public void testIsGingerbreadOrHigher() throws Exception {
        assertEquals(true, AndroidVersion.isGingerbreadOrHigher());
    }

    @Test
    public void testIsGingerbreadMr1OrHigher() throws Exception {
        assertEquals(true, AndroidVersion.isGingerbreadMr1OrHigher());
    }

    @Test
    public void testIsHoneycombOrHigher() throws Exception {
        assertEquals(true, AndroidVersion.isHoneycombOrHigher());
    }

    @Test
    public void testIsHoneycombMr1OrHigher() throws Exception {
        assertEquals(true, AndroidVersion.isHoneycombMr1OrHigher());
    }

    @Test
    public void testIsHoneycombMr2OrHigher() throws Exception {
        assertEquals(true, AndroidVersion.isHoneycombMr2OrHigher());
    }

    @Test
    public void testIsIceCreamSandwichOrHigher() throws Exception {
        assertEquals(true, AndroidVersion.isIceCreamSandwichOrHigher());
    }

    @Test
    public void testIsIceCreamSandwichMr1OrHigher() throws Exception {
        assertEquals(true, AndroidVersion.isIceCreamSandwichMr1OrHigher());
    }

    @Test
    public void testIsJellyBeanOrHigher() throws Exception {
        assertEquals(true, AndroidVersion.isJellyBeanOrHigher());
    }

    @Test
    public void testIsJellyBeanMr1OrHigher() throws Exception {
        assertEquals(true, AndroidVersion.isJellyBeanMr1OrHigher());
    }

    @Test
    public void testIsJellyBeanMr2OrHigher() throws Exception {
        assertEquals(true, AndroidVersion.isJellyBeanMr2OrHigher());
    }

    @Test
    public void testIsKitKatOrHigher() throws Exception {
        assertEquals(true, AndroidVersion.isKitKatOrHigher());
    }

    @Test
    public void testIsLolipopOrHigher() throws Exception {
        assertEquals(true, AndroidVersion.isLolipopOrHigher());
    }

    @Test
    public void testIsLolipopMr1OrHigher() throws Exception {
        assertEquals(true, AndroidVersion.isLolipopMr1OrHigher());
    }

    @Test
    public void testIsMarshmallowHigher() throws Exception {
        assertEquals(true, AndroidVersion.isMarshmallowHigher());
    }

    @Test
    public void testIsBeforeMarshmallow() throws Exception {
        assertEquals(false, AndroidVersion.isBeforeMarshmallow());
    }

    @Test
    public void testIsBeforeLolipopMr1() throws Exception {
        assertEquals(false, AndroidVersion.isBeforeLolipopMr1());
    }

    @Test
    public void testIsBeforeLolipop() throws Exception {
        assertEquals(false, AndroidVersion.isBeforeLolipop());
    }

    @Test
    public void testIsBeforeKitkat() throws Exception {
        assertEquals(false, AndroidVersion.isBeforeKitkat());
    }

    @Test
    public void testIsBeforeJellyBeanMr2() throws Exception {
        assertEquals(false, AndroidVersion.isBeforeJellyBeanMr2());
    }

    @Test
    public void testIsBeforeJellyBeanMr1() throws Exception {
        assertEquals(false, AndroidVersion.isBeforeJellyBeanMr1());
    }

    @Test
    public void testIsBeforeJellyBean() throws Exception {
        assertEquals(false, AndroidVersion.isBeforeJellyBean());
    }

    @Test
    public void testIsBeforeIceCreamSandwichMr1() throws Exception {
        assertEquals(false, AndroidVersion.isBeforeIceCreamSandwichMr1());
    }

    @Test
    public void testIsBeforeIceCreamSandwich() throws Exception {
        assertEquals(false, AndroidVersion.isBeforeIceCreamSandwich());
    }

    @Test
    public void testIsBeforeHoneycombMr2() throws Exception {
        assertEquals(false, AndroidVersion.isBeforeHoneycombMr2());
    }

    @Test
    public void testIsBeforeHoneycombMr1() throws Exception {
        assertEquals(false, AndroidVersion.isBeforeHoneycombMr1());
    }

    @Test
    public void testIsBeforeHoneycomb() throws Exception {
        assertEquals(false, AndroidVersion.isBeforeHoneycomb());
    }

    @Test
    public void testIsBeforeGingerbreadMr1() throws Exception {
        assertEquals(false, AndroidVersion.isBeforeGingerbreadMr1());
    }

    @Test
    public void testIsBeforeGingerbread() throws Exception {
        assertEquals(false, AndroidVersion.isBeforeGingerbread());
    }

    @Test
    public void testIsBeforeFroyo() throws Exception {
        assertEquals(false, AndroidVersion.isBeforeFroyo());
    }

    @Test
    public void testIsBeforeEclairMr1() throws Exception {
        assertEquals(false, AndroidVersion.isBeforeEclairMr1());
    }

    @Test
    public void testIsBeforeEclair() throws Exception {
        assertEquals(false, AndroidVersion.isBeforeEclair());
    }

    @Test
    public void testIsBeforeDonut() throws Exception {
        assertEquals(false, AndroidVersion.isBeforeDonut());
    }

    @Test
    public void testIsBeforeCupcake() throws Exception {
        assertEquals(false, AndroidVersion.isBeforeCupcake());
    }
}