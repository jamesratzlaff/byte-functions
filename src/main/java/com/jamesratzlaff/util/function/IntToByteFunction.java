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
	 * @param i
	 * @return
	 */
	byte applyAsByte(int i);
	
}
