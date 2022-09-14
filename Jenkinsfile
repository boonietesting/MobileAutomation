pipeline {
  agent any
  stages {
    stage('Git') {
      steps {
        echo 'Start mobile testing'
        git(credentialsId: 'boonietesting', url: 'https://github.com/boonietesting/MobileAutomation', branch: 'main', poll: true)
      }
    }

    stage('Test') {
      steps {
        echo 'Deploy Start'
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