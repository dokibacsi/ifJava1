package msaod;
public class NBR {
    private String nev;
    private int szuletesiEv;
    private String cim;

    public NBR(String nev, int szuletesiEv, String cim) {
        this.nev = nev;
        this.szuletesiEv = szuletesiEv;
        this.cim = cim;
    }

    @Override
    public String toString() {
        return "NBR{" + "nev=" + nev + ", szuletesiEv=" + szuletesiEv + ", cim=" + cim + '}';
    }
    
    
}
