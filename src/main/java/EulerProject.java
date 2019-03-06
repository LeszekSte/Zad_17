public class EulerProject {
    public  int zadanie1(int brake) {
        int a = 1;
        int b = 1;
        int suma = 1;
        int sumEnd = 0;
        //   boolean ok = true;

        suma = a + b;
        b = a;
        a = suma;

        if (suma % 2 == 0) {
            sumEnd += suma;
        }

        suma = 1;

        do {
            suma = a + b;
            if (suma % 2 == 0)
                sumEnd += suma;
            b = a;
            a = suma;
        } while (brake > suma);
        return sumEnd;
    }

    int zadanie2(int brake) {
        int sum1 = 1;
        int sum2 = 1;
        int suma = 1;
        int sumEnd = 0;
        boolean ok = true;


        do {
            suma = sum1 + sum2;
            if (suma % 2 == 0) {
                sumEnd += suma;
            }
            sum2 = sum1;
            sum1 = suma;
            if (ok) {
                suma = 1;
                ok = false;
            }
        } while (brake > suma);
        return sumEnd;
    }
}
