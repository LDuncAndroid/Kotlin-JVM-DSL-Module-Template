plugins {
    `kotlin-dsl`
    id(Plugins.Kotlin.jvm) version Versions.Kotlin.jvm
    java
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = CompilerOptions.jvmTarget
    }
}

repositories {
    jcenter()
}

dependencies {
    implementation(Libs.Kotlin.stdLib)
    implementation(Libs.Kotlin.coroutines)
    testImplementation(Libs.UnitTest.Kotlin.test)
    testImplementation(Libs.UnitTest.Kotlin.testJunit)
}
