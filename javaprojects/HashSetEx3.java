package stackqueue;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetEx3
{
    public static void main(String[] args)
    {
        //Creating HashSet object
 
        HashSet<String> set = new HashSet<String>();
 
        //Adding elements to HashSet
 
        set.add("BANGALORE");
 
        set.add("DELHI");
 
        set.add("CHENNAI");
 
        set.add("MUMBAI");
 
        set.add("AHMEDABAD");
 
        //getting synchronized set
 
        Set<String> syncSet = Collections.synchronizedSet(set);
    }
}

