public class LibrarySystem {
    public static void main(String[] args) {
        Book b = new Book("The Alchemist", "Paulo Coelho", 001, "Story-telling", "very low");
        Magazine m = new Magazine("National Geographic", "Nathan Lump", 002, "Geography", "monthly");
        Newspaper np = new Newspaper("Kantipur", "Ritika", 003, "Politics", "Daily");

        b.getInfo();
        m.getInfo();
        np.getInfo();
    }
}

abstract class LibraryItem{
    public String title;
    public String author;
    public int id;

    public LibraryItem(String title, String author, int id){
        this.title = title;
        this.author = author;
        this.id = id;
    }

    public void getInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ID: " + id);
    }
}

class Book extends LibraryItem{
    public String focus;
    public String frequency;

    public Book(String title, String author, int id, String focus, String frequency){
        super(title, author, id);
        this.focus = focus;
        this.frequency = frequency;
    }

    @Override
    public void getInfo(){
        System.out.println("Book name: " + title);
        System.out.println("Author: " + author);
        System.out.println("ID: " + id);
        System.out.println("Focus: " + focus);
        System.out.println("Frequency of publishing: " + frequency + "\n");
    }
}

class Magazine extends LibraryItem{
    public String focus;
    public String frequency;

    public Magazine(String title, String author, int id, String focus, String frequency){
        super(title, author, id);
        this.focus = focus;
        this.frequency = frequency;
    }

    @Override
    public void getInfo(){
        System.out.println("Magazine name: " + title);
        System.out.println("Editor: " + author);
        System.out.println("ID: " + id);
        System.out.println("Focus: " + focus);
        System.out.println("Frequency of publishing: " + frequency + "\n");
    }
}

class Newspaper extends LibraryItem{
    public String focus;
    public String frequency;

    public Newspaper(String title, String author, int id, String focus, String frequency){
        super(title, author, id);
        this.focus = focus;
        this.frequency = frequency;
    }

    @Override
    public void getInfo(){
        System.out.println("Newspaper name: " + title);
        System.out.println("Editor: " + author);
        System.out.println("ID: " + id);
        System.out.println("Focus: " + focus);
        System.out.println("Frequency of publishing: " + frequency + "\n");
    }
}
