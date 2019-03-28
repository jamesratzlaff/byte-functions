/**
 * 
 */
package com.jamesratzlaff.util.function;

/**
 * @author James Ratzlaff
 *
 */
@FunctionalInterface
public interface BytePredicate {

	/**
	 * 
	 * @param b byte
	 * @return boolean
	 */
	boolean test(byte b);
	
}
