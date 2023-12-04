package interfacegyak;
public class Hasznalat {
    public static void main(String[] args) {
        Ajto ajto = new Ajto();
        Esernyo esernyo = new Esernyo();
        Konzerv konzerv = new Konzerv();
    
        Nyithato[] nyithatok = new Nyithato[5];
        nyithatok[0] = ajto;
        nyithatok[1] = esernyo;
        nyithatok[2] = konzerv;
        
        for (Nyithato nyithato : nyithatok) {
            if (nyithato instanceof Nyithato){
                nyithato.kinyit();
            }
        }
    }
}
