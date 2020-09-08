/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;

/**
 *
 * @author HP
 */
public class capacity_string {
    /*
    capacity string digunakan untuk mengetahui dari suatu variable StringBuffer.
    digunakan untuk mengetahui kapasitas memory yang di perlukan untukmembuat sebuah
    objek
    */
    public static void main(String[] args) {
        String kata = "hello";
        StringBuffer a = new StringBuffer();
        StringBuffer b = new StringBuffer(kata);
        
        System.out.println("a "+ a.capacity());
        System.out.println("b "+ b.capacity());
                
    }
}
