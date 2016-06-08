package org.lmdbjava;

import static java.lang.Integer.BYTES;
import java.nio.ByteBuffer;
import static java.nio.ByteBuffer.allocateDirect;
import static java.nio.ByteOrder.LITTLE_ENDIAN;

/**
 * Static constants and methods that are convenient when writing LMDB-related
 * tests.
 */
public final class TestUtils {

  public static final String DB_1 = "test-db-1";
  public static final int POSIX_MODE = 0664;

  static ByteBuffer createBb() {
    ByteBuffer bb = allocateDirect(BYTES);
    bb.order(LITTLE_ENDIAN);
    return bb;
  }

  static ByteBuffer createBb(int value) {
    ByteBuffer bb = allocateDirect(BYTES);
    bb.order(LITTLE_ENDIAN);
    bb.putInt(value).flip();
    return bb;
  }

  private TestUtils() {
  }
}