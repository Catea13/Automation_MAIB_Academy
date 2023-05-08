package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {
    private TestContext testContext;

    public CucumberHooks(TestContext testContext) {
        this.testContext = testContext;
    }

    @Before
    public void setUp() {
        testContext.getHook().setup();
    }

    @After
    public void tearDown() {
        testContext.getHook().close();
    }
}