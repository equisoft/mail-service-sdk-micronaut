import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication

group = "com.equisoft.mailservice.sdk"
version = "0.0.2-SNAPSHOT"

val localBuild = file("local.build.gradle.kts")
if (localBuild.exists()) {
    apply(from = localBuild)
}

plugins {
    `maven-publish`
    id("io.micronaut.library") version "3.5.3"
}

repositories {
    mavenCentral()
}

dependencies {
    api("io.micronaut:micronaut-http-client")
    implementation("com.google.code.findbugs:findbugs:3.0.1")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
    testImplementation("io.micronaut.security:micronaut-security-jwt")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

micronaut {
    version.set("3.6.2")
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

configure<PublishingExtension> {
    repositories {
        maven {
            name = "mail-service-sdk-micronaut"
            url = uri("https://maven.pkg.github.com/equisoft/mail-service-sdk-micronaut")
            credentials {
                name = "gprWrite"
                username = project.findProperty("gpr.user")?.toString()
                    ?: System.getenv("GPR_USER")
                    ?: System.getenv("GHCR_USER")
                password = project.findProperty("gpr.key")?.toString()
                    ?: System.getenv("GPR_TOKEN")
                    ?: System.getenv("GHCR_TOKEN")
            }
        }
    }

    publications {
        create<MavenPublication>("gpr") {
            from(components["java"])
        }
    }
}
