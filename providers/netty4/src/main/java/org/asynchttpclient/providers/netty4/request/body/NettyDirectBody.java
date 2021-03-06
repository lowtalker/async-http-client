/*
 * Copyright (c) 2014 AsyncHttpClient Project. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at
 *     http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
package org.asynchttpclient.providers.netty4.request.body;

import java.io.IOException;

import org.asynchttpclient.AsyncHttpClientConfig;
import org.asynchttpclient.providers.netty4.future.NettyResponseFuture;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;

public abstract class NettyDirectBody implements NettyBody {

    public abstract ByteBuf byteBuf();

    @Override
    public void write(Channel channel, NettyResponseFuture<?> future, AsyncHttpClientConfig config) throws IOException {
        throw new UnsupportedOperationException("This kind of body is supposed to be writen directly");
    }
}
