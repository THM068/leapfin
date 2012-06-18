modules = {

    'app' {
        dependsOn 'bootstrap'
        resource url: 'css/main.css'

    }
    'bootstrap' {
        dependsOn 'jquery', 'jquery-ui'
        defaultBundle 'core'
        resource url: 'js/bootstrap/css/bootstrap.css'
        resource url: 'js/bootstrap/css/bootstrap-responsive.css'

        resource url: 'js/bootstrap/js/bootstrap.js'
        resource url: 'js/bootstrap/js/bootstrap-alert.js'
        resource url: 'js/bootstrap/js/bootstrap-button.js'
        resource url: 'js/bootstrap/js/bootstrap-carousel.js'
        resource url: 'js/bootstrap/js/bootstrap-collapse.js'
        resource url: 'js/bootstrap/js/bootstrap-dropdown.js'
        resource url: 'js/bootstrap/js/bootstrap-modal.js'
        resource url: 'js/bootstrap/js/bootstrap-popover.js'
        resource url: 'js/bootstrap/js/bootstrap-scrollspy.js'
        resource url: 'js/bootstrap/js/bootstrap-tab.js'
        resource url: 'js/bootstrap/js/bootstrap-tooltip.js'
        resource url: 'js/bootstrap/js/bootstrap-transition.js'
        resource url: 'js/bootstrap/js/bootstrap-typeahead.js'


        resource url: 'js/bootstrap/img/glyphicons-halflings-white.png'
        resource url: 'js/bootstrap/img/glyphicons-halflings.png'

        resource url: 'js/backbone.js'
        resource url: 'js/underscore-min.js'
    }
}