package domaciTestNG;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String figura;
		System.out.println("Dobro dosli na stanicu za izracunavanje povrsina geometrijskih figura");
		System.out.println();
		System.out.println("Figure koje mozete uneti su: kvadrat/ pravougaonik / krug");
		while (true) {
			figura = sc.nextLine().toLowerCase();
			switch (figura) {
			case "kvadrat":
				racunajKvadrat();
				break;
			case "pravougaonik":
				racunajPravougaonik();
				break;
			case "krug":
				racunajKrug();
				break;
			case "izadji":
				System.out.println("Izasli ste iz programa!");
				return;
			}
		}
	}

	public static void racunajKrug() {
		Scanner sc = new Scanner(System.in);
		double r;
		System.out.println("Unesite r:");
		r = sc.nextDouble();
		if (r <= 0) {
			System.out.println("Los unos!");
			return;
		}
		System.out.println("Povrsina kruga je: " + pKruga(r));
	}

	public static void racunajPravougaonik() {
		Scanner sc = new Scanner(System.in);
		double a, b;
		System.out.println("Unesite a:");
		a = sc.nextDouble();
		System.out.println("Unesite b:");
		b = sc.nextDouble();
		if (a <= 0 || b <= 0) {
			System.out.println("Los unos!");
			return;
		}
		System.out.println("Povrsina pravougaonika je: " + pPravougaonika(a, b));

	}

	public static void racunajKvadrat() {
		Scanner sc = new Scanner(System.in);
		double a;
		System.out.println("Unesite a:");
		a = sc.nextDouble();
		if (a <= 0) {
			System.out.println("Los unos!");
			return;
		}
		System.out.println("Povrsina kvadrata je: " + pKvadrata(a));

	}

	public static double pKruga(double r) {
		return r * r * 3.14;
	}

	public static double pKvadrata(double a) {
		return a * a;
	}

	public static double pPravougaonika(double a, double b) {
		return a * b;
	}

}
