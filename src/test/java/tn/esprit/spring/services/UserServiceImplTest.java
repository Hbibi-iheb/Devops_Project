package tn.esprit.spring.services;

import static org.junit.jupiter.api.Assertions.*; // Pour les assertions
import org.junit.jupiter.api.Assertions; // Pour les assertions
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation; // Pour l'annotation Order
import org.junit.jupiter.api.Order; // Pour l'annotation Order
import org.junit.jupiter.api.Test; // Pour l'annotation Test
import org.junit.jupiter.api.TestMethodOrder; // Pour l'annotation TestMethodOrder
import org.springframework.beans.factory.annotation.Autowired; // Pour l'annotation Autowired
import org.springframework.boot.test.context.SpringBootTest; // Pour le test Spring Boot
import tn.esprit.spring.services.IUserService; // Assurez-vous que ce package existe
import tn.esprit.spring.models.User; // Assurez-vous que ce package existe
import java.util.List; // Pour la liste

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class UserServiceImplTest {

    @Autowired
    IUserService us;

    @Test
    @Order(1)
    public void testRetrieveAllUsers() {
        List<User> listUsers = us.retrieveAllUsers();
        Assertions.assertEquals(0, listUsers.size());
    }
}
