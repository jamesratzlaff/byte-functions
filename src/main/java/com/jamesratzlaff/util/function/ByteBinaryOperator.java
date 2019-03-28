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
	 * @param a
	 * @param b
	 * @return
	 */
	byte applyAsByte(byte left, byte right);
	
	static ByteBinaryOperator asUnsignedIntBinaryOperator(IntBinaryOperator intbin) {
		return (a,b)->(byte)intbin.applyAsInt(Byte.toUnsignedInt(a), Byte.toUnsignedInt(b));
	}
	
}
