package traffic;

public class TrafficSystem {
    public void handleOption(MenuOption option) {
        switch (option) {
            case ADD_ROAD:
                System.out.println("Road added");
                break;
            case DELETE_ROAD:
                System.out.println("Road deleted");
                break;
            case OPEN_SYSTEM:
                System.out.println("System opened");
                break;
            case QUIT:
                System.out.println("System closed");
                break;
        }
    }
}
