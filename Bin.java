import java.util.Scanner;
public class Bin {
    public void binTrans() {
        Scanner scanner = new Scanner (System.in);
        int egg = 1;
        while (egg == 1) {
            System.out.println("Please enter a whole number for Binary conversion: ");
            int num = scanner.nextInt();
            int b = 1;
            int binNumFin = 0;
            int binTen = 1;
            while (b == 1) {
                int binNum = num;
                int binNumRem = binNum % 2;

                if (binNumRem == 1) {
                    binNum = binNum - 1;   
                }

                binNum = binNum / 2;

                

                int binNumCom = binNumRe * binTen;
                binNumFin = binNumFin + binNumCom;
                binTen = binTen * 10;

                if (binNum == 1) {
                    binNumRem = 1;
                    b = 2;
                }
            }
            System.out.println(num + " in binary is " + binNumFin);
            


        }


    }
}
            