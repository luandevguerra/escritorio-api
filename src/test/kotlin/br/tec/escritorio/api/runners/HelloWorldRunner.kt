package br.tec.escritorio.api.runners

import io.cucumber.junit.Cucumber

import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(
        features = ["src/test/resources/features/HelloWorld.feature"],
        glue = ["br.tec.escritorio.api.steps"],
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = true
)
class HelloWorldRunner