package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import milestones.AddMilestonesPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.*;
import utils.TestListener;


import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)
public abstract class BaseTest {

    protected final static String BASE_URL = "https://jfd.testrail.io/";
    protected final static String EMAIL = "rauchukyulia@gmail.com";
    protected final static String PASSWORD = "sPKbqog9XqLtOHz8Rj12&*%";


    protected WebDriver driver;
    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;
    protected MilestonesPage milestonesPage;
    protected AddMilestonesPage addMilestonesPage;
    protected ToDoPage toDoPage;
    protected OverviewPage overviewPage;
    protected ProjectPage projectPage;
    protected TestCasePage testCasePage;
    protected TestPlanPage testPlanPage;
    protected TestRunResultsPage testRunResultsPage;
    protected ReportsPage reportsPage;

    @BeforeClass(alwaysRun = true)
    public void setUp(ITestContext testContext) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        testContext.setAttribute("driver", driver);

        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        milestonesPage = new MilestonesPage(driver);
        addMilestonesPage = new AddMilestonesPage(driver);
        overviewPage = new OverviewPage(driver);
        toDoPage = new ToDoPage(driver);
        projectPage = new ProjectPage(driver);
        testCasePage = new TestCasePage(driver);
        testPlanPage = new TestPlanPage(driver);
        testRunResultsPage = new TestRunResultsPage(driver);
        reportsPage = new ReportsPage(driver);

    }

    @BeforeMethod(alwaysRun = true)
    public void navigate() {
        driver.get(BASE_URL);
    }
    @AfterMethod(alwaysRun = true)
    public void clear() {
        driver.manage().deleteAllCookies();
        ((JavascriptExecutor) driver).executeScript("window.localStorage.clear();");
        ((JavascriptExecutor) driver).executeScript("window.sessionStorage.clear();");


    }
    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

    public void waitForPageLoaded() {

    }
}