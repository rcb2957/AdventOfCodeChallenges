public class DayThree{

    public void search(string input){
        // Loop through string until mul is found
        int mul_count = 0
        for(int i = 0; i < input.length(); i++){
            string a = "";
            string b = "";
            if(current string = 'mul('){
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
                    multiply(a, b);
                }
            }
        }

    }

    public int multiply(string x, string y){
        return Int32.Parse(x) * Int32.Parse(y)
    }

    public static void main(string[] args){
        DayThree day = new DayThree();
        day.search("mul(3,4)*&mul[0,9)")
    }
}