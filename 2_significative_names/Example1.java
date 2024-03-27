public class Example1 {


    // bad names
    public List<int[]> getThem() {
        List<int[]> list1 = new ArrayList<int[]>();
        for (int[] x : theList)
            if(x[0] == 4)
                list1.add(x);
        return list1;
    }

    // Que tipos de coisas estão dentro de theList?
    // Qual é a importância de um item na posição zero?
    // O que significa o valor 4?
    // Como eu usaria a lista retornada?



    /// Better names
    public List<int[]> getFlaggedCells () {
        List<int[]> flaggedCells = new ArrayList<int []> ();
        for (int[] cell : gameBoard)
            if(cell[STATUS_VALUE] == FLAGGED)
                flaggedCells.add(cell);
        return flaggedCells;
    }


    // Best names
    public List<Cell> getFlaggedCells() {
        List<Cell> flaggedCells = new ArrayList<Cell>();
        for (Cell cell : gameBoard)
            if(cell.isFlagged())
                flaggedCells.add(cell);
        return flaggedCells;
    }
}