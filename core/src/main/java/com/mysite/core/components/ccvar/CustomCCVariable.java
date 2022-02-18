package com.mysite.core.components.ccvar;

import com.adobe.acs.commons.ccvar.ContentVariableProvider;
import org.apache.sling.api.SlingHttpServletRequest;
import org.osgi.service.component.annotations.Component;

import java.util.Map;

@Component(
        service = {ContentVariableProvider.class}
)
public class CustomCCVariable implements ContentVariableProvider {

    public static final String CUSTOM_PROP_PREFIX = "customProperty";

    public CustomCCVariable() {
    }

    public void addProperties(Map<String, Object> map, SlingHttpServletRequest request) {
        map.put(CUSTOM_PROP_PREFIX + ".customProperty", "someValue" );
    }

    public boolean accepts(SlingHttpServletRequest request) {
        return true;
    }
}
