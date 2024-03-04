# Javalin Jlink Resource Directory Issue

Use `runJlinkedMvn.sh` or `runJlinkedRaw.sh` to build a jlink app image and observe the error:

```
io.javalin.util.JavalinException: Static resource directory with path: 'web-ui' does not exist. Depending on your setup, empty folders might not get copied to classpath.
        at io.javalin@6.1.2/io.javalin.jetty.ConfigurableHandler.getResourceBase(JettyResourceHandler.kt:125)
        at io.javalin@6.1.2/io.javalin.jetty.ConfigurableHandler.<init>(JettyResourceHandler.kt:93)
        at io.javalin@6.1.2/io.javalin.jetty.JettyResourceHandler.init(JettyResourceHandler.kt:35)
        at io.javalin@6.1.2/io.javalin.jetty.JettyServer.start(JettyServer.kt:119)
        at io.javalin@6.1.2/io.javalin.Javalin.start(Javalin.java:123)
        at javalin.example@1.0.0-SNAPSHOT/com.jojo.javalin.api.JavalinAPI.main(JavalinAPI.java:23)
```