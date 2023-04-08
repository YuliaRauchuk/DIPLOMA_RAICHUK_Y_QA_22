package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import milestones.AddMilestonesPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import jdk.jfr.Description;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.*;
import testCase.AddTestCasePage;
import utils.TestListener;
import utils.PropertyReader;
import utils.DriverFactory;


import java.util.concurrent.TimeUnit;


@Listeners(TestListener.class)
public abstract class BaseTest {

    protected final static String BASE_URL = PropertyReader.getProperty("test_rail.url");
    protected final static String EMAIL = PropertyReader.getProperty("test_rail.email");
    protected final static String PASSWORD = PropertyReader.getProperty("test_rail.password");
    protected final Logger logger = LogManager.getLogger(this.getClass().getName());


    protected WebDriver driver;
   protected WebDriverWait wait;
   protected LoginPage loginPage;
   protected DashboardPage dashboardPage;
   protected OverviewPage overviewPage;
   protected  MilestonesPage milestonesPage;
   protected AddMilestonesPage addMilestonesPage;
   protected AddTestCasePage addTestCasePage;
   protected ProjectPage projectPage;
   protected TestRunResultsPage testRunResultsPage;
   protected TestCasePage testCasePage;
   protected TestPlanPage testPlanPage;
   protected ReportsPage reportsPage;

   @Parameters({"browser"})

   @Description("Starting a browser")
   @BeforeClass(alwaysRun = true)
   public void setUp(@Optional("chrome") String browserName, ITestContext testContext) throws Exception {
       System.getProperty("browser", "chrome");

           if (browserName.equals("chrome")) {
              // WebDriverManager WebDriverManager = null;
               io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
               driver = new ChromeDriver();
           } else {
               throw new Exception("Undefined browser type");
           }
           wait = new WebDriverWait(driver, 100);
           driver.manage().window().maximize();
       driver = DriverFactory.getDriver(browserName);
       driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
       driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
       testContext.setAttribute("driver", driver);

       loginPage = new LoginPage(driver);
       dashboardPage = new DashboardPage(driver);
       milestonesPage = new MilestonesPage(driver);
       addMilestonesPage = new AddMilestonesPage(driver);
       overviewPage = new OverviewPage(driver);
       addTestCasePage = new AddTestCasePage(driver);
       projectPage = new ProjectPage(driver);
       reportsPage = new ReportsPage(driver);
       testCasePage = new TestCasePage(driver);
       testPlanPage = new TestPlanPage(driver);
       testRunResultsPage = new TestRunResultsPage(driver);
   }

    @BeforeMethod(alwaysRun = true)
    public void navigate() {

        loginPage.open();
   }
    @AfterMethod(alwaysRun = true)
    public void clear() {
        driver.manage().deleteAllCookies();
        ((JavascriptExecutor) driver).executeScript("window.localStorage.clear();");
        ((JavascriptExecutor) driver).executeScript("window.sessionStorage.clear();");
    }

    @Description("Close a browser")
    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
   }
}