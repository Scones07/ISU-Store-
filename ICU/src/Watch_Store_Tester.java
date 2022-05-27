import java.util.*;
import javax.swing.*;
//import java.awt.*;
public class Watch_Store_Tester 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//Owner
		Watch_Store watchStore = new Watch_Store();
		Watch DATEJUST_36 = new Watch("Rolex", "NA"  ,"DATEJUST 36", "5/24/2022", "Rolex", 14100.00, 203472.00);
		Watch DATEJUST_35 = new Watch("Rolex", "NA"  ,"DATEJUST 35", "5/24/2022", "Rolex", 17500.00, 203472.00);
		Purchase purchase = new Purchase(182973,37402947,9843,"RYAN");
		watchStore.addWatch(DATEJUST_36);
		watchStore.addWatch(DATEJUST_35);

		//User
		while(true)
		{
			int code = Code();
			if(code == 1)
			{
				
			}
			else
			{
				while(true) 
				{
					Object tempOne = dropDownMenu(watchStore.getWatch());
					if(tempOne == null)
					{
						break;
					}
					int tempTwo =(mainMenu(tempOne));

					if(tempTwo == 2)
					{
						while(true)
						{
							purchase.addWatch((Watch) tempOne);
							purchase.SetCardnub(credit_card_int("Card Number"));
							purchase.setExperation(credit_card_int("Experation date"));
							purchase.setCvc(credit_card_int("cvc"));
							purchase.setName(credit_card_String("Name on card"));

							int tempThree = checkPurchase(purchase);
							if(tempThree == 2)
							{
								PurchaseComplete();
								break;
							}
							else if(tempThree == 3)
							{
								break;
							}
							purchase.PurchaseClear((Watch)tempOne);
						}
						break;

					}
					else if (tempTwo == 3)
					{
						break;
					}
					
				}
				break;
			}
		}
	}//end main
	public static Object dropDownMenu(ArrayList lst)
	{
		Object[] arr = lst.toArray();
		return JOptionPane.showInputDialog(null, "choose type", "selection", JOptionPane.QUESTION_MESSAGE, null, arr, arr[0]);
	}
	public static int mainMenu(Object tempOne)
	{
		String[] menuOption = {"View Watch", "Buy", "Exit"}; 
		return 1 + JOptionPane.showOptionDialog(JOptionPane.getRootFrame(), "" + tempOne, "mainMenu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuOption, menuOption[1]);    
	}
	public static int credit_card_int(String text)
	{
		int input = Integer.parseInt(JOptionPane.showInputDialog("Enter "+ text + ":"));
		return input;
	}
	public static String credit_card_String(String text)
	{
		String input = JOptionPane.showInputDialog("Enter "+ text + ":");
		return input;
	}
	public static int checkPurchase(Object temp)
	{
		String[] menuOption = {"Renter card", "Confrim & Buy","Cancel",}; 
		return 1 + JOptionPane.showOptionDialog(JOptionPane.getRootFrame(), "Check if data is right\n" + temp, "Confrim & Buy", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuOption, menuOption[1]);    
	}
	public static void PurchaseComplete()
	{
		JFrame parent = new JFrame();
		JOptionPane.showMessageDialog(parent, "Purchase Complete");
	}

	//Owner
	public static int Code()
	{
		int input = Integer.parseInt(JOptionPane.showInputDialog("Enter The code or type any number to go to store"));
		return input;
	}
}//end class

