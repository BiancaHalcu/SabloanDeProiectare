package models;

public interface Visitor {
    public void visitBook(Book b);
    public void visitTable(Table t);
    public void visitSection(Section s);
    public void visitParagraph(Paragraph p);
    public void visitImageProxy(ImageProxy is);
    public void visitImage(Image i);
}
