sap.designstudio.sdk.Component.subclass("com.github.jearn.template.Template", function() {

	this.init = function() {
		// called once to initialize component
		this.$().append("Template");
	};
	this.beforeUpdate = function() {
		// called before a property is updated (old values), e.g. to remove something displayed related to old value
	};
	this.afterUpdate = function() {
		// called after a property is updated (new values), e.g. to add something displaying related to new value
	};
	this.componentDeleted = function() {
		// called once to delete component. When something outside the scope of this component is created from this component, cleanup should follow here.
	};
});
