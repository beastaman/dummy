def repo = "PSTrainingWeek1"
pipeline{
    agent any
    stages{
        stage('Git clone'){
            steps{
                sh """
                if [ -d "${repo}" ]; then
                  rm -r "${repo}"
                fi
                git clone git@github.com:nikhil19rathore99/${repo}.git
                """ 
                dir("${repo}") {
                    sh '''git checkout dev'''
                }
            }
        }
        stage('Build'){
            steps{
                dir("${repo}/projectadd") {
                    sh """mvn clean install"""
                }
            }
        }
        stage('Package'){
            steps{
                dir("${repo}/projectadd") {
                    sh """mvn package"""
                }
            }
        }
        stage('Test'){
            steps{
                dir("${repo}/projectadd/target") {
                    sh """java -cp projectadd-1.0-SNAPSHOT.jar com.sapient.App"""
                }
            }
        }
    }
}
