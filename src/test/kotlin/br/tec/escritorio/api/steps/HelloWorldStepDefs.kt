package br.tec.escritorio.api.steps

import io.cucumber.java8.En

class HelloWorldStepDefs : En {

    init {
        Given("I have {int} cukes in my belly") { number: Int? ->
            println(number)
        }
        When("I wait {int} hour") { number: Int? ->
            println(number)
        }
        Then("my belly should growl") {
            println("Hello World")
        }
    }
}