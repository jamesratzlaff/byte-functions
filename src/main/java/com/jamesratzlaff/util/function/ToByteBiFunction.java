package com.jamesratzlaff.util.function;

/**
 * 
 * @author James Ratzlaff
 *
 * @param <T> T
 * @param <U> U
 */
@FunctionalInterface
public interface ToByteBiFunction<T,U> {
	
	/**
	 * 
	 * @param t T
	 * @param u U
	 * @return byte
	 */
	byte applyAsByte(T t, U u);
	

}
