package ex01start;

import java.text.SimpleDateFormat;
import java.util.Date;

public class E01JavaStruct {

	public static void main(String[] args){
		//1. 오늘 날짜 생성
		Date toDayOfDate = new Date();
		System.out.println("오늘날짜:"+toDayOfDate);
		
		//2. 날짜형식 변환(SimpleDateFormat)	
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String toDayString = simple.format(toDayOfDate);
		
		//3. 결과 출력		
		System.out.println("변형된 날짜:"+toDayString);
	}
}

