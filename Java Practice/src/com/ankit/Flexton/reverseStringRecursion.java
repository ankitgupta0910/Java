package com.ankit.Flexton;

/**
 * Created by ankitgupta on 6/1/17.
 */
public class reverseStringRecursion {

    public String reverse(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        reverseStringRecursion rs = new reverseStringRecursion();

        System.out.println(rs.reverse("Ankit"));
    }

}
