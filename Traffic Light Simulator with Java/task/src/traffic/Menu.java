package traffic;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public MenuOption getOption() {
        MenuOption option;
        do {
            System.out.println("""
                Menu:
                1.Add road
                2.Delete road
                3.Open system
                0.Quit""");

            int selection = scanner.nextInt();


             option = switch (selection) {
                case 1 -> {
                System.out.println("Road added");
                yield MenuOption.ADD_ROAD;
                }
                case 2 -> {
                System.out.println("Road deleted");
                yield MenuOption.DELETE_ROAD;
                }
                case 3 -> {
                System.out.println("System opened");
                yield MenuOption.OPEN_SYSTEM;
                }
                 case 0 -> MenuOption.QUIT;
                default -> {
                    System.out.println("Invalid option. Please try again.");
                    yield getOption();
                }
             };
        } while(option !=MenuOption.QUIT);

        return option;
    }
}
