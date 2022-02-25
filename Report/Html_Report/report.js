$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/features/Adactin.features");
formatter.feature({
  "line": 1,
  "name": "hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@TC01"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"\u003cusername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cpassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "hotel-booking-in-adactin-application;login-page;;1"
    },
    {
      "cells": [
        "Yeef",
        "YEef123"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;login-page;;2"
    },
    {
      "cells": [
        "Cadino",
        "bnt234"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;login-page;;3"
    },
    {
      "cells": [
        "PoongundranM",
        "98CXJ2"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;login-page;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1383100,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@TC01"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"Yeef\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"YEef123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 2805293100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Yeef",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 376333700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "YEef123",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 217627300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_Login_Button_And_It_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 556757600,
  "status": "passed"
});
formatter.after({
  "duration": 239800,
  "status": "passed"
});
formatter.before({
  "duration": 542600,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@TC01"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"Cadino\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"bnt234\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 618913700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cadino",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 276442000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bnt234",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 168084100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_Login_Button_And_It_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 509854700,
  "status": "passed"
});
formatter.after({
  "duration": 530200,
  "status": "passed"
});
formatter.before({
  "duration": 126000,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@TC01"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"PoongundranM\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"98CXJ2\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 361812100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PoongundranM",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 252646900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "98CXJ2",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 168755500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_Login_Button_And_It_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1131591200,
  "status": "passed"
});
formatter.after({
  "duration": 127900,
  "status": "passed"
});
formatter.before({
  "duration": 121200,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Search Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@TC02"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user Select The Hotel Location",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user Select The Hotel Type",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Select The Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Select The Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Select The Check In Date",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Select The Check Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Select The Adults Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Click On Search Button It Will Navigate to Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Hotel_Location()"
});
formatter.result({
  "duration": 416000000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Hotel_Type()"
});
formatter.result({
  "duration": 283000400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Room_Type()"
});
formatter.result({
  "duration": 185261500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Number_Of_Rooms()"
});
formatter.result({
  "duration": 152718400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Check_In_Date()"
});
formatter.result({
  "duration": 145307500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Check_Out_Date()"
});
formatter.result({
  "duration": 174804100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Adults_Per_Room()"
});
formatter.result({
  "duration": 220197200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_Search_Button_It_Will_Navigate_to_Select_Hotel_Page()"
});
formatter.result({
  "duration": 1085447600,
  "status": "passed"
});
formatter.after({
  "duration": 123900,
  "status": "passed"
});
formatter.before({
  "duration": 135200,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Select Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;select-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@TC03"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "user Select Select Button In Select Hotel Page",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "user Click On Continue Button It Will Navigate To Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_Select_Button_In_Select_Hotel_Page()"
});
formatter.result({
  "duration": 125738700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_Continue_Button_It_Will_Navigate_To_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 789374700,
  "status": "passed"
});
formatter.after({
  "duration": 119000,
  "status": "passed"
});
formatter.before({
  "duration": 117100,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Book A Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;book-a-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@TC04"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "user Enter The First Name In First Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Enter The Last Name In Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Enter The Billing Address In Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Enter Credit Card No In Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Select Credit Card Type",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Select Expiry Date",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Select Cvv Number",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Click On Book Now Button And It Will Navigate To Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_First_Name_In_First_Name_Field()"
});
formatter.result({
  "duration": 275680100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Last_Name_In_Last_Name_Field()"
});
formatter.result({
  "duration": 147622500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Billing_Address_In_Address_Field()"
});
formatter.result({
  "duration": 153390700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_Credit_Card_No_In_Field()"
});
formatter.result({
  "duration": 223303200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_Credit_Card_Type()"
});
formatter.result({
  "duration": 312665000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_Expiry_Date()"
});
formatter.result({
  "duration": 585511500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_Cvv_Number()"
});
formatter.result({
  "duration": 188615400,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 151000,
  "status": "passed"
});
});