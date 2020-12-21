pipeline {
  agent any 
  tools { maven 'maven' }
  stages {
    stage('build') {
      steps {
                sh 'mvn compile -f servicebackjava_docker/pom.xml'
                sh 'mvn package -f servicebackjava_docker/pom.xml'
      }
    } 
  }
}
