package com.mycompany.uts.algoritma;

import java.util.Scanner;

public class No1 {
    public static void sorting(int[] A){
        int i =1, j, n = A.length;
        int temp;
        while (i<n) {            
            j=n-1;
            while(j>=i){
                if(A[j-1]>A[j]){
                    temp = A[j];
                    A[j] = A[j-1];
                    A[j-1] = temp;
                }
                j -= 1;
            }
            i += 1;
        }
    }
    
    public static void searching(int[] A, int cari){
        int pointer, posisiAwal = 0;
        int posisiAkhir = A.length - 1;
        boolean ketemu = false;
        
        while((posisiAwal <= posisiAkhir) && (ketemu == false)){
            pointer = (posisiAwal + posisiAkhir) / 2;
            
            System.out.println("index pointer : " + pointer);
            if(cari == A[pointer]){
                ketemu = true;
                System.out.println("Data " + cari + " telah ditemukan pada index ke " + pointer);
            }else if(cari < A[pointer] ){
                System.out.println("cari di kiri");
                posisiAkhir = pointer - 1;
            }else if(cari > A[pointer]){
                System.out.println("cari di kanan");
                posisiAwal = pointer + 1;
            }
        }
        
        
        if(ketemu){
            System.out.println("Kesimpulan: data ditemukan");
        }else{
            System.out.println("Kesimpulan: data tidak ditemukan");
        }
    }
    
    public static void tampil(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
            
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int[] a = {3,10,4,2,8,13};
        No1.tampil(a);
        System.out.println("");
        
        System.out.print("Data setelah disorting  ==> ");
        No1.sorting(a);
        No1.tampil(a);
        System.out.println("");
        No1.searching(a, 8);
        
        
        
        System.out.println();
        System.out.println("    zulfikri pamungkas");
        System.out.println("** Terimakasih **");
    }
}


