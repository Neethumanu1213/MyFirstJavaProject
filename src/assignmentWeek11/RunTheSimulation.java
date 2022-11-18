package assignmentWeek11;

import java.io.IOException;

public class RunTheSimulation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		R1 r1 = new R1(100, 10, 18);
		R2 r2 = new R2(120, 18, 29);
		Simulation simulation = new Simulation();
		simulation.loadItems();
		simulation.loadR1(r1);
		simulation.loadR2(r2);
		simulation.runSimulation(r1, r2);
	}
}
