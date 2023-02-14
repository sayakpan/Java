// Name - Sayak Pan
// Roll No - 4
// Java Assignment 2 - Class and Constructors

package Phone;

public class Telephone {
    protected int mobile_id;
    protected String model_name;
    protected int available_quantity;

    protected Telephone(int mobile_id, String model_name, int available_quantity) {
        this.mobile_id = mobile_id;
        this.model_name = model_name;
        this.available_quantity = available_quantity;
    }
}