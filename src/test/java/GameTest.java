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
}
