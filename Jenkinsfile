pipeline {
     agent any
     stages {
          stage("Compile") {
               steps {
                    echo "Compile"
                    sh "./gradlew compileJava"
               }
          }
          stage("Unit test") {
               steps {
                    echo "Unit test"
                    sh "./gradlew test"
               }
          }
          stage("Package") {
               steps {
                    sh "./gradlew build"
               }
          }
     }
}
