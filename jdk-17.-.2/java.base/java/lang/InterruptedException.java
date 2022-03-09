/*
 * Copyright (c) 1995, 2019, Oracle and/or its affiliates. All rights reserved.
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

package java.lang;

/**
 * Thrown when a thread is waiting, sleeping, or otherwise occupied,
 * and the thread is interrupted, either before or during the activity.
 * Occasionally a method may wish to test whether the current
 * thread has been interrupted, and if so, to immediately throw
 * this exception.  The following code can be used to achieve
 * this effect:
 * <pre>
 *  if (Thread.interrupted())  // Clears interrupted status!
 *      throw new InterruptedException();
 * </pre>
 *
 * @author  Frank Yellin
 * @see     Object#wait()
 * @see     Object#wait(long)
 * @see     Object#wait(long, int)
 * @see     Thread#sleep(long)
 * @see     Thread#interrupt()
 * @see     Thread#interrupted()
 * @since   1.0
 */
public class InterruptedException extends Exception {
    @java.io.Serial
    private static final long serialVersionUID = 6700697376100628473L;

    /**
     * Constructs an {@code InterruptedException} with no detail  message.
     */
    public InterruptedException() {
        super();
    }

    /**
     * Constructs an {@code InterruptedException} with the
     * specified detail message.
     *
     * @param   s   the detail message.
     */
    public InterruptedException(String s) {
        super(s);
    }
}
