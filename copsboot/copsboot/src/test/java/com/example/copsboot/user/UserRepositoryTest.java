package com.example.copsboot.user;

import static org.assertj.core.api.Assertions.*;

import java.util.HashSet;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest // <.>
public class UserRepositoryTest {

    @Autowired
    private UserRepository repository; // <.>

    @Test
    public void testStoreUser() { // <.>
        HashSet<UserRole> roles = new HashSet<>();
        roles.add(UserRole.OFFICER);
        User user = repository.save(new User(UUID.randomUUID(), // <.>
                                            "alex.foley@beverly-hills.com",
                                            "my-secret-pwd",
                                            roles));
        assertThat(user).isNotNull(); // <.>

        assertThat(repository.count()).isEqualTo(1L); // <.>
    }
}