package ${package};

import java.util.HashMap;
import com.logicommerce.sdk.models.PropertiesValidatorResponse;
import com.logicommerce.sdk.models.PropertyValueMap;
import com.logicommerce.sdk.services.PluginServiceException;
import com.logicommerce.sdk.services.PropertiesValidatorService;

public class PropertiesValidator implements PropertiesValidatorService {

	@Override
	public PropertiesValidatorResponse validate(PropertyValueMap properties) throws PluginServiceException {
		return new PropertiesValidatorResponse(false, new HashMap<>());
	}

}
