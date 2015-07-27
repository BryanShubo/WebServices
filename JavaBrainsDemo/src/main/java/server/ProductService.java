package server;

import javax.jws.WebMethod;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shubo on 7/26/2015.
 */
public class ProductService {

    List<String> bookList = new ArrayList<>();
    List<String> musicList = new ArrayList<>();
    List<String> movieList = new ArrayList<>();

    public ProductService() {
        bookList.add("Blind Spot");
        bookList.add("Kill Bill");
        bookList.add("Head First");

        musicList.add("1989");
        musicList.add("Love Story");
        musicList.add("Pink");

        movieList.add("Lost");
        movieList.add("24");
        movieList.add("The big bang theory");

    }

    public List<String> getProductCategories() {
        List<String> categories = new ArrayList<>();
        categories.add("Books");
        categories.add("Music");
        categories.add("Movies");
        return categories;
    }

    public List<String> getProducts(String category) {
        switch(category.toLowerCase()) {
            case "books": return bookList;
            case "music": return musicList;
            case "movies": return  movieList;
            default: return null;
        }
    }

    public boolean addProduct(String category, String product) {
        switch(category.toLowerCase()) {
            case "books":
                bookList.add(product);
                break;
            case "music":
                musicList.add(product);
                break;
            case "movies":
                movieList.add(product);
                break;
            default:
                return false;
        }
        return true;

    }
}
