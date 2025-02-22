plugins {
  id("mod.base-conventions")
}

dependencies {
  remapper("net.fabricmc:tiny-remapper:0.10.4:fat")

  compileOnly(libs.ignite)
  compileOnly(libs.mixin)

  paperweight.paperDevBundle(libs.versions.paper)
}
