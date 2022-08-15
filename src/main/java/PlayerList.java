import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
@Data
public class PlayerList {
    public String name;
    public String location;
    public ArrayList<Player> player;

}
@Data
 class Player{
     public String name;
     public String country;
     public String role;
     @JsonProperty("price-in-crores")
     public String priceInCrores;
}

