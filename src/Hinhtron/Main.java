package Hinhtron;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hinhtron[] ht = new Hinhtron[5];
        int sohinhtron;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhập số hình tròn bạn muốn kiểm tra gioi han 5 hinh tron");
            sohinhtron = input.nextInt();
            if (sohinhtron <= 0) {
                System.out.println("Số hình tròn phải lớn hơn 0. Vui lòng nhập lại.");
            } else {
                for (int i = 0; i < sohinhtron; i++) {
                    ht[i] = new Hinhtron();
                    System.out.println("Hinh tròn  " + i);
                    ht[i].nhapBanKinh();
                    ht[i].tinhChuVi();
                    ht[i].tinhDientich();
                }
            }
        } while (sohinhtron <= 0);
    }

}