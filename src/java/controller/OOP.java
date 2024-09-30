/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;
import model.Coder;

/**
 *
 * @author dondull
 */
public class OOP {

    public static int soCoder() {
        System.out.println("So coder");
        Scanner sc = new Scanner(System.in);
        int u = sc.nextInt();
        return u;
    }

    public static void nhapTen(String name[]) {
        Scanner sc = new Scanner(System.in);
        int u = soCoder();
        //String name[] = new String[u];
        for (int j = 0; j < u; j++) {
            System.out.println("nhap ten nguoi thu " + (j + 1));
            name[j] = sc.next();
        }

    }

    public static void main(String[] args) {
        Coder coder = new Coder();
        Coder coder1 = new Coder();
        Scanner sc = new Scanner(System.in);
        int u = soCoder();
        String name[] = new String[u];
        nhapTen(name);
        coder.setName(name[0]);
        coder1.setName(name[1]);

        //System.out.println("Nhap tuoi ");
//        int age = 0;
//        while ( age < 18 ) {
//                System.out.println("Nhap tuoi ");
//                age = sc.nextInt();
//        }
//        coder.setAge(age);
//        
// tạo phương thức để gọi
        System.out.println("nhap tuoi ");
        while (coder.getAge() == 0) {
            int tuoi = sc.nextInt();
            coder.setAge(tuoi);
        }

        System.out.println("Nhap ngon ngu ");
        String lang = sc.next();
        coder.setProg_Lang(lang);

        System.out.println("Nhap so ");
        String phone = sc.next();
        coder.setPhone(phone);

        // coder thứ 3 là constructor
        System.out.println("Ngon ngu " + coder.getProg_Lang());
        System.out.println("Ten " + coder.getName());
        System.out.println("Tuoi " + coder.getAge());
        System.out.println("Phone " + coder.getPhone());

        /// parameter: giá trị truyền vào, biến dc khai báo trong định nghĩa pthuc
        //argument gtri rõ ràng
        // list array, 
    }

}
