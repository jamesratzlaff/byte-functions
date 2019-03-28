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
	 * @param b
	 * @return
	 */
	int applyAsInt(byte b);
}
