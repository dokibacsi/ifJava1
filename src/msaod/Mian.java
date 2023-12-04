package msaod;

import java.util.Arrays;

public class Mian {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Janő";
        names[1] = "Tomas";
        names[2] = "Balage";
        
        System.out.println("Rendezés nélkül:");
        Kiirat(names);
        System.out.println("---------------");
        Rendez(names);
        System.out.println("Rendezéssel:");
        Kiirat(names);
        
        
        NBR nbr1 = new NBR("Janó", 1987, "Karakószörcsög, Bicskei köz 192"); 
        NBR nbr2 = new NBR("Tibor", 1995, "Karakószörcsög, Ittasok tere 25"); 
        NBR nbr3 = new NBR("Bécike", 1979, "Karakószörcsög, Körforgalom utca 33"); 
        
        NBR[] nbrs = new NBR[3];
        nbrs[0] = nbr1;
        nbrs[1] = nbr2;
        nbrs[2] = nbr3;
        
        System.out.println("Rendezés nélkül:");
        Kiirat(nbrs);
        System.out.println("---------------");
        Rendez(names);
        System.out.println("Rendezéssel:");
        Kiirat(names);
    }

    private static void Rendez(String[] strings) {
        Arrays.sort(strings);
    }
    
    

    private static void Kiirat(String[] strings) {
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
