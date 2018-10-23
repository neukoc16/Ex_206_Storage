package BL;

import java.io.Serializable;

/**
 * @author Konstantin
 */
public class Item implements Serializable {

    private int id;
    private String description;
    private int amount;
    private int place;

    public Item(int id, String description, int amount, int place) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.place = place;
    }

}
