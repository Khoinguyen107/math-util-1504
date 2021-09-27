/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.giaolang.mathutil.core;

/**
 *
 * @author DELL
 */
public class MathUtil {
    //ta viet ham tinh n!= 1.2....n
    //21! tran kieu long(18 so 0)
    //ko tinh am giai thua
    //0! - 1! - 1 -quy uoc
    //TDD - Test Driven Development- viet test truoc khi viet code chinh
    //Test First Development, viet , suy nghi ve bo test caso/cac tinh huong
    //chay ham truoc khi viet ham
    public static long getFactorial(int n){
        if(n<0 || n>20)
            throw new IllegalArgumentException("n must be between 0 and 20");
        if(n==0 || n ==1)
            return 1;
        long product =1;
        for(int i=1;i<=n;i++)
            product *=i;
        return product;
    }
}
