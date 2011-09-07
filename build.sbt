/** Project */
name := "robospecs"

version := "0.2-SNAPSHOT"

organization := "com.github.jbrechtel"

scalaVersion := "2.9.1"

// Dependencies 
resolvers ++= Seq(
    "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository",
    "robolectric snapshots" at "http://oss.sonatype.org/content/repositories/snapshots")
				  
libraryDependencies ++= Seq(
    "com.pivotallabs" % "robolectric" % "1.0-RC5-SNAPSHOT",
    "org.specs2" %% "specs2" % "1.6.1",
    "org.specs2" %% "specs2-scalaz-core" % "6.0.1" % "test",
	"org.mockito" % "mockito-all" % "1.8.5")

// Compilation
javaSource in Test <<= baseDirectory { _ / "src" / "test" / "emptyAndroidProject" / "src" / "java"}	