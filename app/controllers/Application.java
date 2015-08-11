package controllers;

import org.codehaus.groovy.control.customizers.SecureASTCustomizer;

import play.mvc.Controller;
import play.mvc.With;

@With(Secure.class)
public class Application extends Controller {

    public static void index() {
        render();
    }

}