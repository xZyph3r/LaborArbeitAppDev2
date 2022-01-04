public class Kunde {

    int kundennr;
    boolean persoDaten = true;

    public boolean kVunterschrieben(String unterschrift) {
        System.out.println("Möchten Sie den Vertrag unterschreiben? y/n");
        if (System.console().readLine() == "y") {
            System.out.println("Bitte unterschreiben Sie hier:");
            unterschrift = System.console().readLine();
            while (unterschrift == "") {
                System.out.println("Bitte unterschreiben Sie hier:");
                unterschrift = System.console().readLine();
            }
            System.out.println("Vielen Dank!");
            return true;
        }
        else return false;
    }
}
