package com.jamesratzlaff.util.function;

/**
 * 
 * @author James Ratzlaff
 *
 * @param <T>
 * @param <R>
 */
@FunctionalInterface
public interface ToByteBiFunction<T,U> {
	
	/**
	 * 
	 * @param t
	 * @param u
	 * @return
	 */
	byte applyAsByte(T t, U u);
	

}
