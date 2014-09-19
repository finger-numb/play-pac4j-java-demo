name := "play-pac4j-java-demo"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "org.pac4j" % "play-pac4j_java" % "1.3.0-SNAPSHOT",
  "org.pac4j" % "pac4j-http" % "1.6.0-RC2-SNAPSHOT",
  "org.pac4j" % "pac4j-cas" % "1.6.0-RC2-SNAPSHOT",
  "org.pac4j" % "pac4j-openid" % "1.6.0-RC2-SNAPSHOT",
  "org.pac4j" % "pac4j-oauth" % "1.6.0-RC2-SNAPSHOT",
  "org.pac4j" % "pac4j-saml" % "1.6.0-RC2-SNAPSHOT"
)

resolvers ++= Seq(
    "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository",
    "Sonatype snapshots repository" at "https://oss.sonatype.org/content/repositories/snapshots/"
)

