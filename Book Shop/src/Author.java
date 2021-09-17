/**
 * An enumerated Class for Author with methods such as to get the books published,
 * to buy a book and receive or charge the earnings of a particular author.
 * @author Sean Vaughan (ID 119361923)
 */

import java.util.ArrayList;
import java.util.List;

public enum Author implements Person {
    JJR_Tolkien,
    JD_Sallinger;
    private Concrete_Earnings earnings =new Concrete_Earnings();
    private List<String> purchases = new ArrayList<String>( );
    private List<String> collection = new ArrayList<String>( );
    private Double monetry_value=0.0;


    public void writeBook(String book_title) {
        collection.add(book_title);
    }

    public void printBooksPublished() {
        System.out.println(name()+" published:");
        System.out.println(collection);
    }

    @Override
    public void receive(Integer x){
        Double y =x.doubleValue();
        monetry_value=earnings.new_receive(y,monetry_value);
    }


    public void receive(Double x){
        monetry_value=earnings.new_receive(x,monetry_value);
    }

    @Override
    public String getEarnings(){
        return monetry_value.toString();
    }

    @Override
    public void charge(final Integer x){
        Double y =x.doubleValue();
        monetry_value=earnings.new_charge(y,monetry_value);
    }
    @Override
    public void printBooksOwned() {
        System.out.println(name()+" owns:");
        System.out.println(purchases);
    }

    @Override
    public void buy(final Book b) {
        purchases =earnings.new_buy(b,purchases,monetry_value);
        int index = purchases.size() -1;
        String element = purchases.get(index);
        monetry_value =Double.parseDouble(element);
        purchases.remove(index);
    }




    @Override
    public String toString( ) {
        return name();
    }
}
