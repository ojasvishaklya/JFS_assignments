package com.telstra;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_1 {

	public static boolean isPrime(int n) {
		
		for(int i=2;i*i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isPalindrome(String s) {
		
		int i=0;
		int j=s.length()-1;
		
		while(i<j) {
			if(s.charAt(i) !=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static boolean isArmstrong(int n) {
		
		int temp=n;
		int len=0;
		
		while(temp!=0) {
			len++;
			temp/=10;
		}
		int ans=0;
		temp=n;
		while(temp!=0) {
			ans+= Math.pow(temp%10, len);
			temp/=10;
		}
		
		return ans==n;
	}
	public static void removeDuplicates(int[] arr) {
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			int j=i;
			System.out.print(arr[i] + " ");
						
			while(j<arr.length && arr[j]==arr[i]) j++;
			
			i=j;
		}
		
	}
	public static int oddSum(int n) {

		int ans=0;
		int len=0;

		while(n!=0) {
			len++;
			if(len%2==0) {
				ans+=n%10;
			}
			n/=10;
		}

		return ans;
	}
	public static void Driver() {
		boolean status=true;
		Scanner sc =new Scanner(System.in);
		while(status) {
			int key;
			System.out.println("Press 1 for isPrime()");
			System.out.println("Press 2 for isArmstrong()");
			System.out.println("Press 3 for isPalindrome()");
			System.out.println("Press 4 for removeduplicates()");
			System.out.println("Press 5 for oddSum()");
			System.out.println("Press X to exit");
			key=sc.nextInt();
			
			if(key==1) {
				int n;
				System.out.println("Enter the number");
				n=sc.nextInt();
				System.out.println(isPrime(n));
			}else if(key==2) {
				int n;
				System.out.println("Enter the number");
				n=sc.nextInt();
				System.out.println(isArmstrong(n));
			}else if(key==3) {
				String n;
				System.out.println("Enter the string");
				n=sc.next();
				System.out.println(isPalindrome(n));
			}else if(key==4) {
				int n;
				System.out.println("Enter the size of the array");
				n=sc.nextInt();
				int[] arr =new int[n];
				
				System.out.println("Enter the elements of the array");
				for(int i=0;i<n;i++) {
					int x;
					x=sc.nextInt();
					arr[i]=x;					
				}
				removeDuplicates(arr);
				System.out.println();
			}else if(key==5) {
				int n;
				System.out.println("Enter the number");
				n=sc.nextInt();
				System.out.println(oddSum(n));
			}else status=false;
		}
	
	}
	
	public static void main(String[] args) {
		Driver();
	}

}
