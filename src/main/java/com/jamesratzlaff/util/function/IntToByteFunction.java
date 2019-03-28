package com.jamesratzlaff.util.function;
/**
 * 
 * @author James Ratzlaff
 *
 */
@FunctionalInterface
public interface IntToByteFunction {

	/**
	 * 
	 * @param i int
	 * @return byte
	 */
	byte applyAsByte(int i);
	
}
