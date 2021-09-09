package java8;

import java.util.*;
import java.util.stream.Collectors;

public class Practice {
    static List<String> places = new ArrayList<>();
    
    public static List getPlaces() {
        places.add("India, Mumbai");
        places.add("India, Surat");
        places.add("USA, Wachinton DC");
        places.add("USA, Los Angeles");
        places.add("USA, Cupertino");
        places.add("London, Oxford Street");
        places.add("London, Central London");
        places.add("London, Winsdor");
        places.add("London, Nottingham");
        
        return places;
    }
    public static void main(String[] args) {
        List<String> myPlacesFromLondon = getPlaces();
        System.out.println("Places from London: ");
        
        myPlacesFromLondon.stream().filter((p)->p.startsWith("London")).sorted()
        .forEach((p)-> System.out.println(p));
        
       // List<String> myPlacesFromUSA = getPlaces();
        System.out.println("\nPlaces from USA: ");
        
        myPlacesFromLondon.stream().filter((p)->p.startsWith("USA"))
        .collect(Collectors.toList())
        .forEach((q)->System.out.println(q));
        
       // List<String> myPlacesFromIndia = getPlaces();
        System.out.println("\nPlaces from India: ");
        
        myPlacesFromLondon.stream().filter((s)->s.startsWith("India")).sorted()
        .forEach((t)->System.out.println(t));
    }
}