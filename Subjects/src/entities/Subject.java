package entities;

public class Subject {

    private Integer idSubject;
    private String nameSubject;
    private  String nameProfessor;
    private double average;

    public Subject() {
        super();
    }

    public Subject(Integer idSubject, String nameSubject, String nameProfessor, double average) {
        this.idSubject = idSubject;
        this.nameSubject = nameSubject;
        this.nameProfessor = nameProfessor;
        this.average = average;
    }

    public Integer getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(Integer idSubject) {
        this.idSubject = idSubject;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public String getNameProfessor() {
        return nameProfessor;
    }

    public void setNameProfessor(String nameProfessor) {
        this.nameProfessor = nameProfessor;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "nameSubject='" + nameSubject + '\'' +
                ", nameProfessor='" + nameProfessor + '\'' +
                ", average='" + average + '\'' +
                '}';
    }
}
