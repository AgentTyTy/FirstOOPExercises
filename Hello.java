//import java.util.Scanner;

public class Hello {
    //private static int input;
	public static void main(String[] args) { 
    //     Scanner myObj = new Scanner(System.in);
    //     String userName;
    //     String sameUsername;
        
    //     System.out.println("Enter password:"); 
    //     userName = myObj.nextLine();
    //     System.out.println("Enter password again:");
    //     sameUsername = myObj.nextLine();
        
    //     if (userName.equals(sameUsername)) {
    //         System.out.println("You're in!");
    //     }
    //     else {
    //         System.out.println("You did not type the same thing twice");
    //     }

  // System.out.println ("Encrypted number" + Encrypt (5));
  //  System.out.println ("Decrypted number" + Decrypt (-274625));
    System.out.println (Encrypt ('A')) ;
    System.out.println (Encrypt ("Hello")) ;

    }

    public static char Encrypt(char encryptIn) {
    //     double returnValue = encryptIn-15;
    //     returnValue *= 7;
    //     returnValue += 5;
    //     returnValue = Math.pow(returnValue,3);
    //    return returnValue;
 
    int ascii = (int) encryptIn + 2;
    char character = (char)ascii;
    return character;

    }
    // public static double Decrypt(double decryptIn) {
    //     double returnValue = Math.cbrt(decryptIn);
    //     returnValue -= 5;
    //     returnValue = returnValue/7;
    //     returnValue += 15;
    //    return returnValue;
    // }

    public static String Encrypt(String encryptIn) {
  
  String asciiNumbers = "";    

  for (int i=0; i<encryptIn.length(); i++) {
  char character = encryptIn.charAt(i);
  char newCharacter = Encrypt(character);
  asciiNumbers = asciiNumbers + newCharacter;
}
return asciiNumbers;
      }    

}