package assignmentWeek11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Simulation {
	private ArrayList<Item> itemList = new ArrayList<Item>();
	private ArrayList<R1> r1Rockets = new ArrayList<R1>();
	private ArrayList<R2> r2Rockets = new ArrayList<R2>();

	public ArrayList<Item> loadItems() throws IOException {
		String path = "C:\\Users\\manea\\OneDrive\\Desktop\\phase-1.txt";
		FileReader fileReader = new FileReader(path);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			if (line.length() == 0) {
				continue;
			}
			String name = line.substring(0, line.indexOf("="));
			int weight = Integer.parseInt(line.substring(line.indexOf("=") + 1));
			Item item = new Item(name, weight); // New Item Object
			itemList.add(item);
		}
		return itemList;
	}

	public ArrayList<R1> loadR1(R1 r1) {
		for (int i = 0; i < itemList.size(); i++) {
			if (r1.canCarry(itemList.get(i))) {
				r1.carry(itemList.get(i));
			} else {
				R1 tempRocket = new R1(100, 10, 18);
				tempRocket.cargoCarried = r1.cargoCarried; 
				this.r1Rockets.add(tempRocket);
				r1.cargoCarried = 0;
				i--;
			}
		}
		this.r1Rockets.add(r1);
		return r1Rockets;
	}

	public ArrayList<R2> loadR2(R2 r2) {
		for (int i = 0; i < itemList.size(); i++) {
			if (r2.canCarry(itemList.get(i))) {
				r2.carry(itemList.get(i));
			} else {
				R2 tempRocket = new R2(120, 18, 29);
				tempRocket.cargoCarried = r2.cargoCarried;
				this.r2Rockets.add(tempRocket);
				r2.cargoCarried = 0;
				i--;
			}
		}
		this.r2Rockets.add(r2);
		return r2Rockets;
	}

	public void runSimulation(R1 r1, R2 r2) {
		int r2Cost = 0, r1Cost = 0;
		int r1RocketIndex = 0, r2RocketIndex1 = 0;

		// cost calculation for r1
		while (r1RocketIndex < r1Rockets.size()) {
			if ((r1Rockets.get(r1RocketIndex).launch()) && (r1Rockets.get(r1RocketIndex).land())) {
				r1RocketIndex++;
			}
			r1Cost = r1Cost + r1.getRocketCost();
		}
		// cost calculation for r2
		while (r2RocketIndex1 < r2Rockets.size()) {
			if ((r2Rockets.get(r2RocketIndex1).launch()) && (r2Rockets.get(r2RocketIndex1).land())) {
				r2RocketIndex1++;
			}
			r2Cost = r2Cost + r2.getRocketCost();
		}
		System.out.println(String.format("Total cost of R1 fleets : $%d Million", r1Cost));
		System.out.println(String.format("Total cost of R2 fleets : $%d Million", r2Cost));
	}
}
