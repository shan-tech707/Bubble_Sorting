
import java.util.Scanner;

public class BubbleSorting {
    static boolean asc=false;
    static void display(int[] array){
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    static void bubbleSorting(int[] array){
        int i,j,temp;
        for(i=0 ;i<array.length ;i++) {
            for(j=0 ; j<array.length-1 ;j++) {
                if(!asc){
                    if(array[j]>array[j+1]) {
                        temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
                }else if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        asc=true;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] array=new int[5];
        for(int i=0 ;i<array.length ;i++) {
            System.out.print("Enter Value at "+i+" index = ");
            array[i]=input.nextInt();
        }

        System.out.println("The original values in array:\n");
        display(array);

        bubbleSorting(array);
        System.out.println("\n\nThe sorted (ASC) array:\n");
        display(array);

        bubbleSorting(array);
        System.out.println("\n\nThe sorted (DESC) array:\n");
        display(array);
    }
}


