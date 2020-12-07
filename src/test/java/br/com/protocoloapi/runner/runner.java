package br.com.protocoloapi.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "br.com.protocoloapi.steps" }, features = {"src/test/resources/br/com/protocoloapi/feature" }, tags = "@geral")
public class runner {

}
	