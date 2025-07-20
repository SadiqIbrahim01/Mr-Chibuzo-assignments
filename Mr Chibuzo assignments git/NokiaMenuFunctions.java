import java.util.Scanner;

public class NokiaMenuFunctions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("Select a main menu option:");
        System.out.println("1. Phone book");
        System.out.println("2. Messages");
        System.out.println("3. Chat");
        System.out.println("4. Call register");
        System.out.println("5. Tones");
        System.out.println("6. Settings");
        System.out.println("7. Call divert");
        System.out.println("8. Games");
        System.out.println("9. Calculator");
        System.out.println("10. Reminders");
        System.out.println("11. Clock");
        System.out.println("12. Profiles");
        System.out.println("13. SIM services");
        int mainOption = input.nextInt();

        switch (mainOption) {
            case 1:
                System.out.println("Phone book functions:");
                System.out.println("1. Search\n2. Add name\n3. Erase\n4. Edit\n5. Assign tone\n6. Send b'card");
                int phoneBookOption = input.nextInt();
                switch (phoneBookOption) {
                    case 1: System.out.println("You selected: Search"); break;
                    case 2: System.out.println("You selected: Add name"); break;
                    case 3: System.out.println("You selected: Erase"); break;
                    case 4: System.out.println("You selected: Edit"); break;
                    case 5: System.out.println("You selected: Assign tone"); break;
                    case 6: System.out.println("You selected: Send b'card"); break;
                    default: System.out.println("Invalid option."); break;
                }
                break;
            case 2:
                System.out.println("Messages functions:");
                System.out.println("1. Write messages\n2. Inbox\n3. Outbox\n4. Picture messages\n5. Templates");
                int messagesOption = input.nextInt();
                switch (messagesOption) {
                    case 1: System.out.println("You selected: Write messages"); break;
                    case 2: System.out.println("You selected: Inbox"); break;
                    case 3: System.out.println("You selected: Outbox"); break;
                    case 4: System.out.println("You selected: Picture messages"); break;
                    case 5: System.out.println("You selected: Templates"); break;
                    default: System.out.println("Invalid option."); break;
                }
                break;
            case 3:
                System.out.println("You selected: Chat");
                break;
            case 4:
                System.out.println("Call register functions:");
                System.out.println("1. Missed calls\n2. Received calls\n3. Dialled numbers");
                int callRegisterOption = input.nextInt();
                switch (callRegisterOption) {
                    case 1: System.out.println("You selected: Missed calls"); break;
                    case 2: System.out.println("You selected: Received calls"); break;
                    case 3: System.out.println("You selected: Dialled numbers"); break;
                    default: System.out.println("Invalid option."); break;
                }
                break;
            case 5:
                System.out.println("Tones functions:");
                System.out.println("1. Ringing tone\n2. Ringing volume\n3. Incoming call alert");
                int tonesOption = input.nextInt();
                switch (tonesOption) {
                    case 1: System.out.println("You selected: Ringing tone"); break;
                    case 2: System.out.println("You selected: Ringing volume"); break;
                    case 3: System.out.println("You selected: Incoming call alert"); break;
                    default: System.out.println("Invalid option."); break;
                }
                break;
            case 6:
                System.out.println("Settings functions:");
                System.out.println("1. Call settings\n2. Phone settings\n3. Security settings\n4. Restore factory settings");
                int settingsOption = input.nextInt();
                switch (settingsOption) {
                    case 1: System.out.println("You selected: Call settings"); break;
                    case 2: System.out.println("You selected: Phone settings"); break;
                    case 3: System.out.println("You selected: Security settings"); break;
                    case 4: System.out.println("You selected: Restore factory settings"); break;
                    default: System.out.println("Invalid option."); break;
                }
                break;
            case 7:
                System.out.println("You selected: Call divert");
                break;
            case 8:
                System.out.println("You selected: Games");
                break;
            case 9:
                System.out.println("You selected: Calculator");
                break;
            case 10:
                System.out.println("You selected: Reminders");
                break;
            case 11:
                System.out.println("Clock functions:");
                System.out.println("1. Alarm clock\n2. Clock settings\n3. Date setting");
                int clockOption = input.nextInt();
                switch (clockOption) {
                    case 1: System.out.println("You selected: Alarm clock"); break;
                    case 2: System.out.println("You selected: Clock settings"); break;
                    case 3: System.out.println("You selected: Date setting"); break;
                    default: System.out.println("Invalid option."); break;
                }
                break;
            case 12:
                System.out.println("You selected: Profiles");
                break;
            case 13:
                System.out.println("You selected: SIM services");
                break;
            default:
                System.out.println("Invalid main menu option.");
                break;
        }
        
    }
}
