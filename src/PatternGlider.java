public class PatternGlider extends Pattern {
//Glider Pattern
    private boolean[][] glider = {
            {false, false, true},
            {true, false, true},
            {false, true, true}
    };

    public PatternGlider() {
    }

    @Override
    public int getSizeX() {
        return glider.length;
    }

    @Override
    public int getSizeY() {
        return glider[0].length;
    }

    @Override
    public boolean getCell(int x, int y) {
        return glider[x][y];
    }
}