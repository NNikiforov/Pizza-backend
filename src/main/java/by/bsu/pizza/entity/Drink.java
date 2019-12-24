package by.bsu.pizza.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Drink {

    public static final String TYPE = "drink";

    private int id;
    private int price;
    private String name;
}
