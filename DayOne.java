package AdventOfCodeChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DayOne{

    public static List<Integer> sortList(List<Integer> list){

        List<Integer> unsortedList = new ArrayList<>(list);

        if(list == null){
            return list;
        }
        if(list.isEmpty()){
            return list;
        }

        List<Integer> sortedList = new ArrayList<>();

        for(int i = 0; i < list.size(); i++){

            sortedList.add(Collections.min(unsortedList));
            
            int minimumIndex = unsortedList.indexOf(Collections.min(unsortedList));

            if(minimumIndex != -1){
                unsortedList.remove(minimumIndex);
            }   

        }

        return sortedList;
    }

    public static int distance(List<Integer> listOne, List<Integer> listTwo){

        int distance = 0;

        if(listOne == null || listTwo == null){
            return 0;
        }
        if(listOne.isEmpty() || listTwo.isEmpty()){
            return 0;
        }

        listOne = sortList(listOne);
        listTwo = sortList(listTwo);

        for(int i = 0; i < listOne.size(); i++){
            distance += Math.abs(listOne.get(i) - listTwo.get(i));
        }

        return distance;
    }

    public static void main(String[] args){

        List<Integer> listOne = Arrays.asList(3, 4, 2, 1, 3, 3);
        List<Integer> listTwo = Arrays.asList(4, 3, 5, 3, 9, 3);

        int totalDistance = 0;

        try {
            totalDistance = distance(listOne, listTwo);
            System.out.println("The total distance between the lists is " + totalDistance);
        }
        catch(NullPointerException e){
            System.out.println("One of the lists has a null value");
        }
        catch (Exception e) {
           System.out.println("Error Found");
        }
    }
}