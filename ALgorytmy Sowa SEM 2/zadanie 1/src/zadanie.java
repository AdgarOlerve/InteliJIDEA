//Piotr Jędrzejczak-Rakowski 99660
//
//program znajduje liczbe w danym wektorze i wypisuje nr indeksu na ktorym sie znajduje.
public class zadanie
{

    public static void main(String args[])
    {
        int[] wek = {7,9,12,13,14,17,45,57,89,95};	//wektor ktory bedzie przeszukiwany
        int szukana=57;					//liczba,ktorej szukamy
        int i=0;					//licznik
        boolean znaleziono=false;			//zmienna z informacja,czy znaleziono szukana liczbe
        for(;i<wek.length;i++)				//przeszukiwanie wektora
        {
            if(wek[i]==szukana)
            {
                znaleziono=true;			//jesli liczba zostala znaleziona to ta zmienna ustawiana jest na true
                break;					//petla jest wtedy przerywana,dla skrocenia czasu pracy algorytmu
            }
        }
        if(znaleziono)					//jezeli znaleziono szukana liczbe to wyswietla sie taki komunikat
        {
            System.out.println("szukana: "+szukana+" znaleziona na miejscu: "+i+" w tablicy");
        }
        else						//a jesli nie znaleziono,to taki
        {
            System.out.println("w tablicy nie znaleziono podanej liczby");
        }
    }//konczy main
}//konczy klase
