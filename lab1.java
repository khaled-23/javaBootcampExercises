import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Q1
//        System.out.println("enter first number");
//           int fNum = s.nextInt();
//
//        System.out.println("enter second number");
//            int sNum = s.nextInt();
//
//            int sum = fNum+sNum;
//            int mult = fNum*sNum;
//            int sub = fNum - sNum;
//            int div = 0;
//            if(fNum==0 || sNum==0){
//                System.out.println("can't divide by 0");
//            }else {
//                 div = fNum/sNum;
//            }
//            int mod = fNum%sNum;
//
//        System.out.println(fNum + " + " + sNum + " = " + sum);
//        System.out.println(fNum + " - " + sNum + " = " + sub);
//        System.out.println(fNum + " * " + sNum + " = " + mult);
//        System.out.println(fNum + " / " + sNum + " = " + div);
//        System.out.println(fNum + " mod " + sNum + " = " +mod);


//Q2
//--------------------------------------------------------------------------
//        System.out.println("enter a number");
//        int num = s.nextInt();
//
//        for (int i = 1; i<=10 ; i++) {
//
//            int temp = num * i;
//            System.out.println(num + " x " + i + " = " + temp);
//
//        }

        //Q3
        //------------------------------------------------------------------------

//        double radius = 7.5;
//
//        double pi = 3.14159265358979;
//
//        double perimeter = (2*pi)*radius;
//        double area = pi*(radius*radius);
//        System.out.println(perimeter);
//        System.out.println(area);

           //Q4
//        //---------------------------------------------------------------
//        System.out.println("Enter the count of numbers:");
//        int num = s.nextInt();
//        int[] numbers = new int[num];
//        for(int i = 0; i<=num-1; i++ ){
//            System.out.println("Enter an integer:");
//            int temp = s.nextInt();
//            numbers[i] = temp;
//
//        }
//        double avg = 0;
//        double sum =0;
//        for (int i = 0; i <numbers.length ; i++) {
//
//             sum = sum + numbers[i];
//             avg = sum / numbers.length;
//        }
//        System.out.println("the average is: " + avg);

        //Q5
        //-----------------------------------------------------------------------

//        System.out.println("enter the first number");
//        int num1 = s.nextInt();
//
//        System.out.println("enter the second number");
//        int num2 = s.nextInt();
//
//        System.out.println("enter the second number");
//        int num3 = s.nextInt();
//
//
//        int sum = num1+num2;
//        boolean isEquals = sum==num3;
//
//        if(isEquals){
//            System.out.println("the result is : " + isEquals);
//        }else System.out.println("the result is : " + isEquals);

        //Q6
        //--------------------------------------------------------------

//        System.out.println("enter a word");
//        StringBuilder word = new StringBuilder(s.nextLine());
//
//        StringBuilder reversedWord = new StringBuilder();
//
//        for (int i = word.length()-1; i >=0; i--) {
//
//            char tempChar = word.charAt(i);
//            reversedWord.append(tempChar);
//        }
//        System.out.println(reversedWord);

        //Q7
        //------------------------------------------------------------------

//        System.out.println("enter a number:");
//        int num = s.nextInt();
//
//        if((num%2)==0){
//            System.out.println("the number is Even");
//        }else System.out.println("the number is odd");


        //Q8
        //-------------------------------------------------------------------

//        System.out.println("enter temperature in Centigrade");
//        int c = s.nextInt();
//
//        double f = (c*1.8)+32;
//        System.out.println("Temperature in Fahrenheit is: " + f);


        //Q9
        //------------------------------------------------------------------
//        System.out.println("enter a String");
//        StringBuilder sentence = new StringBuilder(s.nextLine());
//
//        System.out.println("enter a number");
//        int num = s.nextInt();
//
//        if(num<0||num>sentence.length()){
//            System.out.println("sorry number out of bounds");
//        }else for(int i=0; i<sentence.length()-1;i++)
//                if(i==num){
//                  System.out.println(sentence.charAt(i));
//                }

        //Q10 //test data value different than expected data value in the question.
        //-------------------------------------------------------------------



//        double width = 5.5;
//        double height = 8.5;
//        double area = height*width;
//        double perimeter = 2*(height+width+0.1);
//
//        System.out.println("area is " + (width+0.1) + " * " + height + " = " + area);
//        System.out.println("Perimeter is 2 * (" + (width+0.1) + " + " + height + ")= " + perimeter);


        //Q11
        //------------------------------------------------------------------

//        System.out.println("enter first number");
//        int fNum = s.nextInt();
//
//        System.out.println("enter second number");
//        int sNum = s.nextInt();
//
//        boolean isEqual = fNum==sNum;
//        boolean isGreater = fNum>sNum;
//        boolean isLesser = fNum<sNum;
//
//
//        if(isEqual){
//            System.out.println(fNum + " == " + sNum);
//        }else System.out.println(fNum + " != " +sNum);
//        if(isLesser){
//            System.out.println(fNum+ " < " + sNum);
//        }
//        if(isGreater){
//            System.out.println(fNum+ " > " + sNum);
//        }
//        if (isGreater || isEqual) {
//            System.out.println(fNum+ " >= " + sNum);
//        }
//        if(isLesser || isEqual){
//            System.out.println(fNum + " <= " + sNum);
//        }


        //Q12
        //---------------------------------------------------------------------------

//        System.out.println("input seconds");
//        int sec = s.nextInt();
//        double hours = sec * (1.0/3600.0);
//        int temp = (int) hours;
//        double minute = (hours-temp)*60;
//        temp = (int)minute;
//        double seconds = (minute - temp) * 60;
//        System.out.println((int)hours + ":" + (int)minute + ":" + (int)seconds);


        //Q13
        //---------------------------------------------------------------------------

//        System.out.println("enter first number");
//        int num1 = s.nextInt();
//        System.out.println("enter second number");
//        int num2 = s.nextInt();
//        System.out.println("enter third number");
//        int num3 = s.nextInt();
//        System.out.println("enter fourth number");
//        int num4 = s.nextInt();
//        boolean group1 = num1==num2;
//        boolean group2 = num2==num3;
//        boolean group3 = num4==num1;
//
//        if(group1==group2 && group1==group3){
//            System.out.println("numbers are equal!");
//        }else System.out.println("numbers are not equal!");


        //Q14
        //-------------------------------------------------------------------

//        System.out.println("enter a number");
//        int num = s.nextInt();
//
//        if(num<0){
//            System.out.println("number is negative");
//        }else if(num>0){
//            System.out.println("number is positive");
//        }else System.out.println("number is zero");


        //Q15
        //-----------------------------------------------------------------------
//        int nSum=0;
//        int pSum=0;
//        int zSum=0;
//        do{
//            System.out.println("enter a number: ");
//                int num = s.nextInt();
//
//
//
//                if(num<0){
//                    nSum = nSum+1;
//                }else if(num>0){
//                    pSum = pSum+1;
//
//                }else zSum = zSum +1;
//
//                if(num == -1)
//                break;
//
//        }while(true);
//
//        System.out.println(pSum + " positives");
//        System.out.println(zSum + " zero");
//        System.out.println(nSum + " negatives");



        //Q16
        //------------------------------------------------------------------

//        System.out.println("enter a number");
//        int num = s.nextInt();
//
//        StringBuilder temp = new StringBuilder(String.valueOf(num));
//        StringBuilder rev = new StringBuilder();
//        for (int i = temp.length()-1; i >=0 ; i--) {
//
//            char tempCh = temp.charAt(i);
//              rev.append(tempCh);
//
//        }
//        int revNum = Integer.parseInt(String.valueOf(rev));
//        System.out.println(revNum);



        //Q17
        //-----------------------------------------------------------------------------



//        int largeNum=0;
//        int smallNum=0;
//        do{
//            System.out.println("enter the number, enter 0 to exit");
//                 int num = s.nextInt();
//
//                 if (num == 0)
//                    break;
//
//                 if(num>largeNum || largeNum==0)
//                    largeNum=num;
//
//                 if(num<smallNum || smallNum==0)
//                    smallNum=num;
//
//
//        }while(true);
//
//        System.out.println("the large number: " + largeNum);
//        System.out.println("the small number: "+ smallNum);




        //Q18
        //-------------------------------------------------------------------------
//        System.out.println("enter a string");
//        StringBuilder str = new StringBuilder(s.nextLine());
//
//        int sum = 0;
//        for(int i=0; i<str.length()-1;i++){
//
//            char temp = str.charAt(i);
//
//            boolean isEqual = temp == 'a';
//            if(isEqual){
//                sum = sum+1;
//            }
//        }
//
//        System.out.println("number of a's: " + sum);




    }
}