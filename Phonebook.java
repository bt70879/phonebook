import java.util.ArrayList;

public class Phonebook
{
    private ArrayList<Contact> contacts = new ArrayList<Contact>();
    
   public void addContact(Contact entry)
   {
       contacts.add(entry);
       sort();
   }
   
   public void printPhonebook()
   {
       for (Contact entry : contacts)
       {
           System.out.println(entry.getName());
       }
   }
   
   public void sort()
   {
       for (int i = 0; i < contacts.size() - 1; i++)
       {
           int min = i;
           for (int j = i + 1; j <contacts.size(); j++)
           {
               String nj = contacts.get(j).getName();
               String nm = contacts.get(min).getName();
               if (nj.compareTo(nm) < 0)
               {
                   min = j;
               }
           }
           Contact temp = contacts.get(i);
           contacts.set(i, contacts.get(min));
           contacts.set(min, temp);
       }
   }
}