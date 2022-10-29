public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Джордж", " Оруэлл");
        Book firstBook = new Book(1949, "1984", firstAuthor);
        Author secondAuthor = new Author("Агата", " Кристи");
        Book secondBook = new Book(1934, "Убийство в Восточном экспрессе", secondAuthor);
        System.out.println("firstBook.getYear() = " + firstBook.getYear());
        firstBook.setYear(1999);
        System.out.println("firstBook.getYear() = " + firstBook.getYear());
        }
    }



