package pkg6;

import java.util.*;

class Book{
    int id, quantity;
    String name,author;

    public Book(int id, int quantity, String name, String author) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

public class Driver {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.println("Initial array List Size = " + al.size());
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        System.out.println(al);
        System.out.println("Now array List Size = " + al.size());
        al.remove(2);
        System.out.println(al);
        al.remove(3);
        System.out.println(al);
        Integer[] alarray = new Integer[al.size()];
        alarray = al.toArray(alarray);
        for (int i : alarray)
            System.out.println(i);


        HashSet<Book> bookSet = new HashSet<Book>();
        Book b1 = new Book(1, 200, "JAVA", "Oracle");
        Book b2 = new Book(2, 30, "CPP", "Bjarne");
        Book b3 = new Book(3, 2400, "TFC", "Linz");

        bookSet.add(b1);
        bookSet.add(b2);
        bookSet.add(b3);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);


        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(1);
        ts.add(4);
        ts.add(2);
        ts.add(6);
        ts.add(3);
        ts.add(5);
        int highest = ts.last();
        int lowest = ts.first();
        System.out.println("The original treeset is : "+ts);
        ts.remove(highest);
        System.out.println("The treeset after removing highest is : "+ts);
        ts.remove(lowest);
        System.out.println("The treeset after removing lowest is : "+ts);


        Deque<Integer> de_que = new ArrayDeque<Integer>(10);

        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);
        for (Integer element : de_que)
        {
            System.out.println("Element : " + element);
        }

        System.out.println("Using clear() ");

        de_que.clear();
        for (Integer element : de_que)
        {
            System.out.println("Element : " + element);
        }
        de_que.addFirst(564);
        de_que.addFirst(291);
        de_que.addLast(24);
        de_que.addLast(14);
        for (Integer element : de_que)
        {
            System.out.println("Element : " + element);
        }

    }
}
