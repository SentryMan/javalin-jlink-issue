module javalin.example {
  requires io.avaje.inject;
  requires io.avaje.config;
  requires io.javalin;
  requires io.avaje.http.api;
  requires ch.qos.logback.classic;
  requires static io.swagger.v3.oas.annotations;

  provides io.avaje.inject.spi.Module with
      com.jojo.javalin.api.controller.ControllerModule;
}
