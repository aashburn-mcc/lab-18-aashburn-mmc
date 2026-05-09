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
		DACArecipient recipient1 = new DACArecipient();
		recipient1.setAll("Mendez", "Javier", "56-3-445", "El Salvador", 2451564, 3956753, 3956840, 'M');

		DACArecipient recipient2 = new DACArecipient();
		recipient2.setAll("Garcia", "Isabella", "77-4-882", "Mexico", 2451600, 3956800, 3956900, 'F');

		DACArecipient recipient3 = new DACArecipient();
		recipient3.setAll("Mendez", "Javier", "56-3-445", "El Salvador", 2451564, 3956753, 3956840, 'M');

		System.out.println("recipient1.toString():");
		System.out.println(recipient1.toString());
		System.out.println();
		System.out.println("recipient2.toString():");
		System.out.println(recipient2.toString());
		System.out.println();
		System.out.println("recipient1.equals(recipient2): " + recipient1.equals(recipient2));
		System.out.println("recipient1.equals(recipient3): " + recipient1.equals(recipient3));
		System.out.println();
		System.out.println("recipient1.printCard():");
		System.out.println(recipient1.printCard());
		System.out.println("recipient2.printCard():");
		System.out.println(recipient2.printCard());
  }
}