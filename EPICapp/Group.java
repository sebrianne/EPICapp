package EPICapp;

import java.util.ArrayList;
import java.util.Random;

public class Group {
	private ArrayList<String> students;
	
	public Group() {
		students = new ArrayList<String>();
	}
	
	/**
	 * addStudents()
	 * @param s - a student
	 */
	public void addStudents(String s) {
		students.add(s);
	}
	
	/**
	 * shuffle()
	 * uses the Fischer-Yates shuffle algorithm
	 * @return shuffled list
	 */
	public ArrayList<String> shuffle() {
		ArrayList<String> newgroup = new ArrayList<String>(students);
		Random r = new Random();
		//int[] chosen = new int[students.size()];
		
		for (int i = newgroup.size()-1; i > 0; i--) {
			String temp = newgroup.get(i);
			int choose = r.nextInt(i);
			newgroup.set(i, newgroup.get(choose));
			newgroup.set(choose, temp);
		}
		return newgroup;
		
	}
	
	/**
	 * getList()
	 * @return list of students
	 * not really ever used, but i used it at one point to debug my code so I'm keeping it.
	 */
	public ArrayList<String> getList() {
		return students;
	}
}
