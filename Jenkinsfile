 pipeline {
    agent any
    tools {
        maven 'M2_HOME'
    }
    stages {
        stage('GIT') {
            steps {
                git branch: 'refs/heads/Mohamed\\ Sahraoui\\ Guesmi',
                    url: 'https://github.com/Hbibi-iheb/Devops_Project',
                    credentialsId: 'jenkins-example-github-pat'
            }
        }
    }
}
