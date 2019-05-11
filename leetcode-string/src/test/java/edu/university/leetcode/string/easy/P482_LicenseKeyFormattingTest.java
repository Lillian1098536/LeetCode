package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P482_LicenseKeyFormattingTest {

    @Test
    public void licenseKeyFormatting1() {
        assertEquals("5F3Z-2E9W", P482_LicenseKeyFormatting.licenseKeyFormatting("5F3Z-2e-9-w", 4));
    }

    @Test
    public void licenseKeyFormatting2() {
        assertEquals("2-5G-3J", P482_LicenseKeyFormatting.licenseKeyFormatting("2-5g-3-J", 2));
    }

    @Test
    public void licenseKeyFormatting3() {
        assertEquals("24A0-R74K", P482_LicenseKeyFormatting.licenseKeyFormatting("2-4A0r7-4k", 4));
    }

}