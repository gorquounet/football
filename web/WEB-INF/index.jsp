<%--
  Created by IntelliJ IDEA.
  User: Mahmut
  Date: 03/04/2018
  Time: 09:42
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>MiaSport</title>
  <link rel="stylesheet" href="css/style.css" type="text/css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="background">
  <div class="page">
    <div class="page">
      <div class="header">
        <ul>
          <li>
            <a href="index">Accueil</a>
          </li>
          <li>
            <a href="news">Actualités</a>
          </li>
          <li>
            <a href="team">Equipes</a>
          </li>
          <li>
            <a href="ligue">Championnat</a>
          </li>
          <li>
            <a href="europe">Coupe Europe</a>
          </li>
          <li>
            <a href="videos">Videos</a>
          </li>
          <li>
            <a href="connexion">Connexion</a>
          </li>
          <li>
            <a href="Inscription">Inscription</a>
          </li>
        </ul>
      </div>
    </div>
    <div class="body home">
      <div>
        <div class="featured">
          <div>
            <h2>Bienvenue sur MiaSport</h2>
            <p>
              Aliquam at neque diam. Nulla facilisi. Donec cursus lacus id urna mattis vestibulum. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
            </p>
          </div>
        </div>
        <div>
          <div>
            <h3>Dernières Videos</h3>
            <span><a href="videos">Voir plus de Videos</a></span>
            <!--Vidéos avec mini plugins youtube-->
            <ul>
              <li>
                <a href="videos"><img src="images/video1.jpg" alt=""></a>
                <h4>Les Ultras du PSG ont fait grève au stade mais ils ont bien célébré le titre devant la Tour Eiffel</h4>
                <p>
                  Le Parc des Princes était relativement calme dimanche soir. Malgré le 7-1, malgré le titre. Pour l’ambiance, c’est du côté de la Tour Eiffel qu’il fallait être après la rencontre.
                  C’est là que les Ultras du PSG, dont une partie ont fait grève du soutien pour protester contre la Ligue, se sont retrouvés pour chanter et allumer quelques fumis.
                </p>
              </li>
              <li>
                <a href="videos"><img src="images/video2.jpg" alt=""></a>
                <h4>Article 2.</h4>
                <p>
                  Detail de l'article numero 2
                </p>
              </li>
              <li>
                <a href="videos"><img src="images/video3.jpg" alt=""></a>
                <h4>Article 3.</h4>
                <p>
                  Détail de l'article numéro 3
                </p>
              </li>
            </ul>
          </div>
          <div>
            <h3>Actualités</h3>
            <span><a href="news">En voir plus</a></span>
            <ul>
              <li>
                <a href="news"><img src="images/featured1.jpg" alt=""></a>
                <h4>Même en L1, Paris ne peut pas se passer d'un crack.</h4>
                <p>
                  Le Paris Saint-Germain a retrouvé sa suprématie sur le championnat de France au terme de la première saison de Neymar dans la capitale.
                  Il l'avait perdue au moment du départ de Zlatan Ibrahimovic. Ce n'est pas forcément un hasard si
                  le PSG a repris sa domination sur la L1 avec l'arrivée d'un autre méga-star dans son effectif..
                </p>
              </li>
              <li>
                <a href="news"><img src="images/featured2.jpg" alt=""></a>
                <h4>Actualité 4 .</h4>
                <p>
                  Détail de l'article numéro 4
                </p>
              </li>
              <li>
                <a href="news"><img src="images/featured3.jpg" alt=""></a>
                <h4>Actualité 5 </h4>
                <p>
                  Détail de l'article numéro 5
                </p>
              </li>
            </ul>
          </div>
        </div>
      </div>
      <div class="sidebar">
        <div class="news">
          <span>Dernières News</span>
          <ul>
            <li>
              <a href="news">PSG Champion de France</a> <span>Publié le 17 avril 2018</span>
            </li>
            <li>
              <a href="news">Barca Eliminé</a> <span>Publié le 17 avril 2018</span>
            </li>
            <li>
              <a href="news">City Champion</a> <span>Publié le 17 avril 2018</span>
            </li>
            <li>
              <a href="news">Derby Milannais</a> <span>Publié le 17 avril 2018</span>
            </li>
            <li>
              <a href="news">Interview Muller</a> <span>Publié le 17 avril 2018</span>
            </li>
            <li>
              <a href="news">Pogba décisif</a> <span>Publié le 17 avril 2018</span>
            </li>
            <li>
              <a href="news">Fekir de retour</a> <span>Publié le 17 avril 2018</span>
            </li>
          </ul>
          <a href="news">En voir plus</a>
        </div>
        <div class="section">
          <span>Agenda</span>
          <ul>
            <li>
              <a href="ligue">PSG VS OL</a> <span>23 July 2023 @ 9AM</span>
            </li>
            <li>
              <a href="ligue">Liverpool VS Arsenal</a> <span>23 July 2023 @ 9AM</span>
            </li>
            <li>
              <a href="ligue">Schalke 04 VS Dortmund</a> <span>23 July 2023 @ 9AM</span>
            </li>
            <li>
              <a href="ligue">Juventus VS Milan AC</a> <span>23 July 2023 @ 9AM</span>
            </li>
            <li>
              <a href="ligue">Fc Barcelone VS Real Madrid</a> <span>23 July 2023 @ 9AM</span>
            </li>
          </ul>
          <a href="ligue">Voir Calendrier</a>
        </div>
        <div>
          <span>Derniers Tweets</span>
          <ul>
            <li>
              <p>
                <a href="#">Enorme Match de Kylian Mbappe.</a>
              </p>
            </li>
            <li>
              <p>
                <a href="#">Coup-franc sensationnel de Messi</a>
              </p>
            </li>
            <li>
              <p>
                <a href="#">14ème but de Cristiano Ronaldo en ligue des champions ! Enorme.</a>
              </p>
            </li>
          </ul>
          <a href="http://freewebsitetemplates.com/go/twitter/">Follow @MiaSport <br> on Twitter</a>
        </div>
      </div>
    </div>
    <div class="footer">
      <div>
        <p>
          &#169; MiaSport. All Rights Reserved
        </p>
      </div>
      <div class="connect">
      </div>
    </div>
  </div>
</div>
</body>
</html>