
public class DmvSimulator {

    public static void main(String[] args){
        System.out.println("Welcome to the DMV!");
        int number = (int)(Math.random()*200);

        System.out.println("Your number is: "+number+".");
        System.out.println("Please wait until your number is called.");

        number++;

        for(int j = 0; j<200; j++){
            if(number<100){
                number++;
            } else if (number == 200){
                number = 0;
                number++;
            } else{
                number++;
            }

            System.out.println("Now helping number: "+number);

        }
        System.out.println("You do not have the required paperwork. GOODBYE.");

        System.exit(0);


    }
}

