package tests.userModuleProcess;

import com.sun.source.tree.AssertTree;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserModuleProcess;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class US00015 extends TestBase {

    @Test
    public void GetUserDeb(){

       driver.findElement(By.xpath("//div[@id='divCollapseUncollapse']//*[name()='svg']")).click();
       driver.findElement(By.xpath(" ")).click();
    }

    @Test
    public void SeeTheNewlyUser(){




//  List<WebElement> rows = driver.findElements(By.xpath("//table[@role='table']//tbody//tr"));
//  List<WebElement> cells;
//
//  List<String> allData = new ArrayList<>();
//
//       for (WebElement w : rows) {
//           cells = w.findElements(By.xpath(".//td"));
//           for (WebElement y : cells)
//               allData.add(y.getText());
//       }
//       System.out.println("allData = " + allData);
//       AssertTree(allData,);
//
//     driver.findElement(By.xpath("//button[normalize-space()='+ Add New Member']"));



    }

}
