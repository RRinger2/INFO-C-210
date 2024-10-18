import java.util.Scanner;

public class ITDArrayStringLog
{
  public static void main(String[] args)
  {
    ArrayStringLog test = new ArrayStringLog("Testing");
    Scanner conIn = new Scanner(System.in);

    String skip;       // skip end of line after reading an integer
    boolean keepGoing; // flag for "choose operation" loop
    int constructor;   // indicates user's choice of constructor
    int operation;     // indicates user's choice of operation

    // Handle test name
    System.out.println("What is the name of this test?");
    String testName = conIn.nextLine();
    System.out.println("\nThis is test " + testName + "\n");

    // Handle constructor
    System.out.println("Choose a constructor:");
    System.out.println("1: ArrayStringLog(String name)");
    System.out.println("2: ArrayStringLog(String name, int maxSize)");
    if (conIn.hasNextInt())
      constructor = conIn.nextInt();
    else
    {
      System.out.println("Error: you must enter an integer.");
      System.out.println("Terminating test.");
      return;
    }
    skip = conIn.nextLine();

    switch (constructor)
    {
      case 1:
        test = new ArrayStringLog(testName);
        break;

      case 2:
        System.out.println("Enter a maximum size:");
        int maxSize;
        if (conIn.hasNextInt())
          maxSize = conIn.nextInt();
        else
        {
          System.out.println("Error: you must enter an integer.");
          System.out.println("Terminating test.");
          return;
        }
        skip = conIn.nextLine();
        test = new ArrayStringLog(testName, maxSize);
        break;

      default:
        System.out.println("Error: invalid constructor choice.");
        System.out.println("Terminating test.");
        return;
    }

    // Main loop
    keepGoing = true;
    while (keepGoing)
    {
      // Display operation choices
      System.out.println("\nChoose an operation:");
      System.out.println("1: insert(String element)");
      System.out.println("2: deleteAll(String element)");
      System.out.println("3: howMany(String element)");
      System.out.println("4: isEmpty()");
      System.out.println("5: isFull()");
      System.out.println("6: size()");
      System.out.println("7: contains(String element)");
      System.out.println("8: clear()");
      System.out.println("9: getName()");
      System.out.println("10: toString()");
      System.out.println("11: uniqInsert(String element)");
      System.out.println("12: Quit test");

      // Get user's operation choice
      if (conIn.hasNextInt())
        operation = conIn.nextInt();
      else
      {
        System.out.println("Error: you must enter an integer.");
        System.out.println("Terminating test.");
        return;
      }
      skip = conIn.nextLine();

      // Perform operation
      switch (operation)
      {
        case 1:
          System.out.println("Enter a string to insert:");
          String insertElement = conIn.nextLine();
          test.insert(insertElement);
          break;

        case 2:
          System.out.println("Enter a string to delete:");
          String deleteElement = conIn.nextLine();
          int count = test.deleteAll(deleteElement);
          System.out.println("Deleted " + count + " instances of '" + deleteElement + "'");
          break;

        case 3:
          System.out.println("Enter a string to count:");
          String countElement = conIn.nextLine();
          int howMany = test.howMany(countElement);
          System.out.println("There are " + howMany + " instances of '" + countElement + "'");
          break;

        case 4:
          System.out.println("Is the log empty? " + test.isEmpty());
          break;

        case 5:
          System.out.println("Is the log full? " + test.isFull());
          break;

        case 6:
          System.out.println("The size of the log is " + test.size());
          break;

        case 7:
          System.out.println("Enter a string to search for:");
          String searchElement = conIn.nextLine();
          System.out.println("Does the log contain '" + searchElement + "'? " + test.contains(searchElement));
          break;

        case 8:
          test.clear();
          System.out.println("The log has been cleared.");
          break;

        case 9:
          System.out.println("The name of the log is '" + test.getName() + "'");
          break;

        case 10:
          System.out.println(test.toString());
          break;

        case 11:
          System.out.println("Enter a string to insert uniquely:");
          String uniqInsertElement = conIn.nextLine();
          System.out.println("Was the string inserted? " + test.uniqInsert(uniqInsertElement));
          break;

        case 12:
          keepGoing = false;
          break;

        default:
          System.out.println("Error: invalid operation choice.");
      }
    }
  }
}