using System.Collections.Generic;

public class DayThree{

    //process string input
    public int search(string input){

        Queue<int> products = new Queue<int>(); //Queue of all the products multiplied

        for(int i = 0; i < input.length()-3; i++){
            string a = "";
            string b = "";
            if(input.Substring(i, i+3) = 'mul('){
                // Retrieve value of the first digit
                while(input.charAt(i).IsDigit()){
                    i++;
                    if(i >= input.length()){
                        break;
                    }
                    a += input.charAt(i);
                }

                if(i >= input.length()){
                    break;
                }

                //Check for comma to verify mul input is uncorrupted
                if(input.charAt(i) == ','){
                    i++;
                }

                if(i >= input.length()){
                    break;
                }

                // Retrieve value of the second digit
                while(input.charAt(i).IsDigit()){
                    i++;
                    if(i >= input.length()){
                        break;
                    }
                    b += input.charAt(i);
                }

                //Check if string was corrupted and multiply values if uncorrupted
                if(input.charAt(i) == ')' && !string.IsNullOrEmpty(a) && !string.IsNullOrEmpty(b)){
                    products.Enqueue(multiply(a, b));
                }
            }
        }
        return mul_total(products);
    }

    private int multiply(string x, string y){
        return Int32.Parse(x) * Int32.Parse(y)
    }

    // Calculate the sum of all the products
    private int mul_total(Queue<int> products){

        int total = 0;
        Queue<int> productsCopy = new Queue<int>(products.ToArray());

        foreach(product in products){
            total += product;
        }
        return total;
    }

    public static void main(string[] args){

        DayThree day = new DayThree();
        int total = day.search("mul(3,4)*&mul[0,9)");
        Console.Write("The total sum of the multiplied values is ");
        Console.Write(total);
    }
}