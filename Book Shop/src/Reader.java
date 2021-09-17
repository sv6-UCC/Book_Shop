/**
 * Class for Reader with methods such as to get the books owned,
 * to buy a book and receive or charge the earnings of a particular reader.
 * @author Sean Vaughan (ID 119361923)
 */
import java.util.List;
import java.util.ArrayList;
public class Reader implements Person{
    private Concrete_Earnings earnings =new Concrete_Earnings();
    private List<String> purchases = new ArrayList<String>( );
    private String firstname;
    private String surname;
    private final Double MONETRY_VALUE = 0.0;
    private Double monetry_value;
    public Reader(final String firstname,final String surname){
        this.firstname=firstname;
        this.surname=surname;
        monetry_value=MONETRY_VALUE;
    }
    public String getFirstName(){
        return firstname;
    }

    public String getSurname(){
        return surname;
    }
    @Override
    public void printBooksOwned() {
        System.out.println(firstname+ " " +surname+" owns:");
        System.out.println(purchases);
    }

    @Override
    public void receive(final Integer x){
        Double y =x.doubleValue();
        monetry_value=earnings.new_receive(y,monetry_value);
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
    public void buy(final Book b) {
        purchases =earnings.new_buy(b,purchases,monetry_value);
        int index = purchases.size() -1;
        String element = purchases.get(index);
        monetry_value =Double.parseDouble(element);
        purchases.remove(index);
    }

    @Override
    public String toString( ) {
        return getFirstName() + " " + getSurname();
    }
}
