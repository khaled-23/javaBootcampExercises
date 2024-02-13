import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //day3 Q:1
        //
//        for (int i = 1; i <=100; i++) {
//
//            boolean fizz = (i%3)==0;
//            boolean buzz = (i%5)==0;
//            boolean fizzbuzz = (i%3)==0 && (i%5)==0;
//
//            if(fizz){
//                System.out.println("Fizz");
//            }
//            if(buzz){
//                System.out.println("Buzz");
//            }
//            if(fizzbuzz){
//                System.out.println("FizzBuzz");
//            }
//
//            System.out.println(i);
//        }


        //day3 Q:2 //reverse array through loop using SpringBuilder.append
        //-----------------------------------------------------------------------------------------
//        System.out.println("enter a String to be reversed");
//        StringBuilder input = new StringBuilder(s.nextLine());
//
//        StringBuilder reversedInput = new StringBuilder();
//
//        for(int i = input.length()-1; i >=0; i--){
//
//            char tempChar = input.charAt(i);
//            reversedInput.append(tempChar);
//            }
//        System.out.println("original String: " + input);
//        System.out.println("reversed string: " + reversedInput);




        //day3 Q:3 //finds the factorial number from user input
        //-----------------------------------------------------------------------------------------
//        System.out.println("enter a number to find its factorial number");
//        int input = s.nextInt();
//
//        int sum = 0;
//        int i = input;
//
//        while(i!=0){
//
//            int factorialNum = input * input-1;
//            sum = sum + factorialNum;
//            i--;
//        }
//        System.out.println("the factorial number of \"" + input + "\" is :" + sum);




        //day3 Q:4 //finds number raised to the power of another number
        //-----------------------------------------------------------------------------------------
//        System.out.println("enter a number");
//        double number = s.nextDouble();
//
//        System.out.println("enter the power number");
//        double powerNum = s.nextDouble();
//
//        double sum = 0;
//        for(int i = 0; i<powerNum; i++){
//            sum = sum+number;
//
//        }
//        System.out.println(sum);





        //day3 Q:5
        // a program asks the user to initialize array size, then promotes the user to fill the array,
        // then prints the sum of odd and even numbers separately.
        //-----------------------------------------------------------------------------------------
//        System.out.println("choose how many number you want to add");
//        int inputSize = s.nextInt();
//
//        int[] numbers = new int[inputSize];
//        int evenSum = 0;
//        int oddSum = 0;
//
//        for(int i = 0; i<numbers.length;i++){
//            System.out.println("enter number: " + (i+1) + " of " + numbers.length);
//            int temp = s.nextInt();
//            numbers[i] = temp;
//
//            if(numbers[i]%2==0){
//                evenSum = evenSum + numbers[i];
//            }else{
//                oddSum = oddSum + numbers[i];
//            }
//        }
//        System.out.println("the sum of even numbers is: " + evenSum +
//               "\nthe sum of odd numbers is :" + oddSum);



        //day3 Q:6 // takes user input to see if the number is prime or not.
        //zero is used to exit the program.
        //-----------------------------------------------------------------------------------------
//        int number;
//        do {
//            System.out.println("enter a positive number, to exit enter 0.");
//             number = s.nextInt();
//
//             //checks if the number is negative
//             if(number<0){
//                 System.out.println("only positive numbers");
//                 //continue; if i use the continue statement i may add prints(dashes) like the one at the end of do while.
//             }
//
//
//            if(number==1){
//                System.out.println("number: " + number + " is not prime" );
//
//            }else{
//                for (int j = 2; j <= number/2; j++) {
//                    if(number % j==0){
//                        System.out.println("number: " + number + " is not a prime" );
//                      break;
//                    }else {
//                        System.out.println("number: " + number + " is a prime" );
//                        break;
//                    }
//                }
//            }
//            System.out.println("-------------------------------------------------");
//
//        }while(number!=0);

        //day3 Q:7 //nested loop
        //-----------------------------------------------------------------------------------------
//        for(int i=1; i<=4; i++){
//            System.out.println("week " + i);
//
//            for (int j = 1; j <=7; j++)
//                System.out.println("day " + j);
//        }

        //day3 Q:8 //takes user input and checks if the input is palindorme or not.
        //-----------------------------------------------------------------------------------------
//        System.out.println("enter a word");
//        StringBuilder word = new StringBuilder(s.next());
//
//        int i = 0; // start at index 0
//        int j = word.length()-1; // start at the last index
//        boolean isEqual = false;
//        do{
//                char a = word.charAt(i);
//                char b = word.charAt(j);
//                isEqual = a==b;
//                if(isEqual){
//                    isEqual = true;
//                    if(i==word.length()-1 && j==0)
//                        break;
//                }else{
//                    break;
//                }
//                i++;
//                j--;
//        }while(true);
//
//        if(isEqual)
//            System.out.println("the word \"" + word + "\" is palindorme.");
//        else
//            System.out.println("the word \"" + word + "\" is not palindorme.");



    }


    }
