import java.util.Scanner;
public class NokiaMenuFunctions {
public static void main(String[] args) {

 String menu = ("""
        List of menu functions
   1 -> Phone book
   2 -> Messages
   3 -> Chat
   4 -> Call register
   5 -> Tones
   6 -> Settings
   7 -> Call divert
   8 -> Games
   9 -> Calculator
   10 -> Reminders
   11 -> Clock
   12 -> Profiles
   13 -> Sim services
      """);

 System.out.println(menu);
 Scanner inputcollector = new Scanner(System.in);
 System.out.print("Choose an option: ");
 int input = inputcollector.nextInt();

 switch(input) {
 case 1: System.out.println("Phone book");
 System.out.print("""
 1. Search
 2. Service Nos
 3. Add name
 4. Erase
 5. Edit
 6. Assign tone
 7. Send b'card
 8. Options
 9. Speed dials
 10. Voice tags
 """);

 Scanner inputcollector12 = new Scanner(System.in);
 System.out.print("Choose an option: ");
 int input12 = inputcollector12.nextInt();
 switch(input12) {
 case 1: System.out.println("You chose Search"); break;
 case 2: System.out.println("You chose Service Nos"); break;
 case 3: System.out.println("You chose Add name"); break;
 case 4: System.out.println("You chose Erase"); break;
 case 5: System.out.println("You chose Edit"); break;
 case 6: System.out.println("You chose Assign tone"); break;
 case 7: System.out.println("You chose Send b'card"); break;
 case 8: System.out.println("You chose Options"); 

  System.out.println("1. Type of view");
  System.out.println("2. Memory status"); break;

 case 9: System.out.println("You chose Speed dials"); break;
 case 10: System.out.println("You chose Voice tags"); break;
 }
break;

 
 case 2: System.out.println("Messages");
 System.out.print("""
 1. Write messages
 2. Inbox
 3. Outbox
 4. Picture messages
 5. Templates
 6. Smileys
 7. Message settings
 8. Info Service
 9. Voice mailbox number
 10. Service command editor
 """);

 Scanner inputcollector21 = new Scanner(System.in);
 System.out.println("Choose an option");
 int input21 = inputcollector21.nextInt();
 switch(input21) { 
 case 1: System.out.println("You chose Write messages"); break;
 case 2: System.out.println("You chose Inbox"); break;
 case 3: System.out.println("You chose Outbox"); break;
 case 4: System.out.println("You chose Picture messages"); break;
 case 5: System.out.println("You chose Templates"); break;
 case 6: System.out.println("You chose Smileys"); break;
 case 7: System.out.println("You chose Message settings");
 
  System.out.println("1. Set 1");

 System.out.println("1. Message centre number");
 System.out.println("2. Messages sent as");
 System.out.println("3. Message validity");

  System.out.println("2. Common");

 System.out.println("1. Delivery reports");
 System.out.println("2.Reply via same centre");
 System.out.println("3.Character support"); break;

 case 8: System.out.println("Info Service"); break;
 case 9: System.out.println("You chose Voice mailbox number"); break;
 case 10: System.out.println("You chose Service command editor"); break;
}

 case 3: System.out.println("You chose Chat"); break;

 case 4: System.out.println("Call register");
 System.out.print("""
 1. Missed calls
 2. Received calls
 3. Dialled numbers
 4. Erase recent call list
 5. Show call duration
 6. Show call costs
 7. Call cost settings
 8. Prepaid credit
 """);

 Scanner inputcollector4 = new Scanner(System.in);
 System.out.println("Choose an option");
 int input4 = inputcollector4.nextInt();
 switch(input4) {
 case 1: System.out.println("You chose Missed calls"); break;
 case 2:System.out.println("You chose Received calls"); break;
 case 3:System.out.println("You chose Dialled numbers"); break;
 case 4:System.out.println("You chose Erase recent call list"); break;
 case 5:System.out.println("You chose Show call duration"); break;
 case 6:System.out.println("You chose Show call costs"); break;
 case 7:System.out.println("You chose Call cost settings"); break;
 case 8:System.out.println("You chose Prepaid credit"); break;
}



 case 5: System.out.println("Tones");
 System.out.print("""
 1. Ringing tone
 2. Ringing volume
 3. Incoming call alert
 4. Composer
 5. Message alert tone
 6. Keypad tones
 7. Warning and game tones
 8. Vibrating alert
 9. Screen saver
  """);

 Scanner inputcollector5 = new Scanner(System.in);
 System.out.println("Choose an option");
 int input5 = inputcollector5.nextInt();
 switch(input5) {
 case 1: System.out.println("You chose Ringing tone"); break;
 case 2:System.out.println("You chose Ringing volume"); break;
 case 3:System.out.println("You chose Incoming call alert"); break;
 case 4:System.out.println("You chose Composer"); break;
 case 5:System.out.println("You chose Message alert tone"); break;
 case 6:System.out.println("You chose Keypad tones"); break;
 case 7:System.out.println("You chose Warning and game tones"); break;
 case 8:System.out.println("You chose Screen saver"); break;
}


 case 6: System.out.println("Settings");
 System.out.print("""
 1. Call settings
 2. Phone settings
 3. Security settings
 4. Restore factory settings
  """);
 
 System.out.println("Choose an option");
 int input6 = inputcollector.nextInt();
 switch(input6) {
 case 1: System.out.println("""
  1. Automatic redial
  2. Speed dialling
  3. Call waiting options
  4. Own number sending
  5. Phone line in use
  6. Automatic answer
 """);
  break;
  
 case 2: System.out.println("""
  1. Language
  2. Cell info display
  3. Welcome note
  4. Network selection
  5. Lights
  6. Confirm sim service actions
    """);
   break;

  case 3: System.out.println("""
  1. Pin code request
  2. Call barring service
  3. Fixed dialling
  4. Closed user group
  5. Phone security
  6. Change access codes
 """);
  break;
 }

 case 7: System.out.println("You chose Call divert"); break;

 case 8: System.out.println("You chose Games"); break;

 case 9: System.out.println("You chose Calculator"); break;

 case 10: System.out.println("You chose Reminders"); break;

 case 11: System.out.println("Clock");
 System.out.print("""
  1. Alarm clock
  2. Clock settings
  3. Date setting
  4. Stopwatch
  5. Countdown timer
  6. Auto update of date and time
   """);

 case 12: System.out.println("You chose Profiles"); break;
 
 case 13: System.out.println("You chose Sim services"); break;






} 

}

}