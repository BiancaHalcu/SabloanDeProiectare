public class Book {
    private String title;
    private String paragraph;
    private String image;
    private String table;

    public Book(String title) {
        this.title = title;
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

    public void print() {
        toString();
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
