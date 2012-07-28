package net.nathanwells.tests



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(ContentTestController)
class ContentTestControllerTests {

    void testXml() {
        request.addHeader "Accept", "application/xml"
        controller.index()
        assert response.text == "XML Format"
    }

    void testJson() {
        request.addHeader "Accept", "application/json"

	request.getHeaders("Accept").each {
	  println it
	}
        controller.index()
        assert response.text == "JSON Format"
    }
}
