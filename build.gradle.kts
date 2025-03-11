plugins {
  id("java")
  id("io.papermc.paperweight.userdev") version "2.0.0-beta.14"
}

java {
  sourceCompatibility = JavaVersion.VERSION_21
  targetCompatibility = JavaVersion.VERSION_21
  toolchain.languageVersion = JavaLanguageVersion.of(21)
}

dependencies {
  remapper("net.fabricmc:tiny-remapper:0.10.4:fat")

  compileOnly("space.vectrix.ignite:ignite-api:1.1.0")
  compileOnly("org.spongepowered:mixin:0.8.7")

  paperweight.paperDevBundle("1.21.4-R0.1-SNAPSHOT")
}
