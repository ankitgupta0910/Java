package com.ankit.Flexton;

/**
 * Created by ankitgupta on 6/1/17.
 */
public class ReversePalin {

    public int reverse(int number){
        int rev = 0;
        int rem = 0;

        while (number != 0)
        {
            rem = number % 10;

            rev = (rev*10) + rem;

            number = number/10;
        }

        return rev;
    }

    public  boolean checkPalindrome(int number)
    {
        int reverse = reverse(number);

        if(reverse == number)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void reverseAndAdd(int number)
    {
        if(checkPalindrome(number))
        {
            System.out.println("Given Number is already a palindrome");
        }
        else
        {
            while (!checkPalindrome(number))
            {
                int reverse = reverse(number);

                int sum = number + reverse;

                System.out.println(number+" + "+reverse+" = "+sum);

                number = sum;
            }
        }
    }

    public static void main(String[] args) {
        int i = 7325;
        ReversePalin rp = new ReversePalin();
        System.out.println(rp.reverse(i));
        rp.reverseAndAdd(i);
    }
}
