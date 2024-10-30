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
          stage('Deploy with Docker Compose') {
            steps {
                sh 'docker-compose up -d'
            }
        } 
          stage('Build Docker Image') {
            steps {
                script {
                    try{
                    sh 'mvn clean package -DscriptTests'
                    sh 'docker build -t iheb141/timesheet-devops:1.0.0 .'
                    } catch(e){
                     echo "Docker build failed: ${e}"
                        currentBuild.result = 'FAILURE' 
                        error("Docker image build failed")
                    }
                }
            
        }
         }
               stage('Deploy Docker Image') {
            steps {
             
                script {
                 withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                    sh 'docker login -u iheb141 -p ${dockerhubpwd}'
                 }  
                 sh 'docker push iheb141/timesheet-devops:1.0.0'
                }
            }
        }
       stage('build and test ')
        { steps{
            script{
            sh " mvn clean install"
            sh " mvn test"}
        }
        }
    stage('maven build') {
steps {
    script {
        sh "mvn package -DscriptTests=true"
    }
}
    }
    stage('SonarQube Scanner') {
            steps {
                
                    withSonarQubeEnv('sonarqube') {
                 script{
                 
                    sh "mvn sonar:sonar"
                 }


                }
                
            }
        }
        stage('nexus'){
            steps {
                script {
                  sh ' mvn deploy  '
                }
            }
        }
        
    }
}
