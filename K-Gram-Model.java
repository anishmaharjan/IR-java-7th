package com.kgram.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kgram {
	public static void main(String[] args) {
		List<String> kgram = new ArrayList<String>(); //un used so far..
		String dict[] = { "grunt", "groove", "grace", "meant", "urn", "earn","grintern" };

		Scanner scan = new Scanner(System.in);
		// int k = 2; //un-used .. later to generalize n-gram(k-gram)
		System.out.println("Input string");
		String input = scan.next(); // mjgrnt

		for (int j = 0; j < dict.length; j++) {
			for (int i = 0; i < dict[j].length(); i++) {
				try {
					for (int k = 0; k < input.length(); k++) {
						if (dict[j].charAt(k) == input.charAt(i)) {

							if (dict[j].charAt(k + 1) == input.charAt(i + 1)) {
								// kgram = input.substring(i, i + 1);
								// kgram.add(input.substring(i, i + 1));
								System.out.println(dict[j]);
							}
						}
					}
				} catch (Exception e) {
					//System.out.println("ayo");
				}
			}
		}
	}
}
