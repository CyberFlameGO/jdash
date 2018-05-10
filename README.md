# JDash

A Java library for Geometry Dash.

# Features

- HTTP client for reading data from Geometry Dash servers
- Support for authentication with GD account ID / password
- A set of objects to manipulate the data

# Get started

In a Maven project, add the following dependency to your `pom.xml`:

```xml
<dependencies>

	// ... your other dependencies
	
	<dependency>
		<groupId>com.github.alex1304</groupId>
		<artifactId>jdash</artifactId>
		<version>2.0.1</version>
	</dependency>
</dependencies>
```

Or download the latest version at the [releases](https://github.com/Alex1304/jdash/releases) page, and add the JAR into the build path of your Java project.

# How to use it ?

Here is a quick example of the usage of the library:

```Java
import com.github.alex1304.jdash.api.GDHttpClient;
import com.github.alex1304.jdash.api.request.GDLevelHttpRequest;
import com.github.alex1304.jdash.component.GDLevel;
import com.github.alex1304.jdash.exceptions.GDAPIException;

public class TestMain {

	public static void main(String[] args) {
		GDHttpClient client = new GDHttpClient();
		GDLevelHttpRequest req = new GDLevelHttpRequest(38693063);
		GDLevel level = null;
		
		try {
			level = client.fetch(req);
		} catch (GDAPIException e) {
			e.printStackTrace();
		}
		
		System.out.println(level);
	}

}

```

The full documentation is available [here](http://jdash.readthedocs.io/en/latest).

# License

MIT

# Contribute

Pull requests are more than welcome ! There is no guide that tells how to structure them, but if you explain clearly what you did in your pull request, we will be able to dicuss about it and getting it eventually merged. This is the same for issues, feel free to submit them as long as they are clear.

# Contact

E-mail: mirandaa1304@gmail.com

Discord: Alex1304#9704

Twitter: @gd_alex1304