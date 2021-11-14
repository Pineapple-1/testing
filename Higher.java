import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;


public class Higher{
    public static void main(String[] args) {
        int answer = higher(2, 3);
        System.out.println(answer);
    }

    public static int higher(int x , int y) {

        if(x > y){
            return x;
        }
        else{ 
            return y ;
        }       
    }
    @Test
    public void testHigher() {
        assertEquals(3,higher(2, 3));        
    }
    
}