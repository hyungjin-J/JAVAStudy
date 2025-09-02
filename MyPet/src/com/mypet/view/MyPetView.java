package com.mypet.view;
import java.util.Random;
//모델로 분류한 클래스에서만 게터 세터 만듬
import java.util.Scanner;

import com.mypet.controller.MyPetController;
import com.mypet.model.Cat;
import com.mypet.model.Dog;
import com.mypet.model.Pet;
import com.mypet.model.PetType;

public class MyPetView {
	
	private Scanner sc = new Scanner(System.in);
	private MyPetController mpc = new MyPetController();
	private PetType[] types = {new Dog(), new Cat()}; // 개 고양이 객체 설정
	private final int PLAY_DAYS = 10; // 플레이 하는 시간
	
	//생성자를 따로 정의하지 않으면, -->기본 생성자가 자동으로 만들어짐
	/*
	 * 시작 화면을 보여주는 메소드
	 */
	public void startView() {
		
		System.out.println("***** My Pet *****");
		System.out.println("이름 입력 : ");
		String userName = sc.nextLine();
		mpc.createUser(userName);
		//사용자 정보 추가 -> 컨트롤러에서 수행
		
		System.out.print("펫 이름 입력 : ");
		String petName = sc.nextLine();
		createPet(petName);
		
		mainView();
		
	}
	/*
	 * 펫 종류를 랜덤하게 뽑아서 펫을 등록하는 메소드
	 * @param petName 펫이름
	 */
	public void createPet(String petName) {
		
		//랜덤하게 펫을 뽑기! - 펫 종류에 대해 랜덤값 추출(0,1,....)
		// Random 클래스를 사용해보자
		Random random = new Random();
		int rNum = random.nextInt(types.length);
		
		PetType type = types[rNum];
		//펫 정보 등록 -> 컨트롤러에서 수행할 예정 
		
		Pet pet = new Pet(petName,type);
		mpc.createPet(pet);
	}
	/*
	 * 메인 화면
	 * PLAY_DAYS 만큼 반복적으로 펫을 키우는 작업을 표시할 예정
	 */
	public void mainView() {
		
		for (int i=1; i<=PLAY_DAYS;i++) {
			System.out.println("========= Day" + i + "==========");
			String petInfo = mpc.petStatus();
			System.out.println(petInfo);
			
			//현재 상태 출력 -> 컨트롤러를 통해 정보를 조회할 예정
			// 펫이 살아있는 경우, 밥을 주거나/놀아주거나/씻겨주는 작업을 수행
			// 펫인 죽은 경우, 게임 종료(프로그램 종료)
			if (!mpc.isPetAlive()) {
				System.out.println("펫이 죽었습니다....");
				System.out.println("게임이 종료됩니다.");
				
				return;
			}
			
			// ---- 펫이 살아있는 경우
			actionMenu(); // 동작 수행
			mpc.nextDay(); // 하루가 지날 때 상태 업데이트
			
			
		}
		// 10일동안 펫을 잘 성장시킨 경우
		System.out.println("펫이 잘 성장했습니다. 게임을 종료합니다.");
	}
	/*
	 * 액션 메뉴 : 펫에 어떠한 동작을 할 수 있도록 출력하는 메뉴
	 */
	public void actionMenu() {
		int action;
		do {
				
			
			System.out.println("* 원하는 행동을 선택해주세요.");
			System.out.println("1. 밥 주기");
			System.out.println("2. 놀아주기");
			System.out.println("3. 씻겨주기");
			System.out.print(" : ");
			
			action = sc.nextInt();
			sc.nextLine();
			
			if(action < 1 || action > 3) {
				System.out.println("잘못 선택했습니다. 다시 선택해주세요.");
				continue;
			}
			
			// 컨트롤러를 통해 -> 선택한 항목에 대한 상태 변경할 예정
			mpc.doAction(action);
		} while(action < 1 || action > 3);

}
}
