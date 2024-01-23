import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(1, "God", "Papa", 2009, "Drama", "Gucci");
        Book book2 = new Book(2, "Bob", "Wilson", 2003, "Drama", "Gucci");
        Book book3 = new Book(3, "Dan", "Papa", 2003, "Drama", "Gucci");
        Book book4 = new Book(4, "John", "Wilson", 2006, "Drama", "Gucci");
        Book book5 = new Book(5, "Terry", "Teds", 2003, "Drama", "Gucci");
        Library library = new Library();
        System.out.println(library.getLastBook());
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.removeBook(book2);
        Iterator<Book> iter = library.iterator();
        for (Iterator<Book> it = iter; it.hasNext(); ) {
            Book el = it.next();
            System.out.println(el.getTitle());
        }

    }
}
