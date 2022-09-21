import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int Balance= 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Was moechten Sie tun?");
        System.out.println("1 Geld einzahlen");
        System.out.println("2 Geld abheben");
        System.out.println("3 Kontostand einsehen");
        System.out.println("4 Vorgang beenden");

        int Eingabe1 = scanner.nextInt();

        if(Eingabe1==1)
        {
            System.out.println("Wie viel moechten Sie einzahlen?");
            int Eingabe2 = scanner.nextInt();
            Balance=Balance+Eingabe2;
            System.out.println("Sie haben "+Eingabe2+" Euro eingezahlt");
        }
        if(Eingabe1==2)
        {
            System.out.println("Wie viel moechten Sie abheben?");
            int Eingabe2 = scanner.nextInt();
            Balance=Balance - Eingabe2;
            System.out.println("Sie haben "+Eingabe2+" Euro ausgezahlt");
        }

    }
}