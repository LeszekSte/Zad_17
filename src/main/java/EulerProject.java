public class EulerProject {
    int zadanie1(int brake) {
        int sum1 = 0;
        int befor = 1;
       int after =0;
        int suma = 0;


        do {

            sum1 = sum1 + befor;
            sum = sum1;
            if (sum1 == 1)
                sum1 = 2;
            System.out.println("Sum1 " + sum1);
            if (sum1 % 2 == 0) {
                suma = sum1;
                System.out.println("Suma -- " + suma);
            }


        } while (brake > sum1);


        return suma;
    }


}
