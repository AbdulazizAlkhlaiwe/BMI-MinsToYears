import java.util.Scanner;
public class BMI {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
double pounds, inches , bmi;
System.out.print("Enter weight in pounds: ");
pounds = input.nextDouble();
pounds = pounds*0.45359237;
System.out.print("Enter height in inches: ");
inches = input.nextDouble();
inches = inches*0.0254;
bmi = (pounds) / (inches*inches);
System.out.println("BMI is "+bmi);}}
