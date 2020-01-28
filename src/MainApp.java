import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        boolean play = true;
        Scanner s = new Scanner(System.in);
        ArrayList ar = new ArrayList();
        while(play){

            System.out.println("Create an airplane...\nAirbus you can choose how many passenger seats you want. \nBoeing you can choose the color. \nBoeing or AirBus? \n");
            String answer = s.nextLine();



            if(answer.toLowerCase().equals("boeing")){
                System.out.println("Enter length: ");
                String length = s.nextLine();
                System.out.println("Enter weight: ");
                int weight = s.nextInt();
                s.nextLine();
                System.out.println("Enter color: ");
                String color = s.nextLine();
                Boeing boeing = new Boeing(weight,length,color);
                ar.add(boeing);
            }
            else if(answer.toLowerCase().equals("airbus")||answer.substring(0,1).equals("a")){

                System.out.println("Enter length: ");
                String length = s.nextLine();
                System.out.println("Enter weight: ");
                int weight = s.nextInt();
                s.nextLine();
                System.out.println("Enter number of passenger seats: ");
                String passengerSeats = s.nextLine();
                AirBus airBus = new AirBus(weight,length,passengerSeats);
                ar.add(airBus);

            }else{
                System.out.println("Do you wish to keep playing?");
                if(s.nextLine().toLowerCase().equals("n")||s.nextLine().toLowerCase().equals("no")){
                    play = false;
                }
            }
            System.out.println("The List so far: \n");
            for(Object airplane : ar){
                if(airplane instanceof Boeing){
                    Boeing b = (Boeing)airplane;
                    System.out.println(b.getClass()+"\nColor: "+b.getColor()+"\nLength: "+b.getLength()+"\nWeight: "+b.getWeight()+"\n");
                } else if(airplane instanceof AirBus){
                    AirBus a = (AirBus)airplane;
                    System.out.println(a.getClass()+"\n"+a.getPassengerSeats()+"\nLength: "+a.getLength()+"\nWeight: "+a.getWeight()+"\n");
                }

            }
        }
        System.out.println("");
    }
}
