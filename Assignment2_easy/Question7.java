public class Question7 {
    public static void main(String[] args) {
        Book b = new Book("Harry Potter", "J.K. Rowling");

        b.showBook();
    }
}

class Book{
    String title;
    String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void showBook(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
    }
}
