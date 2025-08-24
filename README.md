# dasarathi-maven-plugin

---

### Run Maven Command with custom ASCII Art Message & Play Music when maven build

#### Maven pom.xml add plugin

```xml
<plugin>
    <groupId>com.rout.dasarathi</groupId>
    <artifactId>dasarathi-maven-plugin</artifactId>
    <version>v1.0.0-SNAPSHOT</version>
    <executions>
        <execution>
            <id>1-validate-message</id>
            <phase>
                validate
            </phase>
            <goals>
                <goal>message</goal>
            </goals>
            <configuration>
                <userMessage>dasarathi-mvn-3</userMessage>
            </configuration>
        </execution>
        <execution>
            <id>2-validate-music</id>
            <phase>
                validate
            </phase>
            <goals>
                <goal>music</goal>
            </goals>
            <configuration>
                <isMusicSkipped>false</isMusicSkipped>
            </configuration>
        </execution>
    </executions>
</plugin>
```

#### Sample JUnit Test (To Run Enough Time , Can Play Music)

```java

import org.junit.jupiter.api.Test;

public class ApplicationTest {
    @Test
    void testSleepTestToPlayMusic() {
        try {
            Thread.sleep(5 * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            assert (true);
        }
    }
}
```

___

#### Run maven-plugin : message

> ``` 
> # mvn groupId:artifactId:version:mojoName
> mvn com.rout.dasarathi:dasarathi-maven-plugin:v1.0.0-SNAPSHOT:message
> ```

#### Plugin Console Output message

>
> <img src="./docs/img/image-cli-output-message.png" alt="Plugin Run Console Output Message">

#### Run maven-plugin : message with prefix-name

> ``` 
> # mvn prefixName:goalName
> mvn dasarathi:message
> ```

#### Plugin Console Output message (with prefix-name)

>
> <img src="./docs/img/image-cli-output-message-prefix.png" alt="Plugin Run Console Output Message Prefix">

---

#### Run maven-plugin : music

> ``` 
> # mvn groupId:artifactId:version:mojoName
> mvn com.rout.dasarathi:dasarathi-maven-plugin:v1.0.0-SNAPSHOT:music
> ```

#### Plugin Console Output music

>
> <img src="./docs/img/image-cli-output-music.png" alt="Plugin Run Console Output Music">

#### Run maven-plugin : music with prefix-name

> ``` 
> # mvn prefixName:goalName
> mvn dasarathi:music
> ```

#### Plugin Console Output music (with prefix-name)

>
> <img src="./docs/img/image-cli-output-music-prefix.png" alt="Plugin Run Console Output Music Prefix">


---

#### IDE Maven Tool Window Plugin

>
> <img src="./docs/img/image-ide-maven-tool-window-plugin.png" alt="IDE Maven Tool Window Plugin" width="900" height="700">

***

- AsciiArt.eu Generated With Font `DOS Rebel`, Size `6 PT`
- MP3 Ringtone from ZEDGE