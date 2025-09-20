public class PatternBlinker extends Pattern{
//Blinker Pattern
    private boolean[][] blinker = {
            {false, true, false},
            {false, true, false},
            {true, true, false}
    };

    public PatternBlinker(){
    }

    @Override
    public int getSizeX() {
        return blinker.length;
    }

    @Override
    public int getSizeY() {
        return blinker[0].length;
    }

    @Override
    public boolean getCell(int x, int y) {
        return blinker[x][y];
    }
}