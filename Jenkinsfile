pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                mvn clean
                mvn compile
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
    }
}