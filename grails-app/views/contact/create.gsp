<html>
<head>
    <title>Leapfin: Add Contact</title>
    <meta name="layout" content="main"/>
</head>

<body>
<div id="main-content" class="well span7">
    <div id="page_header">
        <h4>Add a new person</h4>
    </div>
    <div id="primary_fields">
        <g:form controller="contact" action="addPerson" method="POST">
            <div class="form_row">
                <label for="firstName">First Name</label>
                <g:textField name="firstName"/>
            </div>

            <div class="form_row">
                <label for="lastName">Last Name</label>
                <g:textField name="lastName"/>
            </div>

            <div class="form_row">
                <label for="title">Title</label>
                <input type="text" name="title"/>
            </div>

            <div class="form_row">
                <label for="companyName">Company</label>
                <input type="text" name="companyName"/>
            </div>

            <div class="form_row">
                <input type="submit" value="Add Person" />
            </div>
            %{--<div class="form_row">--}%
                %{--<label for="title">Title</label>--}%
                %{--<div class="blank_slate"> Add a title</div>--}%
                %{--<div class="contact_method">--}%
                    %{--<input type="text" name="title"/>--}%
                %{--</div>--}%
            %{--</div>--}%
        </g:form>
    </div>
</div>

</body>
</html>