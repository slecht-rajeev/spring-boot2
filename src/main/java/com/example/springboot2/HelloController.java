package com.example.springboot2;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Operation(summary = "Get all items", description = "This endpoint retrieves all items from the database.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved items"),
            @ApiResponse(responseCode = "400", description = "Bad request")
    })
    @GetMapping("/")
    public String home() {
        return "Hello, World!";
    }
}