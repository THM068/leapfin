$(function() {
    $('#addPersonBtn').click(function(e){
        //e.preventDefault()
        //addUser($(this));
    })


});

function addUser(btn) {
    var form = btn.parents('form')
    var url = form.attr('action');
    var data = form.serialize()

    $.post(url, data );
}