import java.util.HashMap;

public class fitra {

    public static void main(String[] args) {
     HashMap<String, Integer> people = new HashMap<String, Integer>();
     people.put("fitra", 21);
     people.put("nia", 19);
     people.put("dina", 20);
     
     for(String i: people.keySet()){
         System.out.println("key:" + i + "value:" + people.get(i));
     }
     
    }
}
