public class PVUnit {
    private Integer id;
    private double kwpeek;
    private String wechselrichter;
    private int plz;
    private String ort;
    private String strasse;
    private int hausnummer;

    public PVUnit(Integer id, double kwpeek, String wechselrichter, String ort, int plz, String strasse, int hausnummer) {
        this.id = id;
        this.kwpeek = kwpeek;
        this.wechselrichter = wechselrichter;
        this.ort = ort;
        this.plz = plz;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
    }

    public PVUnit() {
    }

    @Override
    public String toString() {
        return "PVUnit{" +
                "id=" + id +
                ", kwpeek=" + kwpeek +
                ", wechselrichter='" + wechselrichter + '\'' +
                ", plz=" + plz +
                ", ort='" + ort + '\'' +
                ", strasse='" + strasse + '\'' +
                ", hausnummer=" + hausnummer +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getKwpeek() {
        return kwpeek;
    }

    public void setKwpeek(double kwpeek) {
        this.kwpeek = kwpeek;
    }

    public String getWechselrichter() {
        return wechselrichter;
    }

    public void setWechselrichter(String wechselrichter) {
        this.wechselrichter = wechselrichter;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }
}
