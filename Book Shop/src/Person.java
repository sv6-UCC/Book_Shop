/**
 * Interface for Person with methods such as to get the books owned,
 * to buy a book and receive or charge the earnings of a particular Person.
 * @author Sean Vaughan (ID 119361923)
 */
public interface Person {
    public void buy(final Book b);

    public void printBooksOwned();

    public void receive(final Integer x);

    public void charge(final Integer x);

    public String getEarnings();
}
