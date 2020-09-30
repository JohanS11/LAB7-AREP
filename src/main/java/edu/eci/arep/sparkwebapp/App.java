package edu.eci.arep.sparkwebapp;

import spark.Request;
import spark.Response;

import static spark.Spark.*;

/**
 * This is a simple WebApplication deployed in Heroku using SparkWeb.
 * @author Johan Arias
 */
public class App 
{
    public static void main( String[] args )
    {
        port(5000);
        get("/inputdata", App::inputDataPage);
    }

    /**
     * @param req This is the object that represents the HTTP request
     *            in order to retrieve a resource from the web server.
     * @param res This is the object that represents the HTTP response
     *            given by the webserver
     * @return A string with html code that will build the web page, in this case
     *          the resource located at /inputdata
     */
    private static String inputDataPage(Request req, Response res) {
        return "";
    }

    /**
     * This method reads the default port as specified by the PORT variable in
     * the environment.
     *
     * Heroku provides the port automatically so you need this to run the
     * project on Heroku.
     */


}
