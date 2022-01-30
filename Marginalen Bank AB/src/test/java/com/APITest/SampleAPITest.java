package com.APITest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class SampleAPITest {

    String sampleBaseURL = "http://54.175.72.36:8000";

    @Test
    public void getViewAPITest1(){

        Response response = RestAssured.get(sampleBaseURL+"/api/spartans");

        int StatusCode = response.statusCode();

        if(StatusCode==200) {
            System.out.println("StatusCode = " + StatusCode);
            System.out.println("response.body().prettyPrint() = " + response.body().prettyPrint());
        } else {
            System.out.println("Your request has failed");
        }
    }

    @Test
    public void getSearchBodyTest2(){

       Response response = RestAssured.get(sampleBaseURL+"/api/spartans");

       boolean check = response.body().asString().contains("Cetin");

       if(check){
          System.out.println("check is true");
      } else {
          System.out.println("\"check is false\" = " + "check is false");
      }

       //Or basicly

        Assert.assertTrue(response.body().asString().contains("Cetin"));
    }

    @Test
    public void getFiltViewAPITest3(){

        Response response = RestAssured.get(sampleBaseURL + "/api/spartans/search?nameContains=Cetin&gender=Male");
        System.out.println("response.body().prettyPrint() = " + response.body().prettyPrint());
    }

    //Given accept type is JSON
    //When user sends a get request
    //Then response status code is 200
    //And respons body should be JSON format
    @Test
    public void getWithGherkinLanguageTest4 (){

        Response response= RestAssured.given().accept(ContentType.JSON).
                                        when().get(sampleBaseURL + "/api/spartans");

        Assert.assertTrue(response.contentType().contains("application/json"));

    }

}
