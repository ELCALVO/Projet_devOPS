# Projet_devOPS : PyToJava for Pandas

[![Build and Tests](https://github.com/ELCALVO/Projet_devOPS/actions/workflows/maven.yml/badge.svg?branch=main&event=push)](https://github.com/ELCALVO/Projet_devOPS/actions/workflows/maven.yml)

### Description et Objectif

Ce dépôt fait l'objet d'un projet universitaire ayant pour objectif de développer une version java de la bibliothèque Pandas développée en python, et ce, en utilisant la technique de déploiement qui nous semble la mieux adaptée.

### Utilisation des technologies

Outil de couverture de code : Jacoco
Intégration continue : Maven
Tests unitaires : JUnit 
Validation des tests : Github CI

### Méthodologie du workflow
On a suivi le Workflow : 
- La branche master de notre répertoire doit toujours être déployable
- On utilisera le concept de feature branch pour les développements annexes.
- Il est impossible de push directement sur le master : il est nécessaire de passer par une pull request qui sera vérifiée par un autre membre de l'équipe de développement. Pour vérifier que tous les tests sur le code sont passés avant de merge, on utilisera un mvn verify?. Le merge sur la branche master sera suivi d'un merge deploy? pour tester son déploiement. 
- Les merges et pulls requests seront effectuées régulièrement

### Constructeurs
Pour notre DataFrame, nous avons deux constructeurs :
- Le premier constructeur est un couple composé de d'une classé générique et d'une Arraylist pour le contenu en colonne.
- Le deuxième constructeur est composé d'un fichier en format CSV qui est parsé pour être conforme au format des données voulues pour notre DataFrame

### Image Docker
 Notre image Docker lance notre programme avec un fichier test défini. On aurait aimé que notre image Docker soit générée automatiquement par le service Docker Hub automated build  lors d'un merge sur la branche master mais cela est payant.
