

public class DayFour{

    public static char[][] wordSearch(String grid){
        char[][] chars = stringToDoubleArray(grid);
        for(int i = 0; i < chars.length; i++){
            for(int j = 0; j < chars[i].length; j++){
                if(grid.charAt(i) == 'X'){
                    // check_match(double_array, i, j);

                } else {
                    chars[i][j] = '.';
                }
            }
        }
        
        return chars;
    }

    public static char[][] stringToDoubleArray(String string){
        String[] lines = string.split("\n");
        char[][] arrayGrid = new char[lines.length][lines[0].length()];
        for(int i = 0; i < lines.length; i++){
            arrayGrid[i] = lines[i].toCharArray();
        }
        return arrayGrid;
    }

    public static int[] find_m(char[][] grid, int row, int cell){

        if(cell - 3 > 0){
            if(grid[row][cell-1] == 'M'){
                checkXMAS(grid, row, cell, 0, -1);
            }
        }
        if(cell + 3 < grid[0].length){
            if(grid[row][cell+1] == 'M'){

            }
        }

        if(row - 3 > 0){
            if(grid[row-1][cell] == 'M'){

            }
            if(cell - 3 > 0){
                if(grid[row-1][cell-1] == 'M'){

                }
            }
            if(cell + 3 < grid[0].length){
                if(grid[row-1][cell+1] == 'M'){

                }
            }    
        }

        if(row + 3 < grid[0].length - 1){
            if(grid[row+1][cell] == 'M'){

            }
            if(cell - 3 > 0){
                if(grid[row+1][cell-1] == 'M'){

                }
            }
            if(cell + 3 < grid[0].length){
                if(grid[row+1][cell+1] == 'M'){

                }
            }    
        }
        return [3,3,3];
    }

    public static boolean checkXMAS(char[][] grid, int row, int cell, int rowDir, int cellDir){
        return grid[row+2*rowDir][cell+2*cellDir] == 'A' && grid[row+2*rowDir][cell+2*cellDir] == 'S';
    }

    // public void print_double_array(double_array){
    //     double_array.forEach(row => {
    //         row.forEach(cell =>{
    //             console.log(cell)
    //         });
    //         console.log('\n');
    //     });
    // }

    public static void main(String[] args){
        String grid = "MMMSXXMASM\nMSAMXMSMSA\nAMXSXMAAMM\nMSAMASMSMX\nXMASAMXAMM\n"
                    + "XXAMMXXAMA\nSMSMSASXSS\nSAXAMASAAA\nMAMMMXMMMM\nMXMXAXMASX";
        System.out.println(wordSearch(grid));
    }
}

// Add coordinates for row and column
// Store a list of row and columns that are part of XMAS