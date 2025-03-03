//Piotr Jędrzejczak-Rakowski 99660
//
//Sortowanie z wektorem pomocniczym(a w zasadzie to dwoma)
//program znajduje najmniejsza liczbe,przepisuje ja do wektora pomocniczego i stawia przy niej 'ptaszka' uzywajac trzeciego wektora
public class zadanie
{
    public static void main(String[] args)
    {
        int[] wektorIN = new int[20]; //wektor nieposortowany
        int[] wektorOUT = new int[wektorIN.length];//wektor posortowany
        boolean[] ptaszki = new boolean[wektorOUT.length]; //wektor w ktorym zaznaczam ktore liczby zostaly juz przeniesione do posortowanego wektora
        System.out.println("przed sortowaniem: ");
        for (int i = 0; i < wektorIN.length;i++) //wypenianie wektora losowymi liczbami i wyswietlenie go na ekranie
        {
            wektorIN[i] = (int) ((100 * Math.random() + 1));
            System.out.print(wektorIN[i]+", ");
        }

        int min = 1000; //przechowuje najmniejsza znaleziona w wektorze liczbe
        int indeks=0; //przechowuje numer indeksu na ktorym jest najmniejsza znaleziona liczba

        for(int i=0;i<wektorOUT.length;i++) //idzie po wektorze posortowanym
        {
            min=1000;
            for(int j=0;j<wektorIN.length;j++) //idzie po wektorze nieposortowanym
            {
                if(ptaszki[j]==false)//sprawdzenie czy aktualnie sprawdzana liczba nie zostala juz wczesniej skopiowana do wektora z posortowanymi liczbami
                {
                    if(wektorIN[j]<min) //sprawdzenie czy aktualnie sprawdzana liczba jest mniejsza niz najmniejsza dotad znaleziona
                    {
                        min=wektorIN[j];
                        indeks=j;
                    }
                }
            }
            wektorOUT[i]=min; //przepisanie najmniejszej do wektora z posortowanymi liczbami
            ptaszki[indeks]=true; //zaznaczenie,ze dana liczba zostala juz przeniesiona i nalezy ja pominac przy kolejnym sprawdzaniu

        }
        //wyswietlanie wyniku na ekranie
        System.out.println("");
        System.out.println("po sortowaniu: ");
        for(int k = 0;k<wektorOUT.length;k++)
        {
            System.out.print(wektorOUT[k]+", ");
        }
    }
}
