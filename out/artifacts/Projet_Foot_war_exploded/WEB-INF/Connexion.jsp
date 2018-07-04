<%--
  Created by IntelliJ IDEA.
  User: Mahmut
  Date: 17/04/2018
  Time: 09:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Europe</title>
    <link rel="stylesheet" href="css/style.css" type="text/css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        /* Remove the navbar's default rounded borders and increase the bottom margin */
        .navbar {
            margin-bottom: 50px;
            border-radius: 0;
        }

        /* Remove the jumbotron's default bottom margin */
        .jumbotron {
            margin-bottom: 0;
        }

        /* Add a gray background color and some padding to the footer */
        footer {
            background-color: #f2f2f2;
            padding: 25px;
        }
    </style>
</head>
<body>
<div class="background">
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
            <ul>
                <a>
                    <style>
                        {
                            float: right;
                            border-radius: 0;
                        }
                    </style>
                    <span class="glyphicon glyphicon-user"></span>
                </a>
            </ul>
        </div>
    </div>
    <div class="container">
        <div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
            <div class="panel panel-info" >
                <div class="panel-heading">
                    <div class="panel-title">Sign In</div>
                    <div style="float:right; font-size: 80%; position: relative; top:-10px"><a href="#">Forgot password?</a></div>
                </div>

                <div style="padding-top:30px" class="panel-body" >

                    <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>

                    <form id="loginform" class="form-horizontal" role="form">

                        <div style="margin-bottom: 25px" class="input-group">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                            <input id="login-username" type="text" class="form-control" name="username" value="" placeholder="username or email">
                        </div>

                        <div style="margin-bottom: 25px" class="input-group">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                            <input id="login-password" type="password" class="form-control" name="password" placeholder="password">
                        </div>



                        <div class="input-group">
                            <div class="checkbox">
                                <label>
                                    <input id="login-remember" type="checkbox" name="remember" value="1"> Remember me
                                </label>
                            </div>
                        </div>


                        <div style="margin-top:10px" class="form-group">
                            <!-- Button -->

                         <div class="col-sm-12 controls">
                                <a id="btn-login" href="/index" class="btn btn-success">Login  </a>


                            </div>
                        </div>



                    </form>



                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>