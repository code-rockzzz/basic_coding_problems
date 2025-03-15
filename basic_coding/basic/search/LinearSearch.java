package search;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {87,34,9,12,45,63,89};
        int[][] multiDiArr = {
                {34,87,92,23,56,83},
                {65,31,25,90,88},
                {35,12,99}
        };
        int target = 12;
        System.out.println(isElementExist(arr, target));
        System.out.println(Arrays.toString(isEleExistInMultiDiArr(multiDiArr, target)));
    }

    static int isElementExist(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }

    static int[] isEleExistInMultiDiArr(int[][] arr, int target){
        for(int r=0; r<arr.length; r++){
            for(int c=0; c<arr[r].length; c++){
                if(target == arr[r][c]){
                    return new int[]{r, c};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
