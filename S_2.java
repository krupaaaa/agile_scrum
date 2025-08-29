package String;

import java.util.Scanner;

class ReverseString{
    Scanner sc  = new Scanner(System.in);
    int index=0;

    String s;
    public void takeInput(int size ){
        System.out.println("Enter Input String : ");
        s=sc.nextLine();
    }

    public void reverse_1(){
        char[] charArr = s.toCharArray();
        char[] reversed = new char[s.length()];
//        int left=0;
//        int right=s.length()-1;
//
//        while (left<right){
//            char temp = charArr[right];
//            charArr[left]=charArr[right];
//            charArr[right]=temp;
//        }

        for(int i=s.length()-1;i>=0;i--){
            reversed[charArr.length-1-i] = charArr[i];
        }
        for(char i:reversed){
            System.out.println(i);
        }
    }
}
public class S_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter size : ");
        int inputSize = sc.nextInt();

        ReverseString r = new ReverseString();

        r.takeInput(inputSize);
        r.reverse_1();
    }
}
