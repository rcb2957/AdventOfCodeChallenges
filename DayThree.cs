using System;
using System.Collections.Generic;

namespace MyDayThree
{
  class DayThree
  {
    public int search(string input){

        Queue<int> products = new Queue<int>(); //Queue of all the products multiplied

        for(int i = 0; i < input.Length-4; i++){
            string a = "";
            string b = "";
            if(input.Substring(i, 4).Equals("mul(")){
                i+=4;
               
                // Retrieve value of the first digit
                while(Char.IsDigit(input[i])){
                    if(i >= input.Length){
                        break;
                    }
                    a += input[i];
                    i++;
                }

                if(i >= input.Length){
                    break;
                }

                //Check for comma to verify mul input is uncorrupted
                if(input[i] == ','){
                    i++;
                }

                if(i >= input.Length){
                    break;
                }

                // Retrieve value of the second digit
                while(Char.IsDigit(input[i])){
                    if(i >= input.Length){
                        break;
                    }
                    b += input[i];
                    i++;
                }

                //Check if string was corrupted and multiply values if uncorrupted
                if(input[i] == ')' && !string.IsNullOrEmpty(a) && !string.IsNullOrEmpty(b)){
                    products.Enqueue(multiply(a, b));
                    //Console.WriteLine("IM BACK");
                }
            }
        }
        return mul_total(products);
    }

    private int multiply(string x, string y){
        return Int32.Parse(x) * Int32.Parse(y);
    }

    // Calculate the sum of all the products
    private int mul_total(Queue<int> products){

        int total = 0;
        Queue<int> productsCopy = new Queue<int>(products.ToArray());

        foreach(int product in products){
            total += product;
            Console.WriteLine(product);
        }
        return total;
    }

    public static void Main(string[] args){

        DayThree day = new DayThree();
        int total = day.search("mul(13,4)*&mul[0,9)");
        Console.Write("The total sum of the multiplied values is ");
        Console.Write(total);
    }
  }
}