package com.herokuapp.booker.restful.studentinfo;

import com.herokuapp.booker.restful.testbase.TestBase;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteBooking extends TestBase {


    @Test
    public void deleteBookingInfo() {
        Response response = given()
                .header("Authorization","Bearer 914c0f670f001278363480f4134d14f5dbf7d901652c1212fe3ce872e9e07d7b")
                .pathParams("bookingid", 271)
                .when()
                .delete("/{bookingid}");
       // response.then().statusCode(201);
        response.prettyPrint();

    }
}
