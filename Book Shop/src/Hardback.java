/**
 * Class for Hardback with methods to get the Title,Author,
 * price and page count of a Hardback book.
 * @author Sean Vaughan (ID 119361923)
 */
public class Hardback implements Book{
    private Title title;
    private Author author;
    private Integer page_count;

    public Hardback(final Title title,final Author author, final Integer page_count){
        this.title=title;
        this.author=author;
        this.page_count=page_count;
        author.writeBook(title.toString());
    }

    @Override
    public Title getTitle() {
        return title;
    }

    @Override
    public Author getAuthor() {
        return author;
    }

    public Integer getPagecount() {
        return page_count;
    }

    @Override
    public void getPrice(){
        System.out.println(Book_cost.HARDBACK.getPrice());
    }

    @Override
    public String toString( ) {
        return " "+getTitle() ;
    }
}
