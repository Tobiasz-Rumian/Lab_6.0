/*
 *  Komunikator sieciowy
 *   - program uruchamiajacy serwer i dw�ch klient�w
 *
 *  Autor: Pawel Rogalinski
 *   Data: 1 stycznia 2010 r.
 */


class Tester {

    public static void main(String [] args){
        new Serwer();

        try{
            Thread.sleep(1000);
        } catch(Exception e){}

        new Klient("Ewa");

        new Klient("Adam");
    }

}

