package com.jojo.javalin.api;

import io.avaje.config.Config;
import io.avaje.http.api.AvajeJavalinPlugin;
import io.avaje.inject.BeanScope;
import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class JavalinAPI {

  private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(JavalinAPI.class);

  public static void main(String[] args) throws Exception {
    Javalin.create(
            cfg -> {
              BeanScope.builder()
                  .build()
                  .list(AvajeJavalinPlugin.class)
                  .forEach(cfg::registerPlugin);
              // directories don't work
              cfg.staticFiles.add("web-ui", Location.CLASSPATH);

              // The below will work because we can find files but not directories (it's pretty
              // tedious though)
              // cfg.spaRoot.addFile("/", "web-ui/index.html", Location.CLASSPATH);
              // cfg.spaRoot.addFile("/styles/base.css", "web-ui/styles/base.css",
              // Location.CLASSPATH);
            })
        .start(Config.getInt("server.port", 7070));
  }
}
