# epl-grpc-service
- How to build : mvn clean install


- How to start the server : 
```
<plugin>
      <groupId>org.codehaus.mojo</groupId>
      <artifactId>exec-maven-plugin</artifactId>
      <version>3.0.0</version>
      <executions>
        <execution>
          <id>server-execution</id>
          <phase>compile</phase>
          <goals>
            <goal>java</goal>
          </goals>
          <configuration>
            <mainClass>com.example.calculator.{ServerClassName}</mainClass>
          </configuration>
        </execution>
      </executions>
    </plugin>
  </plugins>
</build>
```

- After updating your pom.xml file with the new configuration, you can run your server using the following command:
`mvn exec:java -Dexec.mainClass="com.example.grpc.Server"`



- By default the Calculator gRPC service will be started on port 50051
