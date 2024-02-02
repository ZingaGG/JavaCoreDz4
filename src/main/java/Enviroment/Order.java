package Enviroment;

import Exceptions.NegativeNumberException;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Order {
    private static int allOrderID = 1;
    private int orderID;
    private String customerName;
    private String productName;
    private int productQuantity;

    public Order(){
        orderID = allOrderID;
        allOrderID++;
    }

    public static Order makeOrder(Customer customer, Product product, int productQuantity) throws NegativeNumberException {
        Order order = new Order();
        order.setCustomerName(customer.getName());
        order.setProductName(product.getProductName());
        if (productQuantity <= 0){
            throw new NegativeNumberException("ERROR: Wrong Product Quantity");
        }
        order.setProductQuantity(productQuantity);
        return order;
    }
}
