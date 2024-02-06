package traffic;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu(scanner);
    TrafficSystem trafficSystem = new TrafficSystem();

    System.out.println("Welcome to the traffic management system!");

    while (true) {
      MenuOption = menu.getOption();

      if(option == MenuOption.QUIT) {
        break;
      }

      trafficSystem.handleOption(option);
    }
  }
}
