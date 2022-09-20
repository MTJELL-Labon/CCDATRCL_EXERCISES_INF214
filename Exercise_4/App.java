import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
           //GEN NOTES:
           //.add = ADD element in the queue
           //.remove = REMOVE element in the queue
           //.size() = SHOW the SIZE of the queue
           //.peek() = SHOW the TOP OBJECT in the queue
           
           Queue<String> Students = new LinkedList<>();
        
           //Enqueue 5 of your classmates in this section
	        Students.add("Carlos Leslie Legaspi");
            Students.add("Christian Moses Bantegui");
            Students.add("Idel Lawrence Aranilla");
            Students.add("Jul Seth Mari Mercado");
            Students.add("Jeremiah Pagarigan");
            System.out.println("\nStudents Group 1: " + Students);

           //Get the size of the queue
            System.out.println("\nSize: " + Students.size());

           //Get the front of the queue
           System.out.println("\nFront: " + Students.peek());

           //Dequeue 5 of your classmates 
           Students.remove();
           Students.remove();
           Students.remove();
           Students.remove();
           Students.remove();

           //Enqueue another 5 of you classmates
           Students.add("Guansing Ivan");
           Students.add("Elaine Grace Victoria");
           Students.add("Kean Lalo");
           Students.add("Ronn Adia");
           Students.add("Tristan AngeloTenerife");   
           System.out.println("\nStudents Group 2: " + Students);

           //Get the size of the queue
           System.out.println("\nSize: " + Students.size());

          //Get the front of the queue
           System.out.println("\nFront: " + Students.peek());
                
           
    }
}
