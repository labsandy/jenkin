pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello santhosh'
            }
            
        }
         stage('Build') {
            steps {
                echo 'Hello World'
            }
            
        }
         stage('Deploy') {
            steps {
                echo 'Hello World'
            }
            
        }
         stage('Test') {
            steps {
                echo 'Hello World'
            }
            
        }
         stage('Releace') {
            steps {
                echo 'Hello World'
            }
            
        }
    }
}
