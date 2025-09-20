public class LifeSimulator {

    //Private fields.
    private int sizeX;
    private int sizeY;
    private boolean[][] world;

    //Constructor
    public LifeSimulator(int sizeX, int sizeY) {
        boolean[][] world =  new boolean[sizeX][sizeY];
        setSizeX(sizeX);
        setSizeY(sizeY);
        for (int row = 0; row < sizeX; row++){
            for (int collum = 0; collum < sizeY ; collum++){
                world[row][collum] = false;
            }
        }
        this.world = world;

    }

    //Size getters and setters.
    private void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }
    private void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }
    public int getSizeX() {
        return sizeX;
    }
    public int getSizeY() {
        return sizeY;
    }


    //Return called cell.
    public boolean getCell(int x, int y) {
        return this.world[x][y];
    }

    //Insert Pattern.
    public void insertPattern(Pattern pattern, int startX, int startY) {
        for(int row = startX; row < pattern.getSizeX() + startX; row++){
            for (int collum = startY; collum < pattern.getSizeY() + startY; collum++){
                world[row][collum] = pattern.getCell(row - startX, collum - startY);
            }
        }
    }

    // Update to new generation.
    public void update() {
        boolean[][] newWorld = new boolean[sizeX][sizeY];

        for (int x = 0; x < sizeX; x++){
            for (int y = 0; y < sizeY; y++){
                int sum = sumSurroundingSquares(x, y);
                if (world[x][y] && sum < 2){
                    newWorld[x][y] = false;
                }
                else if (world[x][y] && (sum == 2 || sum == 3)){
                    newWorld[x][y] = true;
                }
                else if (world[x][y] && sum > 3){
                    newWorld[x][y] = false;
                }
                else if (!world[x][y] && sum == 3){
                    newWorld[x][y] = true;
                }
            }
        }
        for (int row = 0; row < sizeX; row++){
            for (int collum = 0; collum < sizeY ; collum++){
                world[row][collum] = newWorld[row][collum];
            }
        }

    }

    //Sum live squares around a square. Has a bunch of empty body if - else statements, but I wasn't sure how to skip the code. Tried throwing and catching the errors but
    //couldn't figure it out.
    private int sumSurroundingSquares(int x, int y){
        int sum = 0;
        for(int i = x - 1; i <= x + 1; i++){
            for(int j = y - 1; j <= y + 1; j++){
                if ((i <= -1) || (i >= sizeX)){
                } else if ((j <= -1) || (j >= sizeY)){
                } else if (i == x && j == y){
                } else {
                    if (world[i][j]) {
                        sum = sum + 1;
                    }
                }
            }
        }
        return sum;
    }
}