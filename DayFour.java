public class DayFour{

    public static int countXMAS = 0;

    public void wordSearch(String grid){
        char[][] chars = stringToDoubleArray(grid);
        boolean[][] foundWords = new boolean[chars.length][chars[0].length];
        for(int i = 0; i < chars.length; i++){
            for(int j = 0; j < chars[i].length; j++){
                if(chars[i][j] == 'X'){
                    foundWords = findM(chars, foundWords, i, j);
                }
            }
        }
        
        printDoubleArray(chars, foundWords);
    }

    private char[][] stringToDoubleArray(String string){
        String[] lines = string.split("\n");
        char[][] arrayGrid = new char[lines.length][lines[0].length()];
        for(int i = 0; i < lines.length; i++){
            arrayGrid[i] = lines[i].toCharArray();
        }
        return arrayGrid;
    }

    private boolean[][] findM(char[][] grid, boolean[][] found, int row, int cell){

       found = checkRowDir(grid, found, row, cell, 0);

        if(row - 3 > 0){
            found = checkRowDir(grid, found, row, cell, -1);   
        }

        if(row + 3 < grid[0].length){
            found = checkRowDir(grid, found, row, cell, 1);
        }
        return found;
    }

    private boolean[][] checkRowDir(char[][] grid, boolean[][] found, int row, int cell, int rowDir){
        if(grid[row+rowDir][cell] == 'M' && checkXMAS(grid, row, cell, rowDir, 0)){
            found[row][cell] = true;
            found[row+rowDir][cell] = true;
            found[row+rowDir*2][cell] = true;
            found[row+rowDir*3][cell] = true;
            countXMAS++;
        }
        if(cell - 3 > 0){
            if(grid[row+rowDir][cell-1] == 'M'&& checkXMAS(grid, row, cell, rowDir, -1)){
                found[row][cell] = true;
                found[row+rowDir][cell-1] = true;
                found[row+rowDir*2][cell-2] = true;
                found[row+rowDir*3][cell-3] = true;
                countXMAS++;
            }
        }
        if(cell + 3 < grid[0].length){
            if(grid[row+rowDir][cell+1] == 'M' && checkXMAS(grid, row, cell, rowDir, 1)){
                found[row][cell] = true;
                found[row+rowDir][cell+1] = true;
                found[row+rowDir*2][cell+2] = true;
                found[row+rowDir*3][cell+3] = true;
                countXMAS++;
            }
        }
        return found;
    }

    private boolean checkXMAS(char[][] grid, int row, int cell, int rowDir, int cellDir){
        return grid[row+2*rowDir][cell+2*cellDir] == 'A' && grid[row+3*rowDir][cell+3*cellDir] == 'S';
    }

    public void printDoubleArray(char[][] doubleArray, boolean[][] foundWords){
        for(int i = 0; i < doubleArray.length; i++){
            for(int j = 0; j < doubleArray[0].length; j++){
                if(foundWords[i][j]){
                    System.out.print(doubleArray[i][j]);
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        DayFour obj = new DayFour();
        String grid = "MMMSXXMASM\nMSAMXMSMSA\nAMXSXMAAMM\nMSAMASMSMX\nXMASAMXAMM\n"
                    + "XXAMMXXAMA\nSMSMSASXSS\nSAXAMASAAA\nMAMMMXMMMM\nMXMXAXMASX";
        obj.wordSearch(grid);
        System.out.println("Total XMAS: " + countXMAS);
    }
}