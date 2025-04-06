pipeline {
    agent any
    tools{
        maven 'Maven installation'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/pgourish87/devops-automation']])
                bat 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t pgourish87/devops-integration .'
                }
            }
        }
        stage('Push Image to docker Hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhub-password', variable: 'dockerhubpwd')]) {
                        bat 'docker login -u pgourish87 -p ${dockerhubpwd}'
                }
                        bat 'docker push pgourish87/devops-integration'
            }
        }
    }
}
}