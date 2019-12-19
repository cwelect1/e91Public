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
                    sh "ssh -o StrictHostKeyChecking=no root@34.201.7.71 'cd e91Public && git pull origin dev && git checkout dev && git checkout stage && git branch && git status && git merge dev && git push && docker build . -t devnode && docker run -p 80:80 devnode'"
                }
                sleep 2
            }
        }
    }
}
