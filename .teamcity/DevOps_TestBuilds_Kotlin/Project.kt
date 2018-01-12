package DevOps_TestBuilds_Kotlin

import DevOps_TestBuilds_Kotlin.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "e64a3d73-9327-4270-97ba-6db5db8ced12"
    id = "DevOps_TestBuilds_Kotlin"
    parentId = "DevOps_TestBuilds"
    name = "Kotlin_Test"

    buildType(DevOps_TestBuilds_Kotlin_KotlinBuild)

    features {
        versionedSettings {
            id = "PROJECT_EXT_7"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = "GithubJim"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
