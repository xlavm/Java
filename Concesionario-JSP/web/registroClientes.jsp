<%-- 
    Document   : registroClientes
    Created on : 14-ago-2018, 15:12:57
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
                            <li class="breadcrumb-item"><span>Mantenimiento Cliente</span></li>
                        </ol>
                    </section>
                </div>
            </section>

            <div class="container">
                <!-- Page Heading -->
                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <h1 class="page-header"> Detalles del Cliente</h1>
                    </div>
                </div>
                <!-- /.row -->
                <div class="row">
                    <div class="col-sm-12">
                        <div class="card">
                            <div class="card-block">




                                <!---si es vacio param.doc entonces registra, sino ingresa-->
                            <c:if test = "${empty param.doc}">
                                <form action="ClientesServlet?action=agregar" accept-charset="UTF-8" method="post" id="details" >  <div id="customer_details">
                                        <h4 class="title">Escriba sus Datos</h4>
                                        <div id="customer_contacts">
                                            <div id="contacts_phone" class="field text-field">
                                                <label for="customer_phone">Documento </label>
                                                <input type="text" name="doc" value="" id="doc" class="text" required="required" maxlength="10" />
                                            </div>

                                            <div id="contacts_phone" class="field text-field">
                                                <label for="customer_phone">Nombre Completo </label>
                                                <input type="text" name="nombre" value="" id="nombre" class="text" required="required" maxlength="60"/>
                                            </div>

                                            <div id="contacts_phone" class="field text-field">
                                                <label for="customer_phone">Telefono </label>
                                                <input type="text" name="telefono" value="" id="telefono" class="text" required="required" maxlength="15"/>
                                            </div>

                                            <div id="contacts_phone" class="field text-field">
                                                <label for="customer_phone">Usuario </label>
                                                <input type="text" name="username" value="" id="username" class="text" required="required" maxlength="50"/>
                                            </div>

                                        </div>
                                        <div id="customer_additional_fields" class="row">
                                        </div>
                                        <div id="customer_details_password">
                                            <div id="details_password" class="field text-field">
                                                <label for="customer_details_password">Contraseña <em>*</em></label>
                                                <input type="password" name="password1" id="password1" class="text" required="required" maxlength="50" />
                                            </div>
                                            <div id="details_confirm_password" class="field text-field">
                                                <label for="customer_details_confirm_password">Confirmar Contraseña <em>*</em></label>
                                                <input type="password" name="password" id="password" class="text" required="required" maxlength="50" />
                                            </div>
                                        </div>
                                        <div class="actions">                                                   
                                            <input type="submit" value="Registrar" class="button" id="agregar"  />                                                     
                                        </div>
                                    </div>
                                </form>
                            </c:if>

                            <c:if test = "${not empty param.doc}">
                                <form action="ClientesServlet?action=editar" accept-charset="UTF-8" method="post" id="details" >  <div id="customer_details">
                                        <h4 class="title">Escriba sus Datos</h4>
                                        <div id="customer_contacts">
                                            <div id="contacts_phone" class="field text-field">
                                                <label for="customer_phone">Documento </label>
                                                <input type="text" name="doc" value="${param.doc}" id="doc" class="text" readonly="true" />
                                            </div>

                                            <div id="contacts_phone" class="field text-field">
                                                <label for="customer_phone">Nombre Completo </label>
                                                <input type="text" name="nombre" value="${param.nombre}" id="nombre" class="text" required="required" maxlength="50" />
                                            </div>

                                            <div id="contacts_phone" class="field text-field">
                                                <label for="customer_phone">Telefono </label>
                                                <input type="text" name="telefono" value="${param.telefono}" id="telefono" class="text" required="required" maxlength="50"/>
                                            </div>

                                            <div id="contacts_phone" class="field text-field">
                                                <label for="customer_phone">Usuario </label>
                                                <input type="text" name="username" value="${param.username}" id="username" class="text" required="required" maxlength="50" />
                                            </div>

                                        </div>
                                        <div id="customer_additional_fields" class="row">
                                        </div>
                                        <div id="customer_details_password">
                                            <div id="details_password" class="field text-field">
                                                <label for="customer_details_password">Contraseña <em>*</em></label>
                                                <input type="password" name="password1" id="password1" class="text" required="required" maxlength="50" />
                                            </div>
                                            <div id="details_confirm_password" class="field text-field">
                                                <label for="customer_details_confirm_password">Confirmar Contraseña <em>*</em></label>
                                                <input type="password" name="password" id="password" class="text" required="required" maxlength="50" />
                                            </div>
                                        </div>
                                        <div class="actions">                                                   
                                            <input type="submit" value="Editar" class="button" id="editar"  />                                                     
                                        </div>
                                    </div>
                                </form>
                            </c:if>



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

