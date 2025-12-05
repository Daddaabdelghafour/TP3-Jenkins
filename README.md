# TP3 : Mise en Place d'un Pipeline d'Intégration Continue avec Jenkins

École Nationale des Sciences Appliquées de Marrakech (ENSAM)**  
Filière : Génie Informatique  
Module : Ingénierie Logicielle  
Professeur : M. BOUARIFI Walid  
Auteur : Abdelghafour DADDA

---

## 📋 Description du Projet

Ce projet illustre la mise en œuvre d'une chaîne d'intégration continue (CI/CD) complète pour une application Spring Boot. L'objectif principal est d'automatiser le cycle de vie du développement logiciel, de la compilation à l'analyse de la qualité du code.

L'application métier est un Système de Gestion de Bibliothèque (Library Management System) permettant de gérer des livres, des membres et des emprunts.

## 🛠️ Stack Technique

Le projet repose sur une stack moderne et conteneurisée :

*   Langage :** Java 17
*   Framework :** Spring Boot 2.7 / 3.x (JPA, Web)
*   Build Tool :** Maven
*   Base de Données :** H2 (In-Memory Database pour les tests)
*   CI Server : Jenkins (hébergé sur Docker)
*   Qualité de Code : JaCoCo (Java Code Coverage) & JUnit 5
*   Version Control : Git & GitHub

---

## 🚀 Architecture du Pipeline (Jenkinsfile)

Le pipeline est défini "as code" via le fichier `Jenkinsfile` situé à la racine. Il exécute les étapes suivantes séquentiellement :

1.  Checkout SCM : Récupération automatique de la dernière version du code depuis GitHub.
2.  Build & Test :
    *   Compilation du projet (`mvn clean compile`).
    *   Exécution des tests unitaires (`mvn test`).
    *   Packaging de l'application (`mvn package`).
3.  Quality Analysis : Génération du rapport de couverture de code avec JaCoCo.
4.  Reporting :
    *   Publication des résultats des tests JUnit dans l'interface Jenkins.
    *   Archivage des rapports de couverture.

---

## ⚙️ Installation et Démarrage

### Prérequis
*   Docker Desktop installé.
*   Git installé.

### 1. Lancement de l'environnement Jenkins
Le projet inclut une configuration Docker Compose pour déployer un serveur Jenkins prêt à l'emploi.

# À la racine du projet
docker-compose up -d


### screenhsots
