package Code;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class stepDefinition {
	public stepDefinition() {
		super();
	}
	
@Given("User details read from propertiesfile")
public void User_details_read_from_propertiesfile() {
	PageObjectFactory.getMapCode().propertiesFileRead();
}
@Given("Verify user is able to Go to maps.google.com")
public void goToGoogleMaps() {
    // Code to navigate to maps.google.com
	PageObjectFactory.getMapCode().startDriver();  
}

@When("Check user is able to Click on Directions button")
public void clickDirectionsButton() {
    // Code to click on the Directions button
	PageObjectFactory.getMapCode().clickDirection();
    
}

@Then("Verify user is able to Enter Starting Location as residential location")
public void enterStartingLocation() {
	PageObjectFactory.getMapCode().enterUserAddress();
}

@When("Check User adding Destination from properties file")
public void retrieveDestinationFromProperties() {
    // Code to retrieve destination from properties file
	PageObjectFactory.getMapCode().destinationAddress();
    
}

@Then("Verify User able to select the first route")
public void selectFirstRoute() {
    // Code to select the first suggested route
	PageObjectFactory.getMapCode().firstRoute();
   
}

@When("Check whether user able to download or copy all the driving instructions in excel sheet")
public void downloadOrCopyDrivingInstructions() {
    // Code to check if the option to download or copy driving instructions is available
	PageObjectFactory.getMapCode().detailsOfTravelling();
 
}

@And("close the window")
public void closeBrowser() {
	PageObjectFactory.getMapCode().closeBrowser();
}
}
