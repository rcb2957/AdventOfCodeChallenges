def update_change(difference):
    if difference > 0:
        return 1
    if difference < 0:
        return -1

def check_change(change, difference):
    if (change == 1 & difference < 0) or (change == -1 & difference > 0):
        return False
    return True

def check_array(array_list):
    change = 0
    compare = -1
    for element in array_list:

        if compare != -1:

            difference = compare - element
            
            if change == 0:
                change = update_change(difference)
            
            if check_change(change, difference) == False:
                return False
            
            if difference > 3 | difference < -3 | difference == 0:
                return False
        
        compare = element
    
    return True

def check(main_list):
    for array in main_list:
        if check_array(array):
            print(array + " is Safe")
        else:
            print(array + " is Unsafe")

def main():
    main_list = [[7, 6, 4, 2, 1], [1, 2, 7, 8, 9],[9, 7, 6, 2, 1],[1, 3, 2, 4, 5],[8, 6, 4, 4, 1],[1, 3, 6, 7, 9]]
    check(main_list)

if __name__=="__main__":
    main()