package ch.zli.m223;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("calculator/add/{firstNumber}/{secondNumber}")
public class CalculatorResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String add(@PathParam("firstNumber") int firstNumber, @PathParam("secondNumber") int secondNumber) {
        return Integer.toString(firstNumber + secondNumber);
    } 
}