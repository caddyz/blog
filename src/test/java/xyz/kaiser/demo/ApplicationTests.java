package xyz.kaiser.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.kaiser.demo.config.CodeGenerator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Test
    public void contextLoads() {
        CodeGenerator codeGenerator = new CodeGenerator();
        codeGenerator.generateByTables(false,"t_admin",
                "t_user","t_discuss","t_article");
    }

}

