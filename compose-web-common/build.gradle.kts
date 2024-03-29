import com.huanshankeji.team.`Shreck Ye`
import com.huanshankeji.team.pomForTeamDefaultOpenSource

plugins {
    `lib-conventions`
}

kotlin {
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(compose.html.core)
                implementation(compose.runtime)
                implementation(commonDependencies.kotlinx.coroutines.core())
            }
        }
    }
}

publishing.publications.withType<MavenPublication> {
    pomForTeamDefaultOpenSource(
        project,
        "Huanshankeji Compose for Web common",
        "Huanshankeji's common code for Compose for Web"
    ) {
        `Shreck Ye`()
    }
}
