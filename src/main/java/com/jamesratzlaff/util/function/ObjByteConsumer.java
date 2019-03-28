/**
 * 
 */
package com.jamesratzlaff.util.function;

/**
 * 
 * @author James Ratzlaff
 *
 * @param <T> T
 */
@FunctionalInterface
public interface ObjByteConsumer<T> {

	/**
	 * 
	 * @param t T
	 * @param b byte
	 */
	void accept(T t, byte b);
	
}
