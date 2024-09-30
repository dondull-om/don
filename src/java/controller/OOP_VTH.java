package controller;

import java.util.Scanner;
import model.Coder;

public class OOP_VTH {

/// NHAP TEN CHO CAC CODER
    public static void nhapTen(Coder[] coder, String name[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < name.length; i++) {
            System.out.println("nhap ten nguoi thu " + (i + 1)+ ": ");
            name[i] = sc.next();
            coder[i].setName(name[i]);

        }

    }

//NHAP phone CHO CAC CODER
    public static void nhapPhone(Coder[] coder, String phone[]) {
        Scanner sc = new Scanner(System.in);

        for (int j = 0; j < phone.length; j++) {
            System.out.println("nhap phone nguoi thu " + (j + 1)+ ": ");
            phone[j] = sc.next();
            coder[j].setPhone(phone[j]);
        }
    }

//chon ngon ngu cua nguoi thu i
    public static void chonNgonngu(Coder[] coder, int n) {

        System.out.println("Menu:\n1.Java\n2.C\n3.C#\n4.Python\n");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("Ngon ngu cua nguoi thu " + (i + 1) + ": ");

            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    coder[i].setProg_Lang("Java");
                    break;
                case 2:
                    coder[i].setProg_Lang("C");
                    break;

                case 3:
                    coder[i].setProg_Lang("C#");
                    break;
                case 4:
                    coder[i].setProg_Lang("Python");
                    break;
                default:
                    System.out.println("Nhap lai opt 1-> 4");
                    i--;
                    break;

            }

        }
    }

/// nhap tuoi nguoi thu i
    public static void nhapTuoi(Coder[] coder, int tuoi[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tuoi.length; i++) {
            System.out.println("Tuoi nguoi thu " + (i + 1) + ": ");
            while (coder[i].getAge() == 0) {
                tuoi[i] = sc.nextInt();
                coder[i].setAge(tuoi[i]);
            }

        }
    }

    //in ra thong tin cua tung nguoi
    public static void ThongTin(Coder[] coder, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Ten nguoi " + (i + 1)+ ": " + coder[i].getName());
            System.out.println("Tuoi nguoi " + (i + 1)+ ": " + coder[i].getAge());
            System.out.println("So dth nguoi " + (i + 1) + ": "+ coder[i].getPhone());
            System.out.println("Ngon ngu lap trinh nguoi " + (i + 1)+ ": " + coder[i].getProg_Lang() + "\n");

        }
    }

    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguoi ");
        int n = sc.nextInt();
        Coder[] coder = new Coder[n];
        for (int i = 0; i < n; i++) {
            coder[i] = new Coder();
        }

        String name[] = new String[n];
        nhapTen(coder, name);

        String phone[] = new String[n];
        nhapPhone(coder, phone);

        chonNgonngu(coder, n);

        int tuoi[] = new int[n];
        nhapTuoi(coder, tuoi);

        ThongTin(coder, n);

    }
}
