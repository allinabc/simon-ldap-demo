package me.xueyao;

import me.xueyao.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SimonLdapDemoApplicationTests {

    @Autowired
    private PersonRepository personRepository;

    /**
     * 查询ldap-server中满足条件的数据
     */
    @Test
    public void findAll() {
        personRepository.findAll().forEach(person -> {
            System.out.println(person);
        });
    }

}
