public class Book {
    private String title;
    private String paragraph;
    private String image;
    private String table;

    public Book(String title) {
        this.title = title;
    }

    public Book(String paragraph, String image) {
        this.paragraph = paragraph;
        this.image = image;
    }

    public Book(String paragraph, String image, String table) {
        this.paragraph = paragraph;
        this.image = image;
        this.table = table;
    }

    public void createNewParagraph(String s) {
        this.paragraph=s;
    }

    public void createNewImage(String s) {
        this.image=s;
    }

    public void createNewTable(String s) {
        this.table=s;
    }

    public String print() {
        return toString();
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", paragraph='" + paragraph + '\'' +
                ", image='" + image + '\'' +
                ", table='" + table + '\'' +
                '}';
    }
}
