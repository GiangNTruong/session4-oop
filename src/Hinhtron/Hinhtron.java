package Hinhtron;

import java.util.Scanner;

public class Hinhtron {
    //Khai báo các thuộc tính
   double banKinh;
   double chuVi;
   double dienTich;

    public void nhapBanKinh(){
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhập bán kính >0");
            banKinh = input.nextDouble();
        }while (banKinh<=0);
    }
    public void tinhChuVi(){
        chuVi = 2*Math.PI*banKinh;
        System.out.println("Chu vi ="+chuVi);
    }
    public void tinhDientich(){
        dienTich = 2*banKinh*banKinh;
        System.out.println("Diện tích ="+dienTich);
    }
}
