package DevOps_TestBuilds_Kotlin.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.script

object DevOps_TestBuilds_Kotlin_KotlinBuild : BuildType({
    uuid = "e8672f5f-e801-4db3-9a46-218315eccf3a"
    id = "DevOps_TestBuilds_Kotlin_KotlinBuild"
    name = "Kotlin Build"

    steps {
        script {
            name = "Directory Listing"
            scriptContent = "ls"
            param("org.jfrog.artifactory.selectedDeployableServer.useSpecs", "true")
        }
    }
})
