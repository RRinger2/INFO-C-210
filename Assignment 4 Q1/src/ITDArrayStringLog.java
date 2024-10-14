//----------------------------------------------------------------------------
// ITDArrayStringLog.java         by Dale/Joyce/Weems
//
// Interactive Test Driver for the ArrayStringLog class
//----------------------------------------------------------------------------

import java.util.*;

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
        System.out.println("Error in constructor choice. Terminating test.");
        return;
    }

    // Handle test cases
    keepGoing = true;
    while (keepGoing)
    {
      System.out.println("\nChoose an operation:");
      System.out.println("1: insert(String element)");
      System.out.println("2: clear()");
      System.out.println("3: contains(String element)");
      System.out.println("4: isFull()");
      System.out.println("5: size()");
      System.out.println("6: getName()");
      System.out.println("7: show contents");
      System.out.println("8: howMany(String element)");
      System.out.println("9: isEmpty()");
      System.out.println("10: uniqInsert(String element)");
      System.out.println("11: stop Testing");
      if (conIn.hasNextInt())
        operation = conIn.nextInt();
      else
      {
        System.out.println("Error: you must enter an integer.");
        System.out.println("Terminating test.");
        return;
      }
      skip = conIn.nextLine();

      switch (operation)
      {
        case 1:  // insert
          System.out.println("Enter string to insert:");
          String insertString = conIn.nextLine();
          test.insert(insertString);
          break;

        case 2:  // clear
          test.clear();
          break;

        case 3:  // contains
          System.out.println("Enter string to search for:");
          String searchString = conIn.nextLine();
          System.out.println("Result: " + test.contains(searchString));
          break;

        case 4:  // isFull
          System.out.println("Result: " + test.isFull());
          break;

        case 5:  // size
          System.out.println("Result: " + test.size());
          break;

        case 6:  // getName
          System.out.println("Result: " + test.getName());
          break;

        case 7:  // show contents
          System.out.println(test.toString());
          break;

        case 8:  // howMany
          System.out.println("Enter string to count:");
          String countString = conIn.nextLine();
          System.out.println("Result: " + test.howMany(countString));
          break;

        case 9:  // isEmpty
          System.out.println("Result: " + test.isEmpty());
          break;

        case 10:  // uniqInsert
          System.out.println("Enter string to insert:");
          String uniqInsertString = conIn.nextLine();
          System.out.println("Result: " + test.uniqInsert(uniqInsertString));
          break;

        case 11:  // stop Testing
          keepGoing = false;
          break;

        default:
          System.out.println("Error in operation choice.");
      }
    }
  }
}