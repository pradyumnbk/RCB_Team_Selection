import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.qameta.allure.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeamSelectionTest {

    @Test(description = "Test to check rcb has 4 foreign player and one wicket keeper")
    public void teamSelection() throws IOException {
        try {
            ObjectMapper mapper = new ObjectMapper();
            PlayerList playerList=mapper.readValue(new File("./src/test/resources/team.json"),PlayerList.class);
            ArrayList<Player> players = playerList.getPlayer();
            //to check the foreign player count

            Assert.assertTrue(Team.countForeignPlayers(players),"The foreign player count is not equal to 4");
            //to check the wicket keeper count
            Assert.assertTrue(Team.countWicketPlayer(players),"There is no wicket keeper in the team ");
        } catch(Exception e){
            e.printStackTrace();
        }


    }
}
