pipeline {
    agent any

    stages {

        stage('Compile') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn package -DskipTests'
            }
        }

        stage('Docker Image Build') {
            steps {
                sh 'docker build -t backend-app .'
            }
        }

        stage('Run Container') {
            steps {
                sh 'docker run -d --name java-backend -p 8081:8081 backend-app'
            }
        }
    }
}