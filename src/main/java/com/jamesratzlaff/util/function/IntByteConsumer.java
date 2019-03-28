package com.jamesratzlaff.util.function;
/**
 * 
 * @author James Ratzlaff
 *
 */
@FunctionalInterface
public interface IntByteConsumer {
	/**
	 * 
	 * @param i
	 * @param b
	 */
	void accept(int i, byte b);
}
