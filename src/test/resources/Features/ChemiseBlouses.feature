Feature: verifier les produits de la page Chemises et Blouses
Scenario: acceder a la page Chemises et Blouses

Given L utilisateur est sur la page Chemises et Blouses
When l utilisateur clique sur le produit "BLOUSE AVEC VOLANT STYLE FOULARD"
Then l utilisateur est rediriger vers la page "BLOUSE AVEC VOLANT STYLE FOULARD" 
