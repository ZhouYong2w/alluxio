/*
 * The Alluxio Open Foundation licenses this work under the Apache License, version 2.0
 * (the "License"). You may not use this work except in compliance with the License, which is
 * available at www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied, as more fully set forth in the License.
 *
 * See the NOTICE file distributed with this work for information regarding copyright ownership.
 */

package alluxio.client.block.stream;

import java.nio.ByteBuffer;

/**
 * A {@link PacketOutStream} which writes to a bytebuffer.
 */
public class TestPacketOutStream extends PacketOutStream {
  public TestPacketOutStream(ByteBuffer buffer, long length) {
    super(new TestPacketWriter(buffer), length);
  }
}