import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Section implements Element{
    String text;

    public Section(String s) {
        this.text=s;
    }
    public Section() {
    }

    List<Element> elementList=new ArrayList<>();

    @Override
    public void print() {
        System.out.println(text);
        Iterator<Element> it = elementList.iterator();
        while(it.hasNext())  {
            Element employee = it.next();
            employee.print();
        }
    }

    @Override
    public void add(Element e) {
        elementList.add(e);
    }

    @Override
    public void remove(Element e) {
        elementList.remove(e);
    }

    @Override
    public Element get(int e) {
        return elementList.get(e);
    }

}
