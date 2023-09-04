package day13.api.java_util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date.toString());  // 시간 날짜 출력해줌  Mon Sep 04 16:50:30 KST 2023
		// currentTimeMills 기반으로 불러와서 사용
		
		// 특정 문자열 포맷으로 얻어내고 싶은 경우 SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); 
		// 대소문자 가림 월에서 사용하는 M과 분에서 사용하는 m이 같은 m으로 겹쳐서..
		// hh - 12시간, HH -24시간
		String time = sdf.format(date);
		System.out.println(time);
		
		sdf = new SimpleDateFormat("yy-MM-dd a hh:mm:ss"); // a는 오전 오후 표시
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("오늘은 E요일입니다. 오늘은 1년 중 D번째 날입니다.");
		System.out.println(sdf.format(date));

	}// main end

}
