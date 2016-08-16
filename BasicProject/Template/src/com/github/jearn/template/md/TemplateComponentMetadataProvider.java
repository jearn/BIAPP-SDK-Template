/**
 * 
 */
package com.github.jearn.template.md;

import com.sap.ip.bi.zen.rt.metadata.md.ZenAbstractMetadataProvider;

/**
 * @author jearn
 *
 */
public class TemplateComponentMetadataProvider extends ZenAbstractMetadataProvider {

	public static final String TYPE_TEMPLATE_COMPONENT = com.github.jearn.template.impl.TemplateComponent.COMPONENT_TYPE;
	public static final String METADATA_PROVIDER_NAME = TemplateComponentMetadataProvider.class.getCanonicalName()
			.replace(".", "_");
	/**
	 * 
	 */
	public TemplateComponentMetadataProvider() {
		// TODO Auto-generated constructor stub
	}

}
