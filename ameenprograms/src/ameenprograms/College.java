package ameenprograms;

public class College{
	String Sname;
	int Semester;
	int Backlogs;
	double Attendence;
	College(String Sname, int Semester,int Backlogs,double Attendence){
		this.Sname=Sname;
		this.Semester=Semester;
		this.Backlogs=Backlogs;
		this.Attendence=Attendence;
		System.out.println("student name  "+this.Sname+"semester  "+this.Semester+"Number of backlogs"+this.Backlogs+"attendnce perc  "+this.Attendence);
		
	}
	

	public static void main(String[] args) {
	College c1=new College("ameen", 3, 0, 92.3);
	College c2=new College("ammu", 5, 3, 50);

	}

}
