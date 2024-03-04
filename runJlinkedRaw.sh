mvn clean package

jlink \
 --add-modules javalin.example \
 --module-path "./target/modules:${JAVA_HOME}/jmods" \
 --output ./target/jlink-image

./target/jlink-image/bin/java  -Dconfig.profiles=local -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005 -m javalin.example/com.jojo.javalin.api.JavalinAPI
