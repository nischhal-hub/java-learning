import java.io.IOException;

//custom exception
class InvalidAgeException extends RuntimeException{
    InvalidAgeException(String s){
        super(s);
    }
}
public class ErrorHandling {
    public static void ioimport() throws IOException,InvalidAgeException{
            try{
                int i = 16;
                if(i<18){
                    throw new InvalidAgeException("Age must be greater than 18.");
                }
                throw new IOException("Hello");
            }catch(IOException e){
                System.out.println("Caught exception:" + e.getMessage());
                
            }catch(InvalidAgeException e){
                System.out.println("message: " + e.getMessage());
                
            }
        }
    public static void main(String[] args) throws IOException {
        ioimport();
    }
}
