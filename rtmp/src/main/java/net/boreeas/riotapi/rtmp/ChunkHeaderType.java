/*
 * Copyright 2014 Malte Schütze
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.boreeas.riotapi.rtmp;

/**
 * Created on 5/18/2014.
 */
public enum ChunkHeaderType {
    FULL(11),
    NO_MSG_STREAM_ID(7),
    TIMESTAMP_ONLY(3),
    NO_HEADER(0);

    public final int length;

    private ChunkHeaderType(int length) {
        this.length = length;
    }
}