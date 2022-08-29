group = "com.equisoft.mailservice.sdk"
version = "0.0.0-SNAPSHOT"

val localBuild = file("local.build.gradle.kts")
if (localBuild.exists()) {
    apply(from = localBuild)
}

plugins {
    id("io.micronaut.library") version "3.5.1"
}

repositories {
    mavenCentral()
}

dependencies {
    api("io.micronaut:micronaut-http-client")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
    testImplementation("io.micronaut.security:micronaut-security-jwt")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

micronaut {
    version.set("3.6.1")
}

tasks {
    test {
        useJUnitPlatform()
    }

    wrapper {
        distributionType = Wrapper.DistributionType.ALL
        gradleVersion = "7.5.1"
    }
}
