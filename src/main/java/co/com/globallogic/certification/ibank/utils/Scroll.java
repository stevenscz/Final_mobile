package co.com.globallogic.certification.ibank.utils;

import co.com.globallogic.certification.ibank.interactions.ScrollTarget;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class Scroll {
    private Scroll() {
        throw new IllegalStateException("Error en Scroll");
    }

    public static ScrollTarget on(Target target) {
        return (ScrollTarget) Tasks.instrumented(ScrollTarget.class, new Object[]{target});
    }


}
