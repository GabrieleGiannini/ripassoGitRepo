package tap.giannini.provaGitRepo;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AppTest{
	
	private App a;

	@Before
	public void setup(){
		a = new App();
	}
	
	@Test
	public void test1(){
		assertEquals(a.Stringa(),"ciao");
	}
}
    