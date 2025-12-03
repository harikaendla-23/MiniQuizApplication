import java.util.InputMismatchException;
import java.util.Scanner;

class Questions {
	// Questions
	String q1 = "Q1.What is the capital of France?";
	String q2 = "Q2.Which planet is known as the Red Planet?";
	String q3 = "Q3.Who wrote the play \"Romeo and Juliet\"?";
	String q4 = "Q4.What is the largest mammal in the world?";
	String q5 = "Q5.Which country is known for the invention of pizza?";
	String q6 = "Q6.How many continents are there on Earth?";
	String q7 = "Q7.What is the boiling point of water?";
	String q8 = "Q8.Which element is represented by the symbol 'O'?";
	String q9 = "Q9.Who is the author of the \"Harry Potter\" series?";
	String q10 = "Q10.What is the largest ocean on Earth?";
	String q11="What is the chemical symbol for gold?";
	// options
	String o1 = "1.London  2.Berlin  3.Paris  4.Rome  5.LifeLine  6.Quit";
	String o2 = "1.Earth  2.Mars  3.Jupitar  4.Venus  5.LifeLine  6.Quit";
	String o3 = "1.William Shakespeare  2.Charles Dickens  3.Jane Austen  4.Mark Twain  5.LifeLine  6.Quit";
	String o4 = "1.Elephant  2.Blue Whale  3.Giraffe  4.Hippopotamus  5.LifeLine  6.Quit";
	String o5 = "1.France  2.USA  3.Italy  4.Spain  5.LifeLine  6.Quit";
	String o6 = "1. 5  2. 6  3. 7  4. 8  5. LifeLine  6. Quit";
	String o7 = "1. 90°C  2. 100°C  3. 110°C 4. 120°C  5. LifeLine  6. Quit";
	String o8 = "1.Oxygen  2.Gold  3.Silver  4.Hydrogen  5.LifeLine  6.Quit";
	String o9 = "1. J.R.R. Tolkien  2. J.K. Rowling  3. George R.R. Martin  4. Stephen King  5. LifeLine  6. Quit";
	String o10 = "1.Atlantic Ocean  2.Indian Ocean  3.Arctic Ocean  4.Pacific Ocean  5.LifeLine  6.Quit";
	String o11="1.Au  2.Ag  3.Fe  4.Hg";

}

class ChooseOption extends Questions {
	
	public int count = 0;
	int fifty_by_fifty = 0;
	int audience_pool,swap= 0;
	int goQue2, goQue3, goQue4, goQue5, goQue6, goQue7, goQue8, goQue9,goQue10,quit = 0;
	void quitC() {
		quit++;
		System.out
				.println("Thats not the right answer.");
		System.out.println("\n Quiz completed!Your total marks are " + count + " out of 10 marks.");
		System.out.println("<-------------------------------------------------------------------->");
		System.out.println("\t\tThanks for taking the Quiz Challenge!");
	}
	void swapQ() {
		Scanner sc = new Scanner(System.in);
		
		int ans_swap = sc.nextInt();
		switch (ans_swap) {
		case 1:
			count++;
			System.out.println("Congrulations you got one point!");
			break;
		case 2:
			quitC();
			break;
		case 3:
			quitC();
			break;

		case 4:
			quitC();
			break;
		default:
			quitC();
		}
	}

	public void que1() {
		Scanner sc = new Scanner(System.in);
		int ans1 = sc.nextInt();
		switch (ans1) {
		case 1:
			quitC();
			break;
		case 2:
			quitC();
			break;
		case 3:
			count++;
			System.out.println("Congrulations you got one point!");
			break;
		case 4:
			quitC();
			break;
		case 5:
			System.out.println("Choose One Of Them:");
			System.out.println("  1. 50/50\n  2. Audience pool\n  3. Swap");
			int lifeline_opt = sc.nextInt();
			if (lifeline_opt == 1) {
				fifty_by_fifty++;
				System.out.println(q1 + "\n" + "  3.Paris  4.Rome");
				System.out.println("Now choose correct option among two options:");
				int ans1_l = sc.nextInt();
				switch (ans1_l) {
				case 3:
					count++;
					System.out.println("Congrulations you got one point!");
					break;

				case 4:
					quitC();
					break;
				default:
					quitC();
				}
			} 
			else if (lifeline_opt == 2) {
				audience_pool++;
				System.out.println(q1 + "\n  " + "London-10%\n  2.Berlin-9%\n  3.Paris-60%\n  4.Rome-21%");
				int ans1_2 = sc.nextInt();
				switch (ans1_2) {
				case 1:
					quitC();
					break;
				case 2:
					quitC();
					break;
				case 3:
					count++;
					System.out.println("Congrulations you got one point!");
					break;

				case 4:
					quitC();
					break;
				default:
					quitC();
				}
			
			}
			else if (lifeline_opt == 3) {
				swap++;
				System.out.println("Q1."+q11+"\n  "+o11);
				swapQ();
			
			} 
			
			else
				quitC();
			break;
		case 6:
			quit++;
			System.out.println("\n Quiz completed!Your total marks are " + count + " out of 10 marks.");
			System.out.println("<-------------------------------------------------------------------->");
			System.out.println("\t\tThanks for taking the Quiz Challenge!");
			break;
		default:
			quitC();

		}
	}

	public void que2() {
		Scanner sc = new Scanner(System.in);
		int ans2 = sc.nextInt();
		switch (ans2) {
		case 1:
			quitC();
			break;
		case 2:
			count++;
			System.out.println("Congrulations you got one point!");
			break;
		case 3:
			quitC();
			break;
		case 4:
			quitC();
			break;
		case 5:
			if(fifty_by_fifty==1) {
				System.out.println("\n  50/50 has been Exhausted,Please choose one of them!!");
				System.out.println("  1. Audience pool\n  2. Swap");
				int lifeline_opt = sc.nextInt();
				if(lifeline_opt==1) {
					audience_pool++;
					System.out.println(q2 + "\n  " + "1.Earth-10%\n  2.Mars-60%\n  3.Jupitar-9%\n  4.Venus-21%");
					int ans2_1 = sc.nextInt();
					switch (ans2_1) {
					case 1:
						quitC();
						break;
					case 2:
						count++;
						System.out.println("Congrulations you got one point!");
						break;
					case 3:
						quitC();
						break;

					case 4:
						quitC();
						break;
					default:
						quitC();
					}
				}
				else if (lifeline_opt == 2) {
					swap++;
					System.out.println("Q2."+q11+"\n  "+o11);
					swapQ();
				
				}
				else
					quitC();
			}
			else if(audience_pool==1) {
				System.out.println("\n   Audience pool has been Exhausted,Please choose one of them!!");
				System.out.println("  1. 50/50\n  2. Swap");
				int lifeline_opt = sc.nextInt();
				if(lifeline_opt==1) {
					fifty_by_fifty++;
					System.out.println(q2 + "\n" + "  2.Mars  3.Jupitar");
					System.out.println("Now choose correct option among two options:");
					int ans2_2= sc.nextInt();
					switch (ans2_2) {
					case 2:
						count++;
						System.out.println("Congrulations you got one point!");
						break;

					case 3:
						quitC();
						break;
					default:
						quitC();
					}
				}
				else if (lifeline_opt == 2) {
					swap++;
					System.out.println("Q2."+q11+"\n  "+o11);
					swapQ();
				}
				else
					quitC();
			}
			else if(swap==1) {
				System.out.println("\n   Swap has been Exhausted,Please choose one of them!!");
				System.out.println("  1. 50/50\n  2. Audience pool");
				int lifeline_opt = sc.nextInt();
				if(lifeline_opt==1) {
					fifty_by_fifty++;
					System.out.println(q2 + "\n" + "  2.Mars  3.Jupitar");
					System.out.println("Now choose correct option among two options:");
					int ans2_3= sc.nextInt();
					switch (ans2_3) {
					case 2:
						count++;
						System.out.println("Congrulations you got one point!");
						break;

					case 3:
						quitC();
						break;
					default:
						quitC();
					}
				}
				else if (lifeline_opt == 2) {
					audience_pool++;
					System.out.println(q2 + "\n  " + "1.Earth-10%\n  2.Mars-60%\n  3.Jupitar-9%\n  4.Venus-21%");
					int ans2_4 = sc.nextInt();
					switch (ans2_4) {
					case 1:
						quitC();
						break;
					case 2:
						count++;
						System.out.println("Congrulations you got one point!");
						break;
					case 3:
						quitC();
						break;

					case 4:
						quitC();
						break;
					default:
						quitC();
					}
				}
				else
					quitC();
			}
			else {
			System.out.println("Choose One Of Them:");
			System.out.println("  1. 50/50\n  2. Audience pool\n  3. Swap");
			int lifeline_opt = sc.nextInt();
			switch(lifeline_opt) {
			case 1:
				fifty_by_fifty++;
				System.out.println(q2 + "\n" + "  2.Mars  3.Jupitar");
				System.out.println("Now choose correct option among two options:");
				int ans2_5= sc.nextInt();
				switch (ans2_5) {
				case 2:
					count++;
					System.out.println("Congrulations you got one point!");
					break;

				case 3:
					quitC();
					break;
				default:
					quitC();
				}
				break;
			case 2:
				audience_pool++;
				System.out.println(q2 + "\n  " + "1.Earth-10%\n  2.Mars-60%\n  3.Jupitar-9%\n  4.Venus-21%");
				int ans2_6 = sc.nextInt();
				switch (ans2_6) {
				case 1:
					quitC();
					break;
				case 2:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				case 3:
					quitC();
					break;

				case 4:
					quitC();
					break;
				default:
					quitC();
				}	
				break;
			case 3:
				swap++;
				System.out.println("Q2."+q11+"\n  "+o11);
				swapQ();
				break;
			default:
				quitC();
				
				}	
			}
			break;
			
		case 6:
			quit++;
			System.out.println("\n Quiz completed!Your total marks are " + count + " out of 10 marks.");
			System.out.println("<-------------------------------------------------------------------->");
			System.out.println("\t\tThanks for taking the Quiz Challenge!");
			break;
		default:
			quitC();
			
				
	}
}
	public void que3() {
		Scanner sc = new Scanner(System.in);
		int ans3 = sc.nextInt();
		switch (ans3) {
		case 1:
			count++;
			System.out.println("Congrulations you got one point!");
			break;
		case 2:
			quitC();
			break;
		case 3:
			quitC();
			break;
		case 4:
			quitC();
			break;
		case 5:
			if(fifty_by_fifty==1 && audience_pool==1) {
				System.out.println("\n   First and Second option has been Exhausted,Please choose another option!");
				System.out.println("  1. Swap");
				int lifeline_opt = sc.nextInt();
				if(lifeline_opt==1) {
				swap++;
				System.out.println("Q3."+q11+"\n  "+o11);
				swapQ();
				}
				else
					quitC();
			}
			else if(fifty_by_fifty==1 && swap==1) {
				System.out.println("\n   First and Third option has been Exhausted,Please choose another option!");
				System.out.println("  1. Audience pool");
				int lifeline_opt = sc.nextInt();
				if(lifeline_opt==1) {
				audience_pool++;
				System.out.println(q3 + "\n  " + "1.William Shakespeare-60%\n  2.Charles Dickens-10%\n  3.Jane Austenr-9%\n  4.Mark Twain-21%");
				int ans3_1 = sc.nextInt();
				switch (ans3_1) {
				case 1:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				case 2:
					quitC();
					break;
				case 3:
					quitC();
					break;
				case 4:
					quitC();
					break;
				default:
					quitC();
				}
				}
				else
					quitC();
			}
			else if(audience_pool==1 && swap==1) {
			
				System.out.println("\n   Second and Third option has been Exhausted,Please choose another option!");
				System.out.println("  1. 50/50");
				int lifeline_opt = sc.nextInt();
				if(lifeline_opt==1) {
				fifty_by_fifty++;
				System.out.println(q3 + "\n" + "  1.William Shakespeare  3.Jane Austenr");
				System.out.println("Now choose correct option among two options:");
				int ans3_2= sc.nextInt();
				switch (ans3_2) {
				case 1:
					count++;
					System.out.println("Congrulations you got one point!");
					break;

				case 3:
					quitC();
					break;
				default:
					quitC();
				}
				}
				else
					quitC();
			}
			else if(fifty_by_fifty==1) {
				System.out.println("\n  50/50 has been Exhausted,Please choose one of them!!");
				System.out.println("  1. Audience pool\n  2. Swap");
				int lifeline_opt = sc.nextInt();
				if(lifeline_opt==1) {
					audience_pool++;
					System.out.println(q3 + "\n  " + "1.William Shakespeare-60%\n  2.Charles Dickens-10%\n  3.Jane Austenr-9%\n  4.Mark Twain-21%");
					int ans3_3 = sc.nextInt();
					switch (ans3_3) {
					case 1:
						count++;
						System.out.println("Congrulations you got one point!");
						break;
					case 2:
						quitC();
						break;
					case 3:
						quitC();
						break;
					case 4:
						quitC();
						break;
					default:
						quitC();
					}
				}
				else if (lifeline_opt == 2) {
					swap++;
					System.out.println("Q3."+q11+"\n  "+o11);
					swapQ();
				
				}
				else
					quitC();
			}
			else if(audience_pool==1) {
				System.out.println("\n   Audience pool has been Exhausted,Please choose one of them!!");
				System.out.println("  1. 50/50\n  2. Swap");
				int lifeline_opt = sc.nextInt();
				if(lifeline_opt==1) {
					fifty_by_fifty++;
					System.out.println(q3 + "\n" + "  1.William Shakespeare  3.Jane Austenr");
					System.out.println("Now choose correct option among two options:");
					int ans3_4= sc.nextInt();
					switch (ans3_4) {
					case 1:
						count++;
						System.out.println("Congrulations you got one point!");
						break;

					case 3:
						quitC();
						break;
					default:
						quitC();
					}
				}
				else if (lifeline_opt == 2) {
					swap++;
					System.out.println("Q3."+q11+"\n  "+o11);
					swapQ();
				}
				else
					quitC();
			}
			else if(swap==1) {
				System.out.println("\n   Swap has been Exhausted,Please choose one of them!!");
				System.out.println("  1. 50/50\n  2. Audience pool");
				int lifeline_opt = sc.nextInt();
				if(lifeline_opt==1) {
					fifty_by_fifty++;
					System.out.println(q3 + "\n" + "  1.William Shakespeare  3.Jane Austenr");
					System.out.println("Now choose correct option among two options:");
					int ans3_5= sc.nextInt();
					switch (ans3_5) {
					case 1:
						count++;
						System.out.println("Congrulations you got one point!");
						break;

					case 3:
						quitC();
						break;
					default:
						quitC();
					}
				}
				else if (lifeline_opt == 2) {
					audience_pool++;
					System.out.println(q3 + "\n  " + "1.William Shakespeare-60%\n  2.Charles Dickens-10%\n  3.Jane Austenr-9%\n  4.Mark Twain-21%");
					int ans3_6 = sc.nextInt();
					switch (ans3_6) {
					case 1:
						count++;
						System.out.println("Congrulations you got one point!");
						break;
					case 2:
						quitC();
						break;
					case 3:
						quitC();
						break;
					case 4:
						quitC();
						break;
					default:
						quitC();
					}
				}
				else
					quitC();
			}
			
			else {
			System.out.println("Choose One Of Them:");
			System.out.println("  1. 50/50\n  2. Audience pool\n  3. Swap");
			int lifeline_opt = sc.nextInt();
			switch(lifeline_opt) {
			case 1:
				fifty_by_fifty++;
				System.out.println(q3 + "\n" + "  1.William Shakespeare  3.Jane Austenr");
				System.out.println("Now choose correct option among two options:");
				int ans3_7= sc.nextInt();
				switch (ans3_7) {
				case 1:
					count++;
					System.out.println("Congrulations you got one point!");
					break;

				case 3:
					quitC();
					break;
				default:
					quitC();
				}
				break;
			case 2:
				audience_pool++;
				System.out.println(q3 + "\n  " + "1.William Shakespeare-60%\n  2.Charles Dickens-10%\n  3.Jane Austenr-9%\n  4.Mark Twain-21%");
				int ans3_8 = sc.nextInt();
				switch (ans3_8) {
				case 1:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				case 2:
					quitC();
					break;
				case 3:
					quitC();
					break;
				case 4:
					quitC();
					break;
				default:
					quitC();
				}	
				break;
			case 3:
				swap++;
				System.out.println("Q2."+q11+"\n  "+o11);
				swapQ();
				break;
			default:
				quitC();
				
				}	
			}
			break;
			
		case 6:
			quit++;
			System.out.println("\n Quiz completed!Your total marks are " + count + " out of 10 marks.");
			System.out.println("<-------------------------------------------------------------------->");
			System.out.println("\t\tThanks for taking the Quiz Challenge!");
			break;
		default:
			quitC();
			
				
	}
}
	public void que4() {
		Scanner sc = new Scanner(System.in);
		if(fifty_by_fifty==1 && audience_pool==1 && swap==1) {
			int ans_4 = sc.nextInt();
			switch(ans_4) {
			case 1:
				quitC();
				break;
			case 2:
				count++;
				System.out.println("Congrulations you got one point!");
				break;
			case 3:
				quitC();
				break;
			case 4:
				quitC();
				break;
			case 5:
				quit++;
				System.out.println("\n Quiz completed!Your total marks are " + count + " out of 10 marks.");
				System.out.println("<-------------------------------------------------------------------->");
				System.out.println("\t\tThanks for taking the Quiz Challenge!");
				break;
				
			default:
				quitC();
				
			}
		}
		else {
		int ans4 = sc.nextInt();
		if(ans4==1)
			quitC();
		else if(ans4==2) {
			count++;
			System.out.println("Congrulations you got one point!");
		}
		else if(ans4==3)
			quitC();
		else if(ans4==4)
			quitC();
		else if(ans4==5)
		{
			if(fifty_by_fifty==1 && audience_pool==1) {
				System.out.println("\n   First and Second option has been Exhausted,Please choose another option!");
				System.out.println("  1. Swap");
				int lifeline_opt = sc.nextInt();
				if(lifeline_opt==1) {
				swap++;
				System.out.println("Q4."+q11+"\n  "+o11);
				swapQ();
				}
				else
					quitC();
			}
			else if(fifty_by_fifty==1 && swap==1) {
				System.out.println("\n   First and Third option has been Exhausted,Please choose another option!");
				System.out.println("  1. Audience pool");
				int lifeline_opt = sc.nextInt();
				if(lifeline_opt==1) {
				audience_pool++;
				System.out.println(q4 + "\n  " + "1Elephant-10%\n  2.Blue Whale-60%\n  3.Giraffe-9%\n  4.Hippopotamus-21%");
				int ans4_1 = sc.nextInt();
				switch (ans4_1) {
				case 1:
					quitC();
					break;
				case 2:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				case 3:
					quitC();
					break;
				case 4:
					quitC();
					break;
				default:
					quitC();
				}
				}
				else
					quitC();
			}
			else if(audience_pool==1 && swap==1) {
			
				System.out.println("\n   Second and Third option has been Exhausted,Please choose another option!");
				System.out.println("  1. 50/50");
				int lifeline_opt = sc.nextInt();
				if(lifeline_opt==1) {
				fifty_by_fifty++;
				System.out.println(q4 + "\n" + "  2.Blue Whale  3.Giraffe");
				System.out.println("Now choose correct option among two options:");
				int ans4_2= sc.nextInt();
				switch (ans4_2) {
				case 2:
					count++;
					System.out.println("Congrulations you got one point!");
					break;

				case 3:
					quitC();
					break;
				default:
					quitC();
				}
				}
				else
					quitC();
			}
			else if(fifty_by_fifty==1) {
				System.out.println("\n  50/50 has been Exhausted,Please choose one of them!!");
				System.out.println("  1. Audience pool\n  2. Swap");
				int lifeline_opt = sc.nextInt();
				if(lifeline_opt==1) {
					audience_pool++;
					System.out.println(q4 + "\n  " + "1Elephant-10%\n  2.Blue Whale-60%\n  3.Giraffe-9%\n  4.Hippopotamus-21%");
					int ans4_3 = sc.nextInt();
					switch (ans4_3) {
					case 1:
						quitC();
						break;
					case 2:
						count++;
						System.out.println("Congrulations you got one point!");
						break;
					case 3:
						quitC();
						break;
					case 4:
						quitC();
						break;
					default:
						quitC();
					}
				}
				else if (lifeline_opt == 2) {
					swap++;
					System.out.println("Q4."+q11+"\n  "+o11);
					swapQ();
				
				}
				else
					quitC();
			}
			else if(audience_pool==1) {
				System.out.println("\n   Audience pool has been Exhausted,Please choose one of them!!");
				System.out.println("  1. 50/50\n  2 .Swap");
				int lifeline_opt = sc.nextInt();
				if(lifeline_opt==1) {
					fifty_by_fifty++;
					System.out.println(q4 + "\n" + "  2.Blue Whale  3.Giraffe");
					System.out.println("Now choose correct option among two options:");
					int ans4_4= sc.nextInt();
					switch (ans4_4) {
					case 2:
						count++;
						System.out.println("Congrulations you got one point!");
						break;

					case 3:
						quitC();
						break;
					default:
						quitC();
					}
				}
				else if (lifeline_opt == 2) {
					swap++;
					System.out.println("Q4."+q11+"\n  "+o11);
					swapQ();
				}
				else
					quitC();
			}
			else if(swap==1) {
				System.out.println("\n   Swap has been Exhausted,Please choose one of them!!");
				System.out.println("  1. 50/50\n  2. Audience pool");
				int lifeline_opt = sc.nextInt();
				if(lifeline_opt==1) {
					fifty_by_fifty++;
					System.out.println(q4 + "\n" + "  2.Blue Whale  3.Giraffe");
					System.out.println("Now choose correct option among two options:");
					int ans4_5= sc.nextInt();
					switch (ans4_5) {
					case 2:
						count++;
						System.out.println("Congrulations you got one point!");
						break;

					case 3:
						quitC();
						break;
					default:
						quitC();
					}
				}
				else if (lifeline_opt == 2) {
					audience_pool++;
					System.out.println(q4 + "\n  " + "1Elephant-10%\n  2.Blue Whale-60%\n  3.Giraffe-9%\n  4.Hippopotamus-21%");
					int ans4_6 = sc.nextInt();
					switch (ans4_6) {
					case 1:
						quitC();
						break;
					case 2:
						count++;
						System.out.println("Congrulations you got one point!");
						break;
					case 3:
						quitC();
						break;
					case 4:
						quitC();
						break;
					default:
						quitC();
					}
				}
				else
					quitC();
			}
			
			else {
			System.out.println("Choose One Of Them:");
			System.out.println("  1. 50/50\n  2. Audience pool\n  3. Swap");
			int lifeline_opt = sc.nextInt();
			switch(lifeline_opt) {
			case 1:
				fifty_by_fifty++;
				System.out.println(q4 + "\n" + "  2.Blue Whale  3.Giraffe");
				System.out.println("Now choose correct option among two options:");
				int ans4_7= sc.nextInt();
				switch (ans4_7) {
				case 2:
					count++;
					System.out.println("Congrulations you got one point!");
					break;

				case 3:
					quitC();
					break;
				default:
					quitC();
				}
				break;
			case 2:
				audience_pool++;
				System.out.println(q4 + "\n  " + "1.William Shakespeare-60%\n  2.Charles Dickens-10%\n  3.Jane Austenr-9%\n  4.Mark Twain-21%");
				int ans4_8 = sc.nextInt();
				switch (ans4_8) {
				case 1:
					quitC();
					break;
				case 2:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				case 3:
					quitC();
					break;
				case 4:
					quitC();
					break;
				default:
					quitC();
				}	
				break;
			case 3:
				swap++;
				System.out.println("Q4."+q11+"\n  "+o11);
				swapQ();
				break;
			default:
				quitC();
				
				}	
			}
		}
			
			
		else if(ans4==6) {
			quit++;
			System.out.println("\n Quiz completed!Your total marks are " + count + " out of 10 marks.");
			System.out.println("<-------------------------------------------------------------------->");
			System.out.println("\t\tThanks for taking the Quiz Challenge!");
		}
		else
			quitC();
			
				
	}
}
	public void que5() {
		Scanner sc = new Scanner(System.in);
		if(fifty_by_fifty==1 && audience_pool==1 && swap==1) {
			int ans_5 = sc.nextInt();
			switch(ans_5) {
			case 1:
				quitC();
				break;
			case 2:
				quitC();
				break;
			case 3:
				count++;
				System.out.println("Congrulations you got one point!");
				break;
			case 4:
				quitC();
				break;
			case 5:
				quit++;
				System.out.println("\n Quiz completed!Your total marks are " + count + " out of 10 marks.");
				System.out.println("<-------------------------------------------------------------------->");
				System.out.println("\t\tThanks for taking the Quiz Challenge!");
				break;
				
			default:
				quitC();
				
			}
		}
		else {
		int ans5 = sc.nextInt();
		if(ans5==1)
			quitC();
		else if(ans5==2) {
			quitC();
		}
		else if(ans5==3) {
			count++;
		System.out.println("Congrulations you got one point!");}
		else if(ans5==4)
			quitC();
		else if(ans5==5)
		{
			if(fifty_by_fifty==1 && audience_pool==1) {
				System.out.println("\n   First and Second option has been Exhausted,Please choose another option!");
				System.out.println("  1. Swap");
				int lifeline_opt = sc.nextInt();
				if(lifeline_opt==1) {
				swap++;
				System.out.println("Q5."+q11+"\n  "+o11);
				swapQ();
				}
				else
					quitC();
			}
			else if(fifty_by_fifty==1 && swap==1) {
				System.out.println("\n   First and Third option has been Exhausted,Please choose another option!");
				System.out.println("  1. Audience pool");
				int lifeline_opt = sc.nextInt();
				if(lifeline_opt==1) {
				audience_pool++;
				System.out.println(q5 + "\n  " + "1.France-10%\n  2.USA-9%\n  3.Italy-60%\n  4.Spain-21%");
				int ans5_1 = sc.nextInt();
				switch (ans5_1) {
				case 1:
					quitC();
					break;
				case 2:
					quitC();
					break;
				case 3:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				case 4:
					quitC();
					break;
				default:
					quitC();
				}
				}
				else
					quitC();
			}
			else if(audience_pool==1 && swap==1) {
			
				System.out.println("\n   Second and Third option has been Exhausted,Please choose another option!");
				System.out.println("  1. 50/50");
				int lifeline_opt = sc.nextInt();
				if(lifeline_opt==1) {
				fifty_by_fifty++;
				System.out.println(q5 + "\n" + "   2.USA  3.Italy");
				System.out.println("Now choose correct option among two options:");
				int ans5_2= sc.nextInt();
				switch (ans5_2) {
				case 2:
					quitC();
					break;

				case 3:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				default:
					quitC();
				}
				}
				else
					quitC();
			}
			else if(fifty_by_fifty==1) {
				System.out.println("\n  50/50 has been Exhausted,Please choose one of them!!");
				System.out.println(" 1. Audience pool\n  2. Swap");
				int lifeline_opt = sc.nextInt();
				if(lifeline_opt==1) {
					audience_pool++;
					System.out.println(q5 + "\n  " + "1.France-10%\n  2.USA-9%\n  3.Italy-60%\n  4.Spain-21%");
					int ans5_3 = sc.nextInt();
					switch (ans5_3) {
					case 1:
						quitC();
						break;
					case 2:
						quitC();
						break;
					case 3:
						count++;
						System.out.println("Congrulations you got one point!");
						break;
					case 4:
						quitC();
						break;
					default:
						quitC();
					}
				}
				else if (lifeline_opt == 2) {
					swap++;
					System.out.println("Q5."+q11+"\n  "+o11);
					swapQ();
				
				}
				else
					quitC();
			}
			else if(audience_pool==1) {
				System.out.println("\n   Audience pool has been Exhausted,Please choose one of them!!");
				System.out.println("  1. 50/50\n  2. Swap");
				int lifeline_opt = sc.nextInt();
				if(lifeline_opt==1) {
					fifty_by_fifty++;
					System.out.println(q5 + "\n" + "   2.USA  3.Italy");
					System.out.println("Now choose correct option among two options:");
					int ans5_4= sc.nextInt();
					switch (ans5_4) {
					case 2:
						quitC();
						break;

					case 3:
						count++;
						System.out.println("Congrulations you got one point!");
						break;
					default:
						quitC();
					}
				}
				else if (lifeline_opt == 2) {
					swap++;
					System.out.println("Q5."+q11+"\n  "+o11);
					swapQ();
				}
				else
					quitC();
			}
			else if(swap==1) {
				System.out.println("\n   Swap has been Exhausted,Please choose one of them!!");
				System.out.println("  1. 50/50\n  2. Audience pool");
				int lifeline_opt = sc.nextInt();
				if(lifeline_opt==1) {
					fifty_by_fifty++;
					System.out.println(q5 + "\n" + "   2.USA  3.Italy");
					System.out.println("Now choose correct option among two options:");
					int ans5_5= sc.nextInt();
					switch (ans5_5) {
					case 2:
						quitC();
						break;

					case 3:
						count++;
						System.out.println("Congrulations you got one point!");
						break;
					default:
						quitC();
					}
				}
				else if (lifeline_opt == 2) {
					audience_pool++;
					System.out.println(q5 + "\n  " + "1.France-10%\n  2.USA-9%\n  3.Italy-60%\n  4.Spain-21%");
					int ans5_6 = sc.nextInt();
					switch (ans5_6) {
					case 1:
						quitC();
						break;
					case 2:
						quitC();
						break;
					case 3:
						count++;
						System.out.println("Congrulations you got one point!");
						break;
					case 4:
						quitC();
						break;
					default:
						quitC();
					}
				}
				else
					quitC();
			}
			
			else {
			System.out.println("Choose One Of Them:");
			System.out.println("  1. 50/50\n  2. Audience pool\n  3. Swap");
			int lifeline_opt = sc.nextInt();
			switch(lifeline_opt) {
			case 1:
				fifty_by_fifty++;
				System.out.println(q5 + "\n" + "   2.USA  3.Italy");
				System.out.println("Now choose correct option among two options:");
				int ans5_7= sc.nextInt();
				switch (ans5_7) {
				case 2:
					quitC();
					break;

				case 3:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				default:
					quitC();
				}
				break;
			case 2:
				audience_pool++;
				System.out.println(q5 + "\n  " + "1.France-10%\n  2.USA-9%\n  3.Italy-60%\n  4.Spain-21%");
				int ans5_8 = sc.nextInt();
				switch (ans5_8) {
				case 1:
					quitC();
					break;
				case 2:
					quitC();
					break;
				case 3:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				case 4:
					quitC();
					break;
				default:
					quitC();
				}	
				break;
			case 3:
				swap++;
				System.out.println("Q5."+q11+"\n  "+o11);
				swapQ();
				break;
			default:
				quitC();
				
				}	
			}
		}
			
			
		else if(ans5==6) {
			quit++;
			System.out.println("\n Quiz completed!Your total marks are " + count + " out of 10 marks.");
			System.out.println("<-------------------------------------------------------------------->");
			System.out.println("\t\tThanks for taking the Quiz Challenge!");
		}
		else
			quitC();
			
				
	}
}
	public void que6() {
		Scanner sc = new Scanner(System.in);
		if(fifty_by_fifty==1 && audience_pool==1 && swap==1) {
			int ans_6 = sc.nextInt();
			switch(ans_6) {
			case 1:
				quitC();
				break;
			case 2:
				quitC();
				break;
			case 3:
				count++;
				System.out.println("Congrulations you got one point!");
				break;
			case 4:
				quitC();
				break;
			case 5:
				quit++;
				System.out.println("\n Quiz completed!Your total marks are " + count + " out of 10 marks.");
				System.out.println("<-------------------------------------------------------------------->");
				System.out.println("\t\tThanks for taking the Quiz Challenge!");
				break;
				
			default:
				quitC();
				
			}
		}
		else {
		int ans6 = sc.nextInt();
		if(ans6==1)
			quitC();
		else if(ans6==2) {
			quitC();
		}
		else if(ans6==3) {
			count++;
		System.out.println("Congrulations you got one point!");}
		else if(ans6==4)
			quitC();
		else if(ans6==5)
		{
			if(fifty_by_fifty==1 && audience_pool==1) {
				System.out.println("\n   First and Second option has been Exhausted,Please choose another option!");
				System.out.println("  1. Swap");
				int lifeline_opt = sc.nextInt();
				if(lifeline_opt==1) {
				swap++;
				System.out.println("Q6."+q11+"\n  "+o11);
				swapQ();
				}
				else
					quitC();
			}
			else if(fifty_by_fifty==1 && swap==1) {
				System.out.println("\n   First and Third option has been Exhausted,Please choose another option!");
				System.out.println("  1. Audience pool");
				int lifeline_opt = sc.nextInt();
				if(lifeline_opt==1) {
				audience_pool++;
				System.out.println(q6 + "\n  " + "1.5-10%\n  2.6-9%\n  3.7-60%\n  4.8-21%");
				int ans6_1 = sc.nextInt();
				switch (ans6_1) {
				case 1:
					quitC();
					break;
				case 2:
					quitC();
					break;
				case 3:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				case 4:
					quitC();
					break;
				default:
					quitC();
				}
				}
				else
					quitC();
			}
			else if(audience_pool==1 && swap==1) {
			
				System.out.println("\n   Second and Third option has been Exhausted,Please choose another option!");
				System.out.println("  1. 50/50");
				int lifeline_opt = sc.nextInt();
				if(lifeline_opt==1) {
				fifty_by_fifty++;
				System.out.println(q6 + "\n" + "   2.6  3.7");
				System.out.println("Now choose correct option among two options:");
				int ans6_2= sc.nextInt();
				switch (ans6_2) {
				case 2:
					quitC();
					break;

				case 3:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				default:
					quitC();
				}
				}
				else
					quitC();
			}
			else if(fifty_by_fifty==1) {
				System.out.println("\n  50/50 has been Exhausted,Please choose one of them!!");
				System.out.println("  1. Audience pool\n  2. Swap");
				int lifeline_opt = sc.nextInt();
				if(lifeline_opt==1) {
					audience_pool++;
					System.out.println(q6 + "\n  " + "1.5-10%\n  2.6-9%\n  3.7-60%\n  4.8-21%");
					int ans6_3 = sc.nextInt();
					switch (ans6_3) {
					case 1:
						quitC();
						break;
					case 2:
						quitC();
						break;
					case 3:
						count++;
						System.out.println("Congrulations you got one point!");
						break;
					case 4:
						quitC();
						break;
					default:
						quitC();
					}
				}
				else if (lifeline_opt == 2) {
					swap++;
					System.out.println("Q6."+q11+"\n  "+o11);
					swapQ();
				
				}
				else
					quitC();
			}
			else if(audience_pool==1) {
				System.out.println("\n   Audience pool has been Exhausted,Please choose one of them!!");
				System.out.println("  1. 50/50\n  2. Swap");
				int lifeline_opt = sc.nextInt();
				if(lifeline_opt==1) {
					fifty_by_fifty++;
					System.out.println(q6 + "\n" + "   2.6  3.7");
					System.out.println("Now choose correct option among two options:");
					int ans6_4= sc.nextInt();
					switch (ans6_4) {
					case 2:
						quitC();
						break;

					case 3:
						count++;
						System.out.println("Congrulations you got one point!");
						break;
					default:
						quitC();
					}
				}
				else if (lifeline_opt == 2) {
					swap++;
					System.out.println("Q6."+q11+"\n  "+o11);
					swapQ();
				}
				else
					quitC();
			}
			else if(swap==1) {
				System.out.println("\n   Swap has been Exhausted,Please choose one of them!!");
				System.out.println("  1. 50/50\n  2. Audience pool");
				int lifeline_opt = sc.nextInt();
				if(lifeline_opt==1) {
					fifty_by_fifty++;
					System.out.println(q6 + "\n" + "   2.6  3.7");
					System.out.println("Now choose correct option among two options:");
					int ans6_5= sc.nextInt();
					switch (ans6_5) {
					case 2:
						quitC();
						break;

					case 3:
						count++;
						System.out.println("Congrulations you got one point!");
						break;
					default:
						quitC();
					}
				}
				else if (lifeline_opt == 2) {
					audience_pool++;
					System.out.println(q6 + "\n  " + "1.5-10%\n  2.6-9%\n  3.7-60%\n  4.8-21%");
					int ans6_6 = sc.nextInt();
					switch (ans6_6) {
					case 1:
						quitC();
						break;
					case 2:
						quitC();
						break;
					case 3:
						count++;
						System.out.println("Congrulations you got one point!");
						break;
					case 4:
						quitC();
						break;
					default:
						quitC();
					}
				}
				else
					quitC();
			}
			
			else {
			System.out.println("Choose One Of Them:");
			System.out.println("  1. 50/50\n  2. Audience pool\n  3. Swap");
			int lifeline_opt = sc.nextInt();
			switch(lifeline_opt) {
			case 1:
				fifty_by_fifty++;
				System.out.println(q6 + "\n" + "   2.6  3.7");
				System.out.println("Now choose correct option among two options:");
				int ans6_7= sc.nextInt();
				switch (ans6_7) {
				case 2:
					quitC();
					break;

				case 3:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				default:
					quitC();
				}
				break;
			case 2:
				audience_pool++;
				System.out.println(q6 + "\n  " + "1.5-10%\n  2.6-9%\n  3.7-60%\n  4.8-21%");
				int ans6_8 = sc.nextInt();
				switch (ans6_8) {
				case 1:
					quitC();
					break;
				case 2:
					quitC();
					break;
				case 3:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				case 4:
					quitC();
					break;
				default:
					quitC();
				}	
				break;
			case 3:
				swap++;
				System.out.println("Q6."+q11+"\n  "+o11);
				swapQ();
				break;
			default:
				quitC();
				
				}	
			}
		}
			
			
		else if(ans6==6) {
			quit++;
			System.out.println("\n Quiz completed!Your total marks are " + count + " out of 10 marks.");
			System.out.println("<-------------------------------------------------------------------->");
			System.out.println("\t\tThanks for taking the Quiz Challenge!");
		}
		else
			quitC();
			
				
	}
}	public void que7() {
	Scanner sc = new Scanner(System.in);
	if(fifty_by_fifty==1 && audience_pool==1 && swap==1) {
		int ans_7 = sc.nextInt();
		switch(ans_7) {
		case 1:
			quitC();
			break;
		case 2:
			count++;
			System.out.println("Congrulations you got one point!");
			break;
		case 3:
			quitC();
			break;
		case 4:
			quitC();
			break;
		case 5:
			quit++;
			System.out.println("\n Quiz completed!Your total marks are " + count + " out of 10 marks.");
			System.out.println("<-------------------------------------------------------------------->");
			System.out.println("\t\tThanks for taking the Quiz Challenge!");
			break;
			
		default:
			quitC();
			
		}
	}
	else {
	int ans7 = sc.nextInt();
	if(ans7==1)
		quitC();
	else if(ans7==2) {
		quitC();
	}
	else if(ans7==3) {
		count++;
	System.out.println("Congrulations you got one point!");}
	else if(ans7==4)
		quitC();
	else if(ans7==5)
	{
		if(fifty_by_fifty==1 && audience_pool==1) {
			System.out.println("\n   First and Second option has been Exhausted,Please choose another option!");
			System.out.println("  1. Swap");
			int lifeline_opt = sc.nextInt();
			if(lifeline_opt==1) {
			swap++;
			System.out.println("Q7."+q11+"\n  "+o11);
			swapQ();
			}
			else
				quitC();
		}
		else if(fifty_by_fifty==1 && swap==1) {
			System.out.println("\n   First and Third option has been Exhausted,Please choose another option!");
			System.out.println("  1. Audience pool");
			int lifeline_opt = sc.nextInt();
			if(lifeline_opt==1) {
			audience_pool++;
			System.out.println(q7 + "\n  " + "1.90°C-10%\n  2.100°C-60%\n  3.110°C-9%\n  4.120°C-21%");
			int ans7_1 = sc.nextInt();
			switch (ans7_1) {
			case 1:
				quitC();
				break;
			case 2:
				count++;
				System.out.println("Congrulations you got one point!");
				break;
			case 3:
				quitC();
				break;
			case 4:
				quitC();
				break;
			default:
				quitC();
			}
			}
			else
				quitC();
		}
		else if(audience_pool==1 && swap==1) {
		
			System.out.println("\n   Second and Third option has been Exhausted,Please choose another option!");
			System.out.println("  1. 50/50");
			int lifeline_opt = sc.nextInt();
			if(lifeline_opt==1) {
			fifty_by_fifty++;
			System.out.println(q7 + "\n" + "   2.100°C  3.110°C");
			System.out.println("Now choose correct option among two options:");
			int ans7_2= sc.nextInt();
			switch (ans7_2) {
			case 3:
				quitC();
				break;

			case 2:
				count++;
				System.out.println("Congrulations you got one point!");
				break;
			default:
				quitC();
			}
			}
			else
				quitC();
		}
		else if(fifty_by_fifty==1) {
			System.out.println("\n  50/50 has been Exhausted,Please choose one of them!!");
			System.out.println("  1. Audience pool\n  2. Swap");
			int lifeline_opt = sc.nextInt();
			if(lifeline_opt==1) {
				audience_pool++;
				System.out.println(q7 + "\n  " + "1.90°C-10%\n  2.100°C-60%\\n  3.110°C-9%\\n  4.120°C-21%");
				int ans7_3 = sc.nextInt();
				switch (ans7_3) {
				case 1:
					quitC();
					break;
				case 2:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				case 3:
					quitC();
					break;
				case 4:
					quitC();
					break;
				default:
					quitC();
				}
			}
			else if (lifeline_opt == 2) {
				swap++;
				System.out.println("Q7."+q11+"\n  "+o11);
				swapQ();
			
			}
			else
				quitC();
		}
		else if(audience_pool==1) {
			System.out.println("\n   Audience pool has been Exhausted,Please choose one of them!!");
			System.out.println("  1. 50/50\n  2. Swap");
			int lifeline_opt = sc.nextInt();
			if(lifeline_opt==1) {
				fifty_by_fifty++;
				System.out.println(q7 + "\n" + "   2.100°C  3.110°C");
				System.out.println("Now choose correct option among two options:");
				int ans7_4= sc.nextInt();
				switch (ans7_4) {
				case 3:
					quitC();
					break;

				case 2:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				default:
					quitC();
				}
			}
			else if (lifeline_opt == 2) {
				swap++;
				System.out.println("Q7."+q11+"\n  "+o11);
				swapQ();
			}
			else
				quitC();
		}
		else if(swap==1) {
			System.out.println("\n   Swap has been Exhausted,Please choose one of them!!");
			System.out.println("  1. 50/50\n  2. Audience pool");
			int lifeline_opt = sc.nextInt();
			if(lifeline_opt==1) {
				fifty_by_fifty++;
				System.out.println(q7 + "\n" + "   2.100°C  3.110°C");
				System.out.println("Now choose correct option among two options:");
				int ans7_5= sc.nextInt();
				switch (ans7_5) {
				case 3:
					quitC();
					break;

				case 2:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				default:
					quitC();
				}
			}
			else if (lifeline_opt == 2) {
				audience_pool++;
				System.out.println(q7 + "\n  " + "1.90°C-10%\n  2.100°C-60%\\n  3.110°C-9%\\n  4.120°C-21%");
				int ans7_6 = sc.nextInt();
				switch (ans7_6) {
				case 1:
					quitC();
					break;
				case 2:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				case 3:
					quitC();
					break;
				case 4:
					quitC();
					break;
				default:
					quitC();
				}
			}
			else
				quitC();
		}
		
		else {
		System.out.println("Choose One Of Them:");
		System.out.println("  1. 50/50\n  2. Audience pool\n  3. Swap");
		int lifeline_opt = sc.nextInt();
		switch(lifeline_opt) {
		case 1:
			fifty_by_fifty++;
			System.out.println(q7 + "\n" + "   2.100°C  3.110°C");
			System.out.println("Now choose correct option among two options:");
			int ans7_7= sc.nextInt();
			switch (ans7_7) {
			case 3:
				quitC();
				break;

			case 2:
				count++;
				System.out.println("Congrulations you got one point!");
				break;
			default:
				quitC();
			}
			break;
		case 2:
			audience_pool++;
			System.out.println(q7 + "\n  " + "1.90°C-10%\n  2.100°C-60%\\n  3.110°C-9%\\n  4.120°C-21%");
			int ans7_8 = sc.nextInt();
			switch (ans7_8) {
			case 1:
				quitC();
				break;
			case 2:
				count++;
				System.out.println("Congrulations you got one point!");
				break;
			case 3:
				quitC();
				break;
			case 4:
				quitC();
				break;
			default:
				quitC();
			}	
			break;
		case 3:
			swap++;
			System.out.println("Q7."+q11+"\n  "+o11);
			swapQ();
			break;
		default:
			quitC();
			
			}	
		}
	}
		
		
	else if(ans7==6) {
		quit++;
		System.out.println("\n Quiz completed!Your total marks are " + count + " out of 10 marks.");
		System.out.println("<-------------------------------------------------------------------->");
		System.out.println("\t\tThanks for taking the Quiz Challenge!");
	}
	else
		quitC();
		
			
}
}
public void que8() {
	Scanner sc = new Scanner(System.in);
	if(fifty_by_fifty==1 && audience_pool==1 && swap==1) {
		int ans_8 = sc.nextInt();
		switch(ans_8) {
		case 1:
			count++;
			System.out.println("Congrulations you got one point!");
			break;
		case 2:
			quitC();
			break;
		case 3:
			quitC();
			break;
		case 4:
			quitC();
			break;
		case 5:
			quit++;
			System.out.println("\n Quiz completed!Your total marks are " + count + " out of 10 marks.");
			System.out.println("<-------------------------------------------------------------------->");
			System.out.println("\t\tThanks for taking the Quiz Challenge!");
			break;
			
		default:
			quitC();
			
		}
	}
	else {
	int ans8 = sc.nextInt();
	if(ans8==1) {
		count++;
	System.out.println("Congrulations you got one point!");}
	else if(ans8==2) {
		quitC();
	}
	else if(ans8==3) {
		quitC();}
	else if(ans8==4)
		quitC();
	else if(ans8==5)
	{
		if(fifty_by_fifty==1 && audience_pool==1) {
			System.out.println("\n   First and Second option has been Exhausted,Please choose another option!");
			System.out.println("  1. Swap");
			int lifeline_opt = sc.nextInt();
			if(lifeline_opt==1) {
			swap++;
			System.out.println("Q8."+q11+"\n  "+o11);
			swapQ();
			}
			else
				quitC();
		}
		else if(fifty_by_fifty==1 && swap==1) {
			System.out.println("\n   First and Third option has been Exhausted,Please choose another option!");
			System.out.println("  1. Audience pool");
			int lifeline_opt = sc.nextInt();
			if(lifeline_opt==1) {
			audience_pool++;
			System.out.println(q8 + "\n  " + "1.Oxygen-60%\n  2.Gold-9%\n  3.Silver-10%\n  4.Hydrogen-21%");
			int ans8_1 = sc.nextInt();
			switch (ans8_1) {
			case 1:
				count++;
				System.out.println("Congrulations you got one point!");
				break;
			case 2:
				quitC();
				break;
			case 3:
				quitC();
				break;
			case 4:
				quitC();
				break;
			default:
				quitC();
			}
			}
			else
				quitC();
		}
		else if(audience_pool==1 && swap==1) {
		
			System.out.println("\n   Second and Third option has been Exhausted,Please choose another option!");
			System.out.println("  1. 50/50");
			int lifeline_opt = sc.nextInt();
			if(lifeline_opt==1) {
			fifty_by_fifty++;
			System.out.println(q8 + "\n" + "   1.Oxygen  3.Silver");
			System.out.println("Now choose correct option among two options:");
			int ans8_2= sc.nextInt();
			switch (ans8_2) {
			case 3:
				quitC();
				break;

			case 1:
				count++;
				System.out.println("Congrulations you got one point!");
				break;
			default:
				quitC();
			}
			}
			else
				quitC();
		}
		else if(fifty_by_fifty==1) {
			System.out.println("\n  50/50 has been Exhausted,Please choose one of them!!");
			System.out.println("  1. Audience pool\n  2. Swap");
			int lifeline_opt = sc.nextInt();
			if(lifeline_opt==1) {
				audience_pool++;
				System.out.println(q8 + "\n  " + "1.Oxygen-60%\n  2.Gold-9%\n  3.Silver-10%\n  4.Hydrogen-21%");
				int ans8_3 = sc.nextInt();
				switch (ans8_3) {
				case 1:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				case 2:
					quitC();
					break;
				case 3:
					quitC();
					break;
				case 4:
					quitC();
					break;
				default:
					quitC();
				}
			}
			else if (lifeline_opt == 2) {
				swap++;
				System.out.println("Q8."+q11+"\n  "+o11);
				swapQ();
			
			}
			else
				quitC();
		}
		else if(audience_pool==1) {
			System.out.println("\n   Audience pool has been Exhausted,Please choose one of them!!");
			System.out.println("  1. 50/50\n  2. Swap");
			int lifeline_opt = sc.nextInt();
			if(lifeline_opt==1) {
				fifty_by_fifty++;
				System.out.println(q8 + "\n" + "   1.Oxygen  3.Silver");
				System.out.println("Now choose correct option among two options:");
				int ans8_4= sc.nextInt();
				switch (ans8_4) {
				case 3:
					quitC();
					break;

				case 1:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				default:
					quitC();
				}
			}
			else if (lifeline_opt == 2) {
				swap++;
				System.out.println("Q8."+q11+"\n  "+o11);
				swapQ();
			}
			else
				quitC();
		}
		else if(swap==1) {
			System.out.println("\n   Swap has been Exhausted,Please choose one of them!!");
			System.out.println("  1. 50/50\n  2. Audience pool");
			int lifeline_opt = sc.nextInt();
			if(lifeline_opt==1) {
				fifty_by_fifty++;
				System.out.println(q8 + "\n" + "   1.Oxygen  3.Silver");
				System.out.println("Now choose correct option among two options:");
				int ans8_5= sc.nextInt();
				switch (ans8_5) {
				case 3:
					quitC();
					break;

				case 1:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				default:
					quitC();
				}
			}
			else if (lifeline_opt == 2) {
				audience_pool++;
				System.out.println(q8 + "\n  " + "1.Oxygen-60%\n  2.Gold-9%\n  3.Silver-10%\n  4.Hydrogen-21%");
				int ans8_6 = sc.nextInt();
				switch (ans8_6) {
				case 1:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				case 2:
					quitC();
					break;
				case 3:
					quitC();
					break;
				case 4:
					quitC();
					break;
				default:
					quitC();
				}
			}
			else
				quitC();
		}
		
		else {
		System.out.println("Choose One Of Them:");
		System.out.println("  1. 50/50\n  2. Audience pool\n  3. Swap");
		int lifeline_opt = sc.nextInt();
		switch(lifeline_opt) {
		case 1:
			fifty_by_fifty++;
			System.out.println(q8 + "\n" + "   1.Oxygen  3.Silver");
			System.out.println("Now choose correct option among two options:");
			int ans8_7= sc.nextInt();
			switch (ans8_7) {
			case 3:
				quitC();
				break;

			case 1:
				count++;
				System.out.println("Congrulations you got one point!");
				break;
			default:
				quitC();
			}
			break;
		case 2:
			audience_pool++;
			System.out.println(q8 + "\n  " + "1.Oxygen-60%\n  2.Gold-9%\n  3.Silver-10%\n  4.Hydrogen-21%");
			int ans8_8 = sc.nextInt();
			switch (ans8_8) {
			case 1:
				count++;
				System.out.println("Congrulations you got one point!");
				break;
			case 2:
				quitC();
				break;
			case 3:
				quitC();
				break;
			case 4:
				quitC();
				break;
			default:
				quitC();
			}	
			break;
		case 3:
			swap++;
			System.out.println("Q8."+q11+"\n  "+o11);
			swapQ();
			break;
		default:
			quitC();
			
			}	
		}
	}
		
		
	else if(ans8==6) {
		quit++;
		System.out.println("\n Quiz completed!Your total marks are " + count + " out of 10 marks.");
		System.out.println("<-------------------------------------------------------------------->");
		System.out.println("\t\tThanks for taking the Quiz Challenge!");
	}
	else
		quitC();
		
			
}
}
public void que9() {
	Scanner sc = new Scanner(System.in);
	if(fifty_by_fifty==1 && audience_pool==1 && swap==1) {
		int ans_9 = sc.nextInt();
		switch(ans_9) {
		case 1:
			quitC();
			break;
		case 2:
			count++;
			System.out.println("Congrulations you got one point!");
			break;
		case 3:
			quitC();
			break;
		case 4:
			quitC();
			break;
		case 5:
			quit++;
			System.out.println("\n Quiz completed!Your total marks are " + count + " out of 10 marks.");
			System.out.println("<-------------------------------------------------------------------->");
			System.out.println("\t\tThanks for taking the Quiz Challenge!");
			break;
			
		default:
			quitC();
			
		}
	}
	else {
	int ans9 = sc.nextInt();
	if(ans9==1) {
		quitC();}
	else if(ans9==2) {
		count++;
		System.out.println("Congrulations you got one point!");
	}
	else if(ans9==3) {
		quitC();}
	else if(ans9==4)
		quitC();
	else if(ans9==5)
	{
		if(fifty_by_fifty==1 && audience_pool==1) {
			System.out.println("\n   First and Second option has been Exhausted,Please choose another option!");
			System.out.println("  1. Swap");
			int lifeline_opt = sc.nextInt();
			if(lifeline_opt==1) {
			swap++;
			System.out.println("Q9."+q11+"\n  "+o11);
			swapQ();
			}
			else
				quitC();
		}
		else if(fifty_by_fifty==1 && swap==1) {
			System.out.println("\n   First and Third option has been Exhausted,Please choose another option!");
			System.out.println("  1. Audience pool");
			int lifeline_opt = sc.nextInt();
			if(lifeline_opt==1) {
			audience_pool++;
			System.out.println(q9 + "\n  " + "1.J.R.R. Tolkien-9%\n  2.J.K. Rowling-60%\n  3.George R.R. Martin-10%\n  4.Stephen King-21%");
			int ans9_1 = sc.nextInt();
			switch (ans9_1) {
			case 1:
				quitC();
				break;
			case 2:
				count++;
				System.out.println("Congrulations you got one point!");
				break;
			case 3:
				quitC();
				break;
			case 4:
				quitC();
				break;
			default:
				quitC();
			}
			}
			else
				quitC();
		}
		else if(audience_pool==1 && swap==1) {
		
			System.out.println("\n   Second and Third option has been Exhausted,Please choose another option!");
			System.out.println("  1. 50/50");
			int lifeline_opt = sc.nextInt();
			if(lifeline_opt==1) {
			fifty_by_fifty++;
			System.out.println(q9 + "\n" + "   1.J.R.R. Tolkien  2.J.K. Rowling");
			System.out.println("Now choose correct option among two options:");
			int ans9_2= sc.nextInt();
			switch (ans9_2) {
			case 1:
				quitC();
				break;

			case 2:
				count++;
				System.out.println("Congrulations you got one point!");
				break;
			default:
				quitC();
			}
			}
			else
				quitC();
		}
		else if(fifty_by_fifty==1) {
			System.out.println("\n  50/50 has been Exhausted,Please choose one of them!!");
			System.out.println("  1. Audience pool\n  2. Swap");
			int lifeline_opt = sc.nextInt();
			if(lifeline_opt==1) {
				audience_pool++;
				System.out.println(q9 + "\n  " + "1.J.R.R. Tolkien-9%\n  2.J.K. Rowling-60%\n  3.George R.R. Martin-10%\n  4.Stephen King-21%");
				int ans9_3 = sc.nextInt();
				switch (ans9_3) {
				case 1:
					quitC();
					break;
				case 2:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				case 3:
					quitC();
					break;
				case 4:
					quitC();
					break;
				default:
					quitC();
				}
			}
			else if (lifeline_opt == 2) {
				swap++;
				System.out.println("Q.9"+q11+"\n  "+o11);
				swapQ();
			
			}
			else
				quitC();
		}
		else if(audience_pool==1) {
			System.out.println("\n   Audience pool has been Exhausted,Please choose one of them!!");
			System.out.println("  1. 50/50\n  2. Swap");
			int lifeline_opt = sc.nextInt();
			if(lifeline_opt==1) {
				fifty_by_fifty++;
				System.out.println(q9 + "\n" + "   1.J.R.R. Tolkien  2.J.K. Rowling");
				System.out.println("Now choose correct option among two options:");
				int ans9_4= sc.nextInt();
				switch (ans9_4) {
				case 1:
					quitC();
					break;

				case 2:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				default:
					quitC();
				}
			}
			else if (lifeline_opt == 2) {
				swap++;
				System.out.println("Q9."+q11+"\n  "+o11);
				swapQ();
			}
			else
				quitC();
		}
		else if(swap==1) {
			System.out.println("\n   Swap has been Exhausted,Please choose one of them!!");
			System.out.println("  1. 50/50\n  2. Audience pool");
			int lifeline_opt = sc.nextInt();
			if(lifeline_opt==1) {
				fifty_by_fifty++;
				System.out.println(q9 + "\n" + "   1.J.R.R. Tolkien  2.J.K. Rowling");
				System.out.println("Now choose correct option among two options:");
				int ans9_5= sc.nextInt();
				switch (ans9_5) {
				case 1:
					quitC();
					break;

				case 2:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				default:
					quitC();
				}
			}
			else if (lifeline_opt == 2) {
				audience_pool++;
				System.out.println(q9 + "\n  " + "1.J.R.R. Tolkien-9%\n  2.J.K. Rowling-60%\n  3.George R.R. Martin-10%\n  4.Stephen King-21%");
				int ans9_6 = sc.nextInt();
				switch (ans9_6) {
				case 1:
					quitC();
					break;
				case 2:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				case 3:
					quitC();
					break;
				case 4:
					quitC();
					break;
				default:
					quitC();
				}
			}
			else
				quitC();
		}
		
		else {
		System.out.println("Choose One Of Them:");
		System.out.println("  1. 50/50\n  2. Audience pool\n  3. Swap");
		int lifeline_opt = sc.nextInt();
		switch(lifeline_opt) {
		case 1:
			fifty_by_fifty++;
			System.out.println(q9 + "\n" + "   1.J.R.R. Tolkien  2.J.K. Rowling");
			System.out.println("Now choose correct option among two options:");
			int ans9_7= sc.nextInt();
			switch (ans9_7) {
			case 1:
				quitC();
				break;

			case 2:
				count++;
				System.out.println("Congrulations you got one point!");
				break;
			default:
				quitC();
			}
			break;
		case 2:
			audience_pool++;
			System.out.println(q9 + "\n  " + "1.J.R.R. Tolkien-9%\n  2.J.K. Rowling-60%\n  3.George R.R. Martin-10%\n  4.Stephen King-21%");
			int ans9_8 = sc.nextInt();
			switch (ans9_8) {
			case 1:
				quitC();
				break;
			case 2:
				count++;
				System.out.println("Congrulations you got one point!");
				break;
			case 3:
				quitC();
				break;
			case 4:
				quitC();
				break;
			default:
				quitC();
			}	
			break;
		case 3:
			swap++;
			System.out.println("Q9."+q11+"\n  "+o11);
			swapQ();
			break;
		default:
			quitC();
			
			}	
		}
	}
		
		
	else if(ans9==6) {
		quit++;
		System.out.println("\n Quiz completed!Your total marks are " + count + " out of 10 marks.");
		System.out.println("<-------------------------------------------------------------------->");
		System.out.println("\t\tThanks for taking the Quiz Challenge!");
	}
	else
		quitC();
		
			
}
}
public void que10() {
	Scanner sc = new Scanner(System.in);
	if(fifty_by_fifty==1 && audience_pool==1 && swap==1) {
		int ans_10 = sc.nextInt();
		switch(ans_10) {
		case 1:
			quitC();
			break;
		case 2:
			quitC();
			break;
		case 3:
			quitC();
			break;
		case 4:
			count++;
			System.out.println("Congrulations you got one point!");
			break;
		case 5:
			quit++;
			System.out.println("\n Quiz completed!Your total marks are " + count + " out of 10 marks.");
			System.out.println("<-------------------------------------------------------------------->");
			System.out.println("\t\tThanks for taking the Quiz Challenge!");
			break;
			
		default:
			quitC();
			
		}
	}
	else {
	int ans10 = sc.nextInt();
	if(ans10==1) {
		quitC();}
	else if(ans10==2) {
		quitC();
	}
	else if(ans10==3) {
		quitC();}
	else if(ans10==4) {
		count++;
	System.out.println("Congrulations you got one point!");
	}
	else if(ans10==5)
	{
		if(fifty_by_fifty==1 && audience_pool==1) {
			System.out.println("\n   First and Second option has been Exhausted,Please choose another option!");
			System.out.println("  1. Swap");
			int lifeline_opt = sc.nextInt();
			if(lifeline_opt==1) {
			swap++;
			System.out.println("Q10."+q11+"\n  "+o11);
			swapQ();
			}
			else
				quitC();
		}
		else if(fifty_by_fifty==1 && swap==1) {
			System.out.println("\n   First and Third option has been Exhausted,Please choose another option!");
			System.out.println("  1. Audience pool");
			int lifeline_opt = sc.nextInt();
			if(lifeline_opt==1) {
			audience_pool++;
			System.out.println(q10 + "\n  " + "1.Atlantic Ocean-9%\n  2.Indian Ocean-60%\n  3.Arctic Ocean-10%\n  4.Pacific Ocean-21%");
			int ans10_1 = sc.nextInt();
			switch (ans10_1) {
			case 1:
				quitC();
				break;
			case 2:
				quitC();
				break;
			case 3:
				quitC();
				break;
			case 4:
				count++;
				System.out.println("Congrulations you got one point!");
				break;
			default:
				quitC();
			}
			}
			else
				quitC();
		}
		else if(audience_pool==1 && swap==1) {
		
			System.out.println("\n   Second and Third option has been Exhausted,Please choose another option!");
			System.out.println("  1. 50/50");
			int lifeline_opt = sc.nextInt();
			if(lifeline_opt==1) {
			fifty_by_fifty++;
			System.out.println(q10 + "\n" + "   3.Arctic Ocean-10%  4.Pacific Ocean");
			System.out.println("Now choose correct option among two options:");
			int ans10_2= sc.nextInt();
			switch (ans10_2) {
			case 3:
				quitC();
				break;

			case 4:
				count++;
				System.out.println("Congrulations you got one point!");
				break;
			default:
				quitC();
			}
			}
			else
				quitC();
		}
		else if(fifty_by_fifty==1) {
			System.out.println("\n  50/50 has been Exhausted,Please choose one of them!!");
			System.out.println("  1. Audience pool\n  2. Swap");
			int lifeline_opt = sc.nextInt();
			if(lifeline_opt==1) {
				audience_pool++;
				System.out.println(q10 + "\n  " + "1.Atlantic Ocean-9%\n  2.Indian Ocean-60%\n  3.Arctic Ocean-10%\n  4.Pacific Ocean-21%");
				int ans10_3 = sc.nextInt();
				switch (ans10_3) {
				case 1:
					quitC();
					break;
				case 2:
					quitC();
					break;
				case 3:
					quitC();
					break;
				case 4:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				default:
					quitC();
				}
			}
			else if (lifeline_opt == 2) {
				swap++;
				System.out.println("Q.10"+q11+"\n  "+o11);
				swapQ();
			
			}
			else
				quitC();
		}
		else if(audience_pool==1) {
			System.out.println("\n   Audience pool has been Exhausted,Please choose one of them!!");
			System.out.println("  1. 50/50\n  2. Swap");
			int lifeline_opt = sc.nextInt();
			if(lifeline_opt==1) {
				fifty_by_fifty++;
				System.out.println(q10 + "\n" + "   3.Arctic Ocean-10%  4.Pacific Ocean");
				System.out.println("Now choose correct option among two options:");
				int ans10_4= sc.nextInt();
				switch (ans10_4) {
				case 3:
					quitC();
					break;

				case 4:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				default:
					quitC();
				}
			}
			else if (lifeline_opt == 2) {
				swap++;
				System.out.println("Q10."+q11+"\n  "+o11);
				swapQ();
			}
			else
				quitC();
		}
		else if(swap==1) {
			System.out.println("\n   Swap has been Exhausted,Please choose one of them!!");
			System.out.println("  1. 50/50\n  2. Audience pool");
			int lifeline_opt = sc.nextInt();
			if(lifeline_opt==1) {
				fifty_by_fifty++;
				System.out.println(q10 + "\n" + "   3.Arctic Ocean-10%  4.Pacific Ocean");
				System.out.println("Now choose correct option among two options:");
				int ans10_5= sc.nextInt();
				switch (ans10_5) {
				case 3:
					quitC();
					break;

				case 4:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				default:
					quitC();
				}
			}
			else if (lifeline_opt == 2) {
				audience_pool++;
				System.out.println(q10 + "\n  " + "1.Atlantic Ocean-9%\n  2.Indian Ocean-60%\n  3.Arctic Ocean-10%\n  4.Pacific Ocean-21%");
				int ans10_6 = sc.nextInt();
				switch (ans10_6) {
				case 1:
					quitC();
					break;
				case 2:
					quitC();
					break;
				case 3:
					quitC();
					break;
				case 4:
					count++;
					System.out.println("Congrulations you got one point!");
					break;
				default:
					quitC();
				}
			}
			else
				quitC();
		}
		
		else {
		System.out.println("Choose One Of Them:");
		System.out.println("  1. 50/50\n  2. Audience pool\n  3. Swap");
		int lifeline_opt = sc.nextInt();
		switch(lifeline_opt) {
		case 1:
			fifty_by_fifty++;
			System.out.println(q10 + "\n" + "   3.Arctic Ocean-10%  4.Pacific Ocean");
			System.out.println("Now choose correct option among two options:");
			int ans10_7= sc.nextInt();
			switch (ans10_7) {
			case 3:
				quitC();
				break;

			case 4:
				count++;
				System.out.println("Congrulations you got one point!");
				break;
			default:
				quitC();
			}
			break;
		case 2:
			audience_pool++;
			System.out.println(q10 + "\n  " + "1.Atlantic Ocean-9%\n  2.Indian Ocean-60%\n  3.Arctic Ocean-10%\n  4.Pacific Ocean-21%");
			int ans10_8 = sc.nextInt();
			switch (ans10_8) {
			case 1:
				quitC();
				break;
			case 2:
				quitC();
				break;
			case 3:
				quitC();
				break;
			case 4:
				count++;
				System.out.println("Congrulations you got one point!");
				break;
			default:
				quitC();
			}	
			break;
		case 3:
			swap++;
			System.out.println("Q10."+q11+"\n  "+o11);
			swapQ();
			break;
		default:
			quitC();
			
			}	
		}
	}
		
		
	else if(ans10==6) {
		quit++;
		System.out.println("\n Quiz completed!Your total marks are " + count + " out of 10 marks.");
		System.out.println("<-------------------------------------------------------------------->");
		System.out.println("\t\tThanks for taking the Quiz Challenge!");
	}
	else
		quitC();
		
			
}
}
}

public class Quiz {

	public static void main(String[] args) {
		
		try {
		Scanner sc = new Scanner(System.in);	
		System.out.println("\t\t\tWelcome to the Quiz Challenge");
		System.out.println("<-------------------------------------------------------------------->");
		System.out.println("Please Enter Your Details For Entering Into Quiz Challenge!\n");
		System.out.print("Enter Your Name: ");
		String name = sc.next();
		System.out.print("Enter Your Age: ");
		int age = sc.nextInt();
		System.out.print("Enter Your Gender(m/f): ");
		String gender = sc.next();
		System.out.println();
		System.out.println("\tThank You! Your information has been successfully sumbitted.");
		System.out.println("<-------------------------------------------------------------------->");
		System.out.println("Are you ready to take Quiz Challenge(If you ready then enter 1 otherwise  press 0 to exit.): ");
		int start=sc.nextInt();
		if(start==1) {
		System.out.println("About Quit Challenge:\n");
		System.out.println("  -->This quiz is designated to challenge and entertain you.");
		System.out.println("  -->This quiz have 10 General Knowledge Questions.");
		System.out.println("  -->Each question have contains six options.");
		System.out.println("  -->Each correct answer has  allocated one mark.");
		System.out.println("  -->The correct answer is within the  first four options listed.");
		System.out.println("  -->Then fifth option is Lifeline in which again it has three options.");
		System.out.println("\t  -->1.50/50");
		System.out.println("\t  -->2.Audience pool");
		System.out.println("\t  -->3.Swap");
		System.out.println("  -->Please note that each of the lifeline option should be used by only one time.");
		System.out.println("  -->Finally sixth option is Quit option");
		System.out.println("NOTE-->If you choose  wrong option,then you will automatically proceed to the exit of quiz challenge.");
		System.out.println("<-------------------------------------------------------------------->");
		System.out.println("\t\tLets dive in! All the best " + name + "!" + "\n");
		
		ChooseOption cp = new ChooseOption();
		int result=cp.count;
		System.out.println(cp.q1 + "\n\n  " + cp.o1);
		
		cp.que1();
		if (cp.quit==0) {
			System.out.println("\n" + cp.q2 + "\n\n  " + cp.o2);
			cp.que2();
		}
		if (cp.quit==0) {
			System.out.println("\n" + cp.q3 + "\n\n  " + cp.o3);
			cp.que3();
		}

		if (cp.quit==0) {
			if(cp.fifty_by_fifty==1 && cp.audience_pool==1 && cp.swap==1) {
				System.out.println("\n" + cp.q4 + "\n\n  " + "1.Elephant  2.Blue Whale  3.Giraffe  4.Hippopotamus  5.Quit");
				cp.que4();
			}
			else {
			System.out.println("\n" + cp.q4 + "\n\n  " + cp.o4);
			cp.que4();}
		}
		
		
		if (cp.quit==0) {
			if(cp.fifty_by_fifty==1 && cp.audience_pool==1 && cp.swap==1) {
				System.out.println("\n" + cp.q5 + "\n\n  " + "1.France  2.USA  3.Italy  4.Spain  5.Quit");
				cp.que5();
			}
			else {
			System.out.println("\n" + cp.q5 + "\n\n  " + cp.o5);
			cp.que5();}
		}
		
		
		if (cp.quit==0) {
			if(cp.fifty_by_fifty==1 && cp.audience_pool==1 && cp.swap==1) {
				System.out.println("\n" + cp.q6 + "\n\n  " + "1. 5  2. 6  3. 7  4. 8  5.Quit");
				cp.que6();
			}
			else {
			System.out.println("\n" + cp.q6 + "\n\n  " + cp.o6);
			cp.que6();}
		}
		
		if (cp.quit==0) {
			if(cp.fifty_by_fifty==1 && cp.audience_pool==1 && cp.swap==1) {
				System.out.println("\n" + cp.q7 + "\n\n  " + "1. 90°C  2. 100°C  3. 110°C  4. 120°C  5.Quit");
				cp.que7();
			}
			else {
			System.out.println("\n" + cp.q7 + "\n\n  " + cp.o7);
			cp.que7();}
		}
		if (cp.quit==0) {
			if(cp.fifty_by_fifty==1 && cp.audience_pool==1 && cp.swap==1) {
				System.out.println("\n" + cp.q8 + "\n\n  " + "1.Oxygen  2.Gold  3.Silver  4.Hydrogen  5.Quit");
				cp.que8();
			}
			else {
			System.out.println("\n" + cp.q8 + "\n\n  " + cp.o8);
			cp.que8();}
		}
		if (cp.quit==0) {
			if(cp.fifty_by_fifty==1 && cp.audience_pool==1 && cp.swap==1) {
				System.out.println("\n" + cp.q9 + "\n\n  " + "1. J.R.R. Tolkien  2. J.K. Rowling  3. George R.R. Martin  4. Stephen King  5.Quit");
				cp.que9();
			}
			else {
			System.out.println("\n" + cp.q9 + "\n\n  " + cp.o9);
			cp.que9();}
		}
		if (cp.quit==0) {
			if(cp.fifty_by_fifty==1 && cp.audience_pool==1 && cp.swap==1) {
				System.out.println("\n" + cp.q10 + "\n\n  " + "1. J.R.R. Tolkien  2. J.K. Rowling  3. George R.R. Martin  4. Stephen King  5.Quit");
				cp.que10();
			}
			else {
			System.out.println("\n" + cp.q10 + "\n\n  " + cp.o10);
			cp.que10();}
		}
		}
		else {
			System.out.println("You Exit Succefully");
			System.exit(0);
			
		}
		System.out.println("=============================\n" + " CERTIFICATE OF COMPLETION\n" + "=============================\n\n" + "This is to certify that\n\n" + " " + name + "\n\n" + "has successfully completed the quiz."+"\n\n" + "-----------------------------\n" + " " + "MTIET" + "\n" + "-----------------------------\n\n" + "Conducted by: " + "Akash Patel" + "\n\n" + "=============================\n");
		
		
		}
		catch(InputMismatchException e1) {
			System.out.println("Input is not valid!");
			if (args.length == 0) { 
				System.out.println("Please Relogin for entering into Quiz Challenge!");
				main(new String[]{"retry"}); }
			
			else {
				System.out.println("\n\t\t\t Quiz completed!");
				System.out.println("<-------------------------------------------------------------------->");
				System.out.println("\t\tThanks for taking the Quiz Challenge!");
			}
		
		}
		
		
	
	}
}

