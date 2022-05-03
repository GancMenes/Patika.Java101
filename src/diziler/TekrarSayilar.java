package diziler;

import java.util.Arrays;

public class TekrarSayilar {

    public static void main(String[] args) {
        int[]listNum= {2,4,4,6,6,7,9,12,12,14,18,22,24,8,84,88};
        for(int a=0;a <listNum.length; a++){
            for(int b=a;b<listNum.length;b++){
                if(listNum[a]==listNum[b] && a!=b){
                    if(listNum[a]%2==0){
                        System.out.println("Repeating even numbers : "+listNum[a]);
                    }
                }
            }
        }
    }
}
