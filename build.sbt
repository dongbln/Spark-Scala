name := "Spark-Scala-DMP"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.0"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "1.6.0"

resolvers += Resolver.mavenLocal

resolvers += Resolver.typesafeRepo("release")

resolvers += Resolver.sonatypeRepo("release")

resolvers += Resolver.sonatypeRepo("public")

test in assembly := {}

assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)