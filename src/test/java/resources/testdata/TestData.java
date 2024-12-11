package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "ComputerData")
    public Object[][] getBuildYourOwnComputerData() {
        return new Object[][]{
                {"2.2 GHz Intel Pentium Dual-Core E2200", "2 GB", "320 GB", "Windows 7 [+50.00]", "Microsoft Office [+$50.00]"},
                {"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]", "4GB [+$20.00]", "400 GB [+$100.00]", "Windows 10 [+60.00]", "Acrobat Reader [+$10.00]"},
                {"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]", "8GB [+$60.00]", "320 GB", "Ubuntu", "Total Commander [+$5.00]"}
        };
    }
}
