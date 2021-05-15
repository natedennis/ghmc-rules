/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ghmc;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;

@QuarkusTest
public class RestQueryTest {

    private static final String JSON_PAYLOAD =
            "{\n" +
                "\"scope\": [\n" +
                                "{\n" +
                                "\"type\":\"ALL\"\n" +
                                "}\n" +
                            "],\n" +
          "\"loans\": [\n" +
            "{\n" +
                "\"id\": \"ABC10001\",\n" +
                "\"amount\": 999919,\n" +
                "\"deposit\": 100,\n" +
                "\"applicant\": { \n" +
                                 "\"age\": 45,\n" +
                                 "\"name\": \"John\"\n" +
                                "},\n" +
                "\"underwriter\": {\n" +
                                    "\"name\": \"Wile E. Coyote\",\n" +
                                    "\"underwriterType\": \"JUNIOR\"\n" +
                                  "}\n" +
                        "}\n" +
                      "]\n" +
         "}";



    @Test
    public void testProcess() {
        given()
                .body(JSON_PAYLOAD)
                .contentType(ContentType.JSON)
                .when()
                .post("/process")
                .then()
                .statusCode(200)
                .body("id", hasItem("ABC10001"))
                .body(containsString("Approval button disabled"));
    }
}
