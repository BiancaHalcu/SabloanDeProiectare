package models;

public class Table implements Element, Visitee{
    private String title;

    public Table(String title) {
        this.title = title;
    }
    @Override
    public void print(){
        System.out.println("models.Table with name: "+title);
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element get(int e) {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }
}
