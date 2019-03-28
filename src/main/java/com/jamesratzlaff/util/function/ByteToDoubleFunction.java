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
	 * @param b
	 * @return
	 */
	double applyAsDouble(byte b);
	
}
