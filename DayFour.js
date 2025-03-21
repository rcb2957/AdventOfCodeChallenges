function word_search(array){
    let double_array = []
    for(let i = 0; i < array.length; i++){
        double_array[i] = Array.from(array[i]);
    }

    for(let i = 0; i < double_array.length; i++){
        for(let j = 0; j < double_array.length; j++){
            if(double_array[i][j] == 'X'){
                check_match(double_array, i, j);
            }
        }
    }
}

function check_match(array, row, cell){

}

function main(){
    let array = ['MMMSXXMASM', 'MSAMXMSMSA', 'AMXSXMAAMM', 
                'MSAMASMSMX', 'XMASAMXAMM', 'XXAMMXXAMA', 
                'SMSMSASXSS', 'SAXAMASAAA', 'MAMMMXMMMM',
                'MXMXAXMASX'];
    word_search(array);
}

// Add coordinates for row and column
// Store a list of row and columns that are part of XMAS