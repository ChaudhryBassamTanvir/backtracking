public class BackTracking {

public static void permutations(String str, int index, String perm){
if (str.length()==0) {
    System.err.println(perm);
    return;
    
}




    for (int i = 0; i < str.length(); i++) {
        
        char currChar= str.charAt(i);
    
    String newStr = str.substring(0, i ) + str.substring(i+1);


    permutations(newStr, index+1, perm+currChar);
    }



}




    public static void main(String[] args) {
      //permutations problems
      
String str= "ABC";

permutations(str, 0, "");

    }
}
