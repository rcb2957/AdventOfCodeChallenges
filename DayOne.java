package AdventOfCodeChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DayOne{

    public List<Integer> sortList(List<Integer> list){

        List<Integer> sortedList = new ArrayList<>();

        for(int i = 0; i < list.size(); i++){
            sortedList.add(Collections.min(list));
            list.remove(Collections.min(list));
        }

        return sortedList;
    }

    public int distance(List<Integer> listOne, List<Integer> listTwo){

        int distance = 0;

        sortList(listOne);
        sortList(listTwo);

        for(int i = 0; i < listOne.size(); i++){
            
        }

        return distance;
    }

    public static void main(String args){

    }
}