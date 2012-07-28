package net.nathanwells.tests

class ContentTestController {

    def index() {
        println request.getHeaders("Accept")
        println response.getFormat()

        withFormat {
            xml { render "XML Format" }
            json { render "JSON Format" }
        }
    }
}
