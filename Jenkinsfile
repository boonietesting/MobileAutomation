pipeline {
  agent any
  stages {
    stage('Git') {
      parallel {
        stage('Git') {
          steps {
            echo 'Start mobile testing'
            git(credentialsId: 'boonietesting', url: 'https://github.com/boonietesting/MobileAutomation', branch: 'main', poll: true)
          }
        }

        stage('Deploy Test') {
          steps {
            sleep 1
          }
        }

      }
    }

    stage('Environment Build') {
      parallel {
        stage('Environment Build') {
          steps {
            echo 'Deploy Start'
            sleep 1
          }
        }

        stage('Data Creation') {
          steps {
            sleep 2
          }
        }

      }
    }

    stage('Test') {
      parallel {
        stage('Automation Execution') {
          steps {
            sleep 3
          }
        }

        stage('Results') {
          steps {
            sleep 1
          }
        }

      }
    }

    stage('Deploy UAT') {
      steps {
        sleep 2
      }
    }

    stage('API Tests') {
      steps {
        sleep 1
      }
    }

    stage('Reports') {
      steps {
        sleep 1
      }
    }

  }
}