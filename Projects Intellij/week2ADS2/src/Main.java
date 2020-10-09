import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //IterativeFactorial();
        //RecursiveFactorial();
        //linearSearchQuestion();
        //BinarySearch();
        BinarySearchRecursion();
    }
    public static void IterativeFactorial(){
        System.out.println("input factorial number: ");
        Scanner myInput = new Scanner(System.in);
        int data = myInput.nextInt();
        int answer = 0;
        answer = data;
        for(int i=1; i<data; i++){
            answer *= i;
        }
        System.out.println(answer);
    }
    public static void RecursiveFactorial(){
        System.out.println("input factorial number: ");
        Scanner myInput = new Scanner(System.in);
        int n = myInput.nextInt();
        int answer = Calculation(n);
        System.out.println(answer);

    }
    public static int Calculation(int n){
         if(n>0) {
             return n*Calculation(n-1);
         }
         return 1;
    }
    public static void linearSearchQuestion(){
        int[] data = {10,14,67,77,2};
        int search = 67;
        int searchCalculation = LinearSearchCalculation(data, search);
        System.out.println(searchCalculation);
    }
    public static int LinearSearchCalculation(int data[], int search){
        for(int i=0; i<data.length; i++){
            if (data[i] == search){
                return i;
            }
        }
        return -1;
    }
    public static void BinarySearch (){
        int[] arr={10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("input search number: ");
        Scanner myInput = new Scanner(System.in);
        int search = myInput.nextInt();

        int answer = BinarySearchCalc(arr,search);
        System.out.println(answer);
    }
    public static int BinarySearchCalc(int arr[], int search){
        int lRange = 0;
        int hRange = arr.length;
        int guess = arr.length /2;
        boolean correct = false;
        while(correct);
        {
            if (arr[guess] == search) {
                correct = true;
            } else if (arr[guess] > search) {
                guess = (guess + lRange)/2;
            } else if (arr[guess] < search) {
                guess = (hRange + guess)/2;
            }
        }
        return guess;
    }
    public static void BinarySearchRecursion (){
        int[] arr={10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("input search number: ");
        Scanner myInput = new Scanner(System.in);
        int search = myInput.nextInt();
        int answer = BinarySearchCalc(arr,search);
        System.out.println(answer);
    }
    public static void BinarySearchCalcRecursion(int arr[], int search){
        int lRange = 0;
        int hRange = arr.length;
        boolean correct = false;
        binaryCalc(arr,lRange,hRange,search);
    }
    public static int binaryCalc(int[] arr,int lRange,int hRange,int search){
        int guess = (hRange + lRange)/2;

        if (arr[guess] == search) {
            return guess;
        } else if (arr[guess] > search) {
            return binaryCalc(arr, guess, lRange, search);
        }
        return binaryCalc(arr, hRange, guess, search);
    }
}

