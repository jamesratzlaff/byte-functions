package com.jamesratzlaff.util.function;

/**
 * 
 * @author James Ratzlaff
 *
 * @param <T> T
 */
@FunctionalInterface
public interface ObjIntToByteFunction<T> {

	/**
	 * 
	 * @param t T
	 * @param i int
	 * @return byte
	 */
	byte applyAsByte(T t, int i);
	
}
