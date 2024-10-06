/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author dondull
 */
public class STRING {

    public static void main(String[] args) {
//        String a = " "
//        char [] a = {};
//        String a = new String("")
//pthuc thông dụng: 

//length: trả về độ dài của chuỗi kiểu int;
//charA + (int index): lấy ra kĩ tự tại vị trí index;
//subString(truyền vào begin index, exit index): lấy ra 1 phần của chuỗi, exit không lấy
//indexof(string) : tìm vịt ri đầu tiên của chuỗi con
//lastindexof: vị trí cuối cùng
// equals(string): so sánh 2 chuỗi
//equalIgnorecase : k tính viết hoa viết thường
//compareTo(string): so sánh chuỗitheo thứ tự từ điển 
   //     String a = "vu  hang";
//        System.out.println(a.equals("vuhang"));
//        System.out.println(a.equalsIgnoreCase("VuHanG"));
//        System.out.println(a.indexOf("han"));
//        System.out.println("last " + a.lastIndexOf("ng"));
//        System.out.println(a.compareTo("vuhan"));
//        
        //trim : loại bỏ khoảng trnawngs
        //toUppercase, toLowercase
        //replace(chả old -> new)
        //concat: nối chuỗi
//        
//        System.out.println(a.trim());
//        System.out.println(a.toUpperCase());
//        System.out.println(a.replace('v', 'V'));
//        System.out.println(a.concat("hanggggg"));
//        
//        System.out.println((char) a.length());
//        System.out.println(a.charAt(4));
//        System.out.println(a.substring(0,3));
        //start with, endwith (string): trả về boolean, ktra xem chuỗi có bắt đầu bằng string hay kthuc bằng tring này ko

        // split() tách chuỗi theo kí tự biểu thức chính quy
//        -> tạo ra một mảng string String[] c = " Vu Duc";
//        String[] a = c.split ("đk: các điều kiện trong mảng a cách nhau bằng bthuc chính quy" ",")
//        
          String c = "Giang,Dung;Hang-Minh"; //biểu thức chính quy
          String[] a = c.split("\\W"); //tự duyệt qua mảng và danh sách
          
          // [;,-]
          for (String string : a) {
              System.out.println(string);
        }
            
       //   stringbuider(class):  tạo các chuỗi có thể thay đổi, chuỗi biến thiên
       //append():
       
       String a1 = "Hang";
       String b1 = "Ha Hang";
       String c1 = a1.concat(b1);
       
       StringBuilder sb = new StringBuilder();
       sb.append("hello").append('\t').append("me");
        System.out.println(sb.toString());// trả về 1 string
        System.out.println(sb);/// tra về 1 stringbuilder
       
        //isEmpty(): có rỗng hay ko
        //.valueof: chyển đổi giá trị thành chuỗi
        //Integer.parseInt(d): chuỷen string thành integer 
       //contain: truyền vào đây 1 string: có chứa giá trị này hay ko bôlen
        }
    // tạo lớp studetn: id(duy nhất) tạo thêm count = 0, cons ID = static count ++, name, age, major
    // student mânger: ds student, array list
    //hàm : menu switch case: 1 xem ds, 2 thêm sv, 3 xóa sv, 4 sửa sv, 5 tìm kiếmtheo tên, 6 thoát
    //ds tự khởi tạo trc, sửa id 

    }

