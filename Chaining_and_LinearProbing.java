package CB_EN_U4AIE21141;
import java.util.*;

public class U4AIE21141 {
    
    class Node{

    }
    /*
     *this function is used to calculate the hash value of the given input character
     it is calculated using: ascii(char) % size
     */
    public static int hash(char ch, String a){
        //int m = 0;
        //for(int j = 0;j < a.length();j++){
        //    m = (int)a.charAt(j);
        //}
        //int index = (2 * m + 41) % (a.length());
        return (int)ch % a.length();
    }


    /*
     * this function hashes the input string and also deals with collisions using linear probing
     */
    public static void hashing_and_linear_probe(String test){
        char[] ar2 = new char[test.length()];
        
        //inserting the characters into their respective indexes if that index in the array is empty
        for(int h= 0;h < test.length();h++){
            int m = (int)test.charAt(h) % test.length();

            if((int)ar2[m] == 0){
                ar2[m] = test.charAt(h);
            }
            else{
                while((int)ar2[(m+1)%test.length()] == 0){
                    ar2[(m+1)%test.length()] = test.charAt(h);
                }
            }

        }
        
        //printing the finally hashed array
        System.out.println("The re arranged string after hashing and linear probing is ");
        for(char ele:ar2){
            System.out.print(ele);
        }
        System.out.println();
    }


    /*
     * this function is used to perform chaining on the given input string
     */
    /**
     * @param h
     */
    public static void hashing_and_chaining(String h){
        //LinkedList<char> y = new LinkedList<>();
        ArrayList<LinkedList> hashed= new ArrayList<>();
        ArrayList<Integer> indexes = new ArrayList<>();
        // we create a linked list containing possible index values
        ;
        //then we link the characters to their respective indexes calculating using the hash function
        for(int f = 0; f < h.length();f++){
            if(! indexes.contains( hash(h.charAt(f),h) )){
                /*if the program didn't come across this index before;
                then add the index to the _indexes_ array to signify that it has been come across now
                and add a linkedlist 
                */
                indexes.add( hash(h.charAt(f),h));
                LinkedList<String> y = new LinkedList<>();//creating a string linked list to store the _index_ value and its corresponding characters
                y.add(String.valueOf(hash(h.charAt(f),h)));//add the index
                y.add(String.valueOf(h.charAt(f)));//add the character corresponding to the _index_
                hashed.add(y);
            }

            else{
                /*
                 * if we have come across this index value earlier, then it is in the _indexes_ array
                 * in that case, traverse the _hashed_ array and find the linkedlist whose head value contains the _index_
                 * then add the character to the linkedlist
                 */
                for(int o = 0;o < hashed.size();o++){
                    if( hashed.get(o).getFirst() == String.valueOf( hash(h.charAt(f),h) ) ){
                        (hashed.get(o)).add(String.valueOf(h.charAt(f)));
                    }
                }

            }
        }

        //displaying the result
        System.out.println("The chained result is ");
        System.out.println(hashed);

    }

    //The main function
    public static void main(String[] args){
        String ch = "sameer";
        hashing_and_linear_probe(ch);
        hashing_and_chaining(ch);
        System.out.println("θ");
    }
}