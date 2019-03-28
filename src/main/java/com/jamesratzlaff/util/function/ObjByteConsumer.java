/**
 * 
 */
package com.jamesratzlaff.util.function;

/**
 * @author James Ratzlaff
 *
 */
@FunctionalInterface
public interface ObjByteConsumer<T> {

	void accept(T t, byte b);
	
}
