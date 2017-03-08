package test.com.ctrip.platform.dal.dao.unittests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import test.com.ctrip.platform.dal.dao.unitbase.MySqlDatabaseInitializer;

public class DalTabelDaoMySqlTest extends DalTabelDaoTestStub {
	private static MySqlDatabaseInitializer initializer = new MySqlDatabaseInitializer();
	public DalTabelDaoMySqlTest() {
		super(initializer.DATABASE_NAME, initializer.VALIDATE_BATCH_UPDATE_COUNT, initializer.SUPPORT_GET_GENERATED_KEYS, initializer.SUPPORT_INSERT_VALUES);
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		initializer.setUpBeforeClass();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
 		initializer.tearDownAfterClass();
	}
	
	@Before
	public void setUp() throws Exception {
		initializer.setUp2();
	}

	@After
	public void tearDown() throws Exception {
		initializer.tearDown();
	}
}