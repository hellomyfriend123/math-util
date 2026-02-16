/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.phucnguyen.mathultil.test.core;

import com.phucnguyen.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author DELL
 */

// câu lệnh này chỉ dùng với Junit
// báo hiệu rằng sẽ cần loop qua cái tập data để lấy cặp data input expected nhôi vào các hàm 
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    
    // hàm này sẽ trả về mảng 2 chiều gồm nhiều cặp expected | Input đều đc 
    @Parameterized.Parameters // Juinit sẽ ngầm chạy loop qua từng dòng của mảng để lấy ra đc cặp data input/expected 
    // tên hàm k quan trong, mà @ mới quan trong
    public static Object[][] initData(){
       
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
        };     
        
}
    
    // giả sử mà nó loop đc từng dòng của mảng, ta vẫn cần gán từng value của cột 
    // vào biến tưng ứng input, expected để feed cho hàm 
    
    @Parameterized.Parameter(value = 0) // value = 0 map với mảng data 
    public int n; // biến map với value của côt 0 của mảng 
    
    @Parameterized.Parameter(value = 1)
    public long expected; // kiểu long vi giá trị của hàm getF()
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
         Assert.assertEquals(expected, MathUtility.getFactorial(n));  
    }
    
    /*
    
    
    Unit test FW thường có: 
    nhóm hàm assertX() để có ss expected và actual 
    nhóm hàm bắt ngoại lệ coi có xuất hiệnm ngoại lệ xh sẽ là đỏ, nếu kiểm soat đc thì là xanh 
    tách data và câu lệnh thành hàm riêng biệt -DDT
    chạy song song các tc 
    gài ràng buộc giữa các tc, ví dụ login thành công thì mới CRUD 
    nếu tc login thành công -> chạy mấy tc sau login
    thất bại -> những tc sau login vô nghĩa 
    
    generate ra các rp thống kê code lỗi ở các tc nào 
    chạy ở chế độ console/command line (giống chạy Ant có chạy test luôn) - test Runner
    gennerate luôn giùm các tc để ra chi việc modifier thay vì phải viết từ đầu
    */
}
