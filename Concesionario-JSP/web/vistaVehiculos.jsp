<%-- 
    Document   : vistaClientes
    Created on : 14-ago-2018, 15:10:36
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
                            <li class="breadcrumb-item"><span>Vehiculos</span></li>
                        </ol>
                    </section>
                </div>
            </section>

            <div class="actions" align="center">
                <a href="registroVehiculos.jsp?accion=registro" class="button trsn" title="Registrar Vehiculo">Registrar Vehiculo</a>
            </div>

            <div class="container">
                <!-- Page Heading -->
                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <h1 class="page-header" align="center">Lista de Vehiculos</h1>
                    </div>
                </div>
                <!-- /.row -->

                <!-- MUESTRA EL LISTADO DE LOS VEHICULOS -->
                <section class="col-md-8 offset-sm-2 col-sm-8 col-sm-offset-2 col-xs-12 text-center">
                    <div class="card">

                        <table class="table table-striped">                                    
                            <thead>
                                <tr>
                                    <th>Matricula</th><th>Marca</th><th>Modelo</th><th>Valor</th><th>Foto</th><th>Accion</th>
                                </tr>
                            </thead>
                            <tbody>


                            <c:forEach var="c" items="${vehiculos}">
                                <tr>
                                    <th>${c.mat}</th> <th>${c.marca}</th> <th>${c.modelo}</th> <th>${c.valor}</th> <th><img src="getImage.jsp?mat=${c.mat}" width="50%"/> </th>
                                    <th><a onclick="return confirm('¿está seguro que desea eliminar el vehiculo?')" href="VehiculosServlet?action=eliminar&mat=${c.mat}">Eliminar</a> ||         
                                        <a href="registroVehiculos.jsp?mat=${c.mat}&marca=${c.marca}&modelo=${c.modelo}&valor=${c.valor}&foto=${c.foto}&accion=editar">Editar</a></th>
                                </tr>
                            </c:forEach>


                        </tbody>                                   
                    </table>



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

