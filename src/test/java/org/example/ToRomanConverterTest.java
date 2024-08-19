package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

/*
  @author   Oleh
  @project   ArabicToRomanConverterTesting
  @class  ToRomanConverterTest
  @version  1.0.0 
  @since 19.08.2024 - 19.12
*/public class ToRomanConverterTest {

    @Test
    public void WhenNumberIs_0_ThenReturnNull() {
        assertNull(ToRomanConverter.convert(0));
    }

    @Test
    public void WhenNumberIs_4000_ThenReturnNull() {
        assertNull(ToRomanConverter.convert(4000));
    }

    @Test
    public void WhenNumberIs_1_ThenReturn_I() {
        assertEquals("I", ToRomanConverter.convert(1));
    }

    @Test
    public void WhenNumberIs_3999_ThenReturn_MMMCMXCIX() {
        assertEquals("MMMCMXCIX", ToRomanConverter.convert(3999));
    }

    @Test
    public void WhenNumberIs_5_ThenReturn_V() {
        assertEquals("V", ToRomanConverter.convert(5));
    }

    @Test
    public void WhenNumberIs_10_ThenReturn_X() {
        assertEquals("X", ToRomanConverter.convert(10));
    }

    @Test
    public void WhenNumberIs_100_ThenReturn_C() {
        assertEquals("C", ToRomanConverter.convert(100));
    }

    @Test
    public void WhenNumberIs_1000_ThenReturn_M() {
        assertEquals("M", ToRomanConverter.convert(1000));
    }

    @Test
    public void WhenNumberIs_3_ThenReturn_III() {
        assertEquals("III", ToRomanConverter.convert(3));
    }

    @Test
    public void WhenNumberIs_4_ThenReturn_IV() {
        assertEquals("IV", ToRomanConverter.convert(4));
    }

    @Test
    public void WhenNumberIs_50_ThenReturn_L() {
        assertEquals("L", ToRomanConverter.convert(50));
    }

    @Test
    public void WhenNumberIs_90_ThenReturn_XC() {
        assertEquals("XC", ToRomanConverter.convert(90));
    }

    @Test
    public void WhenNumberIs_400_ThenReturn_CD() {
        assertEquals("CD", ToRomanConverter.convert(400));
    }

    @Test
    public void WhenNumberIs_500_ThenReturn_D() {
        assertEquals("D", ToRomanConverter.convert(500));
    }

    @Test
    public void WhenNumberIs_900_ThenReturn_CM() {
        assertEquals("CM", ToRomanConverter.convert(900));
    }

    @Test
    public void WhenNumberIs_245_ThenReturn_CCXLV() {
        assertEquals("CCXLV", ToRomanConverter.convert(245));
    }

    @Test
    public void WhenNumberIs_3666_ThenReturn_MMMDCLXVI() {
        assertEquals("MMMDCLXVI", ToRomanConverter.convert(3666));
    }

    @Test
    public void WhenNumberIs_89_ThenReturn_LXXXIX() {
        assertEquals("LXXXIX", ToRomanConverter.convert(89));
    }

    @Test
    public void WhenNumberIs_594_ThenReturn_DXCIV() {
        assertEquals("DXCIV", ToRomanConverter.convert(594));
    }

    @Test
    public void WhenNumberIs_1987_ThenReturn_MCMLXXXVII() {
        assertEquals("MCMLXXXVII", ToRomanConverter.convert(1987));
    }

    @Test
    public void WhenNumberIs_30_ThenReturn_XXX() {
        assertEquals("XXX", ToRomanConverter.convert(30));
    }

    @Test
    public void WhenNumberIs_66_ThenReturn_LXVI() {
        assertEquals("LXVI", ToRomanConverter.convert(66));
    }

    @Test
    public void WhenNumberIs_777_ThenReturn_DCCLXXVII() {
        assertEquals("DCCLXXVII", ToRomanConverter.convert(777));
    }

    @Test
    public void WhenNumberIs_2022_ThenReturn_MMXXII() {
        assertEquals("MMXXII", ToRomanConverter.convert(2022));
    }

    @Test
    public void WhenNumberIs_333_ThenReturn_CCCXXXIII() {
        assertEquals("CCCXXXIII", ToRomanConverter.convert(333));
    }

    @Test
    public void WhenNumberIs_444_ThenReturn_CDXLIV() {
        assertEquals("CDXLIV", ToRomanConverter.convert(444));
    }

    @Test
    public void WhenNumberIs_888_ThenReturn_DCCCLXXXVIII() {
        assertEquals("DCCCLXXXVIII", ToRomanConverter.convert(888));
    }

    @Test
    public void WhenNumberIs_2500_ThenReturn_MMD() {
        assertEquals("MMD", ToRomanConverter.convert(2500));
    }

    @Test
    public void WhenNumberIs_99_ThenReturn_XCIX() {
        assertEquals("XCIX", ToRomanConverter.convert(99));
    }

    @Test
    public void WhenNumberIs_49_ThenReturn_XLIX() {
        assertEquals("XLIX", ToRomanConverter.convert(49));
    }

    @Test
    public void WhenNumberIs_60_ThenReturn_LX() {
        assertEquals("LX", ToRomanConverter.convert(60));
    }

    @Test
    public void WhenNumberIs_101_ThenReturn_CI() {
        assertEquals("CI", ToRomanConverter.convert(101));
    }

    @Test
    public void WhenNumberIs_700_ThenReturn_DCC() {
        assertEquals("DCC", ToRomanConverter.convert(700));
    }

    @Test
    public void WhenNumberIs_999_ThenReturn_CMXCIX() {
        assertEquals("CMXCIX", ToRomanConverter.convert(999));
    }

    @Test
    public void WhenNumberIs_1486_ThenReturn_MCDLXXXVI() {
        assertEquals("MCDLXXXVI", ToRomanConverter.convert(1486));
    }

    @Test
    public void WhenNumberIs_2847_ThenReturn_MMDCCCXLVII() {
        assertEquals("MMDCCCXLVII", ToRomanConverter.convert(2847));
    }

    @Test
    public void WhenNumberIs_555_ThenReturn_DLV() {
        assertEquals("DLV", ToRomanConverter.convert(555));
    }

    @Test
    public void WhenNumberIs_1649_ThenReturn_MDCXLIX() {
        assertEquals("MDCXLIX", ToRomanConverter.convert(1649));
    }

    @Test
    public void WhenNumberIs_2763_ThenReturn_MMDCCLXIII() {
        assertEquals("MMDCCLXIII", ToRomanConverter.convert(2763));
    }

    @Test
    public void WhenNumberIs_44_ThenReturn_XLIV() {
        assertEquals("XLIV", ToRomanConverter.convert(44));
    }

}