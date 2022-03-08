package Practice;

public class ExceptionsErrors {


    public static void main(String[] args) throws Exception {

//        TODO
//WILL RUN ABOVE EXCEPTION
//        System.out.println("==== Above exception ====");
//NEW EXCEPTION
//        throw new Exception("Uh, Oh !");
//WONT RUN BELOW EXCEPTION
//        System.out.println("==== Below exception ====");


//        TODO
//        THROWS OUT OF BOUNDS EXCEPTION
//        int[] numbers = {1, 2, 3};
//        System.out.println(numbers[999]);

//          TODO
//       NO CODE RUN AFTER EXCEPTION THROWN
//        throw new Exception("Something bad happened!");
//        System.out.println("after the throw statement");


//          TODO
//        try {
//            System.out.println("Let's see...");
//            int result = 1 / 0;
//            System.out.println("I can divide by zero!");
//        } catch (ArithmeticException e) {
//            System.out.println("Math still works!");
//        }

//          TODO
//        WORK AROUND EXCEPTIONS WITH TRY/CATCH BLOCK
//        TRY CODE / IF BREAKS THEN CATCH
        try {
//            CODE TO BREAK APPLICATION / CODE STOPS AT EXCEPTION
            throw new Exception("Something broke");
//            throw new NullPointerException("Null broken");
        } catch (NullPointerException exceptionObject) {
            System.out.println("This is NullPOINTER exception");
            System.out.println(".getMessage() example = " + exceptionObject.getMessage());
            exceptionObject.printStackTrace();
        } catch (RuntimeException exceptionObject) {
            System.out.println("This is Runtime exception");
            System.out.println(".getMessage() example = " + exceptionObject.getMessage());
            exceptionObject.printStackTrace();
        }
//THROWS RUNTIME EXCEPTION, ISN'T NULLPOINT EXCEPTION ON LINE 42 THAT WAS CREATED
//VICE VERSA WITH LINE 43 UNCOMMENTED
        catch (Exception exceptionObject) {
            System.out.println("Generic exception");
            System.out.println("Generic exception example = " + exceptionObject.getMessage());
            exceptionObject.printStackTrace();
        }
//        ^ NOT SPECIFIC EXCEPTION ON LINE 42
//        WILL CATCH MOST SPECIFIC EXCEPTION
    }


}
