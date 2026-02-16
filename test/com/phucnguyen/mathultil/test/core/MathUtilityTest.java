/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.phucnguyen.mathultil.test.core;

import com.phucnguyen.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author DELL
 */
public class MathUtilityTest {
    
    public MathUtilityTest() {
        // đây là class sẽ sử dụng các hàm của thư viện/framework Junit
        // để kiểm thử code chinh - hàm tính giai thừa()
        // viết code để test code 
        
        // có quy tăc đặt tên hàm kiểm thử
        // nhưng thường sẽ nói lênnn mục đích case muốn kiêmr thử
        // tình huống xài hàm theo kiểu thành công và thất bại
        
    }
    
    // @test Junit sẽ phối hợp với JVM để chaỵ hàm này 
    // @Test phía hậu trường chính là PSVM
    // có nhiều @Test ứng với nhiều case khác nhau đêrr ứng với hàm kiểm thử giao thừa
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
       int n = 0; // test thử đầu vào, phai chạy đúng
       long expected = 1; //hy vọng 0! = 1 
       long actual = MathUtility.getFactorial(n); // gọi hàm cần test bên core
       
       // so sanh Expected vs actual dùng xanh xanh đỏ đỏ, tức là dùng framework 
       // hàm giúp ss 2 gia trị nào đó có giống nhau k
       // nếu có thì nó là màu xanh của đèn đường, ít nhất cho case đang test
       // nếu đỏ thì là không giống nhau 
       // hàm ý là expected và actual k giống nhau, sai gì chưa biết, biết là chưa giông
       Assert.assertEquals(expected, actual);
       // expected là cái kì vọngg
       // actual là cái kết quả mà hàm trả về 
       
        // ta lấy nhiều mẫu gộp lai với nhau 
        Assert.assertEquals(1, MathUtility.getFactorial(1));       // tôi muốn 1! = 1
        Assert.assertEquals(2, MathUtility.getFactorial(2));       // tôi muốn 2! = 2 
        Assert.assertEquals(6, MathUtility.getFactorial(3));       // tôi muốn 3! = 6 
        Assert.assertEquals(24, MathUtility.getFactorial(4));       // tôi muốn 4! = 24 
        Assert.assertEquals(120, MathUtility.getFactorial(5));       // tôi muốn 5! = 120 
                                                                    // thử nghiệm 5! = 12 thì lập tức sai 
                                                                    // và nó sẽ hiện thị sai và báo lỗi cho dòng sai
                                                                    // và dù những thangwf kia đúng thì 1 thằng sai thì tức là sai hết 

       // kỹ thuật DDT khi chơi với unit test 
       // DDT viết tắt của data driven testing - kĩ thuật kiểm hướng theo tập data có sẵn 
       // là kỹ thuật tách lời gọi hàm cần test ra 1 chỗ, data đầu vào và expected ra 1 chỗ khác 
       // nhồi/nạp/feed đám data này vào lời gọi hàm 
       // giúp code test dễ dàng, trong sáng tách biệt việc chuẩn bị data ra 1 chỗ, ta dễ tập trung trong việc build data test 
       // k bị trộn với code test đám data vì việc kiểm thử đòi hỏi tính chặt chẽ, cần thận code để test cần đẹp, chuẩn, dễ bảo trì 
       
       // trong giới công nghiệp. các cty p/m, tập data test hay để 
       // trong file execel theo hàng cột 
       // trong text file dùng tab để phân cáhc giá trị dạng CSV
       // nhúng trực tiếp trong code nhingw tách so với code Junit test 
       // để trong table của database chứa toàn data để test, k là database của app
       
       
       // phân tích bài test hàm giai thừa 
       /*
         Input (n)             Expected (n!)
         0                       1
         1                       1
         2                       2
         3                       6
       
       Assert.assertEquals (1, getF(0));
       Assert.assertEquals (1, getF(1));
       Assert.assertEquals (720, getF(6));
       viết theo truyền thống 
       mất thời gian 
       
       viết theo kểu DDT
       Assert.assertEquals (expected, getF(input));
       tập data vần verify đạt thành các biến 
       feed các biến vào code Junit/Unit test 
       
       kix thuật DDT trong sáng dễ hiểu, dễ dánh giá có thiếu case hay k, tình huống xài gàm đã có đủ đại diện chưa 
       
       chốt: 
       DDT chẳng qua là tâp các data test ra 1 chôm đặt cho chúng thành các biến tướng ứng, rồi đưa biến vào hàm Test 
       DDT còn đc gọi 1 tên mới: kiểm thử Unit test kiểu tham số hóa 

       
       */
    }
    
    // hàm getF() ta thiết kế 2 tình huống xử lí 
    // 1. đưa data đúng vào -> done tính đúng 
    // 2. đưa ào data sai, âm, >20. thiết kế hàm là ném ra ngoại lệ 
    // kì vong ngoại lệ phải xuất hiện 
    // nếu hàm nhận vào n < 0 hoặc n > 20 và ném ra ngoại lệ thì hàm chay đúng theo thiết kế -> màu xanh phải xuất hiện 
    // màu xanh ở đây là tức mọi thứ đã đúng như kì vọng
    // nếu hàm nhận vào n < 0 hoặc n > 20 và k ném ra ngoại lệ thì hàm sai, sai kì vọng, màu đỏ 
    
    // Test Case
    // input: -5 
    // expected: IllegalArgumentExpected xuất hiện 
    // tình huôngs bất thường, ngoại lệ, ngoài dự tính là những thứ k thể so sanh theo kiểu value 
    // mà ta chỉ có thể do lường = cách chúng có xuất hiện hay k 
    // asertEquals() ta k dùng để ss 2 ngoại lệ
    // equal là bằng nhau trên value 
    
    
    // lambda expression chỉ xảy ra khi ta chơi với kế thừa
    // interface chỉ xảy ra mà chỉ duy nhất có 1 hàm abs mà thôi, Interface chỉ có 1 hàm duy nhất là abs/ hàm k có code đc gọi là Functional Interface 
    
    // cách khác để bắt ngoại lệ, xuất hiện, viế tự nhiên hơn
    // xài Lambda
    // Test case: hàm sẽ ném vền ngoại lệ nếu nhận vào 21
    // toi cần thấy màu xanh khi có 21!
    
    @Test (expected = IllegalArgumentException.class) //khi hàm test đc chạy thì nó sẽ ném ra 1 cái kì vọng gì đó 
    public void testGetFactorialGivenWrong(){
       MathUtility.getFactorial(-5); // hàm @Test chạy hay, hay hàm getF() chạy sẽ ném về ngoại lệ NumberFormat... 
     }
    
    
    @Test 
    public void testGetFactorialGivenWrong_LambdaVersion(){
       Assert.assertThrows(IllegalArgumentException.class, 
                           () -> MathUtility.getFactorial(-5));
       // hàm cần 2 tham số
       // đầu tiên là loại ngoại lệ muốn lấy 
     }
    
    @Test 
    public void testGetFactorialGivenWrong_LambdaVersion_TryCatch(){
       // MathUtility.getFactorial(-5);
       // nếu ta viết k như vậy thì hệ thống sẽ báo lỗi ở output, dù k sai về mặt cú pháp câu lệnh nhưng ta k đưa nó 1 kì vọng nào 
       // ta muốn bắt lỗi nhưng k có kì vọng thành ra sai 
        
       // try - catch ta đang kiểm soát ngoại lệ 
        try {
             MathUtility.getFactorial(-5); // thế này đúng vì ta đã để nó vào try catch nên nó sẽ bắt đc các lỗi của ta 
                                           // ở các test case trên k sai là vì ta đã cho nó 1 cái kì vọng nên k sai đc 
        } catch (Exception e) {
            Assert.assertEquals("Invalid argument. N must be between 0..20",
                                e.getMessage());
        } // bắt try - catch là Junit sẽ xanh do đã chủ động bắt ngoaij lệ nhưng k chắc ngoại lệ có xuất hiện hay k
          // có đoạn code kiểm soát đúng ngoại lệ   
          
        // clean and build sẽ biến đổi toàn bộ file .java web thành word hoặc file .console thành jar
        
     }
}
