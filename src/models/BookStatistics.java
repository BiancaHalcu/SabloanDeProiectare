package models;

public class BookStatistics implements Visitor{
    int nrb = 0;
    int nri = 0;
    int nrp = 0;
    int nrt = 0;
    int nrs = 0;
    @Override
    public void visitBook(Book b) {
        this.nrb++;
    }

    @Override
    public void visitTable(Table t) {
        this.nrt++;
    }

    @Override
    public void visitSection(Section s) {
        this.nrs++;
    }

    @Override
    public void visitParagraph(Paragraph p) {
        this.nrp++;
    }

    @Override
    public void visitImageProxy(ImageProxy is) {
        this.nri++;
    }

    @Override
    public void visitImage(Image i) {
        this.nri++;
    }

    public void printStatistics() {
        System.out.println("Book statistics:");
        System.out.println("*** Number of paragraphs: " + this.nrp);
        System.out.println("*** Number of images: " + this.nri);
        System.out.println("*** Number of tables: " + this.nrt);
    }
}
