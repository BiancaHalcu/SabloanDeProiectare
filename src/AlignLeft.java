public class AlignLeft implements AlignStrategy{

    @Override
    public void render(Paragraph p) {
        p.setText(p.getText()+"######");
        //formatare text
    }
}
