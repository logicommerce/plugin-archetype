module ${package} {

	requires com.logicommerce.utilities;
	requires com.logicommerce.sdk;
	requires com.fasterxml.jackson.annotation;

	provides com.logicommerce.sdk.services.DefinitionService
		with ${package}.Definition;
}
