using System;
using System.Collections.Generic;

namespace FifthDay
{
    class FifthDay {
        
        public int check_order(string list_string, string orderString){
            Tuple<int, int> order = get_order(order);
            string[] list_array = list_string.Split('\n');
            for(int i = 0; i < list_array.Length; i++){
                check_row(list_array[i]);
            }
            return 0;
        }

        public boolean check_row(string row){
            string[] pages_string = list_array[i].Split(',');
            int[] pages = new int[pages_string.Length];
            int i = 0;
            foreach(string page in pages_string){
                pages[i] = Int32.Parse(page);
                i++;
            }
        }

        public boolean loop_order(Tuple<int, int>[]order, int a, int b){
            for(Tuple<int, int> tuple in order){
                if(b == tuple.Item1 && a == tuple.Item2){
                    return false;
                }
            }
            return true;
        }

        public Tuple<int, int>[] getOrder(string order){
            string[] order_array = order.Split('\n');
            Tuple<int, int>[] order_rules = new Tuple<int, int>[order_array.Length];
            int tuple_index = 0

            for(string element in order_array){
                order_rules[tuple_index] = (Int32.Parse(element.Split('|')[0]), Int32.Parse(element.Split('|')[0]));
                tuple_index++;
            }
            return order_rules;
        }

        public static void Main(string[] args){
        	FifthDay day = new FifthDay();
            string order = "23|45\n34|35\n34|45";
            string list_string = "23,45,34\n23,34,45";

            day.check_order(list_string, order);
        }
    }
}