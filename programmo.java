package funproject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class programmo 
{
	
	
	public static double newSalary(String fach,int hours) {
		String[] fachAuswahl = {"history","math","spanish","biology","physics","sport"};
		double[] fachWert= {0.7,1.1,0.9,0.7,0.8,0.7};
		double temp=0;
		
		for(int i=0;i<fachAuswahl.length;i++) {
			if(fach.equalsIgnoreCase(fachAuswahl[i])){
				temp = fachWert[i];
				
			}
		}
		temp = (temp*15) * hours;
		
		return temp;
	}
	
	
	public static void main(String[] args) 
	{
		
		
	
		Teacher jimmy = new Teacher(1, "Jimmy", 500, 25,"physics");
		Teacher melissa = new Teacher(2, "Melissa", 700,30,"history");
		Teacher sven = new Teacher(3,"Sven", 600, 30,"biology");
		Teacher megan = new Teacher(4,"Megan", 900,40, "sport");
		Teacher alex = new Teacher(5,"Alex",850,30,"spanish");
		
		Student tamara = new Student(1,"Tamara",4);
		Student rakshith = new Student(2,"Rakshith",12);
		Student raven = new Student(3,"Raven",5);
		
		
		
		List<Teacher> teachersList = new ArrayList<>();
		teachersList.add(sven);
		teachersList.add(melissa);
		teachersList.add(jimmy);
		teachersList.add(megan);
		teachersList.add(alex);
		
		List<Student> studentsList = new ArrayList<>();
		studentsList.add(raven);
		studentsList.add(rakshith);
		studentsList.add(tamara);
		
		
		
		School gym = new School(teachersList,studentsList);
		
		
		
		
		tamara.payFees(5000);
		rakshith.payFees(6000);
		
		
		System.out.println("gym has earned: €" +gym.getTotalMoneyEarned());
		
		
		System.out.println("making GYM pay salary");
		
		sven.receiveSalary(sven.getSalary());
		
		System.out.println("GYM has spent salaray to " + sven.getName() + " and now has " + gym.getTotalMoneyEarned());
	
		
		System.out.println(rakshith);
	
		
		int[] allTheSalarys = {jimmy.getSalary(),melissa.getSalary(),sven.getSalary(),megan.getSalary()};
		
		
		//highest salary
		int highestSalary =0;
		for(int i =0; i<allTheSalarys.length;i++) 
		{
			
			if(highestSalary < allTheSalarys[i]) 
			{
				highestSalary = allTheSalarys[i];
			}
			
		}
		
		System.out.println("highest salary is: " +highestSalary);
		
		
		
		// average salary
		int temp = 0;
		for(int i = 0; i<allTheSalarys.length;i++) 
		{
			temp+= allTheSalarys[i];
			
		}
		System.out.println("average salary is: "+temp/teachersList.size());
		
		
		//new salary with werteinheit
		
		System.out.println(jimmy.getName() + "s new salary is " + newSalary(jimmy.getFach(),jimmy.getHours()));
		
		
		//check to see if someone has full hours or not
		for(int i =0;i<teachersList.size();i++) 
		{
				if(teachersList.get(i).getHours()>=40) 
				{
					System.out.println(teachersList.get(i).getName() + " has full hours");
				}
				else 
				{
					System.out.println(teachersList.get(i).getName() + " has hours open.");
				}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
