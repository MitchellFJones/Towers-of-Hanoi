import java.util.Scanner;

public class Driver {
	
	static int moveCounter = 0;
	
	public static void TowerCalc(int x, char from_rod, char to_rod, char aux_rod) {
	
		moveCounter++;
		
		if(x == 1) {
			
			System.out.println("Move Disk 1 From Rod " + from_rod + " To Rod " + to_rod);
			
			return;
		}
		
		TowerCalc(x-1, from_rod, to_rod, aux_rod);
		
		System.out.println("Move Disk " + x + " From Rod " + from_rod + " To Rod " + to_rod);
		
		TowerCalc(x-1, from_rod, to_rod, aux_rod);
	}
	
	public static int resetMoveCounter() {
		
		moveCounter = 0;
		
		return moveCounter;
	}
	
	public static int getMoveCounter() {
		
		return moveCounter;
	}
	public static void main(String args[]) {
		
		TowerCalc(1, 'A', 'B', 'C');
		
		System.out.println("Total Moves: " + getMoveCounter());
		
		resetMoveCounter();
		
		TowerCalc(2, 'A', 'B', 'C');
		
		System.out.println("Total Moves: " + getMoveCounter());
		
		resetMoveCounter();
		
		TowerCalc(3, 'A', 'B', 'C');
		
		System.out.println("Total Moves: " + getMoveCounter());
		
		resetMoveCounter();

		TowerCalc(6, 'A', 'B', 'C');
		
		System.out.println("Total Moves: " + getMoveCounter());
		
		resetMoveCounter();
		
		TowerCalc(5, 'A', 'B', 'C');
		
		System.out.println("Total Moves: " + getMoveCounter());
		
		resetMoveCounter();
		
		TowerCalc(7, 'A', 'B', 'C');
		
		System.out.println("Total Moves: " + getMoveCounter());
		
		resetMoveCounter();
		
		int t = 0;
		
		System.out.println("Enter a very big number:");
		
		Scanner input = new Scanner(System.in);
		
		t = input.nextInt();
		
		TowerCalc(t, 'A', 'B', 'C');
		
		System.out.println("Total Moves: " + getMoveCounter());
		
		resetMoveCounter();
		

		
	}
}
