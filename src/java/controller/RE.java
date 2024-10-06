/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//RE: tìm kiếm kiểm tra và thao tác với chuỗi văn bản
//regex 
// lớpL matcher và pattern
// '.' bất cứ kí tự nào 
// '*' 0 hoặc nhiều lần lặp lại
// '+' 1 hoặc nhiều lần lặp
// '?' 0 hoặc 1 lần lặp 
// '^' bắt đầu RE, $ kết thúc

// \d: số từ 0-9
// \D: các kí tự ko phải số
// \w: các kí tự số hoặc chữ
// \W: các kí tự ko phải só hoặc chữ
// \s: khoảng trắng
// \S: ko phải khoảng trắng
//
// []: tất cả các kí tự trong dấu ngoặc vuông
// [^]: không phải những kí tự nằm trong ngoặc vuông
// ` `: là nháy đơn
// (): nhóm, khi dấu '.' sẽ bị hiểu là bất cứ kí tự nào 
// \\., \\, ... là dấu chấm


public class RE { 
    public static void main(String[] args) {
        // tạo biểu thức chính quy cho email
        String emailRegex = "^[A-Za-z0-9_]+@gmail\\.com$";
        String emai = "hang+4747@gmail.com";
        
        // tạo pattern từ bthucchisnh quy;
        Pattern pt = Pattern.compile(emailRegex);
        
        //khớp mẫu với chuỗi email
        Matcher mc = pt.matcher(emai);
        
        //ktra chuỗi có hợp lệ 
        if (mc.matches()) {
            System.out.println("ok");
        }
        else {
            System.out.println("NÔ");
        }
    }
    
    
}
