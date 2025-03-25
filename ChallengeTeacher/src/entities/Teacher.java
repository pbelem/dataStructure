package entities;

public class Teacher {
	
	private Integer idTeacher;
	private String nameTeacher;
	private String registration;
	
	public Teacher() {
		super();
	}

	public Teacher(Integer idTeacher, String nameTeacher, String registration) {
		super();
		this.idTeacher = idTeacher;
		this.nameTeacher = nameTeacher;
		this.registration = registration;
	}

	public Integer getIdTeacher() {
		return idTeacher;
	}

	public void setIdTeacher(Integer idTeacher) {
		this.idTeacher = idTeacher;
	}

	public String getNameTeacher() {
		return nameTeacher;
	}

	public void setNameTeacher(String nameTeacher) {
		this.nameTeacher = nameTeacher;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	@Override
	public String toString() {
		return "Teacher [idTeacher=" + idTeacher + ", nameTeacher=" + nameTeacher + ", registration=" + registration
				+ "]";
	}
	
	

}
