pipeline {
    agent any

    tools {
        // Assurez-vous que ce nom correspond à celui configuré dans Jenkins > Tools > Maven
        maven 'maven-3'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Construction du projet...'
                // "clean package" va compiler, lancer les tests et créer le JAR
                sh 'mvn clean package -DskipTests=false'
            }
        }

        stage('Test Results') {
            steps {
                echo 'Publication des résultats de tests...'
                // Archive les rapports JUnit générés par Surefire
                junit 'target/surefire-reports/*.xml'
            }
        }

        stage('Quality') {
            steps {
                echo 'Génération du rapport de couverture...'
                // Génère le rapport JaCoCo
                jacoco(
                    execPattern: 'target/*.exec',
                    classPattern: 'target/classes',
                    sourcePattern: 'src/main/java',
                    inclusionPattern: '**/*.class'
                )
            }
        }
    }
}