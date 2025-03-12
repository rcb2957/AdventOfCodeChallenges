def update_change(difference):
    if difference < 0:
        return 1
    if difference > 0:
        return -1

def check_change(change, difference):
    
    if (change == 1 and difference > 0) or (change == -1 and difference < 0):
        return False
    
    if difference > 3 or difference < -3 or difference == 0:
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
        
        compare = element
    
    return True

def check(main_list):

    total_safe = 0

    for array in main_list:

        if check_array(array):
            total_safe += 1
            print(" is Safe")
        else:
            print(" is Unsafe")
    return total_safe

def main():

    main_list = [[7, 6, 4, 2, 1], [1, 2, 7, 8, 9], [9, 7, 6, 2, 1], [1, 3, 2, 4, 5], [8, 6, 4, 4, 1], [1, 3, 6, 7, 9]]
    total_safe = check(main_list)
    print(total_safe + " reports are safe")

if __name__=="__main__":
    main()