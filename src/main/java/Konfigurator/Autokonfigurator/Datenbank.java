package Konfigurator.Autokonfigurator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Datenbank {

    public Plattform plattform;
    HashMap<String, Double> map = new HashMap<String, Double>();
    List<Plattform> list = new ArrayList<>();
    String info = "";


    public Datenbank() {
        fillDatabase();
    }

    public void fillDatabase() {
        map.put("golf", 15000.0);
        map.put("passat", 18000.0);
        map.put("touareg", 25000.0);

        map.put("drei", 0.0);
        map.put("fuenf", 5000.0);

        map.put("diesel", 0.0);
        map.put("benzin", 3000.0);
        map.put("schaltgetriebe", 0.0);
        map.put("automatik", 3000.0);
        map.put("frontantrieb", 0.0);
        map.put("allrad", 11000.0);

        map.put("uni_lackierung_rot", 0.0);
        map.put("uni_lackierung_grau", 0.0);
        map.put("uni_lackierung_schwarz", 0.0);
        map.put("metallic_lackierung_atlantic_blue", 700.0);
        map.put("metallic_lackierung_deep_black_perleffekt", 700.0);
        map.put("metallic_lackierung_mangangrau", 700.0);

        map.put("standart_17zoll", 0.0);
        map.put("albetville_18zoll", 800.0);
        map.put("kalamata_19zoll", 1300.0);

        map.put("stoffbezug", 0.0);
        map.put("lederbezug", 2000.0);
    }

    public void insertPlattform() {
        plattform = new Plattform();
        plattform.configureCar();
        list.add(plattform);
    }

    public void ausgabeAll() {
        int z = 0;
        for (Plattform ausgabe : list) {
            z++;
            System.out.println("Eintragsnummer: " + z);
            System.out.println(ausgabe.getConfigurations());
            System.out.println("");
        }
    }

    public void sucheFarbe(String farbe) {
        int z = 0;
        for (Plattform ausgabe : list) {
            z++;
            if (ausgabe.getConfigurations().contains(farbe)) {
                System.out.println("Eintragsnummer: " + z);
                System.out.println(ausgabe.getConfigurations());
                System.out.println("");
            }

        }

    }


}