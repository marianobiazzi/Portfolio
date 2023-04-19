/*package com.ap.ap;

import com.ap.ap.models.User;
import com.ap.ap.repository.UserRepo;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {
    @Autowired
    UserRepo repo;
    
    @Test
    public void testCreateUser(){
        PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
        String rawPassword = "Cab12345";
        String encodePassword=passwordEncoder.encode(rawPassword);
        User newUser=new User("marianobiazzi@gmail.com",encodePassword);
        User savedUser=repo.save(newUser);
        assertThat(savedUser).isNotNull();
        assertThat(savedUser.getId()).isGreaterThan(0);
    }
}*/
