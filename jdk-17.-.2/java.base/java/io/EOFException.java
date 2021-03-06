/*
 * Copyright (c) 1995, 2020, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package java.io;

/**
 * Signals that an end of file or end of stream has been reached
 * unexpectedly during input.
 * <p>
 * This exception is mainly used by data input streams to signal end of
 * stream. Note that many other input operations return a special value on
 * end of stream rather than throwing an exception.
 *
 * @author  Frank Yellin
 * @see     DataInputStream
 * @see     IOException
 * @since   1.0
 */
public class EOFException extends IOException {
    @Serial
    private static final long serialVersionUID = 6433858223774886977L;

    /**
     * Constructs an {@code EOFException} with {@code null}
     * as its error detail message.
     */
    public EOFException() {
        super();
    }

    /**
     * Constructs an {@code EOFException} with the specified detail
     * message. The string {@code s} may later be retrieved by the
     * {@link Throwable#getMessage} method of class
     * {@code java.lang.Throwable}.
     *
     * @param   s   the detail message.
     */
    public EOFException(String s) {
        super(s);
    }
}
