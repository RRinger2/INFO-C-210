//----------------------------------------------------------------------
// StringLogInterface.java     by Dale/Joyce/Weems
//
// Interface for a class that implements a log of Strings.
// A log "remembers" the elements placed into it.
//
// A log must have a "name".
//----------------------------------------------------------------------

public interface StringLogInterface
{
  void insert(String element);
  // Precondition:   This StringLog is not full.
  //
  // Places element into this StringLog.

  int deleteAll(String element);
  // method to delete all instances of an element

  int howMany(String element);
  // Returns the number of times element occurs in this StringLog.

  boolean isEmpty();
  // Returns true if this StringLog is empty, otherwise returns false.

  boolean isFull();
  // Returns true if this StringLog is full, otherwise returns false.

  int size();
  // Returns the number of Strings in this StringLog.

  boolean contains(String element);
  // Returns true if element is in this StringLog,
  // otherwise returns false.
  // Ignores case differences when doing string comparison.

  void clear();
  // Makes this StringLog empty.

  String getName();
  // Returns the name of this StringLog.

  String toString();

  boolean uniqInsert(String element);

}
