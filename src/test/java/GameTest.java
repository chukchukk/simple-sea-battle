import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;
public class GameTest {
    @Test
    public void gameFieldsBeforeRun() {
        assert BattleShips.numCols == 10;
        assert BattleShips.numRows == 10;
        assert BattleShips.computerShips == 0;
        assert BattleShips.playerShips == 0;
        assertArrayEquals(new String[10][10], BattleShips.grid);
        assertArrayEquals(new int[10][10], BattleShips.missedGuesses);
    }

    @Test
    public void creatingMap() {
        assert BattleShips.grid[0][0] == null;
        BattleShips.createOceanMap();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                assertEquals(" ", BattleShips.grid[i][j]);
            }
        }
    }

    @Test
    public void deployPlayerShips() {
        String userInput = "1\n2\n3\n5\n4\n9\n8\n8\n6\n6";
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        assert BattleShips.playerShips == 0;
        BattleShips.createOceanMap();
        BattleShips.deployPlayerShips();
        assert BattleShips.playerShips == 5;
    }

    @Test
    public void deployComputerShips() {
        BattleShips.createOceanMap();
        BattleShips.deployComputerShips();
        int k = 0;
        for (String[] strings : BattleShips.grid) {
            for(String val: strings) {
                if (val.equals("x")) {
                    k++;
                }
            }
        }
        assertTrue(k > 0);
    }
}
