package daythreeassignments.examples;

import java.util.Arrays;
import java.util.Comparator;

public class StudentMain {

	public static void main(String[] args) {
		
		Student student1 = new Student(2, "naveen", 75);
		Student student2= new Student(1, "samara", 75);
		Student student3= new Student(5, "samara", 85);
		Student student5= new Student(4, "samara", 75);
		Student student4 = new Student(3, "naveen", 75);
		
		Student[] students = {student1,student2,student3,student4,student5};
		Comparator<Student> compare = (Student ob1,Student ob2)->{
			int a = ob2.getCgpa().compareTo(ob1.getCgpa());
			if(a==0) {
				a = ob1.getFname().compareTo(ob2.getFname());
				if(a==0) {
					ob1.getId().compareTo(ob2.getId());
				}
			}
			return a;
		};
		Arrays.sort(students, compare);
		for(Student st :students ) {
			System.out.println(st);
		}

	}

}
