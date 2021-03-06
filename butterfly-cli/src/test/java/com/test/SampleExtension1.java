package com.test;

import com.paypal.butterfly.extensions.api.Extension;
import com.paypal.butterfly.extensions.api.TransformationTemplate;

import java.io.File;
import java.util.Optional;

/**
 * @author facarvalho
 */
public class SampleExtension1 extends Extension {

    public SampleExtension1() {
        add(SampleTemplate.class);
        add(BlankTemplate.class);
    }

    @Override
    public String getDescription() {
        return "SampleExtension1 for tests purposes";
    }

    @Override
    public String getVersion() {
        return "2.0.0";
    }

    @Override
    public Optional<Class<? extends TransformationTemplate>> automaticResolution(File applicationFolder) {
        return Optional.of(SampleTemplate.class);
    }

}
