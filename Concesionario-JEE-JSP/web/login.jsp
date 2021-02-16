<%-- 
    Document   : login
    Created on : 14-ago-2018, 15:13:20
    Author     : Luis Angel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html class="no-js" lang="en" xmlns="http://www.w3.org/1999/xhtml"> <!--<![endif]-->



    <body>
        <jsp:include page="menu.jsp"></jsp:include>


        <!-- Page Content -->

        <section class="container">
            <div class="row">
                <section class="col-sm-12 col-md-12 hidden-sm-down">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="index.jsp" class="trsn" title="Go back to Home">Inicio</a></li>
                        <li class="breadcrumb-item"><span>Login</span></li>
                    </ol>
                </section>
            </div>
        </section>

        <div class="container">
            <!-- Page Heading -->
            <div class="row">
                <div class="col-md-12 col-sm-12 col-xs-12">
                    <h1 class="page-header"><small>Ingresa a</small> Ascaauto</h1>
                </div>
            </div>
            <!-- /.row -->

            <div class="row">
                <div class="col-md-6 col-sm-6 col-xs-12">
                    <div class="card mb-3">
                        <div class="card-block">



                            <form action="ClientesServlet?action=login" accept-charset="UTF-8" method="post" id="login">  <div id="credentials">
                                    <div id="credentials_email" class="field">
                                        <label for="customer_credentials_email">Username</label>
                                        <input type="text" name="username" id="customer_email" class="text"  required="required" maxlength="50"/>
                                    </div>
                                    <div id="credentials_password" class="field">
                                        <label for="customer_credentials_password">Password</label>
                                        <input type="password" name="password" id="customer_password" class="text" required="required" maxlength="50" />
                                    </div>
                                    <div class="actions">
                                        <input type="submit" value="Ingresar" class="button" id="submit_login" name="action"/>
                                        <p>
                                            <a href="#" onclick="reset_password();
                                                    return false;" id="reset_password">Recuperar Mi Contraseña</a>
                                        </p>
                                        <a href="login.jsp" onclick="resume_login();" id="resume_login" style="display:none">Login</a>
                                    </div>
                                </div>
                            </form>


                            <script type="text/javascript">

                                function reset_password() {
                                    var login_form = document.getElementById("login");
                                    login_form.action = '/customer/reset_password';
                                    document.getElementById("submit_login").value = 'Reset Password';
                                    document.getElementById("credentials_password").style.display = 'none'
                                    document.getElementById("reset_password").style.display = 'none'
                                    document.getElementById("resume_login").style.display = ''
                                }
                                function resume_login() {
                                    var login_form = document.getElementById("login");
                                    login_form.action = '/customer/create';
                                    document.getElementById("submit_login").value = 'Log In';
                                    document.getElementById("credentials_password").style.display = ''
                                    document.getElementById("resume_login").style.display = 'none'
                                    document.getElementById("reset_password").style.display = ''
                                }
                            </script>
                        </div>
                    </div>
                </div>

                <div id="customer-new" class="col-md-6 col-sm-6 col-xs-12">
                    <div class="card">
                        <div class="card-header"><h2 class="card-title">¿Aún no tienes una Cuenta?</h2></div>
                        <div class="card-block">
                            <p>Registrate gratis y disfruta de nuestros autos.</p>
                            <a href="registroClientes.jsp" class="btn btn-secondary btn-block" title="Register as Customer">
                                Registrarse
                            </a>
                        </div>  
                    </div>
                </div>
            </div>
        </div>
        <hr>

            <!-- Footer -->
            <div class="container">
                <footer>
                    <div class="row">
                        <div class="col-sm-12">
                            <p class="powerd-by">&copy; 2018 Luis Ángel Vanegas Martinez. Todos los Derechos Reservados por <a href='http://vortech.eshost.com.ar/' title='Vortech' target='_blank' rel='nofollow'>Vortech</a>.</p>
                        </div>
                    </div>
                </footer>
            </div>
            <!-- /.container -->

            <!-- Css -->
            <link rel="stylesheet" href="css/bootstrap.min.css">
                <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
                    <link rel="stylesheet" type="text/css" href="css/app.css"/>
                    <link rel="stylesheet" type="text/css" href="css/color_pickers.css"/>
                    <!-- Bootstrap Core JavaScript -->
                    <script src="js/tether.min.js"></script>
                    <script src="js/bootstrap.min.js"></script>
                    <!-- Script to Activate Tooltips -->
                    <script>
                                $(function () {
                                    $('[data-toggle="tooltip"]').tooltip()
                                    $('.carousel').carousel()
                                })
                    </script>
                    <script src="js/bootstrap-filestyle.min.js"></script>
                    <script type="text/javascript" src="js/main.js"></script>
                    </body>
                    </html>
