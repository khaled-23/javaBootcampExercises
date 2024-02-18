import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        //Q1
//        System.out.println("input the first number: ");
//        int num1 = s.nextInt();
//
//        System.out.println("input the second number: ");
//        int num2 = s.nextInt();
//
//        System.out.println("input the third number: ");
//        int num3 = s.nextInt();
//
//        checkSmall(num1,num2,num3);
//--------------------------------------------------------------


//        //Q2
//        System.out.println("enter a number");
//        int num = s.nextInt();
//        checkNumber(num);
//-------------------------------------------------------------

//
//        //Q3
//        System.out.println("a password must have at least eight characters");
//        System.out.println("a password consists of only letters and digit");
//        System.out.println("a password must contain at least two digit");
//
//        System.out.println("input a password (you agreeing to the above terms and condition)");
//        StringBuilder password = new StringBuilder(s.nextLine());
//
//        isPasswaordValid(password);

    }


    public static void checkSmall(int n1, int n2, int n3){
        //Q1
        boolean num1 = n1<n2 && n1<n3;
        boolean num2 = n2<n1 && n1<n3;

        if(num1){
            System.out.println("the smallest value is " + n1);
        } else if(num2) {
            System.out.println("the smallest value is " + n2);

        }else System.out.println("the smallest value is " + n3);
    }

    public static void checkNumber(int num){
        //Q2
        if(num==0){
            System.out.println("zero");
        }else if(num<0){
            System.out.println("negative");
        }else System.out.println("positive");
    }

    public static void isPasswaordValid(StringBuilder password){
        //Q3 method
        boolean isLong = password.length()>=8;
        boolean isLetterNumber = isLettersNumbers(password);
        boolean isTwoDigit = isTwoDigit(password);
        boolean digitOnly = digitOnly(password);
        boolean isValid = isLong && isLetterNumber && isTwoDigit && !digitOnly;

        if(isValid){
            System.out.println("password is valid: \"" + password + "\"");
        }else if(isLetterNumber && !isTwoDigit && isLong){
            System.out.println("password is invalid: \"" + password + "\" note: need at least two digit");
        }else if(digitOnly){
            System.out.println("password is invalid: \"" + password + "\" password can't be only digit");
        }else if(isLetterNumber && !isTwoDigit && !isLong){
            System.out.println("password is invalid: \"" + password + "\" note: need at 8 characters and two digits");
        }else if(isLetterNumber && isTwoDigit){
            System.out.println("password is invalid: \"" + password +"\" note: need at least 8 characters");
        }else if(!isLetterNumber){
            System.out.println("you can't use symbol");
        }else System.out.println("password is invalid");

    }

    public static boolean isLettersNumbers(StringBuilder password){
        //method for Q3
        //validate numbers and letters
        boolean isLettersNumbers = true;

        for(int i = 0; i<password.length(); i++){
            char temp = password.charAt(i);

            isLettersNumbers = Character.isAlphabetic(temp) || Character.isDigit(temp);

            if(!isLettersNumbers){
                break;
            }


        }
        return isLettersNumbers;
    }

    public static boolean isTwoDigit(StringBuilder password){
        //method for Q3
        //count if there is at least two digit
        boolean isTwoDigit = true;
        int count = 0;

public static boolean isTwoDigit(StringBuilder password){
        //method for Q3
        //count if there is at least two digit
        boolean isTwoDigit = false;
        int count = 0;

        for(int i = 0; i<password.length(); i++){

            char temp = password.charAt(i);

            if(Character.isDigit(temp)){
                count++;
                if(count>1) {
                    isTwoDigit = true;
                    break;
                }
            }
        }

        return isTwoDigit;
    }

    public static boolean digitOnly(StringBuilder password){
        //method for Q3
        //see if the given password only digits
        boolean digitOnly = true;

        for (int i = 0; i<password.length(); i++){
            char temp = password.charAt(i);

            if(!Character.isDigit(temp)){
                digitOnly = false;
                break;
            }
        }
        return digitOnly;
    }



}

