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
	 * @param b byte
	 * @return byte
	 */
	byte applyAsByte(byte b);

	/**
	 * 
	 * @param before {@link ByteUnaryOperator}
	 * @return {@link ByteUnaryOperator}
	 */
	default ByteUnaryOperator compose(ByteUnaryOperator before) {
		Objects.requireNonNull(before);
		return (byte v) -> applyAsByte(before.applyAsByte(v));
	}

	/**
	 * 
	 * @param after {@link ByteUnaryOperator}
	 * @return {@link ByteUnaryOperator}
	 */
	default ByteUnaryOperator andThen(ByteUnaryOperator after) {
		Objects.requireNonNull(after);
		return (byte t) -> after.applyAsByte(applyAsByte(t));
	}

	/**
	 * 
	 * @return {@link ByteUnaryOperator}
	 */
	static ByteUnaryOperator identity() {
		return t -> t;
	}
}
