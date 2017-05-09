import java.util.*;
class tower_of_henoi_problem
	{
		void solve(int n, String start, String end, String aux)
			{
				if(n==1)
					System.out.println(start+" ---> "+end);
				else
					{
						solve(n-1, start, end, aux);
						System.out.println(start+" ---> "+end);
						solve(n-1, aux, start, end);
					}
			}
		public static void main(String args[])
			{
				tower_of_henoi_problem toh = new tower_of_henoi_problem();
				Scanner input = new Scanner(System.in);
				System.out.print("\n\t\tTower Of Hennoi Problem Solver");
				System.out.print("\nEnter the number of discs");
				int discs = input.nextInt();
				toh.solve(discs, "A", "B", "C");
				System.out.println("\n\nExiting...");
			}
	}