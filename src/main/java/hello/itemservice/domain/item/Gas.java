package hello.itemservice.domain.item;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Gas {

    private Long id;
    private String gasName;
    private Integer harmful;
    private Integer quantity;

    public Gas() {
    }

    public Gas(String gasName, Integer harmful, Integer quantity) {
        this.gasName = gasName;
        this.harmful = harmful;
        this.quantity = quantity;
    }
}
