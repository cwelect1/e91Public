pipeline {
    agent any

    stages{
        stage('Build'){
            steps {
                sh 'echo STAGE Build'
            }
        }
        stage ('Deploy to STAGE') {
            steps {
                sh "echo STAGE DEPLOY"
                //sshagent (credentials: ['e91user']) {
                //    sh "ssh -o StrictHostKeyChecking=no root@34.201.7.71 'git pull origin dev && git checkout stage && git merge dev && git push'"
                ////}
                //sleep 2
            }
        }
    }
}