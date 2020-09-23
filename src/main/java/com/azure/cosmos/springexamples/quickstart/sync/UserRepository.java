// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.springexamples.quickstart.sync;

import com.azure.cosmos.springexamples.common.User;
import com.azure.spring.data.cosmos.repository.CosmosRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CosmosRepository<User, String> {

    Iterable<User> findByFirstName(String firstName);

    User findByIdAndLastName(String id, String lastName);
}
