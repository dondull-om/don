/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author dondull
 */
public class Coder extends Person {
    private String Prog_Lang;

    public Coder() {
    }

    //this: từ khóa, phân biệt thuộc tính và parameter , tham chiếu đặc biêtj đến đối tươgj hiện tại trong 1 pthuc, constructor giúp phân biệt giữa các biến tvien instance của lớp và tham sso phuthuc, bien cuc bo 
    //cách sử dụng: 
    
    public Coder(String Prog_Lang, String name, int age, String phone) {
        super(name, age, phone);
        this.Prog_Lang = Prog_Lang;
    }

    public String getProg_Lang() {
        return Prog_Lang;
    }

    public void setProg_Lang(String Prog_Lang) {
        this.Prog_Lang = Prog_Lang;
    }
    
    
    
    
    
}
