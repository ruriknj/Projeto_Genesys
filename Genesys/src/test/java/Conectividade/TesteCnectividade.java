package Conectividade;

import org.junit.Test;
import util.JpaUtil;

public class TesteCnectividade {

	@Test
	public void TestConnection() {
	
		JpaUtil.getEntityManager();
	
	}
}
