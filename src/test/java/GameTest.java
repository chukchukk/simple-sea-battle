import org.junit.jupiter.api.Test;
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
}
