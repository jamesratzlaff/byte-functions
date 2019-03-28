package com.jamesratzlaff.util.function;

/**
 * 
 * @author James Ratzlaff
 *
 * @param <T> T
 */
@FunctionalInterface
public interface ToByteFunction<T> {
	/**
	 * 
	 * @param t T
	 * @return T
	 */
	T applyAsByte(T t);
}
