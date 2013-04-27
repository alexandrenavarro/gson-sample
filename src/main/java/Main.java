import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;


/**
 * <p>Main. </p>
 *
 * @author anavarro - Mar 25, 2013
 *
 */
public class Main {

    /**
     * main.
     *
     * @param args
     */
    public static void main(String[] args) {
        final List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        
        Gson gson = new Gson();
        final String listToJson =  gson.toJson(list);
        System.out.println("jsonList=" + listToJson);
        
        final List listFromJson = gson.fromJson(listToJson, List.class);
        System.out.println("listFromJson=" + listFromJson);
        
    }

}
