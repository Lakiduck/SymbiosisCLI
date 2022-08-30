pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                bat "mvn clean"
                bat "mvn compile"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
    }
}