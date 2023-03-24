package encapsulation;

public class StudentEcnapsulation {

	// How to generate automatically the Getter and Setter --> Right Click > Source
	// > Select Generate Getter & Setter

	private String student_name;
	private int student_id;
	private double student_fee;

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public double getStudent_fee() {
		return student_fee;
	}

	public void setStudent_fee(double student_fee) {
		this.student_fee = student_fee;
	}

	// main method
	public static void main(String[] args) {
		StudentEcnapsulation s = new StudentEcnapsulation();
		s.setStudent_name("Jon Due");
		s.setStudent_id(123);
		s.setStudent_fee(350);

		System.out.println("Name: " + s.getStudent_name());
		System.out.println("ID: " + s.getStudent_id());
		System.out.println("Fee: " + s.getStudent_fee());

	}

}
