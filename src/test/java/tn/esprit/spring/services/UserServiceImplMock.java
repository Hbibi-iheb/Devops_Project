package tn.esprit.spring.services;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.repositories.UserRepository;
import tn.esprit.spring.models.User;
import tn.esprit.spring.models.Role;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
@ExtendWith(MockitoExtension.class)
class UserServiceImplMock { 

    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserServiceImpl userService;

    User user = new User("f1", "l1", new Date(), Role.ADMINISTRATEUR);
    List<User> listUsers = new ArrayList<User>() {
        {
            add(new User("f2", "l2", new Date(), Role.ADMINISTRATEUR));
            add(new User("f3", "l3", new Date(), Role.ADMINISTRATEUR));
        }
    };

    @Test
    public void testRetrieveUser() {
        Mockito.when(userRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(user));
        User user1 = userService.retrieveUser("2");
        assertNotNull(user1);
    }
}
