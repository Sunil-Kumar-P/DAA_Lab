import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class QuickSort {
public static void main(String args[]) {
// unsorted integer array
Scanner scanner = new Scanner(System.in);
System.out.print("Enter how many numbers: ");
int n = scanner.nextInt();
int[] unsorted=new int[n];
for(int i=0;i<n;i++)
{ Random random = new Random();
unsorted[i]=random.nextInt(5000);
}
System.out.println("Unsorted array :" + Arrays.toString(unsorted));
QuickSort1 algorithm = new QuickSort1();
// sorting integer array using quicksort algorithm
algorithm.sort(unsorted);
// printing sorted array
System.out.println("Sorted array :" + Arrays.toString(unsorted));
scanner.close();
}
}
class QuickSort1 {
private int input[];
private int length;
long t1,t2,t;
public void sort(int[] numbers) {
if (numbers == null || numbers.length == 0) {
return;
}
this.input = numbers;
length = numbers.length;
t1=System.currentTimeMillis();
//System.out.println(t1);
quickSort1(0, length - 1);
t2=System.currentTimeMillis();
//System.out.println(t2);
t=t2-t1;
System.out.println("Time taken is to sort elements is "+ t);
}
/* * This method implements in-place quicksort algorithm recursively*/
private void quickSort1(int low, int high) {
int i = low;
int j = high;
int pivot = input[low + (high - low) / 2];
// Divide into two arrays
while (i <= j) {
while (input[i] < pivot) {
i++;
}
while (input[j] > pivot) {
j--;
}
if (i <= j) {
swap(i, j);
// move index to next position on both sides
i++;
j--;
}
}
// calls quickSort() method recursively
if (low < j) {
quickSort1(low, j);
}
if (i < high) {
quickSort1(i, high);
}
}
private void swap(int i, int j) {
int temp = input[i];
input[i] = input[j];
input[j] = temp;
}
}