using System;
using System.Collections.Generic;

namespace FifthDay
{
    class FifthDay {
        
        public int check_order(string list_string, string order){
            string[] list_array = list_string.Split('\n');
            for(int i = 0; i < list_array.Length; i++){
                string[] pages = list_array[i].Split(',');
                foreach(string page in pages){
                	Int32.Parse(page);
                }
            }
            return 0;
        } 
        

        public static void Main(string[] args){
        	FifthDay day = new FifthDay();
            string order = "23|45\n34|35\n34|45";
            string list_string = "23,45,34\n23,34,45";
            day.check_order(list_string, order);
        }
    }
}