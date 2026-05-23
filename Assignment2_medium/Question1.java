public class Question1 {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho", "0001");
        Book b2 = new Book("Atomic Habits", "James Clear", "0002");
        Book b3 = new Book("Rich Dad, Poor Dad", "Robert Kiyosaki", "0003");
        Book b4 = new Book("Muna Madan", "Laxmi Prasad Devkota", "0004");
        Book b5 = new Book("The Blue Mimosa", "Parijat", "0005");

        b1.showDetails();
        b2.showDetails();
        b3.showDetails();
        b4.showDetails();
        b5.showDetails();
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

    public void showDetails(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("ISBN: " + this.isbn);
        System.out.println();

    }
}
