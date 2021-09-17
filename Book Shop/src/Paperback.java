/**
 * Class for Paperback with methods to get the Title,Author,
 * price and page count of a Paperback book.
 * @author Sean Vaughan (ID 119361923)
 */
public class Paperback implements Book{
    private Title title;
    private Author author;
    private Integer page_count;

    public Paperback(final Author author,final Title title, final Integer page_count){
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
        System.out.println(Book_cost.PAPERBACK.getPrice());
    }

    @Override
    public String toString( ) {
        return " "+getTitle() ;
    }

}
