public class App {
    public static void main(String[] args) {
  
      Stack Order = new Stack(5);
  
      // Insert new elements into the stack
      Order.push("Order #1");
      Order.push("Order #2");
      Order.push("Order #3");
      Order.push("Order #4");
  
      System.out.println("Total Orders: " + Order.size());
  
      System.out.println("Pending Order: " + Order.peek());
  
      Order.pop();
  
      System.out.println("Remaining Orders");
  
      Order.printStack();
  
      System.out.println("Pending Order: " + Order.peek());
    }
  }
