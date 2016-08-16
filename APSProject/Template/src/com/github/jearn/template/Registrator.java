/**
 * 
 */
package com.github.jearn.template;

import com.github.jearn.template.impl.TemplateComponent;
import com.github.jearn.template.md.TemplateComponentMetadataProvider;
import com.sap.ip.bi.base.bundle.IActivatorBase;
import com.sap.ip.bi.zen.rt.framework.bundle.FrameworkBaseRegistrator;

/**
 * @author jearn
 *
 */
public class Registrator extends FrameworkBaseRegistrator {

	/**
	 * @param activatorBase
	 */
	public Registrator(IActivatorBase activatorBase) {
		super(activatorBase);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.sap.ip.bi.base.bundle.IRegistratorBase#initialize()
	 */
	@Override
	public void initialize() {
		addMetadata(TemplateComponentMetadataProvider.METADATA_PROVIDER_NAME,
				TemplateComponentMetadataProvider.class);

		addItem(TemplateComponent.COMPONENT_TYPE, TemplateComponent.class);
	}

}
