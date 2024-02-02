import Enviroment.Customer;
import Enviroment.Order;
import Enviroment.Product;
import Exceptions.NegativeNumberException;
import FileWriter.TextWriter;
import Sex.Sex;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws NegativeNumberException {
        {
            ArrayList<Customer> customers = new ArrayList<>();
            Customer a1 = new Customer("name1", Sex.F);
            Customer a2 = new Customer("name2", Sex.M);

            customers.add(a1);
            customers.add(a2);

            ArrayList<Product> products = new ArrayList<>();
            Product p1 = new Product("Milk");
            Product p2 = new Product("Water");

            products.add(p1);
            products.add(p2);

            ArrayList<Order> orders = new ArrayList<>();
            Order o1 = null;
            Order o2 = null;

            try{
                o1 = Order.makeOrder(a1, p1, 2);
                o2 = Order.makeOrder(a2, p2, 1);
            } catch (NegativeNumberException e) {
                throw e; // Здесь роняем программу т.к. нет смысла если кол - во товаров <= 0
            }


            orders.add(o1);
            orders.add(o2);

            // Массив покупок
            for (Order x : orders) {
                TextWriter.writeFile(x.toString());
                System.out.println(x.toString());
            }

            // Массив продуктов
            for (Product x : products) {
                System.out.println(x.toString());
            }

            // Массив покупателей
            for (Customer x : customers) {
                System.out.println(x.toString());
            }


        }
    }

}

// В задании было проверить на существование клиента или продукта, но Order и так требует экземпляр обоих классов
// Сответственно мы должны создать продукт или клиента, что уже является проверкой в своем роде
// Либо я не совсем понял задание
// Кастомный Exception на отрицательное или нулевое число создан
