pipeline {
    agent any

    stages{
        stage('Build'){
            if(env.BRANCH_NAME == 'dev'){
                steps {
                    sh 'echo DEV BUILD'
                }
            }
            else if(env.BRANCH_NAME == 'stage'){
                steps {
                    sh 'echo STAGE BUILD'
                }
            }
        }
        stage ('Deploy to staging') {
            if(env.BRANCH_NAME == 'stage'){
                steps {
                    sh "echo DEV DEPLOY"
                }
            }
            else if(env.BRANCH_NAME == 'stage'){
                steps {
                    sh 'echo STAGE DEPLOY'
                }
            }
        }
    }
}
