fun split(input){
    val lines = input.split("\n)
    for(line in lines){
        val equation = line.split(" ")
        process_equation(equation)
    }
}

fun process_equation(equation){
    val line_result: Int = 0
    for(value in equation){
        if(line_result == 0){
            line_result = value.substring(0, value.length-1)
        }
    }
}

fun mult_or_add(mult_array, equation){
    result = equation[1]
    val i = 2
    val first_false = -1
    for(operation in mult_array){
        if(operation == true){
            result = equation[i] * result
        } else {
            result = equation[i] + result
            if(first_false = -1){
                first_false = i - 2
            }
        }
        i++
    }
    adjust_mult_or_add(mult_array, first_false)
}

fun adjust_mult_or_add(mult_array, first_false){
    val j = 0
    while(j < first_false){
        mult_array[j] = false
    }
    mult_array[first_false] = true
    return mult_array
}

fun main() {
  val txt = """
  	190: 10 19\n
    3267: 81 40 27\n
    83: 17 5\n
    156: 15 6\n
    7290: 6 8 6 15\n
    161011: 16 10 13\n
    192: 17 8 14\n
    21037: 9 7 18 13\n
    292: 11 6 16 20\n
  """
  println(txt)
}