# TP sur SpringBoot - Dev Avancée R6.05 - Alexandre Meunier



Rendez-vous sur http://localhost:8080/ pour vérifier que le serveur a démarré mais qu'une page d'erreur s'affiche (en effet rien n'indique la page racine / à utiliser).

    En effet, le serveur a bien démarré, mais une erreur s'est produite. La page retourne l'erreur 404

Est-ce que l'une des pages suivantes est visible :
- http://localhost:8080/template1.html
- http://localhost:8080/plain.html


      La page temple1.html renvoie une erreur 404.
      Cependant, la page plain.html apparait correctement avec le contenue. Cela veut dire que les fichiers html dans le répertoire static sont comme des vues qui peuvent être appelé à tout moment


A quoi correspond la chaîne renvoyé par la méthode getTemplate1() ?

    La chaine renvoyé par cette fonction correspond au template à afficher. 
    Donc cela va chercher le template1.html dans le répertoire templates.

Est-il absolument nécessaire que la méthode s'appelle getTemplate1() ?

    Non, la méthode n'a pas d'impact car c'est l'annotation RequestMapping qui associe une map qui exécute la fonction getTemplate1()

Quel rôle joue la page template1.html ?

    Son role est d'afficher du html quand elle est appelé par le controller
