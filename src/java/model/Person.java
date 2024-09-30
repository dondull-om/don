package model;

import java.util.Scanner;

/**
 *
 * @author dondull
 */
public class Person {

    private String name;
    private int age;
    private String phone;

    //contructor: ppthuc đawcj biệt dc gọi tự động khi khởi tạo object, khởi tạo gtrij ban đầu
    //contructor ko tham số khởi tạo tất cả thuộc tính
    // tính kế thừa cho phép một lớp mới kế thừa thuộc tính và pthuc từ 1 lớp hiện có
    // đóng gói: baobocj đóng gói các thuộc tính, bảo vệ dữ liệu,
    //tính đa hình: 
    //tính trừu tượng: ẩn đi thuộc tinh cụ thể, chỉ cần hiện ra những gì giao diện cần
    public Person() {

    }

    public Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap tuoi tren 18");
        } else{
            this.age = age;
        }
        
        

    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
