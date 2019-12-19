pipeline {
    agent any

    script{
            if(env.BRANCH_NAME == 'dev'){
            stages{
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
        }
        if(env.BRANCH_NAME == 'stage'){
            stages{
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
        }
        if(env.BRANCH_NAME == 'master'){
            stages{
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
