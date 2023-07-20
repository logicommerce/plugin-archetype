package ${package};

import java.util.List;
import com.logicommerce.sdk.Resource;
import com.logicommerce.sdk.definition.ConnectorDefinition;
import com.logicommerce.sdk.definition.PluginDefinition;
import com.logicommerce.sdk.enums.ConnectorType;
import com.logicommerce.sdk.services.DefinitionService;
import com.logicommerce.sdk.services.PluginServiceException;

public class Definition implements DefinitionService {

	@Resource
	private PluginDefinition pluginDefinition;

	@Override
	public PluginDefinition getPluginDefinition() throws PluginServiceException {
		return this.pluginDefinition;
	}

	@Override
	public ConnectorDefinition getConnectorDefinition(ConnectorType connectorType) throws PluginServiceException {
		return this.pluginDefinition.getConnectorDefinition(connectorType);
	}

	@Override
	public List<ConnectorDefinition> getConnectorDefinitions() throws PluginServiceException {
		return this.pluginDefinition.getConnectorDefinitions();
	}

}
