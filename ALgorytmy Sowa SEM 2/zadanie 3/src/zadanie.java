//Piotr Jędrzejczak-Rakowski 99660
//
//Program generuje ciąg przypadkowych,rosnących liczb o zmiennym skoku w 100 elementowym wektorze
public class zadanie
{
    public static void main(String[] args)
    {
        int[] wektor = new int[100];//wektor w ktorym przechowywane beda wylosowane liczby
        int buf = 0;

        for (int i = 0; i < wektor.length;i++) //wypenianie wektora losowymi liczbami
        {
            wektor[wektor.length-1] = (int) ((10*Math.random())+1); //uzywam ostatniego miejsca w wektorze jako zmiennej tymczasowej aby nie zapelniac pamieci zbednymi zmiennymi
            buf = buf + wektor[wektor.length-1];//dodaje wylosowana liczbe do zawartosci zmiennej buf aby kazda kolejna wylosowana liczba byla wieksza o losowa wartosc
            wektor[i]=buf;  //przypisuje wartosc zmiennej buf do wektora
        }
        for(int j = 0; j < wektor.length;j++) //wypisanie zawartosci wektora na ekran
        {
            System.out.println(wektor[j]);
        }
    }
}
