package me.jjfoley.adt;

/**
 * An interface that describes "Queue" behavior.
 * @author jfoley
 *
 * @param <T> the type of items in the queue.
 */
public interface QueueADT<T> {
	/**
	 * Add an item to this queue.
	 * @param item - the item to add.
	 */
	public void enqueue(T item);
	
	/**
	 * Remove an item from this queue.
	 * @param item - the item to remove.
	 */
	public void dequeue(T item);
	
	/**
	 * Check whether there are any items in the queue.
	 * @return true if there are no more items.
	 */
	public boolean isEmpty();
}
