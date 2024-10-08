import java.util.Scanner;

public class NokiaV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("""
            Welcome to Nokia 3310
            Please select the below menu to start...
            1 -> Phone Book
            2 -> Messages
            3 -> Chat
            4 -> Call register
            5 -> Tone
            6 -> Settings
            7 -> Call divert
            8 -> Games
            9 -> Calculator
            10 -> Reminder
            11 -> Clock
            12 -> Profiles
            13 -> SIM services
            0 -> Exit
            >> """);

            int mainMenuOption = input.nextInt();

            if (mainMenuOption == 0) {
                System.out.println("Exiting... Goodbye!");
                break;
            }

            switch (mainMenuOption) {
                case 1:
                    boolean backToMain = false;
                    while (!backToMain) {
                        System.out.println("""
                        Phone Book
                        1 -> Search
                        2 -> Service Nos.
                        3 -> Add name
                        4 -> Erase
                        5 -> Edit
                        6 -> Assign tone
                        7 -> Send b'card
                        8 -> Options
                        9 -> Speed dials
                        10 -> Voice tags
                        0 -> Back
                        >> """);
                        int phonebookMenuOption = input.nextInt();

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
                                boolean backToPhonebookMenu = false;
                                while (!backToPhonebookMenu) {
                                    System.out.println("""
                                    Phone Book > Options
                                    1 -> Type of view
                                    2 -> Memory status
                                    0 -> Back
                                    >> """);
                                    int phonebookOptionsMenu = input.nextInt();

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
                                break;
                            case 9:
                                System.out.println("Speed dials");
                                break;
                            case 10:
                                System.out.println("Voice tags");
                                break;
                        }
                    }
                    break;

                case 2:
                    backToMain = false;
                    while (!backToMain) {
                        System.out.println("""
                        Messages
                        1 -> Write Message
                        2 -> Inbox
                        3 -> Outbox
                        4 -> Picture Messages
                        5 -> Templates
                        6 -> Smileys
                        7 -> Message settings
                        8 -> Info service
                        9 -> Voice mailbox number
                        10 -> Service command editor
                        0 -> Back
                        >> """);
                        int messageMenuOption = input.nextInt();

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
                    break;

                case 3:
                    System.out.println("Chat");
                    break;

                case 4:
                    backToMain = false;
                    while (!backToMain) {
                        System.out.println("""
                        Call Register
                        1 -> Missed calls
                        2 -> Received calls
                        3 -> Dialled numbers
                        4 -> Erase recent call lists
                        5 -> Show call duration
                        6 -> Show call costs
                        7 -> Call cost settings
                        8 -> Prepaid credit
                        0 -> Back
                        >> """);
                        int callRegisterMenuOption = input.nextInt();

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
                    break;

                case 5:
                    backToMain = false;
                    while (!backToMain) {
                        System.out.println("""
                        Tone
                        1 -> Ringing tone
                        2 -> Ringing volume
                        3 -> Incoming call alert
                        4 -> Composer
                        5 -> Message alert tone
                        6 -> Keypad tones
                        7 -> Warning and game tones
                        8 -> Vibrating alert
                        9 -> Screen saver
                        0 -> Back
                        >> """);
                        int toneMenuOption = input.nextInt();

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
                    break;

                case 6:
                    backToMain = false;
                    while (!backToMain) {
                        System.out.println("""
                        Settings
                        1 -> Call settings
                        2 -> Phone settings
                        3 -> Security settings
                        4 -> Restore factory settings
                        0 -> Back
                        >> """);
                        int settingsMenuOption = input.nextInt();

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
                    backToMain = false;
                    while (!backToMain) {
                        System.out.println("""
                        Clock
                        1 -> Alarm clock
                        2 -> Clock settings
                        3 -> Date setting
                        4 -> Stopwatch
                        5 -> Countdown timer
                        6 -> Auto update of date and time
                        0 -> Back
                        >> """);
                        int clockMenuOption = input.nextInt();

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
}
