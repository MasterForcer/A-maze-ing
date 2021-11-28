# Java code generation using Swagger

Here are some tips and tricks that we have learned to obtain some client code generation in java.

When you access our Swagger UI, you can obtain the JSON specification. Usually it will be available in `/swagger/api/swagger.json`.

You can now go to [Swagger Generator](https://generator.swagger.io/) to have some code auto-generated for you.

There, you can use the POST `/gen/clients/java` endpoint to auto-generate a java client.

The body for that endpoint takes in the following payload:

```json
{
  "spec": <<paste our JSON specification here>>
}
```

If you issue this POST you will receive a response with the following payload:
```json
{
  "code": "a-guid-value-here",
  "link": "https://generator.swagger.io/api/gen/download/the-same-guid-value-as-above"
}
```

You can now download the file referenced in `link` from this response. The file is usually named `java-client-generated.zip`.

Upon unzipping this file, you will find in it an `java-client` folder.

## Run


Opening this folder as a project with IntelliJ. It will offer in a popup to `import Gradle project` click on it.

If an error pops up something like this:

```
The project uses Gradle 2.6 which is incompatible with IDEA running on Java 10 or newer.
See details at https://github.com/gradle/gradle/issues/8431
Possible solution:
 - Upgrade Gradle wrapper to 4.8.1 version and re-import the project
```

Than click the `Upgrade Gradle wrapper to 4.8.1 version and re-import the project` and it should solve the issue (if you are using Java 8 than you probably do not have it). 

This will now enable you to **build** your project.

*Your main class example*

```java
package app;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.api.MazesApi;
import io.swagger.client.api.PlayerApi;
import io.swagger.client.model.MazeInfo;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main( String[] args ) throws ApiException {
        ApiClient defaultApiClient = Configuration.getDefaultApiClient();
        defaultApiClient.setBasePath("<<SERVER_BASE_URL>>");
        defaultApiClient.addDefaultHeader("Authorization", "<<YOUR_TOKEN>>");

        PlayerApi playerApi = new PlayerApi();
        System.out.println("About to register...");
        playerApi.register("Amazing Player");

        MazesApi mazesApi = new MazesApi();
        System.out.println("About to obtain all mazes...");
        List<MazeInfo> allMazes = mazesApi.all();

        for (MazeInfo mazeInfo : allMazes) {
            System.out.println(
                String.format("%s has a potential reward of %d and contains %d tiles;", mazeInfo.getName(), mazeInfo.getPotentialReward(), mazeInfo.getTotalTiles())
            );
        }

        new Scanner(System.in).nextLine();
    }
}

```

Remember to set the `Client` project as Startup project and replace the server address and your access token variables. 

Let's take it for a spin. If all went well, you can now see the following output:

```
About to register...
About to obtain all mazes...
[Example maze] has a potential reward of [160] and contains [17] tiles;
[Hello maze] has a potential reward of [110] and contains [8] tiles;
```

ℹ If something does not seem to work `cd` into your project directory `swagger-java-cliet` hit `mvn clean install` (use normal cmd, bash IntelliJ has its own and *may be* that is the source of the problem...) 🤷🏻‍ Done. It should work normally.

This code is the minimum thing that works and it has problems such as the second time you run it, it will throw an exception because you are already registered.

But we don't want to give you all the code. Instead, we want to help you hit the road running, by facilitating your communication with the server.

And always remember: Have fun! 👍🏻

---

This example was written and tested on [2019-11-14], and it "worked on my machine". Hopefully it will work on yours as well 😅.
