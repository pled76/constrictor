name := """constrictor"""
organization := "ru.pled76"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.2"

EclipseKeys.withSource := true

libraryDependencies += guice
