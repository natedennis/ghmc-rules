# RuleUnit + Quarkus + Lambda Example

## Description

A simple rule service to validate `Loan` fact.

REST endpoints are generated from query rules. You can insert `Loan` facts and query a result via the REST endpoints. Rule resources are assembled as a RuleUnit.

## Installing and Running

### Prerequisites

You will need:
  - Java 11+ installed
  - Environment variable JAVA_HOME set accordingly
  - Maven 3.6.2+ installed

When using native image compilation, you will also need:
  - [GraalVM 19.2.1](https://github.com/oracle/graal/releases/tag/vm-19.2.1) installed
  - Environment variable GRAALVM_HOME set accordingly
  - Note that GraalVM native image compilation typically requires other packages (glibc-devel, zlib-devel and gcc) to be installed too.  You also need 'native-image' installed in GraalVM (using 'gu install native-image'). Please refer to [GraalVM installation documentation](https://www.graalvm.org/docs/reference-manual/aot-compilation/#prerequisites) for more details.

### Compile (native) 

```sh
./mvnw clean package -Dnative -Dnative-image.docker-build=true -Dquarkus.native.container-build=true;

```


### Package and Run using Local Native Image
Note that this requires GRAALVM_HOME to point to a valid GraalVM installation
To run the generated native executable, generated in `target/`, execute
```sh
sam local start-api --template sam.native.yaml
```



###Run in Amazon Lambda
```sh
sam package --template-file target/sam.native.yaml --output-template-file packaged-native.yaml --s3-bucket dcgskhsdfjlkashdflk;
sam deploy --template-file packaged-native.yaml --capabilities CAPABILITY_IAM --stack-name lambda-quarkus;

```
