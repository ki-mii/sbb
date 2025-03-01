package com.mysite.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor //롬복을 활용하여 생성자를 자동으로 만들어줌
@Getter
public class HelloLombok {
	
	private final String hello;
	private final int lombok;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloLombok h1 = new HelloLombok("헬로", 5);
		
		System.out.println(h1.getHello());
		System.out.println(h1.getLombok());

	}

}
