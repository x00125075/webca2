package controllers;

import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory f) {
        this.formFactory = f;
    }

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result addReview() {
        Form<Review> addReviewForm = formFactory.form(Review.class);
        return ok(addReview.render(addReviewForm));
    }

    public Result addReviewSubmit(){
        Form<Review> newReviewForm = formFactory.form(Review.class).bindFromRequest();

        if(newReviewForm.hasErrors()) {
            return badRequest(addReview.render(newReviewForm));
        }

    Review newReview = newReviewForm.get();

    newReview.save();

    flash("success", "Review has been created");

    return redirect(controllers.routes.HomeController.reviews());
    }
    
    public Result index() {
        return ok(index.render("a"));
    }

    public Result irishBeaches() {
        return ok(irishBeaches.render("a"));
    }

    public Result otherResorts() {
        return ok(otherResorts.render("a"));
    }

    public Result aboutUs() {
        return ok(aboutUs.render("a"));
    }

    public Result inchydoney() {
        return ok(inchydoney.render("a"));
    }
    
    public Result derrynane() {
        return ok(derrynane.render("a"));
    }
    public Result curracloe() {
        return ok(curracloe.render("a"));
    }
    public Result inch() {
        return ok(inch.render("a"));
    }
    public Result bannastrand() {
        return ok(bannastrand.render("a"));
    }
    public Result kilmurvey() {
        return ok(kilmurvey.render("a"));
    }
    public Result fanore() {
        return ok(fanore.render("a"));
    }
    public Result traban() {
        return ok(traban.render("a"));
    }
    public Result dogsbay() {
        return ok(dogsbay.render("a"));
    }
    public Result keembay() {
        return ok(keembay.render("a"));
    }
    public Result coumeenole() {
        return ok(coumeenole.render("a"));
    }
    public Result skerries() {
        return ok(skerries.render("a"));
    }
    public Result sharmelsheikh() {
        return ok(sharmelsheikh.render("a"));
    }
    public Result cancun() {
        return ok(cancun.render("a"));
    }
    public Result barbados() {
        return ok(barbados.render("a"));
    }
    public Result maldives() {
        return ok(maldives.render("a"));
    }
    public Result dominican() {
        return ok(dominican.render("a"));
    }
    public Result bali() {
        return ok(bali.render("a"));
    }
    public Result polynesia() {
        return ok(polynesia.render("a"));
    }
    public Result borabora() {
        return ok(borabora.render("a"));
    }
    public Result porquerolles() {
        return ok(porquerolles.render("a"));
    }
    public Result greece() {
        return ok(greece.render("a"));
    }
    public Result dalmatia() {
        return ok(dalmatia.render("a"));
    }
    public Result mallorca() {
        return ok(mallorca.render("a"));
    }
    

}
