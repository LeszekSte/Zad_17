public class Main {

    public static void main(String[] args) {
        EulerProject eulerProject = new EulerProject();
     
        int breake = 4_000_000;
        int zad1 = eulerProject.zadanie1(breake);
        int zad2 = eulerProject.zadanie2(breake);
        
        System.out.println("Zadanie 1  " + breake+ " - " + zad1);
        System.out.println("Zadanie 2  " + breake+ " - " + zad2);
    }
}
