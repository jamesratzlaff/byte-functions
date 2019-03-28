package com.jamesratzlaff.util.function;

/**
 * 
 * @author James Ratzlaff
 *
 * @param <T>
 */
@FunctionalInterface
public interface ObjIntToByteBiFunction<T> {

	/**
	 * 
	 * @param t
	 * @param i
	 * @return
	 */
	byte applyAsByte(T t, int i);
	
}
