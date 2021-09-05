import java.io.PrintStream;
import java.util.Scanner;

public class GuessingGame {

	  //Scans user input
	private static Scanner stdin = new Scanner(System.in);
	
	  //Main runs game and stores and loads binary tree
	 public static void main(String[ ] args)
	  {
	   BinaryNode<String> root;
	   BinaryNode<String> rootNode = null;
	   printTree();
	   guidelines( );
	   root = createTree1(null );
	  
	   do
	     playGame(root);
	   while (question("Do you want to play again?"));
	 
	   System.out.println("Thanks I've learnt a lot.");
	  
	   printSavedTree(rootNode);
       System.out.println();

       String str = saveBinaryTree(rootNode);
       System.out.println(str);

       BinaryNodeInterface<String> start = loadBinaryTree(str);
       System.out.println(start);
       printSavedTree(start);
	  }
	 
	  //Prints out guidelines for user
	 public static void guidelines( )
	  {
	   System.out.println("Please think of an animal or person.");
	   System.out.println("I will ask some yes/no questions to try and guess what ");
	   System.out.println("you are thinking of.");
	  }
	 
	  //Plays game by asking the user a question and updating the current node 
	 //based on the answer
	 //At the leaf receive an answer that is either right or wrong
     //If right offer options for how user should continue
	 //If wrong  expand tree by getting new question from user
	//replacing the current node with this question, and add 
	 //left & right children with the answers
	 public static void playGame(BinaryNodeInterface<String> current)
	  {
	   while (!current.isLeaf( ))
	   {
	     if (question(current.getData( )))
	      current = current.getLeftChild( );
	     else
	      current = current.getRightChild( );
	   }
	 
	   System.out.print("My guess is " + current.getData( ) + ". ");
	   if (!question("Am I right?"))
	     learnGame(current);
	   else
	     System.out.println("I knew it all along!");
	  }
	 
	// If leaf contains a wrong guess that was just made.
	 //Info from user used to make new question
	 public static void learnGame(BinaryNodeInterface<String> current)
	
	  {
	   String guess;   
	   String correctAnswer; 
	   String newQuestion;   
	   
	   // Set Strings for the guess, correct answer and a new question.
	   guess = current.getData( );
	   System.out.println("I give up. What are you? ");
	   correctAnswer = stdin.nextLine( );
	   System.out.println("Please type a yes/no question that will distinguish a");
	   System.out.println(correctAnswer + " from a " + guess + ".");
	   newQuestion = stdin.nextLine( );
	   
	   // Put the new question in the current node, and add two new children.
	   current.setData(newQuestion);
	   System.out.println("As a " + correctAnswer + ", " + newQuestion);
	   if (question("Please answer"))
	   {
	     current.setLeftChild(new BinaryNode<String>(correctAnswer, null, null));
	     current.setRightChild(new BinaryNode<String>(guess, null, null));
	   }
	   else
	   {
	     current.setLeftChild(new BinaryNode<String>(guess, null, null));
	     current.setRightChild(new BinaryNode<String>(correctAnswer, null, null));
	   }         
	  }
	 
	 //Asks user question 
	 //If denies input if invalid
	  public static boolean question(String prompt)
	  {
	   String answer;
	 
	   System.out.print(prompt + " [Y or N]: ");
	   answer = stdin.nextLine( ).toUpperCase( );
	   while (!answer.startsWith("Y") && !answer.startsWith("N"))
	   {
	  System.out.print("Invalid response. Please type Y or N: ");
	  answer = stdin.nextLine( ).toUpperCase( );
	   }
	 
	   return answer.startsWith("Y");
	  }
	 
	// Create tree by building it from the bottom:
	// Build subtree for each leaf, then build subtrees linking them together,
	// until the root is reached
		
		public static BinaryNode<String> createTree1(BinaryTree<String> tree)
		{
			 BinaryNode<String> root = null;
		      BinaryNode<String> child = null;
		      BinaryNode<String> childB = null;
		      BinaryNode<String> childC = null;
		      BinaryNode<String> childD = null;
		      BinaryNode<String> childE = null;
		      BinaryNode<String> childF = null;
		      BinaryNode<String> childG = null;
		      BinaryNode<String> childH = null;
		      BinaryNode<String> childI = null;
		      BinaryNode<String> childJ = null;
		      BinaryNode<String> childK = null;
		      BinaryNode<String> childL = null;
		      BinaryNode<String> childM = null;
		      BinaryNode<String> childN = null;
		      BinaryNode<String> childO = null;

		      final String rootquestion = "Is it an animal?";
		      final String questionB = "Is it able to fly?";
		      final String questionC = "Does it live in the city?";
		      final String questionD = "Is it larger than a truck?";
		      final String questionE = "Does it swim?";
		      final String questionF = "Are they tall?";
		      final String questionG = "Is the person on Tv?";
		      final String questionH = "Are they on a comedy show?";
		      final String questionI = "Are they on a talkshow?";
		      final String questionJ = "Do they have black hair?";
		      final String questionK = "Are they on a fantasy show?";
		      final String questionL = "Are they a musician?";
		      final String questionM = "Are they doing action?";
		      final String questionN = "Are they in movies?";
		      final String questionO = "Are they related to you?";
		      final String answerA = "Pigeon";
		      final String answerB = "Fox";
		      final String answerC = "Penguin";
		      final String answerD = "Whale";
		      final String answerE = "Dolphin";
		      final String answerF = "David Schwimmer";
		      final String answerG = "Jimmy Kimmel";
		      final String answerH = "Ellen Degeneres";
		      final String answerI = "Bryan Cranston";
		      final String answerK = "Kit Harrington";
		      final String answerL = "Jennifer Aniston";
		      final String answerM = "Kanye";
		      final String answerN = "Trump";
		      final String answerO = "Brad Pitt";
		      final String answerP = "Angelina Jolie";
		      final String answerQ = "Bestfriend";
		      final String answerR = "Brother";

		      // Create the root node with the question “Are you a mammal?”
		      root = new BinaryNode<String>(rootquestion, null, null);

		      child = new BinaryNode<String>(questionB, childC, childO);
		      root.setLeftChild(child);

		      childC = new BinaryNode<String>(questionC,null,childD);
		      childC.setLeftChild(new BinaryNode<String>(answerA, null, null));
		      child.setLeftChild(childC);

		      childO = new BinaryNode<String>(questionD,null,null);
		      childO.setLeftChild(new BinaryNode<String>(answerD,null,null));
		      childO.setRightChild(new BinaryNode<String>(answerE,null,null));
		      child.setRightChild(childO);

		      childD = new BinaryNode<String>(questionE, null, null);
		      childD.setLeftChild(new BinaryNode<String>(answerC, null, null));
		      childD.setRightChild(new BinaryNode<String>(answerB, null, null));
		      child.setRightChild(childD);

		      childB = new BinaryNode<String>(questionF, childE, childI);
		      root.setRightChild(childB);

		      childE = new BinaryNode<String>(questionG,childF,childK);
		      childB.setLeftChild(childE);

		      childF = new BinaryNode<String>(questionH,childG,childI);
		      childE.setLeftChild(childF);

		      childG = new BinaryNode<String>(questionI,childH, null);
		      childG.setRightChild(new BinaryNode<String>(answerF,null,null));
		      childF.setLeftChild(childG);

		      childH = new BinaryNode<String>(questionJ, null, null);
		      childH.setLeftChild(new BinaryNode<String>(answerG,null,null));
		      childH.setRightChild(new BinaryNode<String>(answerH,null,null));
		      childG.setLeftChild(childH);

		      childI = new BinaryNode<String>(questionM,null,childJ);
		      childI.setLeftChild(new BinaryNode<String>(answerI,null,null));
		      childF.setRightChild(childI);

		      childJ = new BinaryNode<String>(questionK,null,null);
		      childJ.setLeftChild(new BinaryNode<String>(answerK,null,null));
		      childJ.setRightChild(new BinaryNode<String>(answerL,null,null));
		     childI.setRightChild(childJ);

		      childK = new BinaryNode<String>(questionL,null,null);
		      childK.setLeftChild(new BinaryNode<String>(answerM,null,null));
		      childK.setRightChild(new BinaryNode<String>(answerN,null,null));
		      childE.setRightChild(childK);

		      childL = new BinaryNode<String>(questionM,childM,childN);
		      childB.setRightChild(childL);

		      childM = new BinaryNode<String>(questionN,null,null);
		      childM.setLeftChild(new BinaryNode<String>(answerO,null,null));
		      childM.setRightChild(new BinaryNode<String>(answerP,null,null));
		     childL.setLeftChild(childM);

		      childN = new BinaryNode<String>(questionO,null,null);
		      childN.setLeftChild(new BinaryNode<String>(answerR,null,null));
		      childN.setRightChild(new BinaryNode<String>(answerQ,null,null));
		      childL.setRightChild(childN);
		   
		   return root;
		
		}
		
		//Stores binary tree to file
		private static String saveBinaryTree(BinaryNodeInterface<String> rootNode) {
	        if (rootNode == null) {
	            return "null,";
	        }
	 
	        StringBuilder sb = new StringBuilder();
	        sb.append(rootNode.getData());
	        sb.append(",");
	 
	        sb.append(saveBinaryTree(rootNode.getLeftChild()));
	        sb.append(saveBinaryTree(rootNode.getRightChild()));
	        return sb.toString();
	    }
		
		//loads binary tree from file
		public static BinaryNodeInterface<String> loadBinaryTree(String data) {
	        String[] temp = data.split(",");
	        
	        return saveUsingCounter(temp);
	    }
		
		//loads binary tree from file
		private static BinaryNodeInterface<String> load(String[] data, int[] index) {
	        if (index[0] > data.length || data[index[0]].equals("null")) {
	            index[0]++;
	            return null;
	        }
	 
	        String z = data[index[0]++];
	        BinaryNode<String> node = new BinaryNode<String>(z);
	        node.setLeftChild(load(data, index));
	        node.setRightChild(load(data, index));
	 
	        return node;
	    }
	 
	    static int index;
	 
	  //loads binary tree from file
	    private static BinaryNode<String> saveUsingCounter(String[] data) {
	        if (index > data.length || data[index].equals("null")) {
	            index++;
	            return null;
	        }
	 
	        String v = data[index++];
	        BinaryNode<String> node = new BinaryNode<String>(v);
	        node.setLeftChild(saveUsingCounter(data));
	        node.setRightChild(saveUsingCounter(data));
	 
	        return node;
	    }
	 
	    //Prints binary tree from file
	    private static void printSavedTree(BinaryNodeInterface<String> rootNode) {
	        if (rootNode == null)
	            return;
	        System.out.print(rootNode.getData() + " ");
	        printSavedTree(rootNode.getLeftChild());
	        printSavedTree(rootNode.getRightChild());
	    }
	    
	    public static void printTree() {
	   
	    	System.out.println("\nCreating a treee that looks like this:\n");
	    	
		  	System.out.println("     A      ");
		    System.out.println("   /   \\   "); // '\\' is the escape character for backslash
		    System.out.println("  B      C   ");
		    System.out.println(" / \\   / \\");
		    System.out.println("D   E   F    G ");
		  System.out.println("/ \\ / \\ / \\ / \\ ");
		System.out.println(" H   I J  K L  M N  O");	  
	
	    }
	   
	}
