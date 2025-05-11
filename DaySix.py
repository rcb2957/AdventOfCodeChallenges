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
        
def navigate_up(grid, row, col):
    while row > 0:
        if grid[row - 1][col] == '#':
            grid = navigate_right(grid, row, col)
            return grid
        else:
            row = row - 1
            grid[row + 1][col] = 'X'
            grid[row][col] = '^'
    grid[row][col] = 'X'
    return grid

def navigate_right(grid, row, col):
    while col < len(grid) - 1:
        if grid[row][col + 1] == '#':
            grid = navigate_down(grid, row, col)
            return grid
        else:
            col = col + 1
            grid[row][col - 1] = 'X'
            grid[row][col] = '>'
    grid[row][col] = 'X'
    return grid

def navigate_down(grid, row, col):
    while row < len(grid) - 1:
        if grid[row + 1][col] == '#':
            grid = navigate_left(grid, row, col)
            return grid
        else:
            row = row + 1
            grid[row - 1][col] = 'X'
            grid[row][col] = 'v'
    grid[row][col] = 'X'
    return grid

def navigate_left(grid, row, col):
    while col > 0:
        if grid[row][col - 1] == '#':
            grid = navigate_up(grid, row, col)
            return grid
        else:
            col = col - 1
            grid[row][col + 1] = 'X'
            grid[row][col] = '<'
    grid[row][col] = 'X'
    return grid


def main():
    grid_string = "....#.....\n.........#\n..........\n..#.......\n.......#..\n..........\n.#..^.....\n........#.\n#.........\n......#..."
    grid = make_grid(grid_string)
    location = locate_start_pos(grid)
    grid = navigate_up(grid, location[0], location[1])
    print(grid)

if __name__=="__main__":
    main()