/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/
class Main 
{
  public static void main(String[] args) 
	{
		// Test Default Constructor
		System.out.println("=== Testing Default Constructor ===");
		DACArecipient defaultRecipient = new DACArecipient();
		System.out.println("Default Constructor Result:");
		System.out.println(defaultRecipient.toString());
		System.out.println();

		// Test Full Constructor
		System.out.println("=== Testing Full Constructor ===");
		DACArecipient recipient1 = new DACArecipient("Mendez", "Javier", "56-3-445", "El Salvador", 2451564, 3956753, 3956840, 'M');
		System.out.println("Recipient 1 (Full Constructor):");
		System.out.println(recipient1.toString());
		System.out.println();

		DACArecipient recipient2 = new DACArecipient("Garcia", "Isabella", "77-4-882", "Mexico", 2451600, 3956800, 3956900, 'F');
		System.out.println("Recipient 2 (Full Constructor):");
		System.out.println(recipient2.toString());
		System.out.println();

		DACArecipient recipient3 = new DACArecipient("Mendez", "Javier", "56-3-445", "El Salvador", 2451564, 3956753, 3956840, 'M');
		System.out.println("Recipient 3 (Full Constructor):");
		System.out.println(recipient3.toString());
		System.out.println();

		// Test equals method
		System.out.println("=== Testing Equals Method ===");
		System.out.println("recipient1.equals(recipient2): " + recipient1.equals(recipient2));
		System.out.println("recipient1.equals(recipient3): " + recipient1.equals(recipient3));
		System.out.println();

		// Test printCard method
		System.out.println("=== Testing printCard Method ===");
		System.out.println("recipient1.printCard():");
		System.out.println(recipient1.printCard());
		System.out.println("recipient2.printCard():");
		System.out.println(recipient2.printCard());
  }
}