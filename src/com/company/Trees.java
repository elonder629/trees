package com.company;

import java.util.Scanner;

public class Trees {
	private static int findRagnorianism(int[] parents_tree1, int[] parents_tree2) {
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numTests = sc.nextInt();		// number of test cases

		for (int t = 0; t < numTests; t++) {
			int numVertices = sc.nextInt();
			int[] parents_tree1 = new int[numVertices];
			int[] parents_tree2 = new int[numVertices];

			// We assume both the trees are provided with root = 0, so we set the corresponding parents entries to -1
			parents_tree1[0] = -1;
			parents_tree2[0] = -1;

			// Read the structure of the first tree, and directly set the parents_tree1[] array
			for(int i = 0; i < numVertices - 1; i++) 
				parents_tree1[sc.nextInt()] = sc.nextInt();
			// Similarly read the second tree
			for(int i = 0; i < numVertices - 1; i++) 
				parents_tree2[sc.nextInt()] = sc.nextInt();

			int ans = findRagnorianism(parents_tree1, parents_tree2);
			if(ans == -1) {
				System.out.println("The two trees are not Ragnorianic.");
			} else {
				System.out.println("The trees are Ragnorianic -- root of the first tree maps to node " + ans + " of the second tree.");
			}
		}

		sc.close();
	}
}
