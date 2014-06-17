/**
 * (C)opyright 2004-2009 by CR Software, LLC - All Rights Reserved
 */

package com.techinars.junitUpgrade.utility;

/**
 * @author ayazlakdawala
 * @version May 16, 2014
 * 
 */
public class MathUtility {

    private String classDescription;

    /**
     * @return the classDescription
     */
    public String getClassDescription() {
        return classDescription;
    }

    /**
     * @param classDescription
     *            the classDescription to set
     */
    public void setClassDescription(String classDescription) {
        this.classDescription = classDescription;
    }

    public static int div(int a, int b) {
        if (b != 0) {
            return a / b;
        } else
            throw new ArithmeticException("Divisor is Zero");

    }

}
