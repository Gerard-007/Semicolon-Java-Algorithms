import java.util.Scanner;

public class NokiaV3 {
    public static void main(String... args) {
        Scanner inputVal = new Scanner(System.in);
        mainMenu(inputVal);
    }

    public static void mainMenu(Scanner inputOption) {
        while (true) {
            String mainMenuDisplay = """
            Welcome to Nokia 3310
            Please select the below menu to start...
            1: Phone Book
            2: Messages
            3: Chat
            4: Call register
            5: Tone
            6: Settings
            7: Call divert
            8: Games
            9: Calculator
            10: Reminder
            11: Clock
            12: Profiles
            13: SIM services
            0: Exit
            >> """;
            System.out.print(mainMenuDisplay);

            int mainMenuOption = inputOption.nextInt();

            if (mainMenuOption == 0) {
                System.out.println("Exiting... Goodbye!");
                break;
            }

            switch (mainMenuOption) {
                case 1:
	                phoneBookMenu(inputOption);
	                break;
                case 2:
 	                messageMenu(inputOption);
	                break;
                case 3:
	                System.out.println("Chat");
	                break;
                case 4:
	                callRegisterMenu(inputOption);
	                break;
                case 5:
	                toneMenu(inputOption);
	                break;
                case 6:
	                settingsMenu(inputOption);
	                break;
                case 7:
	                System.out.println("Call divert");
	                break;
                case 8:
	                System.out.println("Games");
	                break;
                case 9:
	                System.out.println("Calculator");
	                break;
                case 10:
	                System.out.println("Reminder");
	                break;
                case 11:
	                clockMenu(inputOption);
	                break;
                case 12:
	                System.out.println("Profiles");
	                break;
                case 13:
	                System.out.println("SIM services");
	                break;
            }
        }
    }

    public static void phoneBookMenu(Scanner inputOption) {
        boolean backToMain = false;
        while (!backToMain) {
            String phoneBookMenuDisplay = """
            Phone Book
            1: Search
            2: Service Nos.
            3: Add name
            4: Erase
            5: Edit
            6: Assign tone
            7: Send b\'card
            8: Options
            9: Speed dials
            10: Voice tags
            0: Back
            >> """;
            System.out.print(phoneBookMenuDisplay);
            int phonebookMenuOption = inputOption.nextInt();

            switch (phonebookMenuOption) {
                case 0:
	                backToMain = true;
	                break;
                case 1:
	                System.out.println("Search");
	                break;
                case 2:
	                System.out.println("Service Nos.");
	                break;
                case 3:
	                System.out.println("Add name");
	                break;
                case 4:
                    System.out.println("Erase");
	                break;
                case 5:
	                System.out.println("Edit");
	                break;
                case 6:
	                System.out.println("Assign tone");
	                break;
                case 7:
	                System.out.println("Send b'card");
	                break;
                case 8:
	                phoneBookOptionsMenu(inputOption);
	                break;
                case 9:
	                System.out.println("Speed dials");
	                break;
                case 10:
	                System.out.println("Voice tags");
	                break;
            }
        }
    }

    public static void phoneBookOptionsMenu(Scanner inputOption) {
        boolean backToPhonebookMenu = false;
        while (!backToPhonebookMenu) {
            String phoneBookOptionDisplay = """
            Phone Book > Options
            1: Type of view
            2: Memory status
            0: Back
            >> """;
            System.out.print(phoneBookOptionDisplay);
            int phonebookOptionsMenu = inputOption.nextInt();

            switch (phonebookOptionsMenu) {
                case 0:
	      backToPhonebookMenu = true;
	      break;
                case 1:
	                System.out.println("Type of view");
	                break;
                case 2:
	                System.out.println("Memory status");
	                break;
            }
        }
    }

    public static void messageMenu(Scanner inputOption) {
        boolean backToMain = false;
        while (!backToMain) {
            String messageMenuDisplay = """
            Messages
            1: Write Message
            2: Inbox
            3: Outbox
            4: Picture Messages
            5: Templates
            6: Smileys
            7: Message settings
            8: Info service
            9: Voice mailbox number
            10: Service command editor
            0: Back
            >> """;

            System.out.print(messageMenuDisplay);

            int messageMenuOption = inputOption.nextInt();

            switch (messageMenuOption) {
                case 0:
	                backToMain = true;
	                break;
                case 1:
	                System.out.println("Write Message");
	                break;
                case 2:
	                System.out.println("Inbox");
	                break;
                case 3:
	                System.out.println("Outbox");
	                break;
                case 4:
	                System.out.println("Picture Messages");
	                break;
                case 5:
	                System.out.println("Templates");
	                break;
                case 6:
	                System.out.println("Smileys");
	                break;
                case 7:
	                System.out.println("Message settings");
	                break;
                case 8:
	                System.out.println("Info service");
	                break;
                case 9:
	                System.out.println("Voice mailbox number");
	                break;
                case 10:
	                System.out.println("Service command editor");
	                break;
            }
        }
    }

    public static void callRegisterMenu(Scanner inputOption) {
        boolean backToMain = false;
        while (!backToMain) {
            String callRegisterMenuDisplay = """
            Call Register
            1: Missed calls
            2: Received calls
            3: Dialled numbers
            4: Erase recent call lists
            5: Show call duration
            6: Show call costs
            7: Call cost settings
            8: Prepaid credit
            0: Back
            >> """;
            System.out.print(callRegisterMenuDisplay);
            int callRegisterMenuOption = inputOption.nextInt();

            switch (callRegisterMenuOption) {
                case 0:
	                backToMain = true;
	                break;
                case 1:
	                System.out.println("Missed calls");
	                break;
                case 2:
	                System.out.println("Received calls");
	                break;
                case 3:
	                System.out.println("Dialled numbers");
	                break;
                case 4:
	                System.out.println("Erase recent call lists");
	                break;
                case 5:
	                System.out.println("Show call duration");
	                break;
                case 6:
	                System.out.println("Show call costs");
	                break;
                case 7:
	                System.out.println("Call cost settings");
	                break;
                case 8:
	                System.out.println("Prepaid credit");
	                break;
            }
        }
    }

    public static void toneMenu(Scanner inputOption) {
        boolean backToMain = false;
        while (!backToMain) {
            int toneMenuOption = inputOption.nextInt();
            switch (toneMenuOption) {
                case 0:
	                backToMain = true;
                    break;
                case 1:
	                System.out.println("Ringing tone");
	                break;
                case 2:
	                System.out.println("Ringing volume");
	                break;
                case 3:
	                System.out.println("Incoming call alert");
	                break;
                case 4:
	                System.out.println("Composer");
	                break;
                case 5:
	                System.out.println("Message alert tone");
	                break;
                case 6:
	                System.out.println("Keypad tones");
	                break;
                case 7:
	                System.out.println("Warning and game tones");
	                break;
                case 8:
	                System.out.println("Vibrating alert");
	                break;
                case 9:
	                System.out.println("Screen saver");
	                break;
            }
        }
    }

    public static void settingsMenu(Scanner inputOption) {
        boolean backToMain = false;
        while (!backToMain) {
            String settingsMenuDisplay = """
            Settings
            1: Call settings
            2: Phone settings
            3: Security settings
            4: Restore factory settings
            0: Back
            >> """;
            System.out.print(settingsMenuDisplay);
            int settingsMenuOption = inputOption.nextInt();

            switch (settingsMenuOption) {
                case 0:
	                backToMain = true;
	                break;
                case 1:
	                System.out.println("Call settings");
	                break;
                case 2:
	                System.out.println("Phone settings");
	                break;
                case 3:
	                System.out.println("Security settings");
	                break;
                case 4:
	                System.out.println("Restore factory settings");
	                break;
            }
        }
    }

    public static void clockMenu(Scanner inputOption) {
        boolean backToMain = false;
        while (!backToMain) {
            System.out.print("""
            Clock
            1: Alarm clock
            2: Clock settings
            3: Date setting
            4: Stopwatch
            5: Countdown timer
            6: Auto update of date and time
            0: Back
            >> """);
            int clockMenuOption = inputOption.nextInt();

            switch (clockMenuOption) {
                case 0:
	                backToMain = true;
                    break;
                case 1:
	                System.out.println("Alarm clock");
	                break;
                case 2:
	                System.out.println("Clock settings");
	                break;
                case 3:
	                System.out.println("Date setting");
	                break;
                case 4:
	                System.out.println("Stopwatch");
	                break;
                case 5:
	                System.out.println("Countdown timer");
	                break;
                case 6:
	                System.out.println("Auto update of date and time");
	                break;
            }
        }
    }
}
