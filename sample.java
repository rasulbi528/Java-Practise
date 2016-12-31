package prpexam1;

import java.io.*;
import java.util.*;

   public class sample {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte T = Byte.parseByte(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[T];
        for(int i = 0; i < T; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0, count = 0;;
        for(int i = 0; i < T; i++){
             sum = 0;
             sum += arr[i];// If the number itself is negative count++
              if(sum < 0){
                    count++;
                }
            for(int j = i + 1; j < T; j++){
                sum += arr[j];
                if(sum < 0){// If the most recent sum is -ve, count++
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}