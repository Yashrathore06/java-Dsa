import java.util.*;
public class passwordstrengthChecker {
     static String Checker(String pass ){
        boolean haslength = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean specialchar = false;

        if(pass.length()>=8)
            haslength=true;
        for(char c: pass.toCharArray()){
        if(Character.isDigit(c))
        hasDigit=true;
        else if(Character.isUpperCase(c))
        hasUpper=true;
        else
            specialchar=true;
            }
        
        if(haslength && hasDigit && hasUpper &&  specialchar  ){
        return "Strong";
        }
        else
        {   return "weak";
            }

 } 
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String pass = sc.nextLine();
        String ans = Checker(pass);
        System.out.println(ans);
        sc.close();
     }
}
