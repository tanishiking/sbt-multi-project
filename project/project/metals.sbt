// DO NOT EDIT! This file is auto-generated.

// This plugin enables semantic information to be produced by sbt.
// It also adds support for debugging using the Debug Adapter Protocol
resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
addSbtPlugin("org.scalameta" % "sbt-metals" % "0.11.2+32-536ff4b1-SNAPSHOT")

// This plugin makes sure that the JDI tools are in the sbt classpath.
// JDI tools are used by the debug adapter server.

addSbtPlugin("org.scala-debugger" % "sbt-jdi-tools" % "1.1.1")

