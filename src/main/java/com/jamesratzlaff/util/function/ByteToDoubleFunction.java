/**
 * 
 */
package com.jamesratzlaff.util.function;

/**
 * @author James Ratzlaff
 *
 */
@FunctionalInterface
public interface ByteToDoubleFunction {

	/**
	 * 
	 * @param b byte
	 * @return double
	 */
	double applyAsDouble(byte b);
	
}
