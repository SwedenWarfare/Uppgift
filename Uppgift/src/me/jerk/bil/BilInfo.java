package me.jerk.bil;

public class BilInfo {
	private static String �gare = "";
	private static String regNr = "";
	private static String fabrikat = "";
	private static int �rsModel = 0;
	private static int vikt = 0;
	private static int motorEffekt = 0;
	public BilInfo(String new�gare,String newRegNr,String newFabrikat, int new�rsModel,int newVikt, int newEffekt) {
		�gare = new�gare;
		regNr = newRegNr;
		fabrikat = newFabrikat;
		�rsModel = new�rsModel;
		vikt = newVikt;
		motorEffekt = newEffekt;
	}
	public static String get�gare() {
		return �gare;
	}
	public static String getRegNr () {
		return regNr;
	}
	public static String getFabrikat() {
		return fabrikat;
	}public static int get�rsModel() {
		return �rsModel;
	}
	public static int getVikt() {
		return vikt;
	}
	public static int getMotorEffekt() {
		return motorEffekt;
	}
}
