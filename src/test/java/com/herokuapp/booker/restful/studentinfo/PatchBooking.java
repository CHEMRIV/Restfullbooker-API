package com.herokuapp.booker.restful.studentinfo;

import com.herokuapp.booker.restful.model.BookingPojo;
import com.herokuapp.booker.restful.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PatchBooking extends TestBase {

    @Test
    public void partiallyUpdateBooking() {
        BookingPojo bookingPojo = new BookingPojo();
        bookingPojo.setFirstname("Raj");
        bookingPojo.setLastname("Simran");

        Response response = given()
                .header("Authorization", "Bearer 0c90e41203eca75")
                .header("Content-Type", "application/json")
                .header("Cookie", "token=28528346102147d")
                .pathParam("id", 642)
                .body(bookingPojo)
                .when()
                .patch("/booking/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
