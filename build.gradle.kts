import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.5.4"
	kotlin("jvm") version "1.5.20"
}

group = "com.mthaler"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0")
	implementation("org.slf4j:slf4j-api:1.7.31")
	implementation("ch.qos.logback:logback-classic:1.2.3")
	implementation("org.springframework.boot:spring-boot-starter-validation:2.5.4")
	testImplementation("io.kotest:kotest-runner-junit5:4.3.2")
	testImplementation("io.kotest:kotest-assertions-core:4.3.2")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "1.8"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
