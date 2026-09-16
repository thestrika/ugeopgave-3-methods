public class Opgave5 {


    /* Hvis du kører programmet får du en række fejl.
     * Fix programmet så det kan køre
     * outputtet bliver:
     * "7 is the smallest!"
     *
     *  OBS! Skriv hvad du har gjort som kommentar ud for hver linje du fixer
     */



    //Har printet outputtet 2 gange. Både via metode og den originale if


    void main() {

        int a = 7, b = 42;

        System.out.println(findMinimum(7, 42) + " is the smallest!"); //fikset metodekaldet, og gjort den returnerede værdi læsbart i console

        if(a < b) { // rettet {} til () og rettet "smaller" til <.
            System.out.println(a + " is the smallest!"); // Sat a udenfor "" og tilføjet et plus
        }
        else{ // tilføjet en else til chainen, da den ellers ikke ville printe noget, hvis det skulle være den anden vej rundt
            System.out.println(b + " is the smallest!");
        }

    }


    int findMinimum(int a, int b) { // Rettet void til int, da den ellers ikke ville kunne returnere. Jeg har også rettet minimum til findMinimum, da det er mere beskrivende
        int smaller; // Deklarerer variablen her i stedet
        if (a < b) {
            smaller = a;
        }
        else{ // fjernede "Greater than" logikken da den ikke behøves
            smaller = b;
        }
        return smaller;

    }


}
