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

<img width="943" height="945" alt="Image" src="https://github.com/user-attachments/assets/7e2b0abc-6b5d-46c9-8925-83c4bd405158" />
<img width="1919" height="566" alt="Image" src="https://github.com/user-attachments/assets/fa9c9e3d-c018-47ca-bb5c-7b7894d9ba70" />
<img width="1916" height="458" alt="Image" src="https://github.com/user-attachments/assets/5e9a8deb-d8d0-47d0-b1a5-714434978f4c" />
<img width="1918" height="944" alt="Image" src="https://github.com/user-attachments/assets/ff79d37b-24b8-42df-a8d9-e17a44d45654" />
<img width="960" height="1035" alt="Image" src="https://github.com/user-attachments/assets/7c5383f6-6aaf-4771-80db-02cdc6de6641" />
<img width="957" height="941" alt="Image" src="https://github.com/user-attachments/assets/eb055bae-ad91-44c4-9819-157625e3b360" />
