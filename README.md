# spring-mvc-demo
Sping MVC demo

## Debug

With *maven* or *gradle* the *web.xml* should go to `sr/main/webapp/WEB-INF`

To show a normal error message instead of the spring error message, set:


```spring
server.error.whitelabel.enabled=false
```

in `application.properties`