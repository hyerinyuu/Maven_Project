package com.biz.sec.work;

import java.util.Map;
import java.util.Set;

public class SystemENV_01 {

	public static void main(String[] args) {
		
		// java에서 OS에서 설정한 환경변수 가져오기
		Map<String,String> envList = System.getenv();
		
		// 전체 ENV리스트 확인
		Set<String> keys = envList.keySet();
		for(String key : keys) {
			System.out.printf("KEY : %s , VALUE : %s\n", key, envList.get(key));
		}
		
		// 환경변수 중에서 BIZ의 값을 확인
		System.out.println(envList.get("BIZ"));
		System.out.println(envList.get("KOREA"));
		
		// 환경변수를 이용해 SALT 감추기
		// SecEx_02 참고
		
	}
	
	
}
