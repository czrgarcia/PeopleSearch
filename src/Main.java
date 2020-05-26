import java.io.*;
public class Main {
    public static void main(String [] args)
    {
        People [] ar = new People[10];
        findNig("jenny", ar);
        System.out.println(ar[0].getAge());
    }
    public static void findNig(String search, People [] ar)
    {
        boolean found = false;
        String nextName = "";
        int nextSalary = 0;
        int nextAge = 0;

        try {

            FileReader fr = new FileReader("people.txt");
            BufferedReader br = new BufferedReader(fr);
            while(!found && (nextName = br.readLine()) != null)
            {
                if(nextName.compareTo(search)==0)
                {
                    nextAge = Integer.parseInt(br.readLine());
                    nextSalary = Integer.parseInt(br.readLine());
                    found = true;

                }
            }
        }
        catch(IOException e)
        {
            System.out.println("Error");
        }
        if(found)
        {
            People person = new People(nextName, nextAge, nextSalary);
            ar[0] = person;
        }
    }
}
