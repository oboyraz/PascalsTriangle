import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {
    /*
    Given an integer numRows, return the first numRows of Pascal's triangle.

    to see question => https://leetcode.com/problems/pascals-triangle/
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Pascal triangle number: ");
        int numRows = scan.nextInt();
        List<List<Integer>> listOfPascal = new ArrayList<List<Integer>>();

        if (!(numRows>30 || numRows<=0)){
            listOfPascal = pascalTriangles(numRows);
            System.out.println(listOfPascal);
        }

        else {
            System.out.println("Please enter a number between 1 and 30!");
        }
    }

    private static List<List<Integer>> pascalTriangles(int numRows) {
        List<List<Integer>> listOfLists = new ArrayList<List<Integer>>();
        for (int i = 0; i <numRows ; i++) {
            List<Integer> arr1 = new ArrayList<>();
            listOfLists.add(arr1);
        }
        if (numRows==1){
            listOfLists.get(0).add(1);
        }
        else {

            listOfLists.get(0).add(1);
            listOfLists.get(1).add(1);
            listOfLists.get(1).add(1);

            for (int i = 2; i <numRows ; i++) {
                listOfLists.get(i).add(1);
                for (int j = 0; j <(listOfLists.get(i-1).size())-1 ; j++) {
                    int toplam = 0;
                    toplam = listOfLists.get(i-1).get(j) + listOfLists.get(i-1).get(j+1);
                    listOfLists.get(i).add(toplam);
                }
                listOfLists.get(i).add(1);
            }
        }

        return listOfLists;
    }
}


