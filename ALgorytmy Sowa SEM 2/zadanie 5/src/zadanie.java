import java.util.Scanner;

//Piotr Jędrzejczak-Rakowski 99660
//
//Wpisywanie danych do wektora za pomoca metody Scanner
public class zadanie
{
    public static void main(String[] args)
    {
        Scanner skaner = new Scanner(System.in);
        int[] wek = new int[10];
        for(int i=0;i<10;i++)//pobieranie danych od uzytkownika
        {
            try //sprawdzenie czy to co wpisal uzytkownik jest liczba calkowita
            {
                System.out.println("podaj liczbe calkowita: ");
                wek[i] = skaner.nextInt();
            }
            catch(Exception e) //jesli nie jest liczba calkowita,to program sie konczy
            {
                System.out.println("Nie wpisales liczby calkowitej,program konczy prace");
                System.exit(0);
            }
        }
        for(int i = 0;i<10;i++)//wypisanie wyniku na ekran
        {
            System.out.println(wek[i]);
        }
    }

}
