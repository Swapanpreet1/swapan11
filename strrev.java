package com.eval;

/**
 * Created by swapanpreetkaur on 2/2/17.
 */


import java.io.*;
import java.util.*;

    public class strrev {


        public static void main(String[] args) {
            String str;
            System.out.println("string");
            try
            {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                str = br.readLine();
                char[] strrever= str.toCharArray();
                for (int i=strrever.length-1;i>=0;i--)
                    System.out.print(strrever[i]);
            }
            catch (IOException e) {
                System.out.println("Exception caught");
            }
        }}

