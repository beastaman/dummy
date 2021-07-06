pipeline {
    agent any
    
    stages {
        stage ('Initialize') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage ('Test') {
            steps {
                sh 'mvn test'
            }
        }
	stage ('Build') {
            steps {
                sh 'mvn package'
            }
        }

	stage ('Deploy') {
            steps {
		sh 'java -cp target/projectadd-1.0-SNAPSHOT.jar com.sapient.App'
            }
        }
	

    }
}
