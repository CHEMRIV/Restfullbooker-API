package com.herokuapp.booker.restful.studentinfo;

import com.herokuapp.booker.restful.testbase.TestBase;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetAllBooking extends TestBase {

    @Test
    public void getAllBookingInfo() {
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get()
                .then()
                .extract().response();
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void getSingleBookingInfo () {
        Response response = given()
                .header("Authorization","Bearer 914c0f670f001278363480f4134d14f5dbf7d901652c1212fe3ce872e9e07d7b")
                .pathParams("bookingid", 330)
                .when()
                .get("/{bookingid}")
                .then()
                .extract().response();
       response.then().statusCode(200);
        response.prettyPrint();
    }


}