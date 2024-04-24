plugins {
    kotlin("jvm") version "1.9.23"
    id("net.weavemc.gradle") version "1.0.0-PRE2"
}

group = "me.youded"
version = "2.0"

weave {
    configure {
        name = "Unrestricted"
        modId = "unrestricted"
        hooks = listOf(
            "me.youded.unrestricted.hooks.StaffEnableHook",
            "me.youded.unrestricted.hooks.BlacklistEnableHook",
            "me.youded.unrestricted.hooks.ReachUnrestrictHook",
            "me.youded.unrestricted.hooks.PollingrateUnrestrictHook",
            "me.youded.unrestricted.hooks.TexturePackUnrestrictHook"
        )
        mcpMappings()
    }
    version("1.8.9")
}

repositories {
    mavenCentral()
    maven("https://repo.weavemc.dev/releases")
}

dependencies {
    implementation("net.weavemc.api:common:1.0.0-PRE2")
    implementation("net.weavemc:internals:1.0.0-PRE2")
}

kotlin {
    jvmToolchain(17)
}