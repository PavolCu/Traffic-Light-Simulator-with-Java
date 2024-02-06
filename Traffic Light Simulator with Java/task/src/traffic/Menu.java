package traffic;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public MenuOption getOption() {
        System.out.println("""
            Menu:
            1.Add road
            2.Delete road
            3.Open system
            0.Quit """);

        int option = scanner.nextInt();

        return switch (option) {
            case 1 -> MenuOption.ADD_ROAD;
            case 2 -> MenuOption.DELETE_ROAD;
            case 3 -> MenuOption.OPEN_SYSTEM;
            case 0 -> MenuOption.QUIT;
            default -> {
                System.out.println("Invalid option. Please try again.");
                yield getOption();
            }
        };
    }

}
