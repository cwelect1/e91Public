pipeline {
    agent any

    stages{
        stage('Build'){
            steps {
                sh 'echo DEV BUILD'
            }
        }
        stage ('Deploy to DEV') {
            steps {
                sh "echo DEV DEPLOY"
                sshagent (credentials: ['e91user']) {
                    sh "ssh -o StrictHostKeyChecking=no root@34.201.7.71 'git pull origin dev  && git checkout . && git checkout stage && git merge dev && git push'"
                }
                sleep 2
            }
        }
    }
}
