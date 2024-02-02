package Enviroment;

import Sex.Sex;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Product {
    private static int allProductID = 1;
    private static int id;
    private String productName;
    public Product(String productName){
        this.productName = productName;
        id = allProductID;
        allProductID++;
    }
}
