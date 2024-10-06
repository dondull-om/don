/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

// arr list: luư trữ các phần tử có cùng kieeru dữ liệu và kích thước cố định, index 0->..
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//
public class CTDL {

    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList();
        alist.add("Quoc Dung");
        alist.add("Thanh hang");

        alist.remove(0);
        //  System.out.println(alist.get(0));

        LinkedList<String> llist = new LinkedList();
        llist.add("QD");
        llist.add("TH");

        llist.addFirst("Minh");
        llist.addLast("anhMinh");
        //business rule: 
        //Stack : theo nguyen tắc LIFO vào sau ra trước
        //push, pop

        Stack<String> slist = new Stack();
        slist.push("Thanh hang");
        slist.push("Quocc Dung");

        String a = slist.pop();
        //  System.out.println(a);

        //Queue: hàng đợi FIFO, triển khai dựa vào linkedlist
        Queue<String> qlist = new LinkedList();
        qlist.add("Quoc Dung");
        qlist.add("Thanh hang");
     //   System.out.println(qlist.poll());
        
        //hash map: lưu trữ các cặp key-value (key=a value 1) key ko dc phép trùng, value trùng
        HashMap<Integer, String> hlist = new HashMap<>();
        hlist.put(1, "Quoc Dung");
        hlist.put(2, "Thanh Hang");
        hlist.put(3, "anh Minh");
     //   System.out.println(hlist.get(2));
        
        //hash Set : ctdl chỉ lưu giữ các giá trị duy nhất, k cho phép phần tử trùng lặp
        //các phần tử trùng bị loại bỏ
        
        HashSet<String> hsl = new HashSet<>();
        hsl.add("quóc Dung");
        hsl.add("Thanh Hang");
        System.out.println(hsl);
        
        
        //collection framework
        // add() thêm phần tử vào bộ sưu tập
        //remove(): xóa phần tử
       // contain(): ktra bộ sưu tập có chứa 1 pahafn tử cụ thể hay không
       //size(): trả về số lượng phần tử trongn coll
       //clear(): xóa tất cả phần tử trong bộ sưuu tập 
       //isEmpty(): ktra bst có rỗng ko 
       
       //sc next: lm vc vs file khó, (chỉ string)
       //đường dẫn tương đối : new file + file naem txt-> tạo thẳng file tròg fo
     //  public static File 

    }

    //Linkedlist: danh sacsh lieen ket trong do mooi phan tuwr chua 1 lien ket den phan tu tiep theo
    // khi lm vc 
}
