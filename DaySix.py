def make_grid(grid_string):
    grid = grid_string.splitlines()
    row_index = 0

    for row in grid:
        grid[row_index] = list(row)
        row_index = row_index + 1

    return grid
    
def locate_start_pos(grid):
    for grid_row in grid:
        if '^' in grid_row:
            return (grid_row.index('^'), grid.index(grid_row))


def main():
    grid_string = "....#.....\n.........#\n..........\n..#.......\n.......#..\n..........\n.#..^.....\n........#.\n#.........\n......#..."
    grid = make_grid(grid_string)
    print(locate_start_pos(grid))
    print(grid)

if __name__=="__main__":
    main()