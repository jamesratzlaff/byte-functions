/**
 * 
 */
package com.jamesratzlaff.util.function;

/**
 * @author James Ratzlaff
 *
 */
@FunctionalInterface
public interface ByteToIntFunction {
	/**
	 * 
	 * @param b byte
	 * @return int
	 */
	int applyAsInt(byte b);
}
