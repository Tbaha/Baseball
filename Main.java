package baseball;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int AB, Hits, dbl, tripple, HR, BB, HBP, SF;
		
		String name;
		
		System.out.print("Enter the name of the player ");
		name = input.nextLine();
		
		System.out.print("Enter number of at bats ");
		AB = input.nextInt();
		
		System.out.print("Enter number of hits ");
		Hits = input.nextInt();
		
		System.out.print("Enter number of doubles ");
		dbl = input.nextInt();
		
		System.out.print("Enter number of tripples ");
		tripple = input.nextInt();
		
		System.out.print("Enter number of home runs ");
		HR = input.nextInt();
		
		System.out.print("Enter number of walks ");
		BB = input.nextInt();
		
		System.out.print("Enter number of times hit by pitch ");
		HBP = input.nextInt();
		
		System.out.print("Enter number of sac flys ");
		SF = input.nextInt();
		
		BaseballStat nbs = new BaseballStat(Hits, AB, BB, HBP, SF, dbl, tripple, HR);
		
		System.out.println("Statistics of " + name + ": ");
		System.out.println("Batting Average = " + nbs.BA());
		System.out.println("On Base Percentage = " + nbs.OBP());
		System.out.println("Slugging Percentage = " + nbs.SLG());
		System.out.println("On Base Percentage + Slugging = " + nbs.OBS());
		System.out.println("Total Bases = " + nbs.TB());
		
	}
}
