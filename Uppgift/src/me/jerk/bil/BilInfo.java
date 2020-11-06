package me.jerk.bil;

public class BilInfo {
	private static String ägare = "";
	private static String regNr = "";
	private static String fabrikat = "";
	private static int årsModel = 0;
	private static int vikt = 0;
	private static int motorEffekt = 0;
	public BilInfo(String newÄgare,String newRegNr,String newFabrikat, int newÅrsModel,int newVikt, int newEffekt) {
		ägare = newÄgare;
		regNr = newRegNr;
		fabrikat = newFabrikat;
		årsModel = newÅrsModel;
		vikt = newVikt;
		motorEffekt = newEffekt;
	}
	public static String getÄgare() {
		return ägare;
	}
	public static String getRegNr () {
		return regNr;
	}
	public static String getFabrikat() {
		return fabrikat;
	}public static int getÅrsModel() {
		return årsModel;
	}
	public static int getVikt() {
		return vikt;
	}
	public static int getMotorEffekt() {
		return motorEffekt;
	}
}
