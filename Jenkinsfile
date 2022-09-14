pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
        echo 'Start mobile testing'
        sh '''cd framework
mvn -Dtest=ConnectToDevice_TestCases test'''
      }
    }

    stage('Deploy') {
      steps {
        echo 'Deploy Start'
      }
    }

  }
}