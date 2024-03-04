package com.jojo.javalin.api.controller;

import io.avaje.http.api.Controller;
import io.avaje.http.api.Get;
import io.avaje.http.api.MediaType;
import io.avaje.http.api.Produces;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
    info =
        @Info(
            title = "Example service",
            description = "Example Javalin controllers with Java and Maven"))
@Controller("javalin")
public class BasicController {

  /**
   * Standard Health Check
   *
   * @return a health check
   */
  @Get("/health")
  @Produces(MediaType.TEXT_PLAIN)
  public String health() {
    return "healthlmao";
  }
}
