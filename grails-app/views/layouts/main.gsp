<!DOCTYPE html>
<html>
<head>
    <title><g:layoutTitle default="Grails"/></title>
    <r:use modules="app"/>
    <g:layoutHead/>
    <r:layoutResources/>
    <g:render template="/parts/ieResources"/>
</head>

<body>
<g:render template="/parts/header"/>



<div class="navbar">
    <div class="navbar-inner">
        <div class="container">
            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>
            <a class="brand" href="#">Project name</a>

            <div class="nav-collapse">
                <ul class="nav">
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="#about">About</a></li>
                    <li><a href="#contact">Contact</a></li>
                </ul>
            </div><!--/.nav-collapse -->
        </div>
    </div>
</div>
<div class="clear"></div>
<div class="container">
    <div class="row">
        <g:render template="/parts/globalSideNav" />
        <g:layoutBody/>
        <r:layoutResources/>
    </div>

</div> <!-- /container -->
</body>
</html>

