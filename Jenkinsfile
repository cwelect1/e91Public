pipeline {
    agent any

    stages{
        script{
            if(env.BRANCH_NAME == 'dev'){
                stage('Build'){
                    steps {
                        sh 'echo DEV BUILD'
                    }

                }
                stage ('Deploy to staging') {
                    steps {
                        sh "echo DEV DEPLOY"
                    }
                }
            }
            else if(env.BRANCH_NAME == 'stage'){
                stage('Build'){
                    steps {
                        sh 'echo STAGE BUILD'
                    }

                }
                stage ('Deploy to staging') {
                    steps {
                        sh "echo STAGE DEPLOY"
                    }
                }
            }
            else(env.BRANCH_NAME == 'master'){
                stage('Build'){
                    steps {
                        sh 'echo MASTER BUILD'
                    }

                }
                stage ('Deploy to staging') {
                    steps {
                        sh "echo PROD DEPLOY"
                    }
                }
            }
        }
    }
}
