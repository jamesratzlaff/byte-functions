/**
 * 
 */
package com.jamesratzlaff.util.function;

/**
 * 
 * @author James Ratzlaff
 *
 * @param <R> R
 */
@FunctionalInterface
public interface ByteFunction<R> {
	/**
	 * 
	 * @param b byte
	 * @return R
	 */
	R apply(byte b);
}
