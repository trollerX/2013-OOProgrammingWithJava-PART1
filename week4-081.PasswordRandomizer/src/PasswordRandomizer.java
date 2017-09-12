import java.util.Random;


public class PasswordRandomizer {
    // Define the variables
    private int length;
    private Random random = new Random();
    
    
    
   
    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        
    }

    public String createPassword() {
        // write code that returns a randomized password
        String alphabet = "abcdefghijklmnopqrstuwxyz";
        String password = "";  
        int i = 0;
        while(i < this.length){
            int randomCharIndex = this.random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(randomCharIndex);
            password += randomChar;
            i++;
        }
        return password;
    }
}
