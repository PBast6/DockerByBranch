pipeline {
  environment {
    registry = "pbast6/docktest"
    registryCredential = 'pbast6'
  }
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

    stage('Building image') {
      steps{
        script {
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
    stage('Deploy Image') {
      steps{
        script {
          docker.withRegistry( '', registryCredential ) {
            dockerImage.push('test')
          }
        }
      }
    }

    stage('Run Image') {
      steps{
        script {
            sh "docker stop testImage || true && docker rm testImage || true"
            dockerImage.run '-p 7000:8081 --name testImage'
        }
      }
    }
  }
}