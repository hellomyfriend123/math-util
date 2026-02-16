/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phucnguyen.mathutil.main;

import com.phucnguyen.mathutil.core.MathUtility;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        /// thử nghiệm hàm tínnh giai thừa coi chạy đúng thiết kế k
        // ta đưa các tình huôngs sử dụng hàm trong thực tế 
        // ví dụ: -5 coi tính đc k
        // 0 coi là mấy
        // 20 coi tinh mấy 
        // test case 
        // là 1 tinh huông hàm/app/màn hình/tính năng ddc đưa vào dung 
        // data đầu vào cụ thê nào đó
        // output đầu ra tương ứng với xưr lí của hàm/chức năng cuar app, dĩ nhiên dungf đầu
        // vào để xử lí
        // kì vọng: mong hàm sẽ trả về value nào đó ứng với input trên
        // so sánh để xem kết quả có như kì vọng k\
    
        long expected = 120;
        int n = 5;
        long actual = MathUtility.getFactorial(n);
        System.out.println("5! = " + expected + "expected");
        System.out.println("5! = "+ actual + "actual");
        
    }
}
