package com.iu.util;

import java.util.Scanner;

public class CollectionSet implements Collection{
	
	//3. com.iu.util.CollectionSet
			//add - 새로운 숫자 추가 맨 뒤에 추가
			// 단 중복되지 않는 숫자만 추가
			//remove - 삭제할 숫자를 입력 받아서 일치하는 숫자 삭제
	
	public int [] add(int [] numbers) {
		int [] numbersCopy = new int[numbers.length + 1];
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		boolean how = true;
		int i = 0;
		for(i = 0; i < numbers.length; i++) {
			if(count == numbers[i]) {
				System.out.println("숫자가 중복됩니다");
				how = !how;
				break;
				}
		}
			if(how) {
				for(i = 0; i < numbers.length; i++) {
					numbersCopy[i] = numbers[i];
				}
				numbersCopy[numbersCopy.length - 1] = count;
				numbers = numbersCopy;
			}
		return numbers;
	}
	
	public int [] remove(int [] numbers) {
		System.out.println("삭제할 숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int [] numbersCopy = new int[numbers.length - 1];
		int i = 0;
		int index = 0;
		boolean check = true;
		
		if(check) {
		for(i = 0; i < numbers.length; i++) {
			if(count == numbers[i]) {
				continue;
			}
			numbersCopy[index] = numbers[i];
			index++;
			}
		}
		numbers = numbersCopy;
		return numbers;
	}
}
