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

