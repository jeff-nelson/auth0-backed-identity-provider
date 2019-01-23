/*
 * Copyright (c) 2019 Jeff Nelson LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jeffnelson.common.auth;

import com.cinchapi.auth.IdentityProvider;
import com.cinchapi.cloud.auth.Auth0IdentityProvider;

/**
 * An configurable {@link IdentityProvider} that is backed by the Auth0 identity
 * management platform.
 * 
 * @author Jeff Nelson
 */
public class Auth0BackedIdentityProvider {

    /**
     * Create a {@link Auth0BackedIdentityProvider} instance with the specified
     * connection information.
     * 
     * @param clientId
     * @param clientSecret
     * @param audience
     * @param connection
     * @param domain
     * @return the {@link Auth0BackedIdentityProvider}
     */
    public static IdentityProvider create(String clientId, String clientSecret,
            String audience, String connection, String domain) {
        return new Auth0IdentityProvider() {

            @Override
            protected String audience() {
                return audience;
            }

            @Override
            protected String clientId() {
                return clientId;
            }

            @Override
            protected String clientSecret() {
                return clientSecret;
            }

            @Override
            protected String connection() {
                return connection;
            }

            @Override
            protected String domain() {
                return domain;
            }

        };
    }
}
