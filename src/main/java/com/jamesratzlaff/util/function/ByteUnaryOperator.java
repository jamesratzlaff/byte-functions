/**
 * 
 */
package com.jamesratzlaff.util.function;

import java.util.Objects;

/**
 * @author James Ratzlaff
 *
 */
@FunctionalInterface
public interface ByteUnaryOperator {
	/**
	 * 
	 * @param b
	 * @return
	 */
	byte applyAsByte(byte b);

	/**
	 * 
	 * @param before
	 * @return
	 */
	default ByteUnaryOperator compose(ByteUnaryOperator before) {
		Objects.requireNonNull(before);
		return (byte v) -> applyAsByte(before.applyAsByte(v));
	}

	/**
	 * 
	 * @param after
	 * @return
	 */
	default ByteUnaryOperator andThen(ByteUnaryOperator after) {
		Objects.requireNonNull(after);
		return (byte t) -> after.applyAsByte(applyAsByte(t));
	}

	/**
	 * 
	 * @return
	 */
	static ByteUnaryOperator identity() {
		return t -> t;
	}
}
