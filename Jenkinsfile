pipeline {
    agent any

    stages {

        stage('Compile') {
            mvn clean compile
        }

        stage('Test') {
            steps {
                mvn test
            }
        }

        stage('Build') {
            mvn package
        }

        stage('Docker Image Build') {
            sh 'docker build -t backend-app'
        }

        stage('Run container') {
            sh 'docker run -d --name java-backend -p 8081:8081 backend-app'
        }
    }
}