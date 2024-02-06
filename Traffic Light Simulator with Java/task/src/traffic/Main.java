package traffic;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to the traffic management system!");

    System.out.println("Input the number of roads:");
    int numberofRoads = scanner.nextInt();

    System.out.println("Input the interval:");
    int interval = scanner.nextInt();

    Menu menu = new Menu(scanner);
    TrafficSystem trafficSystem = new TrafficSystem(numberofRoads, interval);


    while (true) {
      MenuOption option = menu.getOption();

      if(option == MenuOption.QUIT) {
        break;
      }

      trafficSystem.handleOption(option);
    }
  }
}
