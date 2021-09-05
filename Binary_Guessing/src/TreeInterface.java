
/**
 * An interface for basic operations of a tree.
 * 
 * @author gbadebo
 * @version 2.0
 */
public interface TreeInterface<T>
{
  public T getRootData();
  public int getHeight();
  public int getNumberOfNodes();
  public boolean isEmpty();
  public void clear();
} // end TreeInterface
