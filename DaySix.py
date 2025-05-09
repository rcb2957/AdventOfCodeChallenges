def make_grid(grid_string):
    grid_array = grid_string.splitlines()
    grid = [len(grid_array)]
    row_index = 0

    for row in grid_array:
        grid[row_index] = list(row)
        row_index = row_index + 1

    return grid
    
def locate_cursor(grid):
    grid.index('^')


def main():
    grid_string = "....#.....\n.........#\n..........\n..#.......\n.......#..\n..........\n.#..^.....\n........#.\n#...............#..."
    grid = make_grid(grid_string)
    locate_cursor(grid)
    print(grid)

if __name__=="__main__":
    main()