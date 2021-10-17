import java.util.*;

public class BattleShips {
    public static int numRows = 10;
    public static int numCols = 10;
    public static int playerShips = 0;
    public static int computerShips = 0;
    public static String[][] grid = new String[numRows][numCols];
    public static int[][] missedGuesses = new int[numRows][numCols];

    public static void main(String[] args){
        System.out.println("===> Welcome to the Game <===");
        System.out.println("At that time sea is empty.\n");

        //Creating map for playing
        createOceanMap();

        //Deploying ships for player
        deployPlayerShips();
    }

    //Fill grid and show it
    public static void createOceanMap(){
        //First line
        System.out.print("  ");
        for(int i = 0; i < numCols; i++)
            System.out.print(i);
        System.out.println();

        //Middle lines
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = " ";
                if (j == 0)
                    System.out.print(i + "|" + grid[i][j]);
                else if (j == grid[i].length - 1)
                    System.out.print(grid[i][j] + "|" + i);
                else
                    System.out.print(grid[i][j]);
            }
            System.out.println();
        }

        //Last line
        System.out.print("  ");
        for(int i = 0; i < numCols; i++)
            System.out.print(i);
        System.out.println();
    }

    public static void deployPlayerShips(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nDeploy your ships:");
        //Deploying five ships for player
        BattleShips.playerShips = 5;
        for (int i = 1; i <= BattleShips.playerShips; ) {
            System.out.print("Enter X coordinate for your " + i + " ship: ");
            int x = input.nextInt();
            System.out.print("Enter Y coordinate for your " + i + " ship: ");
            int y = input.nextInt();

            if((x >= 0 && x < numRows) && (y >= 0 && y < numCols) && (Objects.equals(grid[x][y], " ")))
            {
                grid[x][y] = "@";
                i++;
            }
            else if((x >= 0 && x < numRows) && (y >= 0 && y < numCols) && Objects.equals(grid[x][y], "@"))
                System.out.println("You can't place two or more ships on the same location");
            else if((x < 0 || x >= numRows) || (y < 0 || y >= numCols))
                System.out.println("You can't place ships outside the " + numRows + " by " + numCols + " grid");
        }
        printOceanMap();
    }

    public static void printOceanMap(){
        System.out.println();
        //First section of Ocean Map
        System.out.print("  ");
        for(int i = 0; i < numCols; i++)
            System.out.print(i);
        System.out.println();

        //Middle section of Ocean Map
        for(int x = 0; x < grid.length; x++) {
            System.out.print(x + "|");

            for (int y = 0; y < grid[x].length; y++){
                System.out.print(grid[x][y]);
            }

            System.out.println("|" + x);
        }

        //Last section of Ocean Map
        System.out.print("  ");
        for(int i = 0; i < numCols; i++)
            System.out.print(i);
        System.out.println();
    }
}