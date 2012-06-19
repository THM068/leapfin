grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
//grails.project.war.file = "target/${appName}-${appVersion}.war"
grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
        excludes 'org.springframework.test'
        excludes 'org.springframework.core'
        excludes 'org.springframework.aop'
        excludes 'org.springframework.aspects'
        excludes 'org.springframework.asm'
        excludes 'org.springframework.beans'
        excludes 'org.springframework.context'
        excludes 'org.springframework.context-support'
        excludes 'org.springframework.expression'
        excludes 'org.springframework.instrument'
        excludes 'org.springframework.jdbc'
        excludes 'org.springframework.jms'
        excludes 'org.springframework.orm'
        excludes 'org.springframework.oxm'
        excludes 'org.springframework.tx'
        excludes 'org.springframework.web'
        excludes 'org.springframework.webmvc'

    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()

        // uncomment the below to enable remote dependency resolution
        // from public Maven repositories
        mavenLocal()
        mavenCentral()
        mavenRepo "http://snapshots.repository.codehaus.org"
        mavenRepo "http://repository.codehaus.org"
        mavenRepo "http://download.java.net/maven/2/"
        mavenRepo "http://repository.jboss.com/maven2/"
    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.

        // runtime 'mysql:mysql-connector-java:5.1.13'
        build([group: 'org.springframework', name: 'spring-test', version: '3.0.7.RELEASE'])

        compile([group: 'org.springframework', name: 'spring-core', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-aop', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-aspects', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-asm', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-beans', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-context', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-context-support', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-expression', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-instrument', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-jdbc', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-jms', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-orm', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-oxm', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-tx', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-web', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-webmvc', version: '3.0.7.RELEASE'])

        runtime([group: 'org.springframework', name: 'spring-core', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-aop', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-aspects', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-asm', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-beans', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-context', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-context-support', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-expression', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-instrument', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-jdbc', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-jms', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-orm', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-oxm', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-tx', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-web', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-webmvc', version: '3.0.7.RELEASE'])

        test([group: 'org.springframework', name: 'spring-core', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-aop', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-aspects', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-asm', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-beans', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-context', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-context-support', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-expression', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-instrument', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-jdbc', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-jms', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-orm', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-oxm', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-tx', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-web', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-webmvc', version: '3.0.7.RELEASE'],
                [group: 'org.springframework', name: 'spring-test', version: '3.0.7.RELEASE'])
    }

    plugins {
        runtime ":resources:1.0.2"
        compile ":jquery-ui:1.8.15"
//        compile ":mongodb:1.0.0.GA"
    }
}
