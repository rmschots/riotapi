/*
 * Copyright 2015 The LolDevs team (https://github.com/loldevs)
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

package net.boreeas.riotapi.loginqueue;

import net.boreeas.riotapi.Shard;

/**
 * @author Malte Schütze
 */
public class LoginQueue implements LoginProvider {
    private LoginProvider provider;

    public LoginQueue(Shard shard) {
        provider = new net.boreeas.riotapi.loginqueue.oldlq.LoginQueue(shard);
    }

    @Override
    public AuthResult getAuthToken(String username, String password) {
        return provider.getAuthToken(username, password);
    }

    @Override
    public QueueTimer waitInQueue(String username, String password) {
        return provider.waitInQueue(username, password);
    }

    @Override
    public String waitInQueueBlocking(String username, String password) {
        return provider.waitInQueueBlocking(username, password);
    }
}
