/**
 * A Concrete Class for calculating earnings with methods to receive
 * and charge a monetry value and method to buy books.
 * @author Sean Vaughan (ID 119361923)
 */

import java.util.ArrayList;
import java.util.List;

public final class Concrete_Earnings {
    public Double new_receive(final Double x, Double total) {
        total = total +x;
        return total;
    }


    public Double new_charge(final Double x,Double total) {
        total = total -x;
        return total;
    }

    public List new_buy(final Book b,List my_list,Double monetry_value) {
        String duration_or_pagecount=" ";
        Integer cost =0;
        Integer counter =0;
        while (counter ==0) {
            if (b instanceof AudioBook) {
                cost = Book_cost.AUDIOBOOK.getPrice();
                duration_or_pagecount = "duration = " + (((AudioBook) b).getDuration().toString());
                break;
            } else if (b instanceof Paperback) {
                cost = Book_cost.PAPERBACK.getPrice();
                duration_or_pagecount = "pagecount = " + (((Paperback) b).getPagecount().toString());
                break;
            } else if (b instanceof Hardback) {
                cost = Book_cost.HARDBACK.getPrice();
                duration_or_pagecount = "pagecount = " + (((Hardback) b).getPagecount().toString());
                break;
            }
            counter+=1;
        }
            if (monetry_value < cost) {
                System.out.println("You dont have enough to buy");
                final List<String> items = new ArrayList<String>();
                items.add("author = " + (b).getAuthor());
                items.add("title = " + (b).getTitle());
                items.add("price = " + cost);
                items.add(duration_or_pagecount);
                System.out.println(items);
            } else {
                my_list.add(b.toString());
                Double cost_as_double =cost.doubleValue();
                Double cost_and_extra_earning = (0.10 * cost);
                (b).getAuthor().receive(cost_and_extra_earning);
                monetry_value=new_charge(cost_as_double,monetry_value);


            }
        my_list.add(monetry_value.toString());
        return my_list;
    }
}
