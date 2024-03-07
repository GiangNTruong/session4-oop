package QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a , b ,c");
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());

        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();

        if(delta >0){
            System.out.println("Phuowng trình có 2 no : "+quadraticEquation.getRoot1() +" vs "+quadraticEquation.getRoot2());

        } else if (delta==0) {
            System.out.println("Phương trin có 1 no kép : " +quadraticEquation.getRoot1());
        }else {
            System.out.println("Vô no");
        }
    }
}
