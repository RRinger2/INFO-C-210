//----------------------------------------------------------------------
// ArrayStringLog.java        by Dale/Joyce/Weems
//
// Implements StringLogInterface using an array to hold the strings.
//----------------------------------------------------------------------

public class ArrayStringLog implements StringLogInterface
{
  protected String name;              // name of this StringLog
  protected String[] log;             // array that holds strings
  protected int lastIndex = -1;       // index of last string in array

  public ArrayStringLog(String name, int maxSize)
  // Precondition:   maxSize > 0
  //
  // Instantiates and returns a reference to an empty ArrayStringLog
  // object with name "name" and room for maxSize strings.
  {
    log = new String[maxSize];
    this.name = name;
  }

  // method to delete all instances of an element
  public int deleteAll(String element){
    int count = 0;
    for (int i = 0; i <= lastIndex; i++)
    {
      if (element.equalsIgnoreCase(log[i]))
      {
        log[i] = null;
        count++;
      }
    }
    return count;
  }

  public int howMany(String element){
    int count = 0;
    for (int i = 0; i <= lastIndex; i++)
    {
      if (element.equalsIgnoreCase(log[i]))
        count++;
    }
    return count;
  }

  public boolean isEmpty()
  // Returns true if this StringLog is empty, otherwise returns false.
  {
    if (lastIndex == -1)
      return true;
    else
      return false;
  }

  public ArrayStringLog(String name)
  // Instantiates and returns a reference to an empty ArrayStringLog
  // object with name "name" and room for 100 strings.
  {
    log = new String[100];
    this.name = name;
  }

  public void insert(String element)
  // Precondition:   This StringLog is not full.
  //
  // Places element into this StringLog.
  {
    lastIndex++;
    log[lastIndex] = element;
  }


  public boolean isFull()
  // Returns true if this StringLog is full, otherwise returns false.
  {
    if (lastIndex == (log.length - 1))
      return true;
    else
      return false;
  }

  public int size()
  // Returns the number of Strings in this StringLog.
  {
    return (lastIndex + 1);
  }

  public boolean contains(String element)
  // Returns true if element is in this StringLog,
  // otherwise returns false.
  // Ignores case differences when doing string comparison.
  {
    int location = 0;
    while (location <= lastIndex)
    {
      if (element.equalsIgnoreCase(log[location]))  // if they match
        return true;
      else
        location++;
    }
    return false;
  }

  public void clear()
  // Makes this StringLog empty.
  {
    for (int i = 0; i <= lastIndex; i++)
      log[i] = null;
    lastIndex = -1;
  }

  public String getName()
  // Returns the name of this StringLog.
  {
    return name;
  }

  public String toString()
  // Returns a nicely formatted string representing this StringLog.
  {
    String logString = "Log: " + name + "\n\n";

    for (int i = 0; i <= lastIndex; i++)
      logString = logString + (i+1) + ". " + log[i] + "\n";

    return logString;
  }
  public boolean uniqInsert(String element) {
    // Check if the element already exists in the log
    if (contains(element))
    {
      return false; // Element already exists, do not insert
    }// Insert the element
    lastIndex++;
    log[lastIndex] = element;
    return true; // Successfully inserted
  }
}
