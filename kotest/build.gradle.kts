plugins {
    kotlin("jvm")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")

    testImplementation("io.kotest:kotest-runner-junit5:5.0.3")

    // example dependencies to represent a real world size project
    implementation("io.github.microutils:kotlin-logging:1.7.7")
    implementation("com.google.protobuf:protobuf-java:3.17.3")
    implementation("io.grpc:grpc-stub:1.26.0")
    implementation("io.grpc:grpc-protobuf:1.26.0")
    implementation("io.grpc:grpc-services:1.26.0")
    runtimeOnly("io.grpc:grpc-netty:1.26.0")
    implementation("io.ktor:ktor-server-core:1.5.4")
    implementation("io.ktor:ktor-server-jetty:1.5.4")
    implementation("org.eclipse.jetty:jetty-server")
    implementation("io.ktor:ktor-gson:1.5.4")
    implementation("io.ktor:ktor-client-core:1.5.4")
    implementation("io.ktor:ktor-client-apache:1.5.4")
    implementation("io.ktor:ktor-client-jackson:1.5.4")
    implementation("io.ktor:ktor-server-test-host:1.5.4")
    implementation("io.ktor:ktor-client-gson:1.5.4")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-guava:1.3.3")
    implementation("javax.annotation:javax.annotation-api:1.3.1")
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.amazonaws:aws-java-sdk-dynamodb:1.12.131")
    implementation("com.amazonaws:aws-java-sdk-s3:1.12.131")
    implementation("org.postgresql:postgresql:42.3.1")
    implementation("com.zaxxer:HikariCP:3.2.0")
    implementation("io.grpc:grpc-kotlin-stub:1.0.0")
    implementation("ch.qos.logback:logback-classic:1.2.3")
    implementation("net.logstash.logback:logstash-logback-encoder:6.3")
    testImplementation("io.mockk:mockk:1.11.0")
    testImplementation("org.testcontainers:postgresql:1.16.2")
    testImplementation("org.testcontainers:dynalite:1.16.2")
    testImplementation("org.testcontainers:junit-jupiter:1.16.2")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.0")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }

    // allows us to run the tests repeatedly without any compilation.
    // Without this, Gradle decides that no inputs have changed therefore does not run the tests.
    outputs.upToDateWhen { false }
}