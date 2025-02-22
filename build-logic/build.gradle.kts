plugins {
  `kotlin-dsl`
}

dependencies {
  implementation(libs.build.paperweight)
}

dependencies {
  compileOnly(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}

java {
  sourceCompatibility = JavaVersion.VERSION_11
  targetCompatibility = JavaVersion.VERSION_11
}

kotlin {
  target {
    compilations.configureEach {
      kotlinOptions {
        jvmTarget = "11"
      }
    }
  }
}
