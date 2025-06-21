plugins {
    id("java")
    application
    id("org.sonarqube") version "6.2.0.5505"
}

application {
    mainClass.set("hexlet.code.App")  // Убрал слеш в начале
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}


sonar {
    properties {
        property("sonar.projectKey", "DenisLater_java-project-61")
        property("sonar.organization", "denislater")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}
