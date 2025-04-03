using System.Collections.Generic;

public class DayThree{

    public void search(string input){
        int mul_count = 0 // Total number of uncorrupted mul
        Queue<int> products = new Queue<int>(); //Queue of all the products multiplied
        for(int i = 0; i < input.length()-3; i++){
            string a = "";
            string b = "";
            if(input.Substring(i, i+3) = 'mul('){
                while(input.charAt(i).IsDigit()){
                    i++;
                    a += input.charAt(i);
                }
                if(input.charAt(i) == ','){
                    i++;
                }
                while(input.charAt(i).IsDigit()){
                    i++;
                    b += input.charAt(i);
                }
                if(input.charAt(i) == ')' && !string.IsNullOrEmpty(a) && !string.IsNullOrEmpty(b)){
                    mul_count++;
                    products.Enqueue(multiply(a, b));
                }
            }
        }
    }

    private int multiply(string x, string y){
        return Int32.Parse(x) * Int32.Parse(y)
    }

    private int mul_total(Queue<int> products){
        int total = 0;
        Queue<int> productsCopy = new Queue<int>(products.ToArray());
        foreach(product in products){
            total += product;
        }
    }

    public static void main(string[] args){
        DayThree day = new DayThree();
        day.search("mul(3,4)*&mul[0,9)")
    }
}