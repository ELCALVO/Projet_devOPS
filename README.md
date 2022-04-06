# Projet_devOPS : PyToJava for Pandas

## Description et Objectif

Ce dépôt fait l'objet d'un projet universitaire ayant pour objectif de développer une version java de la bibliothèque Pandas développée en python, et ce, en utilisant la technique de déploiement qui nous semble la mieux adaptée.

### Méthodologie du workflow

Il est impossible de push directement sur le master : il est nécessaire de passer par une pull request qui sera vérifiée par un autre membre de l'équipe de développement. Pour vérifier que tous les tests sur le code sont passés avant de merge, on utilisera un mvn verify?. Autrement, la pull request ne peut pas être merge. Le plugin jacoco sera également utilisé pour vérifier que la couverture de code soit d'au moins ?%. Le merge sur le master sera suivi d'un merge deploy?, pour déployer le code merge aux autres developpeurs.

