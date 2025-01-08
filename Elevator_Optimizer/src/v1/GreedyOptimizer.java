package v1;

import java.util.ArrayList;
import java.util.Collections;

public class GreedyOptimizer {
	// returns the minimum value in an array
	public static int MinArray(int[] arr) {
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Array must not be empty or null.");
		}

		int min = arr[0]; // Assume the first element is the minimum
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i]; // Update minimum if a smaller value is found, except -1
			}
		}
		return min;
	}

	// Method to find the index of a value in an array
	public static int findIndex(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i; // Return the index if the value is found
			}
		}
		return -1; // Return -1 if the value is not found in the array
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3; // No. of stops
		int[] destination = {1,2,4,7,9,13}; // Destination of the lift, where should it stop
		int floors = 15;
		
		int[] cost = new int[floors]; // The cost of stopping at each floor, indexes represents floor
		int pax = destination.length; // No. of passengers
		int minFloor;	//Floor no. having the minimum walking cost
		int temp = 0;
		ArrayList<Integer> visit = new ArrayList<>(); // Floors to visit
		
		// Check if k stops equals destination floors, then stop at the requested floors
		if (k == destination.length) { 
			for (int a = 0; a < destination.length; a++) {
				visit.add(destination[a]);
			}
			//Print the solution
			System.out.println("\nSolution: ");		
	        Collections.sort(visit);
			for (Integer stop : visit) {
				System.out.println(stop); 
			}

		} else {
		// Calculating the cost of stopping at each floor
		System.out.println("Costs of stopping at each floor: ");
		for (int i = 1; i <= floors; i++) {
			temp = 0;
			for (int j = 0; j < pax; j++) {
				temp += Math.abs(destination[j] - i);  //Distance of stairs between the destination floor and the current floor
			}
			System.out.println("Cost at floor " + i + " :" + temp);
			cost[i - 1] = temp; //Total cost of all passenger for stopping at floor i
		}
		//Greedy approach
		do {
			// (1) Selection Procedure: Select the floor with the minimum walking distance (cost)
			minFloor = findIndex(cost, MinArray(cost)); 
			// (2)Feasibility check: Check if the selected floor is in close proximity to another floor
			if (visit.indexOf(minFloor) == -1 && visit.indexOf(minFloor - 1) == -1 && visit.indexOf(minFloor + 1) == -1) {
				visit.add(minFloor);
			}
			cost[minFloor] = 999; // Flag, saying that the floor has been visited
		// (3) Solution Check
		} while (visit.size() != k);   //Check if k floors for solution has been found
		
		//Print solution
		System.out.println("\nSolution: ");
		Collections.sort(visit);
		for (Integer stop : visit) {
			System.out.println(stop + 1); // To remove floor 0 (index 0) from consideration

		}

		}

	}
}
