/**
 * 
 */
package com.jamesratzlaff.util.function;

/**
 * @author James Ratzlaff
 *
 */
@FunctionalInterface
public interface ByteToShortFunction {

	/**
	 * 
	 * @param b byte
	 * @return short
	 */
	short applyAsShort(byte b);
	
}
