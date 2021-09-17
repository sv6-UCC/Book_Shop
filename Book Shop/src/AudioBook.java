/**
 * Class for Audiobook with methods to get the Title,Author,
 * price and duration of an Audiobook.
 * @author Sean Vaughan (ID 119361923)
 */
public class AudioBook implements Book{
    private Title main_title;
    private Author author;
    private Double duration;

    public AudioBook(final Author author,final Title main_title, final Double duration){
        this.author=author;
        this.main_title=main_title;
        this.duration=duration;
        author.writeBook(main_title.toString());

    }
    @Override
    public Title getTitle() {
        return main_title;
    }

    @Override
    public Author getAuthor() {
        return author;
    }

    public Double getDuration() { return duration; }

    @Override
    public void getPrice(){
        System.out.println(Book_cost.AUDIOBOOK.getPrice());
    }
    @Override
    public String toString( ) {
        return " "+getTitle() ;
    }
}
