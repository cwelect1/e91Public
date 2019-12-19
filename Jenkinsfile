pipeline {
    agent any

    stages{
        stage('Build'){
            steps {
                sh 'echo DEV BUILD'
            }
            steps {
                sh 'echo STAGE BUILD'
            }
        }
        stage ('Deploy to staging') {
            steps {
                sh "echo DEV DEPLOY"
            }
            steps {
                sh 'echo STAGE DEPLOY'
            }
        }
    }
}
