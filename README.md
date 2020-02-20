# phishing
Ce projet a pour objectif d'utiliser les algorithmes de machine learning pour aider à une détection de site web de phishing efficace contre les zéros-day phishing sites. Il a été implémenté avec les technologies JEE et Python. Cependant la veuleur du travail ne réside pas en l'utilisation du modèle sur un site web (une utilisation qui n'est pas encore finie, voir la section manquements); mais plutôt 
en la réalisation du modèle gràce à la plateforme colab.

Réalisation
-----------
L'existant du 15/02/2020 contient un modèle implémentant l'algorithme de la forêt aléatoire (random forest) réalisé à l'aide de python.
Ce choix de modèle d'implémentation ne s'est pas fait par hasard. En fait, nous avons réalisé une étude qui a montré que l'algorithme
random forest entraîné sur 80% des données du dataset en validation était plus efficace les modèles de l'arbre de décision (Decision 
Tree) et du Machine à Vecteur Support (SVM). Les liens permettant d'accéder à cette étude sont: 
https://docs.google.com/document/d/1FdDvxWiN1CCkmQyz8BJh0H3vBsxM9WypZ6gl4RVLXAk/edit?usp=sharing pour le rapport;
Et https://colab.research.google.com/drive/151-F9R8mUjVEVJq0sqrW31wAlhXqd5mg pour colab.

Références
----------
Ce travail a été réalisé en synthétisant plusieurs ressources sur le web notamment:                                  
-https://www.researchgate.net/publication/328541785_Phishing_Website_Detection_using_Machine_Learning_Algorithms            
-https://www.kaggle.com/akashkr/phishing-website-dataset                                                             
-https://www.kaggle.com/shubha23/identification-of-phishing-websites                                                   
Donc un grand merci à toutes ces personnes.

Manquements
-----------
Cependant, il y a certains manquements à améliorer plus tard à savoir:                                                          
	-Permettre de determiner dynamiquement les valeurs des features ou caractéristiques d'un URL donné en entrée par un utilisateur
plutôt qu'une définition aléatoire des caractéristiques d'un URL afin de procéder à un test rapide d'intégration de modèle;     
	-Instancier le modèle une seule fois et l'utiliser pour faire de la prédiction sur toutes les requêtes plutôt que recreer le 
modèle à chaque fois.                                                                                               
	- ....

Tester
-----
Pour tester l'execution de ce projet, il faut:                                                                         

1. Disposer d'un environnement JEE où importer le projet;                                                                
2. Disposer d'un environnement python en local permettant d'executer la commande python monFichier.py pour executer un script python 
à partir du cmd windows ou shell (non testé);                                                                     
3. Installer toutes les dépendances de modules du modèle dans (/WebContent/META-INF/model/model.py) gràce à la commande 'pip install module-name' car le projet utilise le cmd ou shell local pour executer un script python et exploiter ses outputs.   
                                                                                                                                                                      
Auteurs
-------
-Maguette DIOP, Elève Ingénieur de L'Ecole Supérieure Polytechnique de Dakar                                                             
-Mohammed THIANDOUM, Elève Ingénieur de L'Ecole Supérieure Polytechnique de Dakar