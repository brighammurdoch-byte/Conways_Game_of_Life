public class PatternBlock extends Pattern{
//Block Pattern
    private boolean[][] block = {
            {true, true},
            {true, true},
    };

    public PatternBlock() {
    }

    @Override
    public int getSizeX() {
        return block.length;
    }

    @Override
    public int getSizeY() {
        return block[0].length;
    }

    @Override
    public boolean getCell(int x, int y) {
        return block[x][y];
    }
}