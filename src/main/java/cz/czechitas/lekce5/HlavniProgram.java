package cz.czechitas.lekce5;

import java.util.Objects;
import java.util.regex.Pattern;

/**
 * Hlaví třída pro lekci 5.
 */
public class HlavniProgram {

    public class Osoba {
        private String jmeno;
        private String prijmeni;
        private String soukromyEmail;
        private String pracovniEmail;

        public String getJmeno() {
            return jmeno;
        }

        public void setJmeno(String jmeno) {
            Objects.requireNonNull(jmeno);
            if (jmeno.isBlank()) {
                System.err.println("Napiš jméno, pole nemůže být prázdné! ");
                return;
            }
            this.jmeno = jmeno;
        }

        public String getPrijmeni() {
            return prijmeni;
        }

        public void setPrijmeni(String prijmeni) {
            Objects.requireNonNull(prijmeni);
            if (prijmeni.isBlank()) {
                System.err.println("Napiš příjmení, pole nemůže být prázdné! ");
            }
        }

        public String getSoukromyEmail() {
            return soukromyEmail;
        }

        public void setSoukromyEmail(String soukromyEmail) {
            Objects.requireNonNull(soukromyEmail);
            if (soukromyEmail.isBlank()) {
                System.err.println("Napiš soukromý email, pole nemůže být prázdné!");
            }
        }

        public String getPracovniEmail() {
            return pracovniEmail;
        }

        public void setPracovniEmail(String pracovniEmail) {
            Objects.requireNonNull(pracovniEmail);
            if (pracovniEmail.isBlank()) {
                System.err.println("Napiš pracovní email, pole nemůže být prázdné!");
            }
        }
    }

    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String... args) {
        //TODO tady bude náš kód

        System.out.println("Slavnostně přísahám, že jsem připraven ke každé špatnosti.");

        Osoba zdenka = new Osoba();
        zdenka.setJmeno("Zdenka");
        zdenka.setPrijmeni("Sýkorová ");
        zdenka.setSoukromyEmail("sykorova@hotmail.com ");
        zdenka.setPracovniEmail("zdenka@gmail.com");
        System.out.println(zdenka);

    }
}

