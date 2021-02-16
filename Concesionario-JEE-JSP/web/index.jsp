<%-- 
    Document   : index
    Created on : 14-ago-2018, 15:14:39
    Author     : Luis Angel
--%>

<%@page import="java.util.Base64"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html class="no-js" lang="en" xmlns="http://www.w3.org/1999/xhtml"> <!--<![endif]-->


    <!--- REDIRECCIONAR cargamos el servlet y el action para mostrar los autos de la bd en el index  --> 


    <body >
        <jsp:include page="menu.jsp"></jsp:include>


            <!-- Page Content -->

            <div id="carousel-home" class="carousel slide" data-ride="carousel">
                <!-- Wrapper for slides -->
                <div class="carousel-inner" role="listbox">
                    <div class="carousel-item active" style="background-image:url('images/slider-demo.jpg');">
                    </div>
                    <div class="carousel-item" style="background-image:url('images/slider-demo-2.jpg');">
                    </div>
                </div>

                <!-- Controls -->
                <a class="carousel-control-prev" href="#carousel-home" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carousel-home" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>

            <div class="actions" align="center">
                <a href="VehiculosServlet?action=cargarVehiculos" class="button trsn" title="Ver Vehiculos">Ver Vehiculos</a>
            </div>
            
            <!-- Page Content -->
            <div class="container">

                <!-- Products Section -->
                <div class="row">
                    <div class="col-md-12 col-sm-6 col-xs-6">
                        <h2 class="page-header">Nuestros Autos</h2>
                    </div>



                    <!-- mmostramos los datos del vehiculo con su respectiva imagen-->
                <c:forEach var="c" items="${vehiculos}">
                    <div class="col-6 col-md-4 product-home">    

                        <!--mostramos la imagen de cada carro que este en la bd--->
                        <img src="getImage.jsp?mat=${c.mat}" width="50%"/> 

                        <div class="caption">                                
                            <h4 class="pull-left"><a href="detalleCompra.jsp?mat=${c.mat}&marca=${c.marca}&modelo=${c.modelo}&valor=${c.valor}&foto=${c.foto}?vehiculo=${vehiculos}&accion=comprar">${c.marca}</a></h4>
                            <h4 class="pull-right price-mob">
                                <span class="product-block-not-available">${c.valor}</span>
                            </h4>
                            <div class="clearfix"></div>
                            <p class="product-block-description hidden-sm-down">
                                Para Realizar una Compra Dale Click a la Marca
                            </p>
                        </div>
                    </div>
                </c:forEach>                                 

                    
            </div><!-- /.row -->
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

