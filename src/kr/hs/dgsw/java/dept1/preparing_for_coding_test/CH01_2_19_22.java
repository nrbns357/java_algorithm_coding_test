package kr.hs.dgsw.java.dept1.preparing_for_coding_test;

import java.util.Scanner;

// 문제(연습) 000번 - 수정렬하기 시간제한 2초 백준 2750번
// N개의 수가 주어졌을 때 이름 오름차순 정렬하는 프로그램을 작성하시오.

public class CH01_2_19_22 {
    
    
    public static int[] src; 

    public static int[] temp;


    public static void main(String[] args) {
        src = new int[] {0}; // int형 배열을 생성 해서 0으로 초기화
        temp = new int[src.length];
        
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        for(int i = 0; i < Num; i++){
            int n = sc.nextInt();
            src[i] = n;
        }

        mergeSort(0, src.length-1); 
        printArray(src); 
    }


    public static void mergeSort(int start, int end){
        if(start < end){

          int mid = (start + end) / 2;
            mergeSort(start, mid);
            mergeSort(mid+1, end);
            int s = start, q = mid + 1, idx = s;


            while(s <= mid || q <= end){
                if(q > end || (s<=mid && src[s] < src[q])){
                    temp[idx++] = src[s++];
                }else{
                    temp[idx++] = src[q++];
                }
            }

            for(int i=start; i<end; i++){
                src[i] = temp[i];
            }
        }




    }


    public static void printArray(int[] a) {
         for (int i=0;i<a.length;i++) 
         System.out.println(a[i]+"\n"); 
    }

}