#aicha bargaoui
Feature: verifier la page menu 

Scenario: acceder a la page menu 

Given l utilisateur  est sur la page d acceuil
When l utilisateur clique sur le menu "SOLDES" et le sousmenu "Jupes & Pantalons"
Then  l utilisateur  est redirige vers la page "Jupes & Pantalons"


