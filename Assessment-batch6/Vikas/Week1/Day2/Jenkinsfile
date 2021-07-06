pipeline {
    agent any
    
    stages {
        stage ('Initialize') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage ('Test') {
            steps {
                bat 'mvn test'
            }
        }
	stage ('Build') {
            steps {
                bat 'mvn package'
            }
        }

	stage ('Deploy') {
            steps {
		bat 'java -cp target/projectadd-1.0-SNAPSHOT.jar com.sapient.App'
            }
        }
	

    }
}
