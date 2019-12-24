package by.bsu.pizza.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pizza {

    public static final String TYPE = "pizza";

    private int id;
    private String info;
    private int size;
    private int price;
}
