/**
 * 
 */
package com.jamesratzlaff.util.function;

import java.util.function.IntBinaryOperator;

/**
 * @author James Ratzlaff
 *
 */
@FunctionalInterface
public interface ByteBinaryOperator {
	/**
	 * 
	 * @param left byte
	 * @param right byte
	 * @return a byte representing some operation of a and b
	 */
	byte applyAsByte(byte left, byte right);
	
	/**
	 * 
	 * @param intbin {@link IntBinaryOperator}
	 * @return {@link ByteUnaryOperator}
	 */
	static ByteBinaryOperator asUnsignedIntBinaryOperator(IntBinaryOperator intbin) {
		return (a,b)->(byte)intbin.applyAsInt(Byte.toUnsignedInt(a), Byte.toUnsignedInt(b));
	}
	
}
