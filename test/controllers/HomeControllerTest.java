package controllers;

import static org.junit.Assert.assertEquals;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.GET;
import static play.test.Helpers.route;

import org.junit.Test;
import play.Application;
import play.inject.guice.GuiceApplicationBuilder;
import play.mvc.Http;
import play.mvc.Result;
import play.test.WithApplication;

/** @author Deniz Dinchdonmez */
public class HomeControllerTest extends WithApplication {

  @Override
  protected Application provideApplication() {
    return new GuiceApplicationBuilder().build();
  }

  @Test
  public void testIndex() {

    Http.RequestBuilder request = new Http.RequestBuilder().method(GET).uri("/");

    Result result = route(app, request);
    assertEquals(OK, result.status());
  }
}
