/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod11latihan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class laptop {
    int harga;
    int ram;
    String nama;
    public laptop(String nama, int harga, int ram){
        this.harga = harga;
        this.ram = ram;
        this.nama = nama;
    }
    public void print(){
        System.out.print(this.nama+" "+this.harga+" "+this.ram+"\n");
    }

//    @Override
//    public int compareTo(laptop o) {
//        if(this.harga>o.harga){
//            return -1;
//        }else{
//            return 1;
//        }
//    }
}

class printer <T>{
    private T data;
    
    public void setData(T data){
        this.data = data;
    }
    public T getData(){
        return this.data;
    }
    
}
/**
 *
 * @author Rizqi Abdillah
 */
public class Mod11Latihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        printer objp = new printer();
//        objp.setData("a");
//        System.out.println(objp.getData());
          List<laptop> laps = new ArrayList<>();
          laps.add(new laptop("MSI",800,8));
          laps.add(new laptop("Asus",900,8));
          laps.add(new laptop("ROG",850,8));
          Comparator<laptop> com = new Comparator<laptop>(){
              public int compare(laptop o, laptop o2){
                  if(o.ram>o2.ram){
                      return 1;
                  }else{
                      return -1;
                  }
              }
          };
          Collections.sort(laps,com);
          for(laptop l :laps){
              l.print();
          }
    }
    
}
