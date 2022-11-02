public class Table implements Element{
    private String title;

    public Table(String title) {
        this.title = title;
    }
    @Override
    public void print(){
        System.out.println("Table with name: "+title);
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
}
