/*
 * Copyright 2014 The LolDevs team (https://github.com/loldevs)
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

package net.boreeas.riotapi.spectator.rest;

import lombok.Getter;
import lombok.SneakyThrows;
import net.boreeas.riotapi.spectator.SpectatorApiHandler;

import java.util.Date;

/**
 * Created on 4/28/2014.
 */
@Getter
public class AvailableChunkInfo {

    private int id;
    private long duration;
    private String receivedTime;

    @SneakyThrows
    public Date getReceivedTimeAsDate() {
        return SpectatorApiHandler.DATE_FMT.parse(receivedTime);
    }
}
