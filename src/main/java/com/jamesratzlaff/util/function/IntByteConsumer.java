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
	 * @param i int
	 * @param b byte
	 */
	void accept(int i, byte b);
}
