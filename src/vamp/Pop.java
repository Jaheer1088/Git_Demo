package vamp;
class Student{
	private final int STIPEND=100;
	private int studentid;
	private int aggregateMarks;
    //Implement your code here
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public int getAggregateMarks() {
		return aggregateMarks;
	}
	public void setAggregateMarks(int aggregateMarks) {
		this.aggregateMarks = aggregateMarks;
	}
	public int getSTIPEND() {
		return STIPEND;
	}
	public double calculateTotalStipend() {
		int bonus;
		int totalStipend=0;
		if(aggregateMarks>=85 && aggregateMarks<90) {
			totalStipend=STIPEND+10;
		}
		else if(aggregateMarks>=90&&aggregateMarks<95) {
			totalStipend=STIPEND+15;
		}
		else if(aggregateMarks>=95&&aggregateMarks<=100) {
			totalStipend=STIPEND+20;
		}
		return totalStipend;
	}
}

class Pop {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setStudentid(1212);
		student1.setAggregateMarks(93);

		double totalStipend = student1.calculateTotalStipend();
		System.out.println("The final stipend of " + student1.getStudentid()+" is $" + totalStipend);

		Student student2 = new Student();
		student2.setStudentid(1222);
		student2.setAggregateMarks(85);

		totalStipend = student2.calculateTotalStipend();
		System.out.println("The final stipend of " + student2.getStudentid()+" is $" + totalStipend);
	}

}