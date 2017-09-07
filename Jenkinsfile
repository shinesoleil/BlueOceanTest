pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Building......'
        sh './gradlew clean build'
      }
      post {
        always {
          junit 'build/test-results/TEST-*.xml'
          findbugs(pattern: 'build/reports/findbugs/*.xml')
        }
      }
    }
    stage('Test') {
      steps {
        parallel(
          "Test1": {
            echo 'Testing1......'
            
          },
          "Test2": {
            echo 'Testing2......'
            
          }
        )
      }
    }
    stage('Deploy') {
      steps {
        echo 'Deploying......'
      }
    }
  }
}