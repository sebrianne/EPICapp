package EPICapp;

import java.util.Set;
import java.util.TreeMap;

public class Strategy {
	
	TreeMap<String, String> terms;
	
	public Strategy() {
		terms = new TreeMap<String, String>();
		addTerms();
	}
	
	/**
	 * no easy elegant way to do this
	 * just adding all the terms to the treemap
	 */
	public void addTerms() {
		String t0 = "Redirecting Terms";
		String e0 = "requires the Leader to suppress that tendency and redirect questions back to the group";
		terms.put(t0, e0);
		
		String t1 = "Checking for Understanding";
		String e1 = "1. Always maintain eye contact with the students during the session. By making eye contact, you will likely see when a student is confused. \r\n" + 
				    "    2. Ask a student to summarize the concept just covered. If s/he struggles, ask the group to help him/her. \r\n" + 
				    "    3. Ask for a volunteer to write the main points of the discussion on the board. \r\n" + 
				    "    4. Ask a question that requires the student to understand in order to answer correctly. For example, if you just covered the difference between the logical rules of inference, disjunctive syllogism and modus ponens, ask the group, “So I can use Disjunctive Syllogism on this argument, right?” when you cannot, based on the discussion. When they reply, “No, of course not,” ask them why not. \r\n" + 
				    "    5. Once in a while, intentionally make mistakes on the board. The students will catch you if they understand. If no one notices, probe the group about the content on the board until they discover the mistake. (Frequent use of this strategy may confuse students.) \r\n" + 
				    "    6. Ask the students to rephrase the question you asked originally or the summary another student gave. \r\n" + 
				    "    7. Ask for real-life examples or applications of the concept. \r\n" + 
				    "    8. Ask for a similar problem, metaphor, or analogy.\r\n" + 
				"";
		terms.put(t1, e1);
		
		String t2 = "Group Discussion";
		String e2 = "a general discussion of an issue or topic by the group. Individual members are free to contribute or not contribute.";
		terms.put(t2, e2);
		
		String t3 = "Clusters";
		String e3 = "group participants are divided into smaller groups for discussion. They may also be allowed to self-select the small group they want to be in. After discussing the assigned topic the cluster may report their findings to the large group.";
		terms.put(t3, e3);
		
		String t4 = "Turn to a Partner";
		String e4 = "Group members work with a partner on an assignment or discussion topic.";
		terms.put(t4, e4);
		
		String t5 = "Assigned Discussion Leader";
		String e5 = "One person in the group is asked to present on a topic or review material for the group and then lead the discussion for the group. This person should not be the regular group leader.";
		terms.put(t5, e5);
		
		String t6 = "Think / Pair / Share";
		String e6 = "Group members work on an assignment or project individually and then share their results with a partner.";
		terms.put(t6, e6);
		
		String t7 = "Indvidual Presentation";
		String e7 = "An uninterrupted presentation by one person to the group. Group members present on a topic, question, or issue to the group. Unlike an \"Assigned Discussion Leader\" this is a formal presentation delivered to a captive audience.";
		terms.put(t7, e7);
		
		String t8 = "Jigsaw";
		String e8 = "when used properly, make the group as a whole dependent upon all the of subgroups. Each group provides apiece of the puzzle. Group members are broken into smaller groups. Each small group works on some aspect of the same problem, question, or issue. They then share their part of the puzzle with the large group.";
		terms.put(t8, e8);
		
		String t9 = "Group Survey";
		String e9 = "Each group member is surveyed to discover their position on an issue, problem or topic. This process insures that each member of the group is allowed to offer or state their point of view.";
		terms.put(t9, e9);
		
		String t10 = "Lecture Review";
		String e10 = "Students summarize the most recent lecture, or have them identify the key words from that lecture and their notes.";
		terms.put(t10, e10);
		
		String t11 = "Oral Reading of Lecture Notes";
		String e11 = "Tell the group that you will begin reading from your lecture notes and will ask the student on your right or left to pick up where you stop. Let them know that the role of reader will move to each student in the circle. "
				      + "Look at the students and encourage them to let everyone know if something is left out or inconsistent with what they have recorded. ";
		terms.put(t11, e11);
		
		String t12 = "Incomplete Outline";
		String e12 = "Tell students that the main points might not be clear from a specific lecture (or series of lectures) and present to the group an outline with some of the parts missing."
				+ "The group must then work through their notes to figure out how to fill in the outline.";
		terms.put(t12, e12);
		
		String t13 = "The Matrix";
		String e13 = "used when the same types of information are provided in the notes or text for a set of topics. A Matrix helps students organize information by showing its relationship to similar categories of information. It is a helpful tool for students to compare and contrast information.";
		terms.put(t13, e13);
		
		String t14 = "Mapping and Picturing";
		String e14 = "used to illustrate the concept presented verbally in the lecture. The relationships between the topics are stressed in the map by the use of arrows. There are many types of Mapping and Picturing techniques. " +
		"The key idea is to visualize the information and to use as few words as possible.";
		terms.put(t14, e14);
		
		String t15 = "The Informal Quiz";
		String e15 = "Used to develop and reinforce comprehension, improve retention of information, stimulate interest in a subject area, and promote student participation in the study session." +
		              "Provide half sheets, Ask a majority of questions requiring short multiple answers, 3.	Focus on current material, but include two or more concepts the instructor will want the students to understand."
				+ "4.	Most questions should not be too difficult, but should emphasize recall of key points or of minor points related to key points. One or two questions should require use of higher order thinking skills."
		              + "5.	Use a variety of questions formats, including fill-in-the-blank, multiple choice, T/F, etc. 6.	If there are students who aren’t writing answers, say, “If you don’t know the answer, write the question so you will remember what it was you didn’t know.”"+
				"7.	In answering questions, ask who would like to answer a question—any question. Starting with any question instead of the first question contributes to the informality of the quiz and allows a student who only answered a few questions accurately to participate immediately."
		              + "Call on the weaker students first, whenever they have raised a hand. Restate the question before the answer is given." + 
		              "If possible, find something complimentary to say about wrong answers. “That’s a very good guess. If I weren’t sure, I might have guessed that.” Don’t let wrong answers stand." + 
		              "Keep it light and short. Ask a maximum of ten questions.";
		terms.put(t15, e15);
		
		String t16 = "Vocabulary Activities";
		String e16 = "Use terms yourself, create vocabulary matrices, create vocabulary note cards.";
		terms.put(t16, e16);
		
		String t17 = "Time Lines";
		String e17 = "Make sure that the dates are truly important before using this procedure. Then, make a brief, very general Time Line of events happening and give to the group.";
		terms.put(t17, e17);
		
		String t18 = "The Boardwork Model";
		String e18 = "1.	Arrive early and organize the board into four columns. Label like the diagram on the next page. Allow enough room for two people to write at once.\r\n" + 
				"2.	Ask for a volunteer to write on the board. If you encounter reluctance, reassure them that the group will tell the scribe what to write. (They don’t need to know what to do already.)\r\n" + 
				"3.	As a group, brainstorm all formulas, equations, rules, etc. required to solve the problem.\r\n" + 
				"4.	Ask for another volunteer scribe.\r\n" + 
				"a.	The first volunteer will list the mathematical steps in the solution; the second will write out the narrative of the steps in the solution. This should be done simultaneously, and the students need to verbalize the steps in their own words.\r\n" + 
				"b.	Encourage students whose skills are verbal to try the mathematical steps and vice-versa. Remember, the group will help them.\r\n" + 
				"c.	Depending on the ability level of the group, identify, solve, or construct\r\n" + 
				" \r\n" + 
				"and solve a similar problem. Generally, weaker students should begin by identifying similar problems, but do not underestimate their ability to or how much they will benefit from constructing a problem. If they can get inside a problem enough to construct another one, it will help them understand problem solving more thoroughly.\r\n" + 
				"";
		terms.put(t18, e18);
		
		String t19 = "Vocabulary Activities";
		String e19 = "Use terms yourself, create vocabulary matrices, create vocabulary note cards.";
		terms.put(t19, e19);
	
	}
	
	/**
	 * getTerms()
	 * converts to a set so the other class can iterate over it
	 * @return set of all terms
	 */
	public Set getTerms(){
		Set s = terms.entrySet();
		return s;
	}

}
