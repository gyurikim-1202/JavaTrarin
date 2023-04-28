package t20230428;

import java.util.Scanner;

class CoordinateTester2 {
	static boolean comCoordinate(Coordinate c1, Coordinate c2) {
		return c1.getX() == c2.getX() && c1.getY() == c2.getY();
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		double x, y;
		System.out.println("좌표 p를 입력하세요.");
		System.out.println("X좌표: "); x =stdIn.nextDouble();
		System.out.println("Y좌표: "); y =stdIn.nextDouble();
		Coordinate p = new Coordinate(x, y);
		
		System.out.println("좌표 q를 입력하세요.");
		System.out.println("X좌표: "); x =stdIn.nextDouble();
		System.out.println("Y좌표: "); y =stdIn.nextDouble();
		Coordinate q = new Coordinate(x, y);
		
		System.out.println((p == q)
				? "p == q입니다."
				: "p != q입니다.");
		
		System.out.println(p.getX() == q.getX() &&
						   p.getY() == q.getY()
						   ? "p와 q가 같습니다."
						   : "q와 p가 다릅니다.");
		
		System.out.println(comCoordinate(p, q)
						   ? "p와 q가 같습니다."
						   : "p와 q가 다릅니다.");

	}

}
