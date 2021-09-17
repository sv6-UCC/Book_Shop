/**
 * A Class for the title of a book with methods to get
 * the title of a book and also the sub title of a book if necessary.
 * @author Sean Vaughan (ID 119361923)
 */

public final class Title {
    private String main_title;
    private String sub_title;
    public Title(final String main_title){
        this.main_title =main_title;
        this.sub_title="";
    }
    public Title(final String main_title,final String sub_title){
        this.main_title=main_title;
        this.sub_title=sub_title;
    }

    public String getMain_Title() {
        return main_title;
    }

    public String getSub_title(){
        return sub_title;
    }

    @Override
    public String toString( ) {
        if (getSub_title().isEmpty()) {
            return getMain_Title();
        }
        else{
            return getMain_Title() + " / " + getSub_title();
        }
    }
}
