package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage {
	WebDriver driver;

	public DragAndDropPage (WebDriver d){
		driver = d;
	}

	By Draggable1  = By.xpath("//*[@id='todrag']/span[1]");
	By DropZone    = By.id("mydropzone");
	By DroppedList = By.xpath("//*[@id='droppedlist']");

	public void verifyDragDropBox(){
		
		//Element which needs to drag.    		
    	WebElement From = driver.findElement(Draggable1);
    			
		//Element on which need to drop.		
        WebElement To = driver.findElement(DropZone);					
        		
        WebElement Destination =  driver.findElement(DroppedList);
        
        //Using Action class for drag and drop.		
        Actions act=new Actions(driver);					

        //Dragged and dropped.		
        act.dragAndDrop(From, To).release().build().perform();

        
        //verify text changed in to 'Drop here' box 
        String textDestination = Destination.getText();
        
        System.out.println(textDestination);
        

	}
}

