//HashMap in java is very similar to Dictionaries in Python
import java.util.HashMap;

public class hashmap {
    
    public static void main(String[] args){
        //creating a hashmap to add fictional characters and their novels/shows
        HashMap<String,String> fiction = new HashMap<String,String>();
        fiction.put("Gregory House","House M.D");
        fiction.put("Ron Swanson","Parks and Recreation");
        fiction.put("Elliot Anderson","Mr.Robot");
        fiction.put("Jay Gatsby","The Great Gatsby");
        fiction.put("Atticus Finch","To Kill a Mockingbird");
        fiction.put("Elizabeth Bennet","Pride and Prejudice");

        System.out.println("The hashmap contains "+fiction.size()+ " items");
        System.out.println("This is the hashmap right now: "+fiction);

        //I want to know which novel Elizabeth Bennet appears in, so I use HashMap<>.get() command
        System.out.println("The novel that Elizabeth Bennet appears in is: "+fiction.get("Elizabeth Bennet"));

        /* 
         * The hashmap and dictionaries are essentially _key-value pairs_
         * 1 key represents a value
         * In this case, the characters are the keys -- who refer to the novels/shows they appear in 
         */

         System.out.println("The characters (keys) we have stored are "+fiction.keySet());

         System.out.println("The novels/shows(values) they appear in are "+fiction.values());
        
         //I want to add Gandalf from LOTR series
         fiction.put("Gandalf","Lord of the Rings");
         System.out.println("After adding Gandalf, the size of the hashmap is "+fiction.size());

         //I will remove Elliot from Mr.Robot
         fiction.remove("Elliot Anderson");
         System.out.println("After removing Elliot from the hashmap, the size has become "+fiction.size());

         System.out.println("-------The hashmap right now is----------\n"+fiction);

         //finally I am clearing the hashamp
         fiction.clear();
         System.out.println("Time to clear the hashmap\n...\n Now the hashmap size is "+fiction.size());
         System.out.println("the hashmap: \t"+fiction);
    }
}
