using System;
using System.Collections.Generic;

namespace HelloWorld
{
  class FifthDay {
        
        public List<string> check_pages(string list_string, string order_string){
            Tuple<int, int>[] order = get_order(order_string);
            string[] list_array = list_string.Split('\n');
            List<string> safe_rows = new List<string>();
            
            for(int i = 0; i < list_array.Length; i++){
                if(check_row(list_array[i], order)){
                	safe_rows.Add(list_array[i]);
                }
            }
            return safe_rows;
        }

        public bool check_row(string row, Tuple<int, int>[] order){
            string[] row_array = row.Split(',');
            int[] pages = new int[row_array.Length];
            int i = 0;
            
            foreach(string page in row_array){
                pages[i] = Int32.Parse(page);
                for(int j = 0; j < i; j++){
                    if(!check_order(order, pages[j], pages[i])){
                        return false;
                    }
                }
                i++;
            }
            
            return true;
        }

        //new method to loop through order to verify all pages match it

        public bool check_order(Tuple<int, int>[]order, int a, int b){
            foreach(Tuple<int, int> tuple in order){
                if(b == tuple.Item1 && a == tuple.Item2){
                    return false;
                }
            }
            return true;
        }

        public Tuple<int, int>[] get_order(string order){
            string[] order_array = order.Split('\n');
            Tuple<int, int>[] order_rules = new Tuple<int, int>[order_array.Length];
            int tuple_index = 0;

            foreach(string element in order_array){
                order_rules[tuple_index] = new Tuple<int, int>(Int32.Parse(element.Split('|')[0]), Int32.Parse(element.Split('|')[1]));
                tuple_index++;
            }
            
            return order_rules;
        }

        public static void Main(string[] args){
        	FifthDay day = new FifthDay();
            string order = "23|45\n34|35\n34|45";
            string list_string = "23,45,34\n23,34,45";

            List<string> result = day.check_pages(list_string, order);
            foreach(string safe_row in result){
				Console.WriteLine(safe_row);
			}
        }
    }
}