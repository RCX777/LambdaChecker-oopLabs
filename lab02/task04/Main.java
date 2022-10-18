import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString() {
        return title + ", written by " + author + ", published in " + year;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int year = scanner.nextInt();
        
        Book book = new Book(title, author, year);
        System.out.println(book);

        scanner.close();
    }
}