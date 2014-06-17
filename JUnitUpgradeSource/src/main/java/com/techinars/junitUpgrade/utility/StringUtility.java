/**
 * (C)opyright 2004-2009 by CR Software, LLC - All Rights Reserved
 */

package com.techinars.junitUpgrade.utility;

/**
 * @author ayazlakdawala
 * @version May 13, 2014
 * 
 */
public class StringUtility {
    
    /**
     * This method if a String is null or empty (after it has been trimmed).
     *
     * @param value
     * @return
     */
    public static boolean isEmpty(String value) {
        return (value == null || value.trim().length() == 0) ? true : false;
    }    
   
    /**
     * This method identifies if a String is null or empty (without trimming).
     *
     * @param value
     * @return
     */
    public static boolean isUnTrimmedStringEmpty(String value) {
        return (value == null || value.length() == 0) ? true : false;
    }

}
