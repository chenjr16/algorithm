//import org.junit.Before;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//public class StackTest {
//    Stack<Customer> custStack;
//    @Before
//    public void setup(){
//        custStack  = new Stack<>();
//    }
//    @Test
//    public void testPushToEmptyStack(){
//        custStack.push(new Customer(1, "Ibrahim", 1_100_000));
//        Customer poppedCustomer = custStack.pop();
//        assertEquals("Ibrahim",poppedCustomer.getName());
//        assertEquals(1,poppedCustomer.getCustNo());
//        assertEquals(1_100_000,poppedCustomer.getBalance(), 0.0);
//    }
//    @Test
//    public void testPopShouldReturnObjectAtTopOfQueue(){
//        custStack.push(new Customer(1, "Ibrahim", 1990000));
//        custStack.push(new Customer(2, "Kathy", 5));
//        custStack.push(new Customer(3, "Terrance", 100_000));
//        custStack.push(new Customer(4, "Junru", 444));
//        Customer poppedCustomer = custStack.pop();
//        assertEquals("Junru",poppedCustomer.getName());
//        assertEquals(4,poppedCustomer.getCustNo());
//        assertEquals(444,poppedCustomer.getBalance(), 0.0);
//    }
//    @Test
//    public void testPushingNullObjectShouldNotModifyStack(){
//        custStack.push(new Customer(1, "Ibrahim", 1990000));
//        custStack.push(new Customer(2, "Kathy", 5));
//        custStack.push(new Customer(3, "Terrance", 100_000));
//        custStack.push(new Customer(4, "Junru", 444));
//        custStack.push(null);
//        Customer poppedCustomer = custStack.pop();
//        assertEquals("Junru",poppedCustomer.getName());
//    }
//    @Test
//    public void testPopEmptyStackDoesNothing(){
//        Customer poppedCustomer = custStack.pop();
//        assertEquals(null,poppedCustomer);
//    }
//
//}