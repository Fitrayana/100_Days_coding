public class fitra {
   
    public static void main(String[] args) {
     
        String bilanganString;
        int bilanganInt;
        float bilanganFloat;
        double bilanganDouble;
        boolean booleanValue;
        
        bilanganString = "100";
        bilanganInt = Integer.parseInt(bilanganString);
        bilanganFloat = Float.parseFloat(bilanganString);
        bilanganDouble = Double.parseDouble(bilanganString);
        
        String booleanString = "true";  
        booleanValue = Boolean.parseBoolean(booleanString);
        
        System.out.println("bilangan int = " + bilanganInt);
        System.out.println("bilangan float = " + bilanganFloat);
        System.out.println("bilangan double = " + bilanganDouble);
        System.out.println("bilangan boolean = " + booleanValue);
    }
}

              
      
