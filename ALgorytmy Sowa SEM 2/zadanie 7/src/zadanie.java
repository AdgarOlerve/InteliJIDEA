//Piotr Jędrzejczak-Rakowski 99660
//
//Sortowanie babelkowe

public class zadanie
{
    public static void main(String[] args)
    {
        int[] wektor = new int[20];

        System.out.println("Przed sortowaniem: ");
        for (int i = 0; i < wektor.length;i++) //wypenianie wektora losowymi liczbami i wyswietlenie go na ekranie
        {
            wektor[i] = (int) ((100 * Math.random() + 1));
            System.out.print(wektor[i]+", ");
        }

        int buf=0; //zmienna przechowujaca zamieniane ze soba liczby
       boolean swap;//zmienna przechowujaca info czy zostala wykonana jakas zamiana,jesli nie,to oznacza to ze wektor jest posortowany i mozna zakonczyc petle
       do
       {
           swap=false;
           for(int i = 0;i<wektor.length;i++)
           {
               if (i + 1 == wektor.length) //sprawdzenie czy i+1 nie jest juz poza zakresem wektora
               {
                   break;
               }
               else if (wektor[i] > wektor[i + 1])//sprawdzenie i zamiana liczb miejscami
               {
                   buf=wektor[i];
                   wektor[i]=wektor[i+1];
                   wektor[i+1]=buf;
                   swap=true;//jesli jakies liczby zostaly zamienione to znaczy ze wektor nie jest jeszcze posortowany wiec ta zmienna ustawiana jest na true
                            ///co skutkuje dalszym trwaniem petli while
               }
           }
       }
        while(swap);

        //wyswietlenie posortowanego wektora
        System.out.println("");
        System.out.println("Po sortowaniu: ");
        for(int i = 0;i<wektor.length;i++)
        {
            System.out.print(wektor[i]+", ");
        }
    }
}
