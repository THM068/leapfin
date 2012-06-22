<div class="form_row">
    <label for="phone">Phone</label>
    <g:textField name="phone" placeholder="Add a phone number"/>
</div>

<div class="form_row">
    <label for="email">Email</label>
    <g:textField name="email" placeholder="Add an email"/>
</div>

<div class="form_row">
    <label for="email">Website</label>
    <g:textField name="website" placeholder="Add a website"/>
</div>

<div class="form_row">
    <label for="Address">Address</label>
    <g:textArea name="address" cols="5" rows="3" placeholder="Address"/>
    <p class="address-container">
        <g:textField name="city" class="address" placeholder="City"/>
        <g:textField name="state" class="address" placeholder="State/Province"/>
        <g:textField name="postCode" class="address" placeholder="Post Code"/>
    </p>

    <p class="address-container">
        <g:countrySelect name="country" noSelection="['':'-Choose a country-']"/>
    </p>
</div>