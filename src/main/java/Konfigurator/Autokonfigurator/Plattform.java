package Konfigurator.Autokonfigurator;

import java.util.Scanner;

public class Plattform {
    public Datenbank datenbank = new Datenbank();
    Scanner scan = new Scanner(System.in);
    String tueren, farbe, treibstoff, getriebe, antrieb, austattung, raeder, sitzbez, ausfuehrung;
    double preis = 0.0;
    String eingabe;
    boolean booli = false;

    public Plattform() {

    }

    public Plattform(String tueren, String farbe, String treibstoff, String getriebe, String antrieb, String austattung, String raeder, String sitzbez, String ausfuehrung) {
        this.tueren = tueren;
        this.farbe = farbe;
        this.treibstoff = treibstoff;
        this.getriebe = getriebe;
        this.antrieb = antrieb;
        this.austattung = austattung;
        this.raeder = raeder;
        this.sitzbez = sitzbez;
        this.ausfuehrung = ausfuehrung;
    }


    public void settueren(String tueren) {
        this.tueren = tueren;
    }
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
    public void setTreibstoff(String treibstoff) {
        this.treibstoff = treibstoff;
    }
    public void setGetriebe(String getriebe) {
        this.getriebe = getriebe;
    }
    public void setAntrieb(String antrieb) {
        this.antrieb = antrieb;
    }
    public void setAustattung(String austattung) {
        this.austattung = austattung;
    }
    public void setRaeder(String raeder) {
        this.raeder = raeder;
    }
    public void setSitzbez(String sitzbez) {
        this.sitzbez = sitzbez;
    }
    public void setAusfuehrung(String ausfuehrung) {
        this.ausfuehrung = ausfuehrung;
    }


    public String gettueren() {
        return tueren;
    }
    public String getFarbe() {
        return farbe;
    }
    public String getTreibstoff() {
        return treibstoff;
    }
    public String getGetriebe() {
        return getriebe;
    }
    public String getAntrieb() {
        return antrieb;
    }
    public String getAustattung() {
        return austattung;
    }
    public String getRaeder() {
        return raeder;
    }
    public String getSitzbez() {
        return sitzbez;
    }
    public String getAusfuehrung() {
        return ausfuehrung;
    }


    //Hier kommt die Abfrage Ausfuehrung
    public void queryAusfuehrung() {
        booli = false;
        System.out.println("Waehlen Sie bitte Ihr gewuenschtes Modell aus.");
        System.out.println("Golf / Passat / Touareg");
        this.eingabe = scan.nextLine().toLowerCase();
        do {
            if (eingabe.equals("golf") || eingabe.equals("passat") || eingabe.equals("touareg")) {
                setAusfuehrung(this.eingabe);
                preis = datenbank.map.get(getAusfuehrung());
                System.out.println("Der aktuelle Preis betraegt somit Euro: " + preis);
                System.out.println("Fuer 'Weiter' geben Sie bitte die 'Ja' ein oder geben Sie 'Zurueck' ein um die Abfrage zu wiederholen.");
                String abfrage = scan.nextLine().toLowerCase();
                if (abfrage.equals("ja")) {
                    booli = true;
                    break;
                } else {
                    eingabe = "zurueck";
                }
            } else {
                System.out.println("-------------------------------");
                System.out.println("Eingabe war nicht erfolgreich!!");
                System.out.println("-------------------------------");
                System.out.println("Waehlen Sie bitte Ihr gewuenschtes Modell aus.");
                System.out.println("Golf, Passat, Touareg");
                this.eingabe = scan.nextLine().toLowerCase();
            }
        } while (booli = true);
    }

    //Hier kommt die Abfrage der Variante tueren
    public void querytueren() {
        booli = false;

        System.out.println("");
        System.out.println("Sehr schoen, bitte waehlen Sie die Variante mit drei oder fuenf tueren aus.");
        eingabe = scan.nextLine().toLowerCase();
        do {
            if (eingabe.equals("drei") || eingabe.equals("fuenf")) {
                settueren(eingabe);
                preis = preis + datenbank.map.get(gettueren());
                System.out.println("Der aktuelle Preis betraegt somit Euro: " + preis);
                System.out.println("Fuer 'Weiter' geben Sie bitte die 'Ja' ein oder geben Sie 'Zurueck' ein um die Abfrage zu wiederholen.");
                String abfrage = scan.nextLine().toLowerCase();
                if (abfrage.equals("ja")) {
                    booli = true;
                    break;
                } else {
                    eingabe = "zurueck";
                }
            } else {
                System.out.println("-------------------------------");
                System.out.println("Eingabe war nicht erfolgreich!!");
                System.out.println("-------------------------------");
                System.out.println("Bitte waehlen Sie die Variante mit drei oder fuenf tueren aus.");
                eingabe = scan.nextLine().toLowerCase();
            }
        } while (booli = true);
    }

    public void queryTreibstoff() {
        booli = false;
        //Hier kommt die Abfrage der Variante Treibstoff
        System.out.println("");
        System.out.println("Sehr gut, bitte waehlen Sie die gewuenschten Treibstoff aus.");
        System.out.println("Diesel (Standart) oder Benzin");
        eingabe = scan.nextLine().toLowerCase();
        do {
            if (eingabe.equals("diesel") || eingabe.equals("benzin")) {
                setTreibstoff(eingabe);
                preis = preis + datenbank.map.get(getTreibstoff());
                System.out.println("Der aktuelle Preis betraegt somit Euro: " + preis);
                System.out.println("Fuer 'Weiter' geben Sie bitte die 'Ja' ein oder geben Sie 'Zurueck' ein um die Abfrage zu wiederholen.");
                String abfrage = scan.nextLine().toLowerCase();
                if (abfrage.equals("ja")) {
                    booli = true;
                    break;
                } else {
                    eingabe = "zurueck";
                }
            } else {
                System.out.println("-------------------------------");
                System.out.println("Eingabe war nicht erfolgreich!!");
                System.out.println("-------------------------------");
                System.out.println("Bitte waehlen Sie die gewuenschten Treibstoff aus.");
                System.out.println("Diesel (Standart) oder Benzin");
                eingabe = scan.nextLine().toLowerCase();
            }
        } while (booli = true);
    }

    public void queryGetriebe() {
        booli = false;
        //Hier kommt die Abfrage der Variante Getriebe
        System.out.println("");
        System.out.println("Bitte waehlen Sie das gewuenschte Getriebe aus.");
        System.out.println("Schaltgetriebe (Standart) oder Automatik");
        eingabe = scan.nextLine().

                toLowerCase();
        do {
            if (eingabe.equals("schaltgetriebe") || eingabe.equals("automatik")) {
                setGetriebe(eingabe);
                preis = preis + datenbank.map.get(getGetriebe());
                System.out.println("Der aktuelle Preis betraegt somit Euro: " + preis);
                System.out.println("Fuer 'Weiter' geben Sie bitte die 'Ja' ein oder geben Sie 'Zurueck' ein um die Abfrage zu wiederholen.");
                String abfrage = scan.nextLine().toLowerCase();
                if (abfrage.equals("ja")) {
                    booli = true;
                    break;
                } else {
                    eingabe = "zurueck";
                }
            } else {
                System.out.println("-------------------------------");
                System.out.println("Eingabe war nicht erfolgreich!!");
                System.out.println("-------------------------------");
                System.out.println("Bitte waehlen Sie das gewuenschte Getriebe aus.");
                System.out.println("Schaltgetriebe (Standart) oder Automatik");
                eingabe = scan.nextLine().toLowerCase();
            }
        } while (booli = true);
    }

    public void queryAntrieb() {
        booli = false;
        //Hier kommt die Abfrage der Variante Antrieb
        System.out.println("");
        System.out.println("Bitte waehlen Sie den gewuenschten Antrieb aus.");
        System.out.println("Frontantrieb (Standart) oder Allrad");
        eingabe = scan.nextLine().toLowerCase();
        do {
            if (eingabe.equals("frontantrieb") || eingabe.equals("allrad")) {
                setAntrieb(eingabe);
                preis = preis + datenbank.map.get(getAntrieb());
                System.out.println("Der aktuelle Preis betraegt somit Euro: " + preis);
                System.out.println("Fuer 'Weiter' geben Sie bitte die 'Ja' ein oder geben Sie 'Zurueck' ein um die Abfrage zu wiederholen.");
                String abfrage = scan.nextLine().toLowerCase();
                if (abfrage.equals("ja")) {
                    booli = true;
                    break;
                } else {
                    eingabe = "zurueck";
                }
            } else {
                System.out.println("-------------------------------");
                System.out.println("Eingabe war nicht erfolgreich!!");
                System.out.println("-------------------------------");
                System.out.println("Bitte waehlen Sie den gewuenschten Antrieb aus.");
                System.out.println("Frontantrieb (Standart) oder Allrad");
                eingabe = scan.nextLine().toLowerCase();
            }
        } while (booli = true);
    }

    public void queryFarbe() {
        booli = false;
        //Hier kommt die Abfrage der Variante Lackierung
        System.out.println("");
        System.out.println("Bitte waehlen Sie die gewuenschte Lackierung aus.");
        System.out.println("Uni_Lackierung_Rot / Grau / Schwarz (Standart Lack) oder Metallic_Lackierung_Atlantic_Blue / Deep_Black_Perleffekt / Mangangrau. Bitte mit Unterstrich ('_') eingeben.");
        eingabe = scan.nextLine().toLowerCase();
        do {
            if (eingabe.equals("uni_lackierung_rot") || eingabe.equals("uni_lackierung_grau") || eingabe.equals("uni_lackierung_schwarz") || eingabe.equals("metallic_lackierung_atlantic_blue") || eingabe.equals("metallic_lackierung_deep_black_perleffekt") || eingabe.equals("metallic_lackierung_mangangrau")) {
                setFarbe(eingabe);
                preis = preis + datenbank.map.get(getFarbe());
                System.out.println("Der aktuelle Preis betraegt somit Euro: " + preis);
                System.out.println("Fuer 'Weiter' geben Sie bitte die 'Ja' ein oder geben Sie 'Zurueck' ein um die Abfrage zu wiederholen.");
                String abfrage = scan.nextLine().toLowerCase();
                if (abfrage.equals("ja")) {
                    booli = true;
                    break;
                } else {
                    eingabe = "zurueck";
                }
            } else {
                System.out.println("-------------------------------");
                System.out.println("Eingabe war nicht erfolgreich!!");
                System.out.println("-------------------------------");
                System.out.println("Bitte waehlen Sie die gewuenschte Lackierung aus.");
                System.out.println("Uni_Lackierung_Rot / Grau / Schwarz (Standart Lack) oder Metallic_Lackierung_Atlantic_Blue / Deep_Black_Perleffekt / Mangangrau. Bitte mit Unterstrich ('_') eingeben.");
                eingabe = scan.nextLine().toLowerCase();
            }
        } while (booli = true);
    }

    public void queryRaeder() {
        booli = false;
        //Hier kommt die Abfrage der Variante Raeder
        System.out.println("");
        System.out.println("Bitte waehlen Sie die gewuenschten Felgen aus.");
        System.out.println("Standart_17Zoll / Albetville_18Zoll / Kalamata_19Zoll");
        eingabe = scan.nextLine().toLowerCase();
        do {
            if (eingabe.equals("standart_17zoll") || eingabe.equals("albetville_18zoll") || eingabe.equals("kalamata_19zoll")) {
                setRaeder(eingabe);
                preis = preis + datenbank.map.get(getRaeder());
                System.out.println("Der aktuelle Preis betraegt somit Euro: " + preis);
                System.out.println("Fuer 'Weiter' geben Sie bitte die 'Ja' ein oder geben Sie 'Zurueck' ein um die Abfrage zu wiederholen.");
                String abfrage = scan.nextLine().toLowerCase();
                if (abfrage.equals("ja")) {
                    booli = true;
                    break;
                } else {
                    eingabe = "zurueck";
                }
            } else {
                System.out.println("-------------------------------");
                System.out.println("Eingabe war nicht erfolgreich!!");
                System.out.println("-------------------------------");
                System.out.println("Bitte waehlen Sie die gewuenschten Felgen aus.");
                System.out.println("Standart_17Zoll / Albetville_18Zoll / Kalamata_19Zoll");
                eingabe = scan.nextLine().toLowerCase();
            }
        } while (booli = true);
    }

    public void queryBezuege() {
        booli = false;
        //Hier kommt die Abfrage der Variante Bezuege
        System.out.println("");
        System.out.println("Bitte waehlen Sie die gewuenschten Bezuege aus.");
        System.out.println("Stoffbezug / Lederbezug");
        eingabe = scan.nextLine().toLowerCase();
        do {
            if (eingabe.equals("stoffbezug") || eingabe.equals("lederbezug")) {
                setSitzbez(eingabe);
                preis = preis + datenbank.map.get(getSitzbez());
                System.out.println("Der finale Preis betraegt somit Euro: " + preis);
                System.out.println("Fuer 'Weiter' geben Sie bitte die 'Ja' ein oder geben Sie 'Zurueck' ein um die Abfrage zu wiederholen.");
                String abfrage = scan.nextLine().toLowerCase();
                if (abfrage.equals("ja")) {
                    booli = true;
                    break;
                } else {
                    eingabe = "zurueck";
                }
            } else {
                System.out.println("-------------------------------");
                System.out.println("Eingabe war nicht erfolgreich!!");
                System.out.println("-------------------------------");
                System.out.println("Bitte waehlen Sie die gewuenschten Bezuege aus.");
                System.out.println("Stoffbezug / Lederbezug");
                eingabe = scan.nextLine().toLowerCase();
            }
        } while (booli = true);
    }

    public String getConfigurations() {
        return "Modell: " + getAusfuehrung() + "\n" + "Anzahl tueren: " + gettueren() + "\n" + "Treibstoff: " + getTreibstoff() + "\n" + "Getriebe: " + getGetriebe() + "\n" + "Antrieb: " + getAntrieb() + "\n" + "Lackierung: " + getFarbe() + "\n" + "Auswahl Raeder: " + getRaeder() + "\n" + "Auswahl Bezuege: " + getSitzbez();
    }

    public void menue() {
        boolean loop = false;
        while (!loop) {
            System.out.println("Bitte geben Sie den zu waehlenden Punkt an.");
            System.out.println("Punkt 0: Auswahl Konfiguration starten");
            System.out.println("Punkt 1: Auswahl Modell");
            System.out.println("Punkt 2: Auswahl tueren");
            System.out.println("Punkt 3: Auswahl Treibstoff");
            System.out.println("Punkt 4: Auswahl Getriebe");
            System.out.println("Punkt 5: Auswahl Antrieb");
            System.out.println("Punkt 6: Auswahl Lackierung");
            System.out.println("Punkt 7: Auswahl Raeder");
            System.out.println("Punkt 8: Auswahl Bezuege");
            System.out.println("------------------------");
            System.out.println("Punkt 9: Auswahl Beenden");
            int punkt = scan.nextInt();
            String referenceError = scan.nextLine();

            switch (punkt) {
                case 0:
                    configureCar();
                    break;

                case 1:
                    this.preis = preis - datenbank.map.get(getAusfuehrung());
                    queryAusfuehrung();
                    break;

                case 2:
                    this.preis = preis - datenbank.map.get(gettueren());
                    querytueren();
                    break;

                case 3:
                    this.preis = preis - datenbank.map.get(getTreibstoff());
                    queryTreibstoff();
                    break;

                case 4:
                    this.preis = preis - datenbank.map.get(getGetriebe());
                    queryGetriebe();
                    break;

                case 5:
                    this.preis = preis - datenbank.map.get(getAntrieb());
                    queryAntrieb();
                    break;

                case 6:
                    this.preis = preis - datenbank.map.get(getFarbe());
                    queryFarbe();
                    break;

                case 7:
                    this.preis = preis - datenbank.map.get(getRaeder());
                    queryRaeder();
                    break;

                case 8:
                    this.preis = preis - datenbank.map.get(getSitzbez());
                    queryBezuege();
                    break;

                case 9:
                    loop = true;
                    break;

                default:
                    menue();
                    break;
            }


        }

    }

    //Hier wird das Modell abgefragt
    public void configureCar() {
        booli = false;
        System.out.println("----------------------------------------------------");
        System.out.println("Guten Tag bei Ihrem peroenlichen VW Auto-Konfigurator.");
        System.out.println("Die Auswahlen mit dem Zusatz 'Standart' enthalten keinen Aufpreis.");
        System.out.println("----------------------------------------------------");

        queryAusfuehrung();
        querytueren();
        queryTreibstoff();
        queryGetriebe();
        queryAntrieb();
        queryFarbe();
        queryRaeder();
        queryBezuege();

        System.out.println("-------------------------------");
        System.out.println("Hier nochmal eine Auflistung all Ihrer Auswahlen:");
        System.out.println("");
        System.out.println(getConfigurations());
        System.out.println("-------------------------------");
        System.out.println("");
        System.out.println("Sind Sie mit der Auswahl zufrieden? Geben Sie 'Ja' ein um Ihre Bestellung aufzugeben oder 'Nein' um in das Menue zu springen.");
        String menueAbfrage = scan.nextLine().toLowerCase();
        if (menueAbfrage.equals("ja")) {
            System.out.println("Vielen Dank fuer Ihre Bestellung wir werden in kuerze Ihren Auftrag aufgeben.");
        } else {
            menue();
        }
    }


}
