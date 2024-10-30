pipeline {
    agent any
    tools {
        maven 'M2_HOME'
    }
    stages {
        stage('GIT') {
            steps {
                git branch: 'Hbibiiheb',
                    url: 'https://github.com/Hbibi-iheb/Devops_Project.git',
                    credentialsId: 'jenkins-example-github-pat'
            }
        }
       stage('build and test ')
        { steps{
            script{
            sh " mvn clean install"
            sh " mvn test"}
        }
        }
    /*stage('maven build') {
steps {
    script {
        sh "mvn package -DscriptTests=true"
    }
}
    }*/
    }
}
