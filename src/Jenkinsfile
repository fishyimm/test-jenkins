node('master') {
    stage('Checkout') {
        git 'https://github.com/fishyimm/test-jenkins.git'
    }

    stage('Clean and Test') {
        bat 'mvn clean test'
    }

    stage('Package') {
        bat 'mvn package'
    }

}
