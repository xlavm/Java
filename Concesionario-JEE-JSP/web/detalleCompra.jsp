<%-- 
    Document   : detalleCompra
    Created on : 14-ago-2018, 15:15:12
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
                            <li class="breadcrumb-item"><span>Compra</span></li>
                        </ol>
                    </section>
                </div>
            </section>

            <div class="container">
                <!-- Page Heading -->
                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <h1 class="page-header">Comprar Auto</h1>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                    <div class="col-sm-12 col-md-12 col-lg-6 mb-4">
                        <!-- There's only One image -->
                        <div class="">
                            <div class="main-product-image">
                                <!--mostramos la imagen-->
                                <img src="getImage.jsp?mat=${param.mat}" width="50%"/>
                        </div>
                    </div>
                </div>


                <div class="col-sm-12 col-md-12 col-lg-6">


                    <c:if test = "${param.accion == 'comprar'}">
                        <form action="VentasServlet?action=comprar" accept-charset="UTF-8" method="post" id="comprar">  <div id="customer_details">
                                <h4 class="title">Detalle del Auto</h4>
                                <div id="customer_contacts">
                                    <div id="contacts_phone" class="field text-field">
                                        <label for="customer_phone">Matricula </label>
                                        <input type="text" name="mat" value="${param.mat}" id="doc" class="text" readonly="true" />
                                    </div>                                                    
                                    <div id="contacts_phone" class="field text-field">
                                        <label for="customer_phone">Marca </label>
                                        <input type="text" name="marca" value="${param.marca}" id="nombre" class="text" readonly="true" />
                                    </div>                                                    
                                    <div id="contacts_phone" class="field text-field">
                                        <label for="customer_phone">Modelo </label>
                                        <input type="text" name="modelo" value="${param.modelo}" id="telefono" class="text" readonly="true" />
                                    </div>                                                    
                                    <div id="contacts_phone" class="field text-field">
                                        <label for="customer_phone">Valor </label>
                                        <input type="text" name="valor" value="${param.valor}" id="username" class="text" readonly="true" />
                                    </div>  
                                    <div id="contacts_phone" class="field text-field">
                                        <label for="customer_phone">Cantidad </label>
                                        <input type="text" name="cantidad" value=""  class="text" required="required"   />
                                    </div>
                                    <div id="contacts_phone" class="field text-field">
                                        <label for="customer_phone">Documento del Cliente</label>
                                        <input type="text" name="doc" value="" id="doc" class="text" required="required" maxlength="10"/>
                                    </div> 
                                </div>
                                <div id="customer_additional_fields" class="row">
                                </div>
                                <div class="actions">
                                    <input type="submit" value="Realizar Compra" class="button" id="comprar" />
                                </div>
                            </div>
                        </form>
                    </c:if>     


                    <c:if test = "${param.accion == 'editar'}">
                        <form action="VentasServlet?action=editarCompra" accept-charset="UTF-8" method="post" id="comprar">  <div id="customer_details">
                                <h4 class="title">Detalle del Auto</h4>
                                <div id="customer_contacts">
                                    <div id="contacts_phone" class="field text-field">
                                        <label for="customer_phone">Matricula </label>
                                        <input type="text" name="mat" value="${param.mat}" id="doc" class="text" readonly="true" />
                                    </div>                                                    
                                    <div id="contacts_phone" class="field text-field">
                                        <label for="customer_phone">Marca </label>
                                        <input type="text" name="marca" value="${param.marca}" id="nombre" class="text" readonly="true" />
                                    </div>                                                    
                                    <div id="contacts_phone" class="field text-field">
                                        <label for="customer_phone">Modelo </label>
                                        <input type="text" name="modelo" value="${param.modelo}" id="telefono" class="text" readonly="true" />
                                    </div>                                                    
                                    <div id="contacts_phone" class="field text-field">
                                        <label for="customer_phone">Valor </label>
                                        <input type="text" name="valor" value="${param.valor}" id="username" class="text" readonly="true" />
                                    </div>  
                                    <div id="contacts_phone" class="field text-field">
                                        <label for="customer_phone">Cantidad </label>
                                        <input type="text" name="cantidad" value=""  class="text" required="required"   />
                                    </div>
                                    <div id="contacts_phone" class="field text-field">
                                        <label for="customer_phone">Documento del Cliente</label>
                                        <input type="text" name="doc" value="" id="doc" class="text" required="required" maxlength="10"/>
                                    </div> 
                                </div>
                                <div id="customer_additional_fields" class="row">
                                </div>
                                <div class="actions">
                                    <input type="submit" value="Editar Compra" class="button" id="comprar" />
                                </div>
                            </div>
                        </form>
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

