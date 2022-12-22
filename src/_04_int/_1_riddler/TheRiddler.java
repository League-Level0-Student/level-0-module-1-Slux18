package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String input = 		JOptionPane.showInputDialog("What has a bottom at the top?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (input.equals("legs")) {
			JOptionPane.showMessageDialog(null,"you are correct! :)");
			score+=1;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
		
			JOptionPane.showMessageDialog(null, "you are incorrect:(");
		}
		// 6. Add some more riddles
		
		String input2 =    JOptionPane.showInputDialog("ok, lets do another one,What runs all around a backyard, yet never moves?");
		if(input2.equals("a fence")) {
			JOptionPane.showMessageDialog(null, "You are correct:)");
			score+=1;
		}
		else {
			JOptionPane.showMessageDialog(null, "you are incorrect:(");
		}
		String input3 = JOptionPane.showInputDialog("lets do one more,Take off my skin - I won't cry, but you will! What am I?"); {
			if(input3.equals("an onion")){
			JOptionPane.showMessageDialog(null,"you are correct:)");
			score+=1;
		}
		else {
			JOptionPane.showMessageDialog(null, "you are incorrect");
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null,score);
	}
}
}
