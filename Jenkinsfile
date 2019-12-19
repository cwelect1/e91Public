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
                    sh "ssh -o StrictHostKeyChecking=no root@34.201.7.71 'cd e91Public && git pull origin dev && gitcheckout . && git checkout stage && git merge dev && git push '"
                }
                sleep 2
            }
        }
        
        stage('Build image') {
            app = docker.build("getintodevops/hellonode")
        }
    }
}
