// Java code to illustrate the contains() method
import java.util.*;

 class Hash_Table_Demo {
    public static void main(String[] args)
    {

        // Creating an empty Hashtable
        Hashtable<Integer, String> hash_table = new Hashtable<Integer, String>();

        // Mapping string values to int keys
        hash_table.put(10, "Geeks");
        hash_table.put(15, "4");
        hash_table.put(20, "Geeks");
        hash_table.put(25, "Welcomes");
        hash_table.put(30, "You");

        // Displaying the HashMap
        System.out.println("Initial Table is: " + hash_table);

        // Checking for the Value 'Geeks'
        System.out.println("Is the value 'Geeks' present? " + hash_table.contains("Geeks"));

        // Checking for the Value 'World'
        System.out.println("Is the value 'World' present? " + hash_table.contains("World"));
        System.out.println(hash_table.containsValue(10));
        System.out.println(hash_table.get(10));
        System.out.println(hash_table.containsKey(10));

    }
}
