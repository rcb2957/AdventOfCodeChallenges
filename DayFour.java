

public class DayFour{

    public static String wordSearch(String grid){
        char[] chars = grid.toCharArray();
        for(int i = 0; i < grid.length(); i++){
            if(grid.charAt(i) == 'X'){
                // check_match(double_array, i, j);
            } else {
                chars[i] = '.';
            }
        }
        grid = new String(chars);
        return grid;
    }

    // function check_match(array, row, cell){

    // }

    // function find_m(){
        
    // }

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
        grid = wordSearch(grid);
        System.out.println(grid);
    }
}

// Add coordinates for row and column
// Store a list of row and columns that are part of XMAS