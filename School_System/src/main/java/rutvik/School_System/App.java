package rutvik.School_System;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//	
		Student tarun = new Student(1, "Tarun", 4);
		Student daksh = new Student(2, "Daksh", 12);
		Student rhea = new Student(3, "Rhea", 11);
		List<Student> studentList = new ArrayList<>();
		studentList.add(tarun);
		studentList.add(daksh);
		studentList.add(rhea);
		Teacher rekha = new Teacher(1, "Rekha", 5500);
		Teacher seema = new Teacher(2, "Seema", 8700);
		Teacher rahul = new Teacher(3, "Rahul", 8900);
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(seema);
		teacherList.add(rekha);
		teacherList.add(rahul);
		School dps = new School("DPS", teacherList, studentList);

		while (true) {

			System.out.println("***********Welcome TO DPS ************");
			System.out.println("1. Show school Details");
			System.out.println("2. Show Teachers");
			System.out.println("3. show Students");
			System.out.println("4. Show Total Money Spend By School");
			System.out.println("5. Show Total Money Eaned By School");
			System.out.println("6. Maintain Student");
			System.out.println("7. Maintain Student");

			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();

			switch (option) {
			case 1: {
				System.out.print("NAME OF SCHOOL:" + School.getName() + "\n");
				System.out.println(dps);
				break;
			}
			case 2: {
				System.out.println("Total Number of Teachers Present: " + teacherList.size());
				System.out.println(teacherList);
				break;
			}
			case 3: {
				System.out.println("Total Number of Students Present: " + studentList.size());
				System.out.println(studentList);
				break;
			}
			case 4: {
				System.out.println("Total Money Spend by School :" + School.getTotalMoneySpend() + "\n");
				break;
			}
			case 5: {
				System.out.println("Total Money earned by School :" + School.getTotalMoneyEarned() + "\n");
				break;
			}
			case 6: {
				System.out.println("Total Number of Students Present : " + studentList.size());
				System.out.println("Select student ID:");
				int id = sc.nextInt();
				id--;
				System.out.print(studentList.get(id));
				System.out.println("pay fees: \nYES \nNO \n Enter y/n:");
				String yn = sc.next();
				yn.toUpperCase();
				switch (yn) {
				case "Y": {
					Student stud = studentList.get(id);
					System.out.print("Enter the Amount to pay");
					int amount = sc.nextInt();
					stud.payfees(amount);
					System.out.print("Fees paid Successfully\n\n");
					break;
				}
				case "N": {
					System.out.print("Fine!!!");
					break;
				}
				default:
					System.out.print("invalide Response");
					break;
				}
				break;
			}
			case 7 :{
				System.out.println("Total Number of Teachers Present : " + teacherList.size());
				System.out.println("Select Teacher ID:");
				int id = sc.nextInt();
				id--;
				System.out.print(teacherList.get(id));
				System.out.println("Collect Salary: \nYES \nNO \n Enter y/n:");
				String yn = sc.next();
				yn.toUpperCase();
				switch (yn) {
				case "Y": {
					Teacher teac = teacherList.get(id);
					int salary = teac.getSalary();
					teac.receiveSalary(salary);
					System.out.print("Salary Collected Successfully\n\n");
					break;
				}
				case "N": {
					System.out.print("Fine!!!");
					break;
				}
				default:
					System.out.print("invalide Response\n\n");
					break;
				}
				break;
			}

			default:
				System.out.println("Invalid Option\n\n");
				break;
			}
		}
	}
}
