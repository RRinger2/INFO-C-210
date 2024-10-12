
//----------------------------------------------------------------------------
// UseStringLog.java           by Dale/Joyce/Weems
//
// Simple example of the use of a StringLog.
//----------------------------------------------------------------------------

public class UseStringLog {
  public static void main(String[] args) {
    StringLogInterface sample;
    sample = new ArrayStringLog("Example Use");

    System.out.println("Is log empty? " + sample.isEmpty());

    sample.insert("Elvis");
    sample.insert("King Louis XII");
    sample.insert("Captain Kirk");
    sample.insert("Mustafa");
    

    System.out.println("Is log empty? " + sample.isEmpty());

    System.out.println(sample);

    System.out.println("The size of the log is " + sample.size());
    System.out.println("Elvis is in the log: " + sample.contains("Elvis"));
    System.out.println("Santa is in the log: " + sample.contains("Santa"));
    System.out.println("How many King Louis? " + sample.howMany("King Louis XII"));
    System.out.println("How elements deleted Mustafa? " + sample.deleteAll("Mustafa"));
    
    // Clear the log
   sample.clear();

    System.out.println("Is log empty? " + sample.isEmpty());
  }
}