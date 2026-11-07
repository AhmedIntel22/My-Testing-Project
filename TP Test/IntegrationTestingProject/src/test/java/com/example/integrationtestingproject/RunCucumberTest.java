package com.example.integrationtestingproject;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("com/example/integrationtestingproject")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.example.integrationtestingproject")
public class RunCucumberTest {
}

