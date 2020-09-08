/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobacoba;

/**
 *
 * @author HP
 */
public class coba2 {
    public static void main(String[] args) {
        String author = "author";
String book = "book";
String duplicateBook = "book";
 
assertThat(author.compareTo(book))
  .isEqualTo(-1);
assertThat(book.compareTo(author))
  .isEqualTo(1);

    }
            
    
}
