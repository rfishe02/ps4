
public class CLTest {

    public static void main(String[] args) {
  
        if(args != null) {
        
            if(args.length >= 1) {
            
                NB nb = new NB();
            
                // Build a space delimited input String from the command line arguments.
            
                StringBuilder sb = new StringBuilder();
                
                for(int i = 0; i < args.length; i++) {
                
                    sb.append(args[i]);
                
                    if(i < args.length-1) {
                    
                        sb.append(" ");
                        
                    }
                
                }
                
                // Print out the result from the NB getProb method.
                
                nb.getAllProb(sb.toString());
            
            }
        
        }

    }

}
