/**
 * An enumerated Class for storing costs for particular books whether
 * its a Hardback book, Paperback book or Audiobook.
 * @author Sean Vaughan (ID 119361923)
 */
public enum Book_cost {
    HARDBACK(12), PAPERBACK(10), AUDIOBOOK(15);
    private final Integer price;

    private Book_cost(final Integer price){
        this.price=price;
    }

    public Integer getPrice(){
        return price;
    }
}
