package server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(name="TestMartCatalog", portName = "TestMartCatalogPort", serviceName = "TestMartCatalogService",
            targetNamespace = "http://www.testmart.com")
public class ProductCatalog {

    ProductService productService = new ProductService();

    @WebMethod(action = "fetch_categories", operationName = "fetchCategories")
    public List<String> getProductCategories() {
        return productService.getProductCategories();
    }

    @WebMethod
    public List<String> getProducts(String category) {
        return productService.getProducts(category);
    }

    @WebMethod
    public boolean addProduct(String category, String product) {

        return productService.addProduct(category, product);
    }
}
