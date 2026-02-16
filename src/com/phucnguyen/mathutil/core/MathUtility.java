/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phucnguyen.mathutil.core;

/**
 *
 * @author DELL
 */
public class MathUtility {
    // trong class này cung cấp ra ngoài nhiều hàm xử lí tóan học 
    // clone class math cuar JDK 
    // hàm thư viện xài chung cho ai đó, k cần lưu lại trạng thái/ gía trrij
    // chọn thiết kế là hàm static 
    
    // hàm tính giai thừa 
    // n! = 1.2.3....n
    // không có giai thừa cho số âm
    public static long getFactorial (int n){
      if (n<0 || n>20){
       throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
      }
      
      if (n == 0 || n == 1){
        return 1; // kếu thúc nếu biết những giá trị đặt biệt
      }
      
      long product = 1; // 
        for (int i = 2; i <= n; i++) {
            product = product * i;
        }
         return product;
    }
    
    
}
