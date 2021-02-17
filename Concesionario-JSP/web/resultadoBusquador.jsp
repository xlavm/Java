<%-- 
    Document   : resultadoBusquador
    Created on : 14-ago-2018, 15:11:29
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
                            <li class="breadcrumb-item"><a href="#" class="trsn" title="Go back to Home">Inicio</a></li>
                            <li class="breadcrumb-item"><span>Busqueda</span></li>
                        </ol>
                    </section>
                </div>
            </section>

            <div class="container">
                <!-- Page Heading -->
                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <h1 class="page-header">Resultado de Busqueda</h1>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                <c:forEach var="c" items="${vehiculos}">

                    <c:if test = "${parametro == c.mat}">

                        <!--div de imagen-->
                        <div class="col-sm-12 col-md-12 col-lg-6 mb-4">
                            <div class="">
                                <div class="main-product-image">
                                    <!--mostramos la imagen de cada carro que este en la bd--->
                                    <img src="getImage.jsp?mat=${c.mat}" width="50%"/> 
                                </div>
                            </div>
                        </div>
                        <!--fin de div de imagen-->

                        <div class="col-sm-12 col-md-12 col-lg-6">
                            <form action="" accept-charset="UTF-8" method="post" id="details">  <div id="customer_details">
                                    <h4 class="title">Detalle de Consulta</h4>
                                    <div id="customer_contacts">
                                        <div id="contacts_phone" class="field text-field">
                                            <label for="customer_phone">Matricula </label>
                                            <input type="text" name="mat" value="${c.mat}" id="mat" class="text" readonly="true" />
                                        </div>

                                        <div id="contacts_phone" class="field text-field">
                                            <label for="customer_phone">Marca </label>
                                            <input type="text" name="marca" value="${c.marca}" id="marca" class="text" readonly="true" />
                                        </div>

                                        <div id="contacts_phone" class="field text-field">
                                            <label for="customer_phone">Modelo </label>
                                            <input type="text" name="modelo" value="${c.modelo}" id="modelo" class="text" readonly="true" />
                                        </div>

                                        <div id="contacts_phone" class="field text-field">
                                            <label for="customer_phone">Precio </label>
                                            <input type="text" name="valor" value="${c.valor}" id="valor" class="text" readonly="true" />
                                        </div>

                                    </div>
                                    <div id="customer_additional_fields" class="row">
                                    </div>
                                </div>
                            </form>
                            <c:set var = "entro" value = "${1}"/>
                        </c:if> 
                    </c:forEach>

                    <c:if test = "${entro !=1}">

                        <h4>No hay resultados para su busqueda</h4>
    
                    </c:if>                    

                    <script type="text/javascript">
                        $('#product-sharing a').click(function () {
                            return !window.open(this.href, 'Share', 'width=640,height=300');
                        });
                    </script>
                </div>                    
            </div>
        </div>
        <script type="text/javascript">
            $(document).ready(function () {
                $('#product-carousel').carousel({interval: false});
                $('.thumbs').click(function (e) {
                    e.preventDefault();
                    $("#product-carousel").carousel(parseInt($(this).attr('data-image')) - 1);
                });
                $("#product-link").click(function () {
                    $(this).select();
                });
            });
        </script>
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

