import java.util.*;
public class Watch_Store 
{
        private ArrayList<Watch> watches;
        public Watch_Store()
        {
            this.watches = new ArrayList<Watch>();
        }
        public ArrayList<Watch> getWatch() 
        {
            return watches;
        }
        public void setWatch(ArrayList<Watch> watch) 
        {
            this.watches = watch;
        }
        public void removeWatch(Watch temp)
        {
            this.watches.remove(temp);
        }
        public void addWatch(Watch temp)
        {
            this.watches.add(temp);
        }
        public String toString() 
        {
            String temp = "";
            for(int i = 0; i<watches.size();i++)
            {
                temp += watches.get(i);
            }
            return "Watch_Store\n---------------\nWatches: \n" + temp;
        }
}//end Watch_Store 
