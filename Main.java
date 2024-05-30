import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear autores
        Author author1 = new Author(1, "George Orwell", "British");
        Author author2 = new Author(2, "Harper Lee", "American");

        // Crear libros
        Book book1 = new Book(1, "1984", author1, "123-4567890123", 1949, true);
        Book book2 = new Book(2, "To Kill a Mockingbird", author2, "123-4567890124", 1960, true);

        // Crear usuarios
        User user1 = new User(1, "Alice", "alice@example.com", new Date());
        User user2 = new User(2, "Bob", "bob@example.com", new Date());

        // Crear préstamos
        Loan loan1 = new Loan(1, book1, user1, new Date(), null, false);
        Loan loan2 = new Loan(2, book2, user2, new Date(), null, false);

        // Imprimir información
        System.out.println("Autores:");
        System.out.println(author1);
        System.out.println(author2);
        
        System.out.println("\nLibros:");
        System.out.println(book1);
        System.out.println(book2);

        System.out.println("\nUsuarios:");
        System.out.println(user1);
        System.out.println(user2);

        System.out.println("\nPréstamos:");
        System.out.println(loan1);
        System.out.println(loan2);
    }
}