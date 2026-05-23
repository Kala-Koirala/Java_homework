import java.util.Scanner;

public class BookArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book[] book = {
                new Book("Harry Potter", "J.K. Rowling", "0001"),
                new Book("The alchemist", "Paulo Coelho", "0002"),
                new Book("Atomic Habits", "James Clear", "0003"),
                new Book("Muna Madan", "Laxmi Prasad Devkota", "0004"),
                new Book("The Blue Mimosa", "Parijat", "0005")
        };

        System.out.print("Enter the book title to search for: ");
        String bookSearch = scanner.nextLine();
        boolean found = false;
        for(Book b : book){
            if(b.title.equals(bookSearch)){
                found = true;
                b.matchTitle();
                break;
            }
        }
        if (found != true) {
            System.out.println("Book Not Found!");
        }
    }
}

class Book{
    String title;
    String author;
    String isbn;

    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void matchTitle(){
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}
