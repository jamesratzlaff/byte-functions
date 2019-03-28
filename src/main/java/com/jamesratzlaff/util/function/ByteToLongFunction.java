/**
 * 
 */
package com.jamesratzlaff.util.function;

/**
 * @author James Ratzlaff
 *
 */
@FunctionalInterface
public interface ByteToLongFunction {

	/**
	 * 
	 * @param b byte
	 * @return long
	 */
	long applyAsLong(byte b);
	
}
