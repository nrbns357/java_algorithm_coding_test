package kr.hs.dgsw.java.dept1.preparing_for_coding_test;

public class CH01_1_16_18 {
//시간 복잡도는 주어진 문제를 해결하기 위한 연산 횟수를 말합니다.
	//일반적으로 수행 시간은 1억 번의 연산을 1초의 시간으로 간주하여 예측합니다.
	
	//시간 복잡도 예제 코드
	public static void main(String[] args) {
		
		//1~100 사이 값 랜덤 선택
		int findNumber = (int)(Math.random() * 100);
		for(int i = 0; i < 100; i++) {
			if(i == findNumber) {
				System.out.println(i);
				break;
			}
		}
	}
	
	//코딩 테스트에서는 어떤 시간 복잡도 유형을 사용해야 할까?
	//(O(n))을 기준으로 수행시간을 계산하는 것이 좋습니다.
}
