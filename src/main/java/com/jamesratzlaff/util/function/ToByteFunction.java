package com.jamesratzlaff.util.function;

/**
 * 
 * @author James Ratzlaff
 *
 * @param <T>
 */
@FunctionalInterface
public interface ToByteFunction<T> {
	/**
	 * 
	 * @param t
	 * @return
	 */
	T applyAsByte(T t);
}
