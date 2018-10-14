/**
 * Created by Sebrianne Ferguson
 * October 2018
 * All content attributes go to Mr. Josue Alcaraz of the Canada College STEM Center
 */

package EPICapp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class Console {
	
	private JFrame frame; //for holding all of the content
	JButton back; //for going back to the home.
	ImageIcon img; //icon for the program
	//home
	JPanel homePanel;
	JPanel buttonPanel;
	JLabel logo;
	JLabel welcome;
	JButton lessonPlan;
	JButton strategies;
	JButton groups;
	JButton about;
	//lesson plan
	XWPFDocument document;
	XWPFParagraph para;
	XWPFRun run;
	JLabel des; //description
	JPanel fields;
	JTextField date;
	JTextField name;
	JTextField course;
	JTextField instr;
	JTextField obj;
	JTextField c1; //first content
	JTextField p1; //first process to use
	JTextField c2; //2nd content
	JTextField p2; //2nd process to use
	JTextField c3; //3rd content
	JTextField p3; //3rd process to use
	JButton createFile; //for getting all of the information and putting it into a word document
	//strategies
	Strategy s;
	JTextField search;
	JLabel strategyHeader;
	JTextArea text;
	JScrollPane scroller;
	Iterator it;
	//groups
	Group g;
	JLabel groupHeader;
	JLabel enterG;
	JTextField student;
	JTextField groupOf;
	JButton grouping;
	JTextArea result;
	int groupNum;
	//about
	JLabel aboutText;
	
	
	/**
	 * ctor for the class
	 */
	public Console() {
		frame = new JFrame("The Cañada College EPIC App"); //make a frame with this title
		ImageIcon img = new ImageIcon(getClass().getResource("logo.jpg"));
		frame.setIconImage(img.getImage());
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setPreferredSize(new Dimension(1000, 800));
		home(); //create the home screen to begin with 
		
		//don't add yet to the frame but create a home button with ctor
		back = new JButton("HOME");
		back.addActionListener(event -> {
			frame.getContentPane().removeAll();
			frame.repaint();
			home();
			frame.validate();
			
		});
	}
	
	/**
	 * creates the home screen
	 */
	public void home() {
		//create the JPanel to hold everything
		homePanel = new JPanel();
		frame.add(homePanel);
		//frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.LINE_AXIS));
		
		//add the image at the top
		logo = new JLabel(new ImageIcon(getClass().getResource("nav-about.png")));
		homePanel.add(logo);
		
		//add the welcome message
		welcome = new JLabel("The Cañada College EPIC App");
		welcome.setForeground(Color.WHITE);
		//welcome.setVerticalAlignment(SwingConstants.CENTER);
		welcome.setFont(welcome.getFont().deriveFont (50.0f));
		//homePanel.add(welcome);
		frame.add(welcome);
		
		//add the buttons
		buttonPanel = new JPanel();
		frame.add(buttonPanel);
		
		//lesson plan button
		lessonPlan = new JButton("Make a Lesson Plan for Josue");
		lessonPlan.setFont(lessonPlan.getFont().deriveFont(17.0f));
		lessonPlan.setPreferredSize(new Dimension(300,100));
		lessonPlan.addActionListener(event -> { //when clicked will clear the screen and bring you to the lesson plan one
			frame.getContentPane().removeAll();
			frame.repaint();
			frame.validate();
			createLessonPlan();
		});
		buttonPanel.add(lessonPlan); //add to the jpanel

		//strategies button
		strategies = new JButton("Look Up a Teaching Strategy");
		strategies.setFont(lessonPlan.getFont().deriveFont(17.0f)); //set font size
		strategies.addActionListener(event -> { //when clicked bring to strategy search
			frame.getContentPane().removeAll();
			frame.repaint();
			frame.validate();
			stratIndex();
		});
		buttonPanel.add(strategies);
		
		//groups button
		groups = new JButton("Create Groups for your EPIC");
		groups.setFont(lessonPlan.getFont().deriveFont(17.0f));
		groups.addActionListener(event -> { //when clicked clear and make new screen
			frame.getContentPane().removeAll();
			frame.repaint();
			frame.validate();
			groups();
		});
		buttonPanel.add(groups);
		
		//about button
		about = new JButton("About");
		about.setFont(lessonPlan.getFont().deriveFont(17.0f));
		about.addActionListener(event -> {
			frame.getContentPane().removeAll();
			frame.repaint();
			frame.validate();
			about();
		});
		buttonPanel.add(about);
		
		//using the Strategy Pattern for layouts
		buttonPanel.setLayout(new GridLayout(2, 2));
		homePanel.setLayout(new BoxLayout(homePanel, BoxLayout.PAGE_AXIS));
		homePanel.validate();
	}
	
	/**
	 * createLessonPlan()
	 * when the button is clicked it will bring you to this page to create
	 * your lesson plan
	 */
	public void createLessonPlan() {
		//add the back button
		frame.add(back);
		
		//header
		des = new JLabel("Create Your Lesson Plan");
		des.setForeground(Color.WHITE);
		des.setFont(des.getFont().deriveFont (50.0f));
		frame.add(des);
		
		//create a JPanel to hold all the fields and create the fields
		fields = new JPanel();
		
		//date
		date = new JTextField("Session and Day of the Week: ");
		date.setPreferredSize(new Dimension(900, 30));
		date.setFont(date.getFont().deriveFont (17.0f));
		fields.add(date);
		
		//leader name
		name = new JTextField("SI Leader: ");
		name.setPreferredSize(new Dimension(900, 30));
		name.setFont(date.getFont().deriveFont (17.0f));
		fields.add(name);
		
		//course name
		course = new JTextField("Course: ");
		course.setPreferredSize(new Dimension(900, 30));
		course.setFont(date.getFont().deriveFont (17.0f));
		fields.add(course);
		
		//professor
		instr = new JTextField("Instructor: ");
		instr.setPreferredSize(new Dimension(900, 30));
		instr.setFont(date.getFont().deriveFont (17.0f));
		fields.add(instr);
		
		//objective for the week
		obj = new JTextField("Objective: What are the one or two most difficult concepts that the students need to work on today?: ");
		obj.setPreferredSize(new Dimension(900, 60));
		obj.setFont(date.getFont().deriveFont (17.0f));
		fields.add(obj);
		
		//concpet 1
		c1 = new JTextField("Content to Cover: ");
		c1.setPreferredSize(new Dimension(900, 50));
		c1.setFont(date.getFont().deriveFont (17.0f));
		fields.add(c1);
		
		//process to use 1
		p1 = new JTextField("Processes to Use: ");
		p1.setPreferredSize(new Dimension(900, 60));
		p1.setFont(date.getFont().deriveFont (17.0f));
		fields.add(p1);
		
		//concept 2 
		c2 = new JTextField("Content to Cover: ");
		c2.setPreferredSize(new Dimension(900, 50));
		c2.setFont(date.getFont().deriveFont (17.0f));
		fields.add(c2);
		
		//process to use 2
		p2 = new JTextField("Processes to Use: ");
		p2.setPreferredSize(new Dimension(900, 60));
		p2.setFont(date.getFont().deriveFont (17.0f));
		fields.add(p2);
		
		//concept 3
		c3 = new JTextField("Content to Cover: ");
		c3.setPreferredSize(new Dimension(900, 50));
		c3.setFont(date.getFont().deriveFont (17.0f));
		fields.add(c3);
		
		//process to use 3
		p3 = new JTextField("Processes to Use: ");
		p3.setPreferredSize(new Dimension(900, 60));
		p3.setFont(date.getFont().deriveFont (17.0f));
		fields.add(p3);
		
		//set the layout of the fields and add all the fields to the frame
		fields.setLayout(new BoxLayout(fields, BoxLayout.Y_AXIS));
		frame.add(fields);
		
		//add a convert to word documents button at the bottom
		createFile = new JButton("Create Word Document");
		createFile.setPreferredSize(new Dimension(300,100));
		createFile.setFont(createFile.getFont().deriveFont(22.0f));
		createFile.addActionListener(event ->{
			//credits to tutorialspoint.com, this is where i got help with this part.
			//had to import a bunch of apache crap to get this working
			try {
				 document = new XWPFDocument();
				 FileOutputStream out = new FileOutputStream (new File("LessonPlan.docx"));
				 para = document.createParagraph();
				 run = para.createRun();
				 
				 //add all of the text from the fields to the document, can still work on formatting for this.
				 run.setText(date.getText());
				 run.addCarriageReturn();
				 run.setText(name.getText());
				 run.addCarriageReturn();
				 run.setText(course.getText());
				 run.setText(instr.getText());
				 run.addCarriageReturn();
				 run.setText(obj.getText());
				 run.addCarriageReturn();
				 run.setText(c1.getText());
				 run.addCarriageReturn();
				 run.setText(p1.getText());
				 run.addCarriageReturn();
				 run.setText(c2.getText());
				 run.addCarriageReturn();
				 run.setText(p2.getText());
				 run.addCarriageReturn();
				 run.setText(c3.getText());
				 run.addCarriageReturn();
				 run.setText(p3.getText());
				 
				 document.write(out);
				 out.close();
				      
				 System.out.println("createdocument.docx written successully");
			}
			catch (Exception e) {
				System.out.println("error!");
			}
			
		});
		frame.add(createFile);
		
		frame.validate();
		
	}

	/**
	 * stratIndex()
	 * an index of all of the strategies a epic tutor can use
	 */
	public void stratIndex() {
		//Strategy class is for the treemap of strategies
		//by the way the iterator is created because treemap, unlike arraylist, does 
		//not have an iterator built into it. I used a tree map because i wanted key value pairs
		//in alphabetical order.
		s = new Strategy();
		
		frame.add(back); //add the home button
		
		strategyHeader = new JLabel("Find Your Strategy");
		strategyHeader.setForeground(Color.WHITE);
		strategyHeader.setFont(strategyHeader.getFont().deriveFont (50.0f));
		
		//search holds all the results
		search = new JTextField();
		search.setPreferredSize(new Dimension(500, 25));
		text = new JTextArea(35,70);
		text.setLineWrap(true);
		scroller = new JScrollPane(text);
		
		search.addActionListener(event -> { //when someone types and presses enter in search box
			String find = search.getText();
			text.setText(""); //clear the text in the box for each new search
			it = s.getTerms().iterator();
			boolean found = false; //gonna display nothing found if there's nothing
			while (it.hasNext()) { //goes through all of the entries
				//text.setText(text.getText()+"*****");
				Map.Entry entry = (Map.Entry)it.next();
				if (entry.getKey().toString().toLowerCase().contains(find.toLowerCase()) || entry.getValue().toString().toLowerCase().contains(find.toLowerCase())) {
					text.setText(text.getText() + "\n ~ " + entry.getKey() + ":\n    " + entry.getValue() + "\n*****");
					text.setFont(text.getFont().deriveFont (22.0f));
					found = true;
				}
			}
			if (found == false) { //no matches
				text.setText("No results found.");
			}
					
		});
		
		//add all to the frame
		frame.add(strategyHeader);
		frame.add(search);
		frame.add(scroller);
		frame.validate();
		
		
	}

	
	public void groups() {
		
		frame.add(back); //add the back button
		
		g = new Group(); //this is a class I made to create an arraylist of groups and shuffle
		
		groupHeader = new JLabel("Enter Student Name and Press Enter for Each Student.");
		groupHeader.setForeground(Color.WHITE);
		groupHeader.setFont(groupHeader.getFont().deriveFont(25.0f));
		
		student = new JTextField();
		student.setPreferredSize(new Dimension(400,40));
		student.addActionListener(event -> { //when a student's name is entered
			g.addStudents(student.getText());
			//System.out.println(g.shuffle());
			student.setText("");
			
		});
		
		//for the field where number of students per group is entered
		enterG = new JLabel("Enter the number of students per group and Press Enter.");
		enterG.setForeground(Color.WHITE);
		enterG.setFont(enterG.getFont().deriveFont(25.0f));
		groupOf = new JTextField();
		groupOf.setPreferredSize(new Dimension(70,40));
		groupOf.addActionListener(event -> { //clears once the user enters text, i think it just looks nicer
			groupOf.setText("");
			
		});
		
		grouping = new JButton("FORM GROUPS");
		result = new JTextArea(18,35);
		result.setText("");
		result.setFont(result.getFont().deriveFont(25.0f));
		
		//add all the components
		frame.add(groupHeader);
		frame.add(student);
		frame.add(enterG);
		frame.add(groupOf);
		frame.add(grouping);
		frame.add(result);
		
		grouping.addActionListener(event -> { //update the text field when the button is clicked
			result.setText("");
			result.setLineWrap(true);
			groupNum = 1;
			ArrayList<String> shuffle = g.shuffle();

			for (int i = 0; i < shuffle.size(); i++) {
				if (i % Integer.parseInt(groupOf.getText()) == 0) { //this is how i divide the shuffled people into groups
					
					result.setText(result.getText() + "\nGroup " + groupNum + "\n");
					groupNum++;
				}
				result.setText(result.getText() + shuffle.get(i) + " ");
				result.validate();
			}
		});

		frame.validate();

	}
	
	public void about() {
		
		frame.add(back); //add the back button
		
		//simply displays text
		aboutText = new JLabel();
		aboutText.setPreferredSize(new Dimension(500, 500));
		aboutText.setText("<html>" + "Credit for all content on EPIC stratgeies and graphics goes to Mr. Josue Alacarz and the STEM Center, "
				+ "Application Developed by Sebrianne Ferguson, "
				+ "Last edit: October 13th, 2018. "
				+ "If there are bugs, please contact me." + "</html>");
		aboutText.setForeground(Color.WHITE);
		aboutText.setFont(aboutText.getFont().deriveFont (20.0f));
		frame.add(aboutText);
		frame.validate();
		
	}
	
	
	/**
	 * main()
	 * makes the console and sets the layout
	 * @param args
	 */
	public static void main(String[] args) {
		Console c = new Console();

		c.frame.setLayout(new FlowLayout());//(new BoxLayout(c.frame.getContentPane(), BoxLayout.LINE_AXIS));
		c.frame.pack(); //makes sure that it doesn't take up more room than needed
		c.frame.setVisible(true); //makes the frame visible
		c.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //or else it will end only when the user closes the window
	}
	

}
