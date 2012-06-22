<html>
<head>
    <title>Leapfin: Add Contact</title>
    <meta name="layout" content="main"/>
</head>

<body>
<div id="main-content" class="well span7 form-bg">
    <div id="page_header">
        <h4>Add a new person</h4>
    </div>
    <div id="primary_fields">
        <g:form controller="contact" action="addPerson" method="POST">
            <div class="form_row">
                <label for="firstName">First Name</label>
                <g:textField name="firstName" placeholder="Add a first name"/>
            </div>

            <div class="form_row">
                <label for="lastName">Last Name</label>
                <g:textField name="lastName" placeholder="Add a last name"/>
            </div>

            <div class="form_row">
                <label for="title">Title</label>
                <g:textField name="title" placeholder="Add a title"/>
            </div>

            <div class="form_row">
                <label for="companyName">Company</label>
                <g:textField name="companyName" placeholder="Add a company"/>
            </div>
            <hr>
            <g:render template="/parts/contactForm" />

            <hr>
            <div class="form_row">
                <input id="addPersonBtn" type="submit" value="Add Person" />

            </div>
        </g:form>
    </div>
</div>

</body>
</html>