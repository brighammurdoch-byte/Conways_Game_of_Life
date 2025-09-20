public class PatternAcorn extends Pattern{
//Accorn pattern
    private boolean[][] accorn = {
        {false, true, false, false, false, false, false},
        {false, false, false, true, false, false, false},
        {true, true, false, false, true, true, true}
    };

    public PatternAcorn(){
    }

    @Override
    public int getSizeX() {
        return accorn.length;
    }

    @Override
    public int getSizeY() {
        return accorn[0].length;
    }

    @Override
    public boolean getCell(int x, int y) {
        return accorn[x][y];
    }
}