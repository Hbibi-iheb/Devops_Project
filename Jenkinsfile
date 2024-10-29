pipeline {
    agent any
    tools {
        maven 'M2_HOME'
    }
    stages {
        stage('GIT') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/Hbibi-iheb/Devops_Project.git',
                    credentialsId: 'jenkins-example-github-pat'
            }
        }
    }
}
