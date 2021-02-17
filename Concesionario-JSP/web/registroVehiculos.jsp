<%-- 
    Document   : registroVehiculo
    Created on : 14-ago-2018, 15:12:18
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
                            <li class="breadcrumb-item"><span>Mantenimiento de Vehiculo</span></li>
                        </ol>
                    </section>
                </div>
            </section>

            <div class="container">
                <!-- Page Heading -->
                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <h1 class="page-header">Detalles del Vehiculo</h1>
                    </div>
                </div>
                <!-- /.row -->


                <!---si es vacio param.doc entonces registra, sino ingresa-->
            <c:if test = "${param.accion == 'registro'}">
                <form action="VehiculosServlet?action=agregar" accept-charset="UTF-8" method="post" id="vehiculo"> 
                    <div class="col-sm-12 col-md-12 col-lg-6">
                        <h4 class="title">Diligencie los Campos</h4>
                        <div id="customer_contacts">
                            <div id="contacts_phone" class="field text-field">
                                <label for="customer_phone">Matricula </label>
                                <input type="text" name="mat" value="" id="input1" class="text" required="required" maxlength="6" />
                            </div>
                            <div id="contacts_phone" class="field text-field">
                                <label for="customer_phone">Marca </label>
                                <input type="text" name="marca" value="" id="marca" class="text" required="required" maxlength="15" />
                            </div>
                            <div id="contacts_phone" class="field text-field">
                                <label for="customer_phone">Modelo </label>
                                <input type="text" name="modelo" value="" id="modelo" class="text" required="required" maxlength="20" />
                            </div>
                            <div id="contacts_phone" class="field text-field">
                                <label for="customer_phone">Valor </label>
                                <input type="text" name="valor" value="" id="valor" class="text" />
                            </div>
                            <input type="hidden" name="foto" value="inijniniini.jpg" class="text" readonly="true" />
                        </div>

                        <div id="customer_additional_fields" class="row">
                        </div>

                        <div class="actions">
                            <input type="submit" value="Aceptar" class="button" id="agregar" form="vehiculo"/>
                        </div>

                        <div id="customer_additional_fields" class="row">
                        </div>
                    </div>
                </form>

                <!--guardar imagen-->
                <div class="col-sm-12 col-md-12 col-lg-6">
                    <form action="GuardarImg" method="post" enctype="multipart/form-data">
                        <input type="hidden" name="matricula" id="input2" class="text" readonly="true" value="<%=request.getParameter("mat")%>" />
                        <div class="actions">   
                            <input type="file" name="image" /><br/><br/>
                            <input type="submit"value="Registrar" class="button" id="agregar"/>                       
                        </div> 
                    </form>
                </div> 
            </c:if>

            <c:if test = "${param.accion == 'editar'}">
                <form action="VehiculosServlet?action=editar" accept-charset="UTF-8" method="post" id="action" > 
                    <div class="col-sm-12 col-md-12 col-lg-6">
                        <h4 class="title">Diligencie los Campos</h4>
                        <div id="customer_contacts">
                            <div id="contacts_phone" class="field text-field">
                                <label for="customer_phone">Matricula </label>
                                <input type="text" name="mat" value="${param.mat}" id="input1" class="text" readonly="true"/>
                            </div>
                            <div id="contacts_phone" class="field text-field">
                                <label for="customer_phone">Marca </label>
                                <input type="text" name="marca" value="${param.marca}" id="marca" class="text" required="required" maxlength="15" />
                            </div>
                            <div id="contacts_phone" class="field text-field">
                                <label for="customer_phone">Modelo </label>
                                <input type="text" name="modelo" value="${param.modelo}" id="modelo" class="text" required="required" maxlength="20" />
                            </div>
                            <div id="contacts_phone" class="field text-field">
                                <label for="customer_phone">valor </label>
                                <input type="text" name="valor" value="${param.valor}" id="valor" class="text" />
                            </div>
                            <input type="hidden" name="foto" value="inijniniini.jpg" class="text" readonly="true" />
                        </div>

                        <div id="customer_additional_fields" class="row">
                        </div>

                        <div class="actions">
                            <input type="submit" value="Aceptar" class="button" id="agregar" />
                        </div>

                        <div id="customer_additional_fields" class="row">
                        </div>
                    </div>
                </form>
                <!--guardar imagen-->
                <div class="col-sm-12 col-md-12 col-lg-6">
                    <form action="GuardarImg" method="post" enctype="multipart/form-data">
                        <input type="hidden" name="matricula" id="input2" class="text" readonly="true" value="<%=request.getParameter("mat")%>" />
                        <div class="actions">   
                            <input type="file" name="image" values=""/><br/><br/>
                            <input type="submit"value="Registrar" class="button" id="agregar"/>                       
                        </div> 
                    </form>
                </div> 
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

