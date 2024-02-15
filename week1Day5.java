import java.util.ArrayList;

public class week1Day5 {
    public static void main(String[] args) {

        //Q1
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(50);
//        numbers.add(-20);
//        numbers.add(0);
//        numbers.add(30);
//        numbers.add(40);
//        numbers.add(60);
//        numbers.add(10);
//
//        boolean isEqual = numbers.getFirst() == numbers.getLast();
//
//        if(isEqual){
//            System.out.println(isEqual);
//        }else System.out.println(isEqual);


        //Q2
        //--------------------------------------------------------------------------


//        int[] number = {1,4,17,7,25,3,100};
//
//        ArrayList<Integer> greater = new ArrayList<Integer>();
//
//        int sum = 0;
//        int avg = 0;
//        int count = 0;
//        for(int n:number){
//
//            sum += n;
//            avg = sum / number.length;
//
//        }
//        for (int i = 0; i < number.length; i++) {
//
//            if(number[i]>avg)
//                greater.add(number[i]);
//        }
//        System.out.println("the average of the said array is : " + avg +
//                " The numbers in the said array that are greater than the average are: " + greater);


        //Q3
        //--------------------------------------------------------------------------------------------------------------

//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        numbers.add(20);
//        numbers.add(30);
//        numbers.add(40);
//
//        if(numbers.getFirst()<numbers.getLast()){
//            System.out.println("Larger number between first and last element: " + numbers.getLast());
//        }else System.out.println("Larger number between first and last element: " + numbers.getFirst());

        //Q4
        //--------------------------------------------------------------------------------------------------------------
//
//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        numbers.add(40);
//        numbers.add(30);
//        numbers.add(20);
//
//        ArrayList<Integer> rev = new ArrayList<>();
//
//                for(int n:numbers){
//                if(n != numbers.getFirst() || n != numbers.getLast()){
//                    rev.add(n);
//                }else if(n == numbers.getLast()){
//                    rev.add(0,n);
//                }else rev.addLast(n);
//        }
//        System.out.println("new array after swapping the first and last element" +rev);


        //Q5
        //-----------------------------------------------------------------------------------------

//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        numbers.add(2); numbers.add(3); numbers.add(40); numbers.add(1); numbers.add(5);
//        numbers.add(9); numbers.add(4); numbers.add(10); numbers.add(7);
//
//        ArrayList<Integer> reNumbers = new ArrayList<>();
//        ArrayList<Integer> even = new ArrayList<>();
//        int fNum = numbers.get(0);
//
//        for(int n : numbers){
//
//            if(n%2==0) {
//                even.add(n);
//            }else reNumbers.add(n);
//        }
//        for(int n:even){
//            reNumbers.add(n);
//        }
//
//        System.out.println(reNumbers);




    //Q6
    //------------------------------------------------------------------------------------------------------------------


//        int[] numbers1 = {2,3,6,6,4};
//        int[] numbers2 = {2,3,6,6,4};
//
//        int count = 0;
//        boolean isEqual = false;
//        for(int n:numbers1){
//
//            if(n==numbers2[count])
//                isEqual = true;
//            else{
//                isEqual = false;
//                break;
//            }
//            count++;
//        }
//        System.out.println(isEqual);


    }
}