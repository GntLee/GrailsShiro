import grails.util.BuildSettings
import grails.util.Environment

// See http://logback.qos.ch/manual/groovy.html for details on configuration
appender('STDOUT', ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
//        pattern = "%level %logger - %msg%n"
        pattern = "%d{HH:mm:ss.SSS} [%thread] %-5level %logger%n>>>>>>>>>>>>%msg%n"
    }
}

root(ERROR, ['STDOUT'])

def targetDir = BuildSettings.TARGET_DIR
if (Environment.isDevelopmentMode() && targetDir) {
    appender("FULL_STACKTRACE", FileAppender) {
        file = "${targetDir}/stacktrace.log"
        append = true
        encoder(PatternLayoutEncoder) {
            pattern = "%level %logger - %msg%n"
        }
    }

    appender("DEVLOG", FileAppender) {

        file = "${targetDir}/devel.log"
        append = true
        encoder(PatternLayoutEncoder) {
            //pattern = "%level %logger - %msg%n"
            pattern = "%d{HH:mm:ss.SSS} [%thread] %-5level %logger%n>>>>>>>>>>>>%msg%n"
        }
    }

    logger("StackTrace", ERROR, ['FULL_STACKTRACE','DEVLOG'], false)

    logger 'org.apache.shiro',DEBUG, ['STDOUT','DEVLOG'], false
    logger 'grails.app.realms', DEBUG, ['STDOUT','DEVLOG'], false
    logger 'grails.app.taglibs', DEBUG, ['STDOUT','DEVLOG'], false
    logger 'grails.app.interceptors', DEBUG, ['STDOUT','DEVLOG'], false
    logger 'grails.app.controllers', DEBUG, ['STDOUT','DEVLOG'], false
    logger 'grails.app.services', DEBUG, ['STDOUT','DEVLOG'], false
}

