pipeline {
    agent any

    tools {
        maven 'Maven3'
    }

    stages {

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Analyse') {
            steps {
                bat 'mvn verify site'
            }
        }

        stage('Rapports') {
            steps {
                publishHTML(target: [
                    reportDir: 'target/site/jacoco',
                    reportFiles: 'index.html',
                    reportName: 'JaCoCo'
                ])

                publishHTML(target: [
                    reportDir: 'target/site/checkstyle',
                    reportFiles: 'checkstyle.html',
                    reportName: 'Checkstyle'
                ])

                publishHTML(target: [
                    reportDir: 'target/site',
                    reportFiles: 'pmd.html',
                    reportName: 'PMD'
                ])
            }
        }
    }
}