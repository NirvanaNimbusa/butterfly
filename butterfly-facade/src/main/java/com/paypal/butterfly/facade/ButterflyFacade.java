package com.paypal.butterfly.facade;

import com.paypal.butterfly.extensions.api.Extension;
import com.paypal.butterfly.extensions.api.exception.ButterflyException;

import java.io.File;
import java.util.Set;

/**
 * Butterfly façade
 *
 * @author facarvalho
 */
public interface ButterflyFacade {

    Set<Extension> getRegisteredExtensions();

    /**
     * Transform an application
     *
     * @param applicationFolder application folder
     * @param templateClassName transformation template class name
     */
    void transform(File applicationFolder, String templateClassName) throws ButterflyException;

    /**
     * Transform an application, and also accept an additional
     * parameter with configuration
     *
     * @param applicationFolder application folder
     * @param templateClassName transformation template class name
     * @param configuration Butterfly configuration object
     */
    void transform(File applicationFolder, String templateClassName, Configuration configuration) throws ButterflyException;

}