package com.xworkz.controlStaments;

public class EvenNumbers {
	public static void array(int arr[]) {
		for (int i = 0; i<arr.length; i++)
			if (arr[i]%2==0) {
				System.out.println("even number are" +arr[i]);
			}
			else
			{
				System.out.println("not an even number" +arr[i]);
			}
	}

	public static void main(String[] args) {
		int arr[] = {1,5,7,8,3,10,5,25,86,99};
		EvenNumbers.array(arr);

	}

}
