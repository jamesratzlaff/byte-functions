package com.jamesratzlaff.util.function;
/**
 * 
 * @author James Ratzlaff
 *
 * @param <T> T
 */
@FunctionalInterface
public interface ObjIntByteConsumer<T> {
	/**
	 * 
	 * @param t Object
	 * @param i int
	 * @param b byte
	 */
	void accept(T t, int i, byte b);
}
