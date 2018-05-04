import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ActiveProfiles({ "test" })
@RunWith(SpringJUnit4ClassRunner.class)
public abstract class BaseTest {

}
