
public class DmvSimulator {

    public static void main(String[] args){
        System.out.println("Welcome to the DMV!");
        int number = (int)Math.random()*100;

        System.out.println("Your number is: "+number+".");
        System.out.println("Please wait until your number is called.");

        number++;

        for(int j = 0; j<100; j++){
            if(number<100){
                number++;
            } else if (number == 100){
                number = 0;
                number++;
            } else{
                number++;
            }

            System.out.println("Now helping number: "+number);

        }
        System.out.println("You clearly do not have the neccessary requirements to be here, don't come back without them.");

        System.exit(0);


    }
}

