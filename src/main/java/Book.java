public class Book {
    private static Book book;
    private String author;
    private String title;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    static Book of(String author, String title) {
        return book;
    }

}
