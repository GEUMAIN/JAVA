package test;

import java.lang.reflect.Array;

public class test2 {
	public static void main(String[] args) {
		int[] arr = new int[]{31,25,64,71,24,51}; //배열 만들기
		
		for (int i = 1; i<arr.length; i++) { //인덱스값
			for (int j = i; j>0; j--) { //인덱스 뒷 값
				
				if(arr[j-1] > arr[j]) { // 뒤에 있는 값이 앞에 있는 값보다 크다면
					int temp = arr[j-1]; //임시 temp에 뒷 값을 저장한다
					arr[j-1] = arr[i]; // 뒷 값이 크므로 뒷 값엔 원래 앞의 값을 넣고
					arr[j] = temp; //앞에 있는 값엔 더 컸던 뒷 값의 복사본을 넣는다
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
