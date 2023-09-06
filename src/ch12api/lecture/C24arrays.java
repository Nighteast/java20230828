package ch12api.lecture;

import java.util.Arrays;

public class C24arrays {
    public static void main(String[] args) {
        // Arrays : 배열을 다루는 메서드들 있음

        // equals : 두 배열이 같은지
        // fill : 배열을 특정 값으로 채우기
        // sort : 배열 정렬
        // binarySearch : 특정 원소의 위치 찾기
        // toString : 문자열로 변환

        int[] arr1 = new int[5];
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 10;
        }
        System.out.println(Arrays.toString(arr1));

        Arrays.fill(arr1, 5);
        System.out.println(Arrays.toString(arr1));

        // sort
        int[] arr2 = {3, -2, 10, 0, -1};
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        // equals
        int[] arr3 = {3, 4, 5};
        int[] arr4 = {3, 4, 5};
        int[] arr5 = {4, 3, 5};

        System.out.println(arr3 == arr4);   //false
        System.out.println(Arrays.equals(arr3, arr4));  //true
        System.out.println(Arrays.equals(arr4, arr5));  //false

        Arrays.sort(arr4);
        Arrays.sort(arr5);
        System.out.println(Arrays.equals(arr4, arr5));  //true

        // binarySearch : 이진 탐색
        // 정렬되어있는 배열이라면 중간값부터 큰지 작은지를 확인하여 효율적으로 탐색
        // 반드시 정렬 되어 있어야 함.

        int[] arr6 = {5, 3, 1, 7, 9};

        int i = Arrays.binarySearch(arr6, 3);
        System.out.println(i);

        Arrays.sort(arr6);  // 1, 3, 5, 7, 9
        int i1 = Arrays.binarySearch(arr6, 3);
        System.out.println(i1);

        int i2 = Arrays.binarySearch(arr6, 4);
        System.out.println(i2);


    }
}

