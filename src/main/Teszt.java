package main;

import java.util.Scanner;


public class Teszt 
{

    static final Scanner sc = new Scanner(System.in);
    static String[] pakli = new String[21];
    
    public static void osszeallit()
    {
        String[] ertekek = {"Asz", "Kir", "Fel", "X", "IX", "VIII"};
        String[] szinek = {"\033[31;1mP\033[0m", "\033[33;1mT\033[0m", "\033[32;1mZ\033[0m", "\033[33;1mM\033[0m"};
        
        int index = 0;
        for (int j = 0; j < ertekek.length && index < pakli.length; j++)
        {
            for (int k = 0; k < szinek.length && index < pakli.length; k++)
            {
                pakli[index] = "%s_%s".formatted(szinek[k], ertekek[j]); 
                index++;
            }
        }
    }
    
    public static void kiir()
    {
        for (int i = 0; i < pakli.length; i++)
        {
            if (i % 3 == 0)
            {
                System.out.println("\t");
            }
            System.out.printf("%-7s\t".formatted(pakli[i]));
        }
        System.out.println("\n");
    }
    
    public static void beker()
    {
        System.out.println("Melyik oszlopban (1-3)?");
        int oszlopSzam = sc.nextInt();
    }
    
    private static void indit()
    {
        osszeallit();
        kiir();
        beker();
    }
    
    public static void main(String[] args)
    {
        indit();
    }
    
    
}
