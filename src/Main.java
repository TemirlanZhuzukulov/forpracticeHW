import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Chyngyz Aitmatov", "ch.aitmatov.gmail.com", 'M');
        Author author2 = new Author("Aaly Tookombaev", "a.tokombaev.gmail.com", 'M');
        Author author3 = new Author("Alykul Osmonov", "a.Osmonov.gmail.com", 'M');
        Author author4 = new Author("Zhusup Abdrahmanov", "zh.abdrahmaov.gmail.com", 'M');
        Author author5 = new Author("Musa Baetov", "m.baietov.gmail.com", 'M');


        Author[] authors = {author1, author1, author3, author4, author5};
        Book book1 = new Book("Reach father", "Kiosaki", 500, 800);
        Book book2 = new Book("Reach man ", "Nill", 300, 1000);
        Book book3 = new Book("Reach mother", "Cosling", 400, 700);
        Book book4 = new Book("Reach sister", "Jame", 550, 200);
        Book book5 = new Book("Reach brother", "Robert", 600, 150);
        Book[] books = {book1, book2, book3, book4, book5};
        Scanner scanner=new Scanner(System.in);
getNameCountry(scanner.next(),authors);
getPrice(books);
    }

    public static void getPrice(Book[] books) {
     int max=books[0].getPrice();
     int min=books[0].getPrice();
        for (int i = 0; i < books.length; i++) {
       max=Math.max(max,books[i].getPrice());
       min=Math.min(min,books[i].getPrice());
        }
        System.out.println(max);
        System.out.println(min);

        }
        public static  void  getNameCountry(String getNameCountry,Author[]authors){
            for (Author author:authors) {
                if(author.getFullname().equals(getNameCountry));
                System.out.println(author.toString());



            }

        }
            }










