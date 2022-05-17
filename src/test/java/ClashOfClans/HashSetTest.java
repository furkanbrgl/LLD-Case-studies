package ClashOfClans;

import org.junit.Test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetTest {


    @Test
    public void setTest_2dArray(){

        Set<int[]> set = new HashSet<>();
        int[] p = new int[]{1,1};
        int[] p1 = new int[]{12,2};
        int[] p2 = new int[]{13,2};
        int[] p3 = new int[]{15,1};
        set.add(p1);set.add(p1);set.add(p2);set.add(p3);

        int[] pp = new int[]{13,2};

        String a = "001";
        System.out.println(Integer.valueOf(a));

        System.out.println(set.toString());

    }

    @Test
    public void testHashSet(){
        HashSet<Book> set=new HashSet<Book>();
        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        Book b4=new Book(103,"Operating System","Galvin","Wiley",6);
        Book b5=new Book(103,"Operating System2","Galvin","Wiley",6);
        Book b6=new Book(103,"Operating System","Galvin","Wiley",6);

        //Adding Books to HashSet
        set.add(b1);
        set.add(b2);
        set.add(b3);
        //Traversing HashSet
        for(Book b:set){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }

    class Book {
        int id;
        String name;
        String author;
        String publisher;
        int quantity;

        public Book(int id, String name, String author, String publisher, int quantity) {
            this.id = id;
            this.name = name;
            this.author = author;
            this.publisher = publisher;
            this.quantity = quantity;
        }

        @Override
        public boolean equals(Object o) {
            if(this == o) return true;
            if(o == null || getClass() != o.getClass()) return false;

            Book book  = (Book) o;
            return id == book.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }
}
