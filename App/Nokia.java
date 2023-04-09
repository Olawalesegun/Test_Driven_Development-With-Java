import java.util.Scanner;
public class Nokia {
    static int numberEntered;
    static int returnBack;

    //Scanner inputFromUser = new Scanner(System.in);
    public static void main(String[] args) {
        nokiaMainMenu();
    }

    public static void nokiaMainMenu(){
        System.out.println("Welcome to Nokia Mobile Phone");
        System.out.println("Kindly Enter a number in your Nokia Mobile Phone");
        System.out.println("Press 1 for Phone book");
        System.out.println("Press 2 for Messages");
        System.out.println("Press 3 for Chat");
        System.out.println("Press 4 for Call register");
        System.out.println("Press 5 for Tones");
        System.out.println("Press 6 for Settings");
        System.out.println("Press 7 for Call divert");
        System.out.println("Press 8 for Games");
        System.out.println("Press 9 for Calculator");
        System.out.println("Press 10 for Reminders");
        System.out.println("Press 11 for Clock");
        System.out.println("Press 12 for Profiles");
        System.out.println("Press 13 for SIM services");
        Scanner inputFromUser = new Scanner(System.in);
        numberEntered = inputFromUser.nextInt();
        phoneBookMenu();
        messagesMenu();
        chatMenu();
        callRegistryMenu();
        tonesEntryMenu();
        settingsMenu();
        callDivertMenu();
        gamesMenu();
        calculatorMenu();
        reminderMenu();
        clockEntryMenu();
        profileMenu();
        simServicesMenu();
    }

    public static void phoneBookMenu() {
        int phoneBookEntry, optionsEntry;
        //boolean hasNext = inputFromUser.hasNextInt();
        if (numberEntered == 1) {
            System.out.println("Phone book");
            System.out.println("Kindly Enter a number in your Phone Book");
            System.out.println("Press 1 for Search");
            System.out.println("Press 2 for Service Nos");
            System.out.println("Press 3 for Name");
            System.out.println("Press 4 for Erase");
            System.out.println("Press 5 for Edit");
            System.out.println("Press 6 for Assign tone");
            System.out.println("Press 7 for b'card");
            Scanner inputFromUser = new Scanner(System.in);
            phoneBookEntry = inputFromUser.nextInt();
            switch (phoneBookEntry) {
                case 1 -> System.out.println("Search");
                case 2 -> System.out.println("Service Nos");
                case 3 -> System.out.println("Add Name");
                case 4 -> System.out.println("Erase");
                case 5 -> System.out.println("Edit");
                case 6 -> System.out.println("Assign tone");
                case 7 -> System.out.println("Send b'card");
                case 8 -> {
                    System.out.println("Options");
                    System.out.println("Kindly Enter a number in your Options Book");
                    System.out.println("Press 1 for Type Of View");
                    System.out.println("Press 2 for Memory status");
                    //RETURNS
                    System.out.println("To return to the previous option Press 3");
                    System.out.println("To go back to the Main Menu, Press 4");
                    optionsEntry = inputFromUser.nextInt();
                    switch (optionsEntry) {
                        case 1 -> System.out.println("Type Of View");
                        case 2 -> System.out.println("Memory status");
                        case 3 -> {
                            System.out.println("Phone book");
                            System.out.println("Kindly Enter a number in your Phone Book");
                            System.out.println("Press 1 for Search");
                            System.out.println("Press 2 for Service Nos");
                            System.out.println("Press 3 for Name");
                            System.out.println("Press 4 for Erase");
                            System.out.println("Press 5 for Edit");
                            System.out.println("Press 6 for Assign tone");
                            System.out.println("Press 7 for b'card");
                            phoneBookEntry = inputFromUser.nextInt();
                            switch (phoneBookEntry) {
                                case 1 -> System.out.println("Search");
                                case 2 -> System.out.println("Service Nos");
                                case 3 -> System.out.println("Add Name");
                                case 4 -> System.out.println("Erase");
                                case 5 -> System.out.println("Edit");
                                case 6 -> System.out.println("Assign tone");
                                case 7 -> System.out.println("Send b'card");
                                case 8 -> {
                                    System.out.println("Options");
                                    System.out.println("Kindly Enter a number in your Options Book");
                                    System.out.println("Press 1 for Type Of View");
                                    System.out.println("Press 2 for Memory status");
                                }
                            }
                        }
                        //END OF RETURN
                    }
                }
                case 9 -> System.out.println("Speed Dials");
                case 10 -> System.out.println("Voice tags");
            }
        }
    }

    public static void messagesMenu() {
        int messageEntry;
        int messageSettingEntry, setMessageEntry, commonMessageSettingsEntry;
        Scanner inputFromUser = new Scanner(System.in);
        if (numberEntered == 2) {
            System.out.println("Message");
            System.out.println("Kindly Enter a number in your Message Box");
            System.out.println("Press 1 to Write Message");
            System.out.println("Press 2 to check your Inbox");
            System.out.println("Press 3 to check your Outbox");
            System.out.println("Press 4 to check your Picture messages");
            System.out.println("Press 5 for Templates");
            System.out.println("Press 6 for Smileys");
            System.out.println("Press 7 for Message Settings");
            messageEntry = inputFromUser.nextInt();
            switch (messageEntry) {
                case 1 -> System.out.println("Write Messages");
                case 2 -> System.out.println("Inbox");
                case 3 -> System.out.println("Outbox");
                case 4 -> System.out.println("Picture messages");
                case 5 -> System.out.println("Templates");
                case 6 -> System.out.println("Smileys");
                case 7 -> {
                    System.out.println("Message Settings");
                    System.out.println("Kindly Enter a number in your Message settings");
                    System.out.println("Press 1 for Set 1^2");
                    System.out.println("Press 2 for Common^3");
                    messageSettingEntry = inputFromUser.nextInt();
                    switch (messageSettingEntry) {
                        case 1 -> {
                            System.out.println("Set 1^2");
                            System.out.println("Kindly Enter a number to set your message settings");
                            System.out.println("Press 1 for Message centre Number");
                            System.out.println("Press 2 for Messages sent as");
                            System.out.println("Press 3 for Message validity");
                            setMessageEntry = inputFromUser.nextInt();
                            switch (setMessageEntry) {
                                case 1 -> System.out.println("Message centre Number");
                                case 2 -> System.out.println("Messages sent as");
                                case 3 -> System.out.println("Message validity");
                            }
                        }
                        case 2 -> {
                            System.out.println("Common^3");
                            System.out.println("Kindly Enter a number For Common Settings");
                            System.out.println("Press 1 for Delivery reports");
                            System.out.println("Press 2 for Reply via same centre");
                            System.out.println("Press 3 for Character support");
                            commonMessageSettingsEntry = inputFromUser.nextInt();
                            switch (commonMessageSettingsEntry) {
                                case 1 -> System.out.println("Delivery reports");
                                case 2 -> System.out.println("Reply via same centre");
                                case 3 -> System.out.println("Character support");
                            }
                        }
                    }
                }
                case 8 -> System.out.println("Info service");
                case 9 -> System.out.println("Voice mailbox number");
                case 10 -> System.out.println("Service command editor");
            }
        }
    }

    public static void chatMenu() {
        int returnBack;
        Scanner inputFromUser = new Scanner(System.in);
        if (numberEntered == 3) {
            System.out.println("Chat");

            System.out.println("Press 1 to go back to the previous Menu\n" +
                    "Press 0 to go back to the Main Menu\n" +
                    "Press CTRL+D to exit");
            returnBack = inputFromUser.nextInt();
            if(returnBack == 1) Nokia.messagesMenu();
            if(returnBack == 0) nokiaMainMenu();

        }
    }

    public static void callRegistryMenu() {
        int callRegisterEntry, callDurationEntry, showCallEntry;
        int callCostEntry;
        Scanner inputFromUser = new Scanner(System.in);
        if (numberEntered == 4) {
            System.out.println("Call Register");
            System.out.println("Kindly Enter a number in in your Call Register");
            System.out.println("Press 1 for Missed calls");
            System.out.println("Press 2 for Received calls");
            System.out.println("Press 3 for Dialled numbers");
            System.out.println("Press 4 for Erase recent call lists");
            System.out.println("Press 5 for Show call duration");
            callRegisterEntry = inputFromUser.nextInt();
            switch (callRegisterEntry) {
                case 1 -> System.out.println("Missed calls");
                case 2 -> System.out.println("Received calls");
                case 3 -> System.out.println("Dialled numbers");
                case 4 -> System.out.println("Erase recent call lists");
                case 5 -> {
                    System.out.println("Show call duration");
                    System.out.println("Kindly Enter a number to Show call duration");
                    System.out.println("Press 1 for Last call duration");
                    System.out.println("Press 2 for all calls duration");
                    System.out.println("Press 3 for all Received calls duration");
                    System.out.println("Press 4 for Clear timers");
                    callDurationEntry = inputFromUser.nextInt();
                    switch (callDurationEntry) {
                        case 1 -> System.out.println("Last call duration");
                        case 2 -> System.out.println("All calls duration");
                        case 3 -> System.out.println("Received calls duration");
                        case 4 -> System.out.println("Clear timers");
                    }
                }
                case 6 -> {
                    System.out.println("Show call costs");
                    System.out.println("Kindly Enter a number to Show call duration");
                    System.out.println("Press 1 for Last call cost");
                    System.out.println("Press 2 for all calls cost");
                    System.out.println("Press 3 for Clear counters");
                    showCallEntry = inputFromUser.nextInt();
                    switch (showCallEntry) {
                        case 1 -> System.out.println("Last call cost");
                        case 2 -> System.out.println("All calls cost");
                        case 3 -> System.out.println("Clear counters");
                    }
                }
                case 7 -> {
                    System.out.println("Call cost settings");
                    System.out.println("Kindly Enter a number to Show call cost settings");
                    System.out.println("Press 1 for Call cost limit");
                    System.out.println("Press 2 for Show costs in");
                    callCostEntry = inputFromUser.nextInt();
                    switch (callCostEntry) {
                        case 1 -> System.out.println("Call cost limit");
                        case 2 -> System.out.println("Show costs in");
                    }
                }
                case 8 -> System.out.println("Prepaid credit");
            }
        }
    }

    private static void tonesEntryMenu() {
        int tonesEntry;
        Scanner inputFromUser = new Scanner(System.in);
        if (numberEntered == 5) {
            System.out.println("Tones");
            System.out.println("Kindly Enter a number to Show call duration");
            System.out.println("Press 1 for Ringing tone");
            System.out.println("Press 2 for Ringing volume");
            System.out.println("Press 3 for Incoming call alert");
            System.out.println("Press 4 for Composer");
            System.out.println("Press 5 for Message Alert tone");
            System.out.println("Press 6 for Keypad tones");
            System.out.println("Press 7 for Warning and game tones");
            System.out.println("Press 8 for Vibrating alert");
            System.out.println("Press 9 for Screen saver");
            tonesEntry = inputFromUser.nextInt();
            switch (tonesEntry) {
                case 1 -> System.out.println("Ringing tone");
                case 2 -> System.out.println("Ringing volume");
                case 3 -> System.out.println("Incoming call alert");
                case 4 -> System.out.println("Composer");
                case 5 -> System.out.println("Message Alert tone");
                case 6 -> System.out.println("Keypad tones");
                case 7 -> System.out.println("Warming and game tones");
                case 8 -> System.out.println("Vibrating alert");
                case 9 -> System.out.println("Screen saver");
            }
        }
    }

    private static void settingsMenu() {
        int settingsEntry;
        int callSettingsEntry, phoneSettingsEntry, secSettingsEntry;
        Scanner inputFromUser = new Scanner(System.in);
        if (numberEntered == 6) {
            System.out.println("Settings");
            System.out.println("Kindly enter a number change your settings");
            System.out.println("Press 1 for Call settings");
            System.out.println("Press 2 for Phone settings");
            System.out.println("Press 3 for Security settings");
            System.out.println("Press 4 for Restore factory settings");
            settingsEntry = inputFromUser.nextInt();
            switch (settingsEntry) {
                case 1 -> {
                    System.out.println("Call settings");
                    System.out.println("Kindly Enter a number to Show call settings");
                    System.out.println("Press 1 for Automatic redial");
                    System.out.println("Press 2 for Speed dialling");
                    System.out.println("Press 3 for Call waiting options");
                    System.out.println("Press 4 for Own number sending");
                    System.out.println("Press 5 for Phone line in use");
                    System.out.println("Press 6 for Automatic answer");
                    callSettingsEntry = inputFromUser.nextInt();
                    switch (callSettingsEntry) {
                        case 1 -> System.out.println("Automatic redial");
                        case 2 -> System.out.println("Speed dialling");
                        case 3 -> System.out.println("Call waiting options");
                        case 4 -> System.out.println("Own number sending");
                        case 5 -> System.out.println("Phone line in use");
                        case 6 -> System.out.println("Automatic answer");
                    }
                }
                case 2 -> {
                    System.out.println("Phone settings");
                    System.out.println("Kindly Enter a number to Show Phone settings");
                    System.out.println("Press 1 for Language");
                    System.out.println("Press 2 for Cell info display");
                    System.out.println("Press 3 for Welcome note");
                    System.out.println("Press 4 Network selection");
                    System.out.println("Press 5 for Lights");
                    System.out.println("Press 6 to Confirm SIM service actions");
                    phoneSettingsEntry = inputFromUser.nextInt();
                    switch (phoneSettingsEntry) {
                        case 1 -> System.out.println("Language");
                        case 2 -> System.out.println("Cell info display");
                        case 3 -> System.out.println("Welcome note");
                        case 4 -> System.out.println("Network selection");
                        case 5 -> System.out.println("Lights");
                        case 6 -> System.out.println("Confirm SIM service actions");
                    }
                }
                case 3 -> {
                    System.out.println("Security settings");
                    System.out.println("Kindly Enter a number to Show call settings");
                    System.out.println("Press 1 for PIN code request");
                    System.out.println("Press 2 for Call barring service");
                    System.out.println("Press 3 for Fixed Dialling");
                    System.out.println("Press 4 for Closed user group");
                    System.out.println("Press 5 for Phone security");
                    System.out.println("Press 6 to Change access codes");
                    secSettingsEntry = inputFromUser.nextInt();
                    switch (secSettingsEntry) {
                        case 1 -> {
                            System.out.println("PIN code request");
                            System.out.println("To return to the previous options, Press 1" +
                                    "To go back to Main Menu, press 0");
                            returnBack = inputFromUser.nextInt();
                            if(returnBack == 1) Nokia.settingsMenu();
                            if(returnBack == 0) nokiaMainMenu();
                        }
                        case 2 -> {
                            System.out.println("Call barring service");
                            System.out.println("To return to the previous options, Press 1\n" +
                                    "To go back to Main Menu, press 0");
                            returnBack = inputFromUser.nextInt();
                            if(returnBack == 1) Nokia.settingsMenu();
                            if(returnBack == 0) nokiaMainMenu();
                        }
                        case 3 -> {
                            System.out.println("Fixed Dialling");
                            System.out.println("To return to the previous options, Press 1\n" +
                                    "To go back to Main Menu, press 0");
                            returnBack = inputFromUser.nextInt();
                            if(returnBack == 1) Nokia.settingsMenu();
                            if(returnBack == 0) nokiaMainMenu();
                        }
                        case 4 -> {
                            System.out.println("Closed user group");
                            System.out.println("To return to the previous options, Press 1\n" +
                                    "To go back to Main Menu, press 0");
                            returnBack = inputFromUser.nextInt();
                            if(returnBack == 1) Nokia.settingsMenu();
                            if(returnBack == 0) nokiaMainMenu();
                        }
                        case 5 -> {
                            System.out.println("Phone security");
                            System.out.println("To return to the previous options, Press 1\n" +
                                    "To go back to Main Menu, press 0");
                            returnBack = inputFromUser.nextInt();
                            if(returnBack == 1) Nokia.settingsMenu();
                            if(returnBack == 0) nokiaMainMenu();
                        }
                        case 6 -> {
                            System.out.println("Change access codes");
                            System.out.println("To return to the previous options, Press 1\n" +
                                    "To go back to Main Menu, press 0");
                            returnBack = inputFromUser.nextInt();
                            if(returnBack == 1) Nokia.settingsMenu();
                            if(returnBack == 0) nokiaMainMenu();
                        }
                    }
                    /*System.out.println("Press 1 to go back to the previous Menu\n" +
                            "Press 0 to go back to the Main Menu\n" +
                            "To Repeat this Menu again" +
                            "Press CTRL+D to exit");
                    returnBack = inputFromUser.nextInt();
                    if(returnBack == 1) Nokia.settingsMenu();
                    if(returnBack == 0) nokiaMainMenu();*/
                }
                case 4 -> {
                    System.out.println("Restore factory settings");
                    System.out.println("To repeat this option, Press 1\n" +
                            "To go back to Main Menu, press 0");
                    returnBack = inputFromUser.nextInt();
                    if(returnBack == 1) Nokia.settingsMenu();
                    if(returnBack == 0) nokiaMainMenu();
                }
            }
        }
    }

    private static void callDivertMenu() {
        Scanner inputFromUser = new Scanner(System.in);
        if (numberEntered == 7) {
            System.out.println("Call divert");

            System.out.println("Press 1 to go back to the previous Menu\n" +
                    "Press 0 to go back to the Main Menu\n" +
                    "Press CTRL+D to exit");
            returnBack = inputFromUser.nextInt();
            if(returnBack == 1) Nokia.settingsMenu();
            if(returnBack == 0) nokiaMainMenu();
        }
    }

    private static void gamesMenu() {
        Scanner inputFromUser = new Scanner(System.in);
        if (numberEntered == 8) {
            System.out.println("Games");


            System.out.println("Press 1 to go back to the previous Menu\n" +
                    "Press 0 to go back to the Main Menu\n" +
                    "Press CTRL+D to exit");
            returnBack = inputFromUser.nextInt();
            if(returnBack == 1) Nokia.callDivertMenu();
            if(returnBack == 0) nokiaMainMenu();
        }
    }

    private static void calculatorMenu() {
        Scanner inputFromUser = new Scanner(System.in);
        if (numberEntered == 9) {
            System.out.println("Calculator");

            System.out.println("Press 1 to go back to the previous Menu\n" +
                    "Press 0 to go back to the Main Menu\n" +
                    "Press CTRL+D to exit");
            returnBack = inputFromUser.nextInt();
            if(returnBack == 1) Nokia.gamesMenu();
            if(returnBack == 0) nokiaMainMenu();
        }
    }

    private static void reminderMenu() {
        Scanner inputFromUser = new Scanner(System.in);

        if (numberEntered == 10) {
            System.out.println("Reminders");

            System.out.println("Press 1 to go back to the previous Menu\n" +
                    "Press 0 to go back to the Main Menu\n" +
                    "Press CTRL+D to exit");
            returnBack = inputFromUser.nextInt();
            if(returnBack == 1) Nokia.calculatorMenu();
            if(returnBack == 0) nokiaMainMenu();
        }
    }

    private static void clockEntryMenu() {
        Scanner inputFromUser = new Scanner(System.in);
        if (numberEntered == 11) {
            int clockEntry;
            System.out.println("Clock");
            System.out.println("Kindly Enter a number to Show Clock");
            System.out.println("Press 1 for Alarm clock");
            System.out.println("Press 2 for Clock settings");
            System.out.println("Press 3 for Date settings");
            System.out.println("Press 4 for Stopwatch");
            System.out.println("Press 5 for Countdown timer");
            System.out.println("Press 6 for Auto update of date and time");
            clockEntry = inputFromUser.nextInt();
            switch (clockEntry) {
                case 1 -> {
                    System.out.println("Alarm clock");

                    System.out.println("Press 1 to go back to the previous option\n" +
                            "Press 0 to go back to the Main Menu\n" +
                            "Press CTRL+D to exit");
                    returnBack = inputFromUser.nextInt();
                    if(returnBack == 1) Nokia.clockEntryMenu();
                    if(returnBack == 0) nokiaMainMenu();
                }
                case 2 -> System.out.println("Clock settings");
                case 3 -> System.out.println("Date settings");
                case 4 -> System.out.println("Stopwatch");
                case 5 -> System.out.println("Countdown timer");
                case 6 -> System.out.println("Auto update of date and time");
            }

        }
    }

    private static void profileMenu() {
        Scanner inputFromUser = new Scanner(System.in);
        if (numberEntered == 12) {
            System.out.println("Profiles");

            System.out.println("Press 1 to go back to the previous Menu\n" +
                    "Press 0 to go back to the Main Menu\n" +
                    "Press CTRL+D to exit");
            returnBack = inputFromUser.nextInt();
            if(returnBack == 1) Nokia.clockEntryMenu();
            if(returnBack == 0) nokiaMainMenu();
        }
    }

    private static void simServicesMenu() {
        int returnBack;
        Scanner inputFromUser = new Scanner(System.in);
        if (numberEntered == 13) {
            System.out.println("SIM services");

            System.out.println("Press 1 to go back to the previous Menu\n" +
                    "Press 0 to go back to the Main Menu\n" +
                    "Press CTRL+D to exit");
            returnBack = inputFromUser.nextInt();
            if(returnBack == 1) Nokia.profileMenu();
            if(returnBack == 0) nokiaMainMenu();


        }
    }
}

            //System.out.println("To quit this enter exit");
             //       hasNext = inputFromUser.hasNextBoolean();