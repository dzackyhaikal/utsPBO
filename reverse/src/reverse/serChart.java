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
public class serChart {
    /*
    *method serChart digunakan untuk mengubah karakter pada indeks tertentu
    */
    public static void main(String[] args) {
        String kata ="siti rpl";
        StringBuffer kata_baru = new StringBuffer(kata);
        System.out.println(kata);
        
        kata_baru.setCharAt(0,'t');
        kata_baru.setCharAt(6, 'g');
        System.out.println(kata_baru);
    }
}
