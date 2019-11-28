package com.ustglobal.arrays;

public class TestA {
public static void main(String[] args) {
	 int[]nums = new int[5];
	 nums[0] = 10;
	 nums[1] = 20;
	 nums[2] = 30;
	 nums[3] = 40;
	 nums[4] = 50;
	 for(int i = 0; i <nums.length;i++) {
		 System.out.println(nums[i]);
	 }
	 System.out.println("====================");
	 for(int num : nums) {
		 System.out.println(num);
	 }
	 System.out.println("=======================");
	 char[]ch = {'a','b','c','d'};
	 for(int i = 0; i <ch.length;i++) {
		 System.out.println(ch[i]);
	 }
	 System.out.println("===============");
	 for(int c : ch) {
		 System.out.println(c);
	 }
	 System.out.println("================");
	 boolean[] b = {true,false,true};
	 System.out.println("===========");
	 byte[] b1 = {1,2,3,4};
	 for(int i=0;i<b1.length;i++) {
		 System.out.println(b1[i]);
	 }
	 System.out.println("===================");
	 double[] d1 = {1.0000,2.0000,3.0000,4.0000};
	 for(int i=0;i<d1.length;i++) {
		 System.out.println(d1[i]);
	 }
	 System.out.println("========================");
	 String[] names = {"manasa","surya","teju","swi"};
	 for(int i = 0;i<names.length;i++) {
		 System.out.println(names[i]);
	 }
	 System.out.println("=====================");
	 for(String name:names) {
		 System.out.println(name);
	 }
	 
}
}
