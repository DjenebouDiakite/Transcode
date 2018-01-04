/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.transcode.servlet;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.brickred.socialauth.SocialAuthConfig;
import org.brickred.socialauth.SocialAuthManager;


/**
 *
 * @author matta
 */
@WebServlet(name = "webServletgoogle", urlPatterns = {"/cogoogle"})
public class CoGoogleServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Create an instance of SocialAuthConfgi object
        SocialAuthConfig config = SocialAuthConfig.getDefault();

        try {
            //load configuration. By default load the configuration from oauth_consumer.properties.
            //You can also pass input stream, properties object or properties file name.            
            config.load(getServletContext().getResourceAsStream("/WEB-INF/oauth_consumer.properties"));
        } catch (Exception ex) {
            Logger.getLogger(CoGoogleServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Create an instance of SocialAuthManager and set config
        SocialAuthManager manager = new SocialAuthManager();
        try {
            manager.setSocialAuthConfig(config);
        } catch (Exception ex) {
            Logger.getLogger(CoGoogleServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        //URL of YOUR application which will be called after authentication
        String successUrl = "www.google.fr";
        String url = null;
        
        try {
            // get Provider URL to which you should redirect for authentication.
            // id can have values "facebook", "twitter", "yahoo" etc. or the OpenID URL
            System.out.println("Caca !!!!!!!!!");
            url = manager.getAuthenticationUrl("google", successUrl);
            System.out.println("url :"+ url.toString());
        } catch (Exception ex) {
            Logger.getLogger(CoGoogleServlet.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("AAAAAAAAAAAAAAAAAAAA : "+url);
        }

        // Store in session
        HttpSession session = req.getSession();
        session.setAttribute("authManager", manager);
        
        resp.sendRedirect(url);
    }
    
    
}
