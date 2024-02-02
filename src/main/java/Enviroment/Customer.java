package Enviroment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import Sex.Sex;

@Getter
@Setter
@ToString
public class Customer {
    private static int idall = 1;
    private final int id;
    private String name;
    private Sex sex;

    public Customer(String name, Sex sex){
        this.name = name;
        this.sex = sex;
        this.id = idall;
        idall++;
    }
}
