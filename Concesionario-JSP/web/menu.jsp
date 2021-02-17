<%-- 
    Document   : menu
    Created on : 14-ago-2018, 15:49:03
    Author     : Luis Angel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html class="no-js" lang="en" xmlns="http://www.w3.org/1999/xhtml"> <!--<![endif]-->

    <title>Ascauto</title>
    <meta name="description" content="We are a tech oriented store with the best deals and products." />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="robots" content="follow, all" />
    <!-- Set the viewport width to device width for mobile -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <!-- Facebook Meta tags for Product -->
    <meta property="fb:app_id" content="283643215104248" />
    <meta property="og:title" content="Ascaauto" />
    <meta property="og:type" content="website" />
    <meta property="og:image" content="images/logo.jpg" />
    <meta property="og:description" content="We are a tech oriented store with the best deals and products." />
    <meta property="og:url" content="index.html" />
    <meta property="og:site_name" content="Bootstrap" />
    <meta name="twitter:card" content="summary" />

    <link rel="alternate" hreflang="en" href="#" />
    <link rel="alternate" hreflang="es-CL" href="#" />
    <link rel="alternate" hreflang="es-CO" href="#" />
    <link rel="alternate" hreflang="pt-BR" href="#" />
    <link rel="alternate" hreflang="pt-PT" href="#" />
    <link rel="alternate" hreflang="es-MX" href="#" />
    <link rel="alternate" hreflang="es" href="#" />

    <link rel="icon" href="images/favicon.png">

            <script src="js/jquery-3.1.1.min.js"></script>
            <script type="application/ld+json">
                {
                "@context": "http://schema.org/"
                ,
                "@type": "WebSite",
                "url": "http://bootstrap.jumpseller.com",
                "potentialAction": {
                "@type": "SearchAction",
                "target": "http://bootstrap.jumpseller.com/search/{search_term_string}",
                "query-input": "required name=search_term_string"
                }
                }
            </script>
            <script type="text/javascript">
                (function (i, s, o, g, r, a, m) {
                    i['GoogleAnalyticsObject'] = r;
                    i[r] = i[r] || function () {
                        (i[r].q = i[r].q || []).push(arguments)
                    }, i[r].l = 1 * new Date();
                    a = s.createElement(o),
                            m = s.getElementsByTagName(o)[0];
                    a.async = 1;
                    a.src = g;
                    m.parentNode.insertBefore(a, m)
                })(window, document, 'script', '//www.google-analytics.com/analytics.js', 'ga');

                ga('create', 'UA-12220401-1');
                ga('set', 'anonymizeIp', true);
                ga('send', 'pageview');
            </script>
            <script src="js/jumpseller-2.0.0.js" type="text/javascript" defer="defer"></script>
            <meta content="authenticity_token" name="csrf-param" /><meta content="xZQb7F7cY51Pcxbr9DCzA/DzY8Gpr+VDzS+NX1BHOqg=" name="csrf-token" />
            </head>
            
            <body>               

                <!-- Navigation -->
                <div class="fixed-top">
                    <nav class="navbar-light navbar-toggleable-md bg-faded">
                        <div class="container">
                            <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarContainer" aria-controls="navbarsContainer-1" aria-expanded="false" aria-label="Toggle navigation">
                                <span class="navbar-toggler-icon"></span>
                            </button>
                            <a href="index.jsp" title="Concesionario">
                                <img src="images/logo.jpg" class="navbar-brand store-image" alt="Bootstrap" />
                            </a>

                            <div class="collapse navbar-collapse justify-content-end" id="navbarContainer">
                                <!-- busqueda-->
                                <form id="search_mini_form" class="navbar-form float-right form-inline hidden-lg-up" action="VehiculosServlet?action=buscar"  accept-charset="UTF-8" method="post" >
                                    <input type="text" value="" name="q" class="form-control form-control-sm" placeholder="Buscar Carros" />
                                    <button type="submit" id="buscar" class="btn btn-secondary btn-sm hidden-md"><i class="fa fa-search fa-fw"></i></button>
                                </form>


                                <ul id="navbarContainerMobile" class="navbar-nav hidden-lg-up">
                                    <li class="nav-item  ">
                                        <a href="index.jsp"  title="Inicio" class="level-1 trsn nav-link" >Inicio</a>
                                    </li>   
                                    <li class="nav-item  ">
                                        <a href="vistaClientes.jsp"  title="Clientes" class="level-1 trsn nav-link" >Clientes</a>
                                    </li>
                                    <li class="nav-item  ">
                                        <a href="vistaVehiculos.jsp"  title="Vehiculos" class="level-1 trsn nav-link" >Vehiculos</a>
                                    </li>
                                    <li class="nav-item  ">
                                        <a href="vistaVentas.jsp"  title="Ventas" class="level-1 trsn nav-link" >Ventas</a>
                                    </li>
                                </ul>
                                <ul class="nav navbar-nav float-right nav-top">
                                    <li class="dropdown">
                                        <a href="#" class="dropdown-toggle trsn nav-link" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" class="nav-link">
                                            <span><i class="fa fa-globe fa-fw"></i></span>
                                            <span>Español (Colombia)</span>
                                            <span class="caret"></span>
                                        </a>
                                        <ul class="dropdown-menu">
                                            <li><a href="#" class="trsn nav-link" title="English">English</a></li>
                                            <li><a href="#" class="trsn nav-link" title="Español (Chile)">Español (Chile)</a></li>
                                            <li><a href="#" class="trsn nav-link" title="Español (Colombia)">Español (Colombia)</a></li>
                                            <li><a href="#" class="trsn nav-link" title="Português (Brasil)">Português (Brasil)</a></li>
                                            <li><a href="#" class="trsn nav-link" title="Português (Portugal)">Português (Portugal)</a></li>
                                            <li><a href="#" class="trsn nav-link" title="Español (Mexico)">Español (Mexico)</a></li>
                                            <li><a href="#" class="trsn nav-link" title="Español">Español</a></li>
                                        </ul>
                                    </li>

                                    <!-- PARTE FUNCIONAL-->
                                    <c:if test="${empty login}">
                                        <li >
                                            <a href="login.jsp" id="login-link" class="trsn nav-link" title="login">
                                                <i class="fa fa-user fa-fw"></i>
                                                <span class="customer-name">
                                                    Ingresar
                                                </span>
                                            </a>
                                        </li>

                                        <li >
                                            <a href="registroClientes.jsp" id="login-link" class="trsn nav-link" title="registro">
                                                <i class="fa fa-user fa-fw"></i>
                                                <span class="customer-name">
                                                    Registrate
                                                </span>
                                            </a>
                                        </li>
                                    </c:if>

                                    <c:if test = "${not empty login}">
                                        <li >
                                            <a  href="ClientesServlet?action=logout" id="login-link" class="trsn nav-link" title="login">
                                                <i class="fa fa-user fa-fw"></i>
                                                <span class="customer-name">
                                                    Salir
                                                </span>
                                            </a>
                                        </li>
                                    </c:if>
                                </ul> 

                                <!-- formulario de busqueda--->
                                <form action="VehiculosServlet?action=buscar"  accept-charset="UTF-8" method="post" id="search_mini_form" class="navbar-form float-right form-inline hidden-md" >
                                    <input type="text" name="busqueda" id="busqueda" class="text" value=""  placeholder="Buscar Carro"  maxlength="6" />
                                    <button type="submit" id="buscar" class="btn btn-secondary btn-sm hidden-md"><i class="fa fa-search fa-fw"></i></button>
                                </form>

                                <ul class="social list-inline hidden-lg-up">
                                </ul>
                            </div>
                        </div>
                    </nav>

                    <nav class="navbar-inverse bg-inverse navbar-toggleable-md">
                        <div class="container">
                            <div class="collapse navbar-collapse" id="navbarsContainer-2">
                                <ul class="navbar-nav mr-auto">
                                    <li class="nav-item  ">
                                        <a href="index.jsp"  title="Inicio" class="level-1 trsn nav-link" >Inicio</a>
                                    </li>

                                    <c:if test = "${not empty login}">
                                        <li class="nav-item  ">
                                            <a href="ClientesServlet?action=vistaCliente"  title="Clientes" class="level-1 trsn nav-link" >Clientes</a>
                                        </li>
                                        <li class="nav-item  ">
                                            <a href="VehiculosServlet?action=vistaVehiculo"  title="Vehiculos" class="level-1 trsn nav-link" >Vehiculos</a>
                                        </li>
                                        <li class="nav-item  ">
                                            <a href="VentasServlet?action=vistaVenta"  title="Ventas" class="level-1 trsn nav-link" >Ventas</a>
                                        </li>
                                    </c:if>                                   

                                </ul>
                                <ul class="social navbar-toggler-right list-inline">
                                </ul>
                            </div>
                        </div>
                    </nav>
                </div>
                <!-- end navigation -->

            </body>
            </html>
