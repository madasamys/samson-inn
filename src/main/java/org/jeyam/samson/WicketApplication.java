package org.jeyam.samson;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;
import org.jeyam.samson.consumer.page.HomePage;

/**
 * Application object for your web application. If you want to run this application without deploying, run the Start class.
 *
 * @see org.wicket.mongo.Start#main(String[])
 */
public class WicketApplication extends WebApplication
{
    /**
     * @see org.apache.wicket.Application#getHomePage()
     */
    @Override
    public Class<? extends WebPage> getHomePage()
    {
        return HomePage.class;
    }

    /**
     * @see org.apache.wicket.Application#init()
     */
    @Override
    public void init()
    {
        super.init();

        // add your configuration here
    }
}
