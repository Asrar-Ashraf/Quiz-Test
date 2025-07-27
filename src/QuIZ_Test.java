import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuIZ_Test {
        Scanner scanner = new Scanner(System.in);
        File file = new File("F:/quizresult.txt");
         ArrayList<String> result_Key = new ArrayList<>();
         ArrayList<String> user_Result = new ArrayList<>();
         ArrayList<String> final_result = new ArrayList<>();
         ArrayList<String> false_result = new ArrayList<>();
        int count = 0;
        int false_count = 0;



    void key_Result(){
                result_Key.add("To Locate the exe files (.exe)");
                result_Key.add("ames Gosling");
                result_Key.add("Compile time polymorphism");
                result_Key.add("Floating-point value assigned to an integer type");
                result_Key.add(".class");
                result_Key.add("OutOfMemoryError");
                result_Key.add("java.lang");
                result_Key.add("34");
                result_Key.add("Collection of interfaces and classes");
                result_Key.add("It can have static members");
                result_Key.add("try");
                result_Key.add("Accessible only within the same class");
                result_Key.add("Automatic memory management");
                result_Key.add("Compile-time error");
                result_Key.add("ALl of Above");
                result_Key.add("Through public methods of the superclass");
                result_Key.add("public class Outer{ static class Inner {} }");
                result_Key.add("final");
                result_Key.add("External inner class");
                result_Key.add("Object class");
        }
        void question1(){
        System.out.println("Write the right word not Written the A , B , C\nif written A,B,C the result is wrong.");
        System.out.println("Question Number 1: ");
        System.out.println(" What is the purpose of the PATH environment variable in Java?");
        System.out.println("""
                A.To locate Java libraries \s
                B.To store Java bytecode \s
                C. To Locate the exe files (.exe) \s
                D.To optimize Java code\s""");
        System.out.print("Correct Answer: ");
        String result = scanner.nextLine();
        user_Result.add(result);

        System.out.println();
}


        void question2(){
                System.out.println("Question Number 2: ");
                System.out.println("Who invented Java Programming?");
                System.out.println("""
                        A.Guido van Rossum \s
                        B.James Gosling\s
                        C. Dennis Ritchie \s
                        D.Bjarne Stroustrup\s""");
                System.out.print("Correct Answer: ");
                String result = scanner.nextLine();
                user_Result.add(result);
                System.out.println();
        }



        void question3(){
                System.out.println("Question Number 3: ");
                System.out.println(" Which of the following is a type of polymorphism in Java Programming?");
                System.out.println("""
                        A.Multiple polymorphism \s
                        B.Compile time polymorphism\s
                        C. Multilevel polymorphism \s
                        D.Execution time polymorphism\s""");
                System.out.print("Correct Answer: ");
                String result = scanner.nextLine();
                user_Result.add(result);
                System.out.println();
        }




        void question4(){
                System.out.println("Question Number 4: ");
                System.out.println("What is Truncation in Java?");
                System.out.println("""
                        A.Floating-point value assigned to a Floating type \s
                        B.Integer value assigned to floating type\s
                        C. Integer value assigned to floating type \s
                        D.Floating-point value assigned to an integer type\s""");
                System.out.print("Correct Answer: ");
                String result = scanner.nextLine();
                user_Result.add(result);
                System.out.println();
        }



        void question5(){
                System.out.println("Question Number 5: ");
                System.out.println("What is the extension of compiled java classes?");
                System.out.println("""
                        A. .txt
                        B. .js
                        C. .class \s
                        D..java""");
                System.out.print("Correct Answer: ");
                String result = scanner.nextLine();
                user_Result.add(result);
                System.out.println();

        }



        void question6(){
                System.out.println("Question Number 6: ");
                System.out.println("Which exception is thrown when java is out of memory?");
                System.out.println("""
                        A. MemoryFullException
                        B. OutOfMemoryError
                        C. MemoryError \s
                        D. MemoryOutOfBoundsException""");
                System.out.print("Correct Answer: ");
                String result = scanner.nextLine();
                user_Result.add(result);
                System.out.println();
        }




        void question7(){
                System.out.println("Question Number 7: ");
                System.out.println("Which of these packages contains the error StackOverflowError in Java?");
                System.out.println("""
                        A. java.io
                        B. java.system
                        C. java.lang\s
                        D. java.util""");
                System.out.print("Correct Answer: ");
                String result = scanner.nextLine();
                user_Result.add(result);
                System.out.println();
        }




        void question8(){
                System.out.println("Question Number 8: ");
                System.out.println("Output of this code: \n a=10; b=a++ + ++a + a--");
                System.out.println("""
                        A. 22
                        B. 12
                        C. 34\s
                        D. none""");
                System.out.print("Correct Answer: ");
                String result = scanner.nextLine();
                user_Result.add(result);
                System.out.println();
        }



        void question9(){
                System.out.println("Question Number 9: ");
                System.out.println("What is the correct definition of a package?");
                System.out.println("""
                        A. Collection of classes
                        B. Collection of editing tools
                        C. Collection of interfaces
                        D. Collection of interfaces and classes
                        """);
                System.out.print("Correct Answer: ");
                String result = scanner.nextLine();
                user_Result.add(result);
                System.out.println();
        }





        void question10(){
                System.out.println("Question Number 10: ");
                System.out.println("Which of the following is NOT a feature of an inner class?");
                System.out.println("""
                        A. It can access members of its outer class
                        B. It can have static members
                        C. It can be private, public, or protected
                        D. It can extend another class
                        """);
                System.out.print("Correct Answer: ");
                String result = scanner.nextLine();
                user_Result.add(result);
                System.out.println();
        }




        void question11(){
                System.out.println("Question Number 11: ");
                System.out.println(" Which of these keywords are used for the block to be examined for exceptions?");
                System.out.println("""
                        A. check
                        B. throw
                        C. catch
                        D. try
                        """);
                System.out.print("Correct Answer: ");
                String result = scanner.nextLine();
                user_Result.add(result);
                System.out.println();
        }


        void question12(){
                System.out.println("Question Number 12: ");
                System.out.println("What is the visibility of private attributes in Java?");
                System.out.println("""
                        A. Accessible from anywhere
                        B. Accessible only within the same class
                        C. Accessible from subclasses
                        D. Accessible within its own package
                        """);
                System.out.print("Correct Answer: ");
                String result = scanner.nextLine();
                user_Result.add(result);
                System.out.println();
        }



        void question13(){
                System.out.println("Question Number 13: ");
                System.out.println("Which of the following is a feature of Java’s garbage collection?");
                System.out.println("""
                        A. Manual memory management
                        B. Runtime Mange
                        C. Explicit memory allocation
                        D. Automatic memory management
                        """);
                System.out.print("Correct Answer: ");
                String result = scanner.nextLine();
                user_Result.add(result);
                System.out.println();
        }




        void question14(){
                System.out.println("Question Number 14: ");
                System.out.println("In Java, what is the result of attempting to instantiate an abstract class?");
                System.out.println("""
                        A. Compile-time error
                        B. Run-time error
                        C. It creates an instance of the abstract class
                        D. It calls the constructor of the abstract class
                        """);
                System.out.print("Correct Answer: ");
                String result = scanner.nextLine();
                user_Result.add(result);
                System.out.println();
        }





        void question15(){
                System.out.println("Question Number 15: ");
                System.out.println("Which method can be used to create a deep copy of an object?");
                System.out.println("""
                        A. Cloneable interface
                        B. Run-time error
                        C. Copy constructor
                        D. ALl of Above
                        """);
                System.out.print("Correct Answer: ");
                String result = scanner.nextLine();
                user_Result.add(result);
                System.out.println();
        }




        void question16(){
                System.out.println("Question Number 16: ");
                System.out.println("In Java, how can a subclass access the private members of its superclass?");
                System.out.println("""
                        A. Directly
                        B. Through public methods of the superclass
                        C. By overriding the superclass method
                        D. By using reflection
                        """);
                System.out.print("Correct Answer: ");
                String result = scanner.nextLine();
                user_Result.add(result);
                System.out.println();
        }




        void question17(){
                System.out.println("Question Number 17: ");
                System.out.println(" Which of the following is a correct way to declare a static inner class?");
                System.out.println("""
                        A. public class Outer { static class Inner {} }
                        B. public class Outer { Inner static {} }
                        C. static class Outer { class Inner {} }
                        D. class Outer { static class Inner {} }
                        """);
                System.out.print("Correct Answer: ");
                String result = scanner.nextLine();
                user_Result.add(result);
                System.out.println();
        }




        void question18(){
                System.out.println("Question Number 18: ");
                System.out.println(" Which of the following keywords can be used to prevent method overriding?");
                System.out.println("""
                        A. static
                        B. final
                        C. abstract
                        D. virtual
                        """);
                System.out.print("Correct Answer: ");
                String result = scanner.nextLine();
                user_Result.add(result);
                System.out.println();
        }
        void question19(){
                System.out.println("Question Number 19: ");
                System.out.println(" Which of the following is NOT a type of inner class?");
                System.out.println("""
                        A. Member inner class
                        B. Local inner class
                        C. Anonymous inner class
                        D. External inner class
                        """);
                System.out.print("Correct Answer: ");
                String result = scanner.nextLine();
                user_Result.add(result);
                System.out.println();
        }


        void question20(){
                System.out.println("Question Number 20: ");
                System.out.println("Which of the following is a superclass of every class in Java?");
                System.out.println("""
                        A. Array List
                        B. Abstract class
                        C. Object class
                        D. String""");
                System.out.print("Correct Answer: ");
                String result = scanner.nextLine();
                user_Result.add(result);
                System.out.println();

        }

        void QuizResult(){
                for (int i = 0; i < result_Key.size(); i++) {
                        String temp = user_Result.get(i);
                        boolean check=true;
                    for (String s : result_Key) {
                        if (s.equalsIgnoreCase(temp)) {
                            count++;
                            final_result.add(temp);
                            check = false;
                        }
                    }
                        if (check){
                                false_result.add(temp);
                                false_count++;
                        }
                }
                System.out.println("Total Your Correct Answer = " + count);
                System.out.println("Total Your Wrong Answer =  " + false_count);
                double av =(double) count/20*100;
                System.out.println("Average of your Result = " + av);
                System.out.println("\n");
                System.out.println("\n");
                System.out.println("if you want Result Detail \n please pres 1 button");
                System.out.println("Click on 1 button or any: ");
                String no = scanner.nextLine();
            if (no.equals("1")) {
                showDetail();
            } else {
                    System.out.println("Exit...");
            }



        }
        void showDetail(){
                System.out.println("Answer Key:");
                for (String s : result_Key){
                        System.out.println(s);
                }
                System.out.println();
                System.out.println();
                System.out.println("You are Correct Answer...");
                for (String s: final_result){
                        System.out.println(s);
                }
                System.out.println();
                System.out.println();
                System.out.println("You are Wrong Answer...");
                for(String s: false_result){
                        System.out.println(s);
                }
        }
     void saveInFile(){
           try {
                   FileWriter fileWriter  = new FileWriter(file);
                   fileWriter.write("First show ALl Correct Key Answer....");
                   fileWriter.write(String.valueOf(result_Key));
                   System.out.println();
                   fileWriter.write("Second Show your Correct Answer....");
                   fileWriter.write(String.valueOf(final_result));
                   System.out.println();
                   fileWriter.write("Third show your are Wrong Answer....");
                   fileWriter.write(String.valueOf(false_result));
                   fileWriter.close();
                   System.out.println("Your are data save in File");
           }catch (Exception e){
                   System.out.println("error: " + e.getMessage());
           }
        }
}
