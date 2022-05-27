
import java.util.ArrayList;
public class Purchase
{
    private ArrayList<Watch> basket;
    private int cardnub;
    private int experation;
    private int cvc;
    private String name;
    private int totalCost;
    public Purchase(int cardnub, int experation, int cvc, String name) 
    {
        this.cardnub = cardnub;
        this.experation = experation;
        this.cvc = cvc;
        this.name = name;
        this.basket = new ArrayList<Watch>();
    }
    public void PurchaseClear(Watch temp)
    {
        this.cardnub = 0;
        this.experation = 0;
        this.cvc = 0;
        this.name = null;
        removeWatch(temp);
    }
    public ArrayList<Watch> getBasket() 
    {
        return basket;
    }
    public void setBasket(ArrayList<Watch> basket) 
    {
        this.basket = basket;
    }
    public int getCardnub() 
    {
        return cardnub;
    }
    public void SetCardnub(int cardnub) 
    {
        this.cardnub = cardnub;
    }
    public int getExperation() 
    {
        return experation;
    }
    public void setExperation(int experation) 
    {
        this.experation = experation;
    }
    public int getCvc()
    {
        return cvc;
    }
    public void setCvc(int cvc) 
    {
        this.cvc = cvc;
    }
    public String getName() 
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void removeWatch(Watch temp)
    {
        this.basket.remove(temp);
        totalCost-=temp.getCost();
    }
    public void addWatch(Watch temp)
    {
        this.basket.add(temp);
        totalCost+=temp.getCost();
    }
    
    public String toString() 
    {
        String temp = "";
        for(int i = 0; i<basket.size();i++)
        {
            temp += basket.get(i);
        }
        return "Purchase\n------------------\nBasket:\n------------------\n" + temp + "\n----------------\nCard Nuber: " + cardnub + "\nExperation date: " + experation + "\ncvc:" + cvc
                + "\nName on card: " + name + "\n---------------------\nTotal Cost: " + totalCost;
    }
}
