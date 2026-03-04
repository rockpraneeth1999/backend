pipeline {
    agent any

    stages {

        stage('Compile') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn package -DskipTests'
            }
        }

        stage('Docker Image Build') {
            steps {
                bat 'docker build -t backend-app .'
            }
        }

        stage('Run Container') {
            steps {
                bat 'docker run -d --name java-backend -p 8080:8080 backend-app'
            }
        }
    }
}