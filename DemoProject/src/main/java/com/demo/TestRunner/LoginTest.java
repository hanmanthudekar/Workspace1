package com.demo.TestRunner;

import org.junit.runner.RunWith;

@CucumberOptions( 
features = "Feature" 
,glue={"stepDefinition"} 
) 
 


public class LoginTest {

}
