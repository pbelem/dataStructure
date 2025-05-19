package entities;

public class Brawler {

    private Integer idBrawler;
    private String nomeBrawler;
    private String classBrawler;

    public Brawler(Integer idBrawler, String nomeBrawler, String classBrawler) {
        super();
        this.idBrawler = idBrawler;
        this.nomeBrawler = nomeBrawler;
        this.classBrawler = classBrawler;
    }

    public Integer getIdBrawler() {
        return idBrawler;
    }

    public void setIdBrawler(Integer idBrawler) {
        this.idBrawler = idBrawler;
    }

    public String getNomeBrawler() {
        return nomeBrawler;
    }

    public void setNomeBrawler(String nomeBrawler) {
        this.nomeBrawler = nomeBrawler;
    }

    public String getClassBrawler() {
        return classBrawler;
    }

    public void setClassBrawler(String classBrawler) {
        this.classBrawler = classBrawler;
    }
}
