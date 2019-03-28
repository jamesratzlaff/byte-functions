/**
 * 
 */
package com.jamesratzlaff.util.function;

/**
 * @author James Ratzlaff
 *
 */
@FunctionalInterface
public interface ByteFunction<R> {
	/**
	 * 
	 * @param b
	 * @return
	 */
	R apply(byte b);
}
