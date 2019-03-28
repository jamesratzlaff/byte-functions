package com.jamesratzlaff.util.function;
/**
 * 
 * @author James Ratzlaff
 *
 * @param <T>
 */
@FunctionalInterface
public interface ObjIntByteConsumer<T> {
	void accept(T t, int i, byte b);
}
