organization := "$package$"
scalaVersion := "2.12.8"

name := "$name$"

lazy val semod = RootProject(uri("https://github.com/smeagol74/semod.git"))

lazy val root = (project in file(".")).dependsOn(semod)