
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author cagri
 *
 */
public class project1main {
	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		/**
		 *The max duration considering all students
		 */
		int max = -1;

		Scanner input = new Scanner(new File(args[0])).useLocale(Locale.US);
		PrintStream output = new PrintStream(new File(args[1]));
		LinkedList<House> houses = new LinkedList<House>();
		LinkedList<Student> students = new LinkedList<Student>();
		/**
		 * House object for temporary usage.
		 */
		House house;
		/**
		 * student object for temporary usage
		 */
		Student student;
		while(input.hasNextLine()) {
			Scanner line = new Scanner(input.nextLine()).useLocale(Locale.US);
			String type = line.next();
			if (type.equals("h")) {
				houses.add(new House(line.nextInt(), line.nextInt(), line.nextDouble()));
			}
			else {
				student = new Student(line.nextInt(),line.next(),line.nextInt(),line.nextDouble());
				students.add(student);
				if(student.getDuration()>max) {
					max = student.getDuration();
				}
			}
		}
		// Sorting students and houses according to their ID's
		Collections.sort(houses,new HouseComparator());
		Collections.sort(students,new StudentComparator());
		for(;max>0 && !houses.isEmpty();max--)	{
			Iterator<House> itHouses = houses.iterator();
			while(itHouses.hasNext()) {
				house = itHouses.next();
				if(house.getDuration() == 0) {
					for(Iterator<Student> itStudents = students.iterator();itStudents.hasNext();) {
						student = itStudents.next();
						if(house.isAvailable(student.getRating(),student.getDuration())) {
							itStudents.remove();
							break;
						}
					}
				}
				// If house is occupied untill the maximum duration, There is no need to store the house.
				if(house.getDuration() == max) {
					itHouses.remove();
				}
				else {
					house.decreaseSemester();
				}
			}
			for(Iterator<Student> itStudents = students.iterator();itStudents.hasNext();) {
				student = itStudents.next();
				student.decreaseSemester();
			}
		}

		Iterator<Student> result = students.iterator();
		while(result.hasNext()) {
			output.println(result.next().getName());
			result.remove();
		}

	}

}

