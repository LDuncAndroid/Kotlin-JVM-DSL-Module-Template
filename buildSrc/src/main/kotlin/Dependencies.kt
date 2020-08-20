object Versions {
    object Kotlin {
        const val jvm = "1.3.72"
        const val kotlin = "1.3.72"
        const val kotlinCoroutines = "1.3.9"
    }
}

object CompilerOptions {
    const val jvmTarget = "1.8"
}

object Libs {
    object Kotlin {
        const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.Kotlin.kotlinCoroutines}"
        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.Kotlin.kotlin}"
    }

    object UnitTest {
        object Kotlin {
            const val test = "org.jetbrains.kotlin:kotlin-test:${Versions.Kotlin.kotlin}"
            const val testJunit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.Kotlin.kotlin}"
        }
    }
}

object Plugins {
    object Kotlin {
        const val jvm = "org.jetbrains.kotlin.jvm"
    }
}
