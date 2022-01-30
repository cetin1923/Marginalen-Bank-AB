package com.APITest;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.junit.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class SampleAPITest2 {

    @BeforeClass
    public void setUpClass(){

        RestAssured.baseURI="http://54.175.72.36:8000";

    }

    @Test
    public void getWithPathPAramTest1 (){

            Response response = RestAssured.given().accept(ContentType.JSON)
                    .and().pathParam("id", 101)
                    .when().get("/api/spartans/{id}");

        assertEquals(200, response.statusCode());

        assertEquals(response.contentType(),"application/json");

        System.out.println("response.contentType() = " + response.contentType());

        System.out.println(response.getHeader("Connection"));
        System.out.println(response.getHeader("Transfer-Encoding"));
        System.out.println(response.getHeader("Date"));
        System.out.println(response.getBody().asString());
        System.out.println(response.getBody().prettyPrint());
        System.out.println(response.body().asString());

        // assertTrue(response.body().asString().contains("Cetin"));
        // System.out.println("response.prettyPrint() = " + response.prettyPrint());
    }

    @Test
    public void pathParamTest(){

        Response response = RestAssured.given().accept(ContentType.JSON)
                .and().pathParam("id",18)
                .when().get("/api/spartans/{id}");

        System.out.println(response.statusCode());
        response.getBody().prettyPrint();
        assertEquals(response.statusCode(),200);
        assertEquals((response.contentType()), "application/json");
    }

    @Test
    public void negTPathParamTest(){

        Response resp =RestAssured.given().accept(ContentType.JSON)
                .and().pathParam("id",500)
                .when().get("/api/spartans/{id}");

        resp.body().prettyPrint();

       if(resp.statusCode()==404){
           System.out.println("Status Code = 404");
       } else {
           System.out.println("Hej budy!, you made a mistake! Check it out!");
       };

       assertTrue(resp.body().asString().contains("Not Found"));

        System.out.println("Hej budy, There is no such a guy here!");
    }

    @Test
    public void querryParamTest (){

        Response resp = RestAssured.given().contentType(ContentType.JSON)
                                    .and().queryParam("gender","Female")
                                    .and().queryParam("nameContains",'J')
                                    .when().get("/api/spartans/search");

        //Assertions

        assertEquals(resp.statusCode(),200);
        assertEquals(resp.contentType(),"application/json");
        assertFalse(resp.body().asString().contains("Male"));
        assertTrue(resp.body().asString().contains("Janette"));

        resp.getBody().prettyPrint();
    }

    //passing parameters by using map

    @Test
    public void querParamTest2(){

        Map<String,Object> qParams = new HashMap<>();
                qParams.put("gender","Female");
                qParams.put("nameContains","J");

        Response response = RestAssured.given().accept(ContentType.JSON)
                            .and().queryParams(qParams)
                            .when().get("/api/spartans/search");

        assertEquals(response.statusCode(),200);
        assertEquals(response.contentType(),"application/json");

        response.body().prettyPrint();

    }
}
