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
	 * @param b
	 * @return
	 */
	boolean test(byte b);
	
}
