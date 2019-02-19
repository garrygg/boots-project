package app;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/*不用写代码，只需要注解即可*/
@RunWith(Suite.class)
@Suite.SuiteClasses({ItemServiceTest.class,ItemControllerTest.class})
public class TestSuits {

}
