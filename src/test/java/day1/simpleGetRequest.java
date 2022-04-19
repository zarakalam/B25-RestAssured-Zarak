package day1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;



public class simpleGetRequest<url> {

    String url = "http://44.201.121.105:8000/api/spartans";

    @Test
    public void test1(){

        Response response = RestAssured.get(url);

        System.out.println("response.statusCode() = " + response.statusCode());

        response.prettyPrint();


    }

//complete




}
