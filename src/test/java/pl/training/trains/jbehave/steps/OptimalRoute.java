package pl.training.trains.jbehave.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.joda.time.LocalTime;

import java.util.List;

public class OptimalRoute {

    @net.thucydides.core.annotations.Pending
    @Pending
    @Given("$line line trains from $lineStart leave for $destination at $departureTimes")
    public void givenArrivingTrains(String line, String lineStart, String destination, List<LocalTime> departureTimes) {
    }

    @net.thucydides.core.annotations.Pending
    @Pending
    @When("I want to travel from $departure to $destination at $startTime")
    public void whenIWantToTravel(String departure, String destination, LocalTime startTime) {
    }

    @net.thucydides.core.annotations.Pending
    @Pending
    @Then("I should be told about the trains at: $expectedTrainTimes")
    public void iShouldBeTold(List<LocalTime> expectedTrainTimes) {
    }

}
