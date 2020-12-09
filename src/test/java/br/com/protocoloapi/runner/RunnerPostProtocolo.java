package br.com.protocoloapi.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "br.com.protocoloapi.steps" }, features = {"src/test/resources/br/com/protocoloapi/feature" }, tags = "@geral")
public class RunnerPostProtocolo {

}
	