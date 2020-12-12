package com.lisz.resolver;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Locale;

public class MSBResolver extends InternalResourceViewResolver {
	private static final String MSB_REDIRECT_URL_PREFIX = "msb:";

	@Override
	protected View createView(String viewName, Locale locale) throws Exception {
		// If this resolver is not supposed to handle the given view,
		// return null to pass on to the next resolver in the chain.
		if (!canHandle(viewName, locale)) {
			return null;
		}

		// Check for special "msb:" prefix.
		if (viewName.startsWith(MSB_REDIRECT_URL_PREFIX)) {
			String redirectUrl = viewName.substring(MSB_REDIRECT_URL_PREFIX.length());
			RedirectView view = new RedirectView(redirectUrl,
					isRedirectContextRelative(), isRedirectHttp10Compatible());
			String[] hosts = getRedirectHosts();
			if (hosts != null) {
				view.setHosts(hosts);
			}
			return applyLifecycleMethods(MSB_REDIRECT_URL_PREFIX, view);
		}

		// Else fall back to superclass implementation: calling loadView.
		return super.createView(viewName, locale);
	}
}
