package movieReservation;

import java.util.Scanner;

public class MovieMain {
	Scanner sc = new Scanner(System.in);
	String[][] seat = new String[3][5];
	int reservationSeatNum =1000;
	Reservation reser = new Reservation();

	while(true) {
		System.out.println("1.오늘의 영화 2.좌석보기 3.영화 예매 4.취소 5. 종료");
		int choice = sc.nextInt();
		
		if(choice ==1) {
			System.out.println("===오늘의 영화===");
			System.out.println("제목 \t\t\t 상영시간  장르 \t\t 감독 \t 관람가");
			System.out.println(reser.todayShow());
			System.out.println("============");
		}else if(choice ==2) {
			for(int i=0; i<seat.length; i++) {
				for(int j =0; j<seat[i].length; j++) {
					System.out.println((char)('A' +i));
					System.out.println(reser.SeatCheck(seat[i][j], j)+"\t");
				}
				System.out.println();
			}
		}else if (choice ==3) {
			for(int i=0; i<seat.length; i++) {
				for(int j =0; j<seat[i].length; j++) {
					System.out.println((char)('A' +i));
					System.out.println(reser.SeatCheck(seat[i][j], j)+"\t");
				}
				System.out.println();
		    }
			System.out.println("좌석번호를 선택해 주세요");
			String seatNum = sc.next();
			
			char[] reservationSeat = seatNum.toCharArray();
			
			int line = reservationSeat[0] -'A';
			int num = reservationSeat[1] - '0';
			seat[line][num] = reservationSeat[0] + String.valueOf(reservationSeatNum);
			reservationSeatNum++;
			
			for(int i=0; i<seat.length; i++) {
				for(int j =0; j<seat[i].length; j++) {
					System.out.println((char)('A' +i));
					System.out.println(reser.SeatCheck(seat[i][j], j)+"\t");
				}
				System.out.println();
		    }
			System.out.println("고객님의 예약 번호는"+seat[line][num]+"입니다");
		    }else if(choice ==4) {
		    	System.out.println("취소하실 예약 번호를 입력해주세요");
		    	String seatNum = sc.next();
		    	
		    	for(int i=0; i<seat.length; i++) {
					for(int j =0; j<seat[i].length; j++) {
						if(seatNum.equals(seat[i][j])) {
							seat[i][j] = null;
						}
					}
		    }
		    	for(int i=0; i<seat.length; i++) {
					for(int j =0; j<seat[i].length; j++) {
						System.out.println((char)('A' +i));
						System.out.println(reser.SeatCheck(seat[i][j], j)+"\t");
					}
					System.out.println();
			    }
		    }else if (choice ==5) {
		    	System.out.println("프로그램 종료");
		    	return;
		    }else {
		    	System.out.println("잘못된 입력");
		    }
	}
  }
}


