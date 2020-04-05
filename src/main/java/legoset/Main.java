package legoset;

import jaxb.JAXBHelper;

import java.net.URL;
import java.time.Year;
import java.util.ArrayList;
import java.util.Set;
import java.lang.String;

public class Main {
    public static void main(String[] args)throws Exception{
        LegoSet legoSet = new LegoSet();
        legoSet.setNumber("75211");
        legoSet.setName("Imperial TIE Fighter");
        legoSet.setTheme("StarWars");
        legoSet.setSubtheme("Solo");
        legoSet.setPieces(519);
        legoSet.setYear(Year.of(2018));
        legoSet.setTags(Set.of("Starfighter", "Stormtrooper", "Star Wars", "Solo"));

        ArrayList<Minifig> minifigs = new ArrayList<>();
        minifigs.add(new Minifig("Imperial Mudtrooper", 2));
        minifigs.add(new Minifig("Imperial Pilot", 1));
        minifigs.add(new Minifig("Mimban Stormtrooper", 1));
        legoSet.setMinifigs(minifigs);

        Weight weight = new Weight("kg", 0.89);
        legoSet.setWeight(weight);

        legoSet.setUrl(new URL("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter"));

        JAXBHelper.toXML(legoSet, System.out);
    }
}
