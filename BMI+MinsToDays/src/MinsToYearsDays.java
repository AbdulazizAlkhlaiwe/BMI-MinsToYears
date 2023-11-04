import java.util.Scanner;
public class MinsToYearsDays {
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the number of minutes: ");
	int min ,Year , day , D;
	min = input.nextInt();
	day = min/1440;
	Year= day/365;
	D = day % 365;
	System.out.println(min+" minutes is approximately "+ Year + " Years and "+D+ " days");}}
