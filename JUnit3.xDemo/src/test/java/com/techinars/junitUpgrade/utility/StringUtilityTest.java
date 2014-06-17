package com.techinars.junitUpgrade.utility;

import junit.extensions.TestSetup;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author ayazlakdawala
 * @version May 13, 2014
 * 
 */
public class StringUtilityTest extends TestCase {
    
    public static Test suite() {
        TestSetup setup = new TestSetup(new TestSuite(StringUtilityTest.class)){
            @Override
            protected void setUp() throws Exception {
                System.out.println("One time setup in Junit 3.x");
            }

            @Override
            protected void tearDown() throws Exception {
                System.out.println("One time teardown in Junit 3.x");
            }
        };
        return setup;
        
    }
    
    @Override
    protected void setUp() {
        System.out.println("Setup per Test in Junit 3.x");
    }
    
    @Override
    protected void tearDown() {
        System.out.println("Tear down per Test in Junit 3.x");
    }

    /** 
     * Test method for testing StringUtilityMethod with blank space string as input
     */
    public void testIsUnTrimmedStringEmptyWithBlankSpaceInput() {
        assertFalse(StringUtility.isUnTrimmedStringEmpty(" "));
    }    

    /** 
     * Test method for testing StringUtilityMethod with null string as input
     */
    public void testIsUnTrimmedStringEmptyWithNullInput() {
        assertTrue(StringUtility.isUnTrimmedStringEmpty(null));
    }
    
    /** 
     * Test method for testing StringUtilityMethod with empty string as input
     */
    public void testIsUnTrimmedStringEmptyWithEmptyStringInput() {
        assertTrue(StringUtility.isUnTrimmedStringEmpty(""));
    }
    
    /** 
     * Test method for testing StringUtilityMethod with " 123TestInput " string as input
     */
    public void testIsUnTrimmedStringEmptyWithStringWithLeadingAndTrailingSpacesInput() {
        assertFalse(StringUtility.isUnTrimmedStringEmpty(" 123TestInput "));
    }
    
    /** 
     * Test method for {@link com.crsoftwareinc.framework.util.StringUtility#isEmpty(java.lang.String)} with blank space string as input
     */
    public void testIsEmptyWithBlankSpaceInput() {
        assertTrue(StringUtility.isEmpty(" "));
    }
    

    /** 
     * Test method for {@link com.crsoftwareinc.framework.util.StringUtility#isEmpty(java.lang.String)} with null string as input
     */
    public void testIsSEmptyWithNullInput() {
        assertTrue(StringUtility.isEmpty(null));
    }
    
    /** 
     * Test method for {@link com.crsoftwareinc.framework.util.StringUtility#isEmpty(java.lang.String)} with empty string as input
     */
    public void testIsEmptyWithEmptyStringInput() {
        assertTrue(StringUtility.isEmpty(""));
    }
    
    /** 
     * Test method for {@link com.crsoftwareinc.framework.util.StringUtility#isEmpty(java.lang.String)} with " 123TestInput " string as input
     */
    public void testIsEmptyWithLeadingAndTrailingSpacesInput() {
        assertFalse(StringUtility.isEmpty(" 123TestInput "));
    }

}
