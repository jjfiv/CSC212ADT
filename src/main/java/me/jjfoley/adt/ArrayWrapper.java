package me.jjfoley.adt;

import javax.annotation.Nullable;

/**
 * This class wraps an Array up in a nice package.
 * 
 * @author jfoley
 *
 * @param <T> the type of items to store in the array.
 */
public class ArrayWrapper<T> {
	/**
	 * Java doesn't let us make an array of T, so we secretly use an array of
	 * objects.
	 */
	final Object[] array;

	/**
	 * Create a new ArrayWrapper with a given, fixed size.
	 * All values are set to null.
	 * @param size - the number of slots in the array.
	 */
	public ArrayWrapper(int size) {
		this.array = new Object[size];
	}

	/**
	 * Edit the value in a given slot of this array.
	 * @param index - the position to edit.
	 * @param item - the item (or null) to put into the position.
	 */
	public void setIndex(int index, @Nullable T item) {
		this.array[index] = item;
	}

	/**
	 * Get the value (or null) at the given index in the array.
	 * @param index - the position to get the value from.
	 * @return the value stored in the array at that position (may be null).
	 */
	@SuppressWarnings("unchecked")
	@Nullable
	public T getIndex(int index) {
		return (T) this.array[index];
	}

	/**
	 * Get the length of the array.
	 * @return the number of positions in this array.
	 */
	public int size() {
		return this.array.length;
	}
}
