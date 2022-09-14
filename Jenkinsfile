pipeline {
  agent any
  stages {
    stage('Code') {
      steps {
        git(url: 'https://github.com/boonietesting/MobileAutomation.git', branch: 'main', poll: true)
      }
    }

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