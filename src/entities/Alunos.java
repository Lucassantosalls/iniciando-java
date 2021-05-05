package entities;

public class Alunos {

	public String name;
	public double note1;
	public double note2;
	public double note3;
	
	public double notepass() {
		double notepass = note1+note2+note3;
		return notepass;
	}
	public double notefaled() {
		double notefaled = 60-(note1+note2+note3);
		return notefaled;
	}
	
}
