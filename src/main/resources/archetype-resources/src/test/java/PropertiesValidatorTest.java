package ${package};

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import com.logicommerce.sdk.models.PropertiesValidatorResponse;
import com.logicommerce.sdk.services.PluginServiceException;

@ExtendWith(MockitoExtension.class)
class PropertiesValidatorTest {

	@InjectMocks
	private PropertiesValidator validator;

	@Test
	void validate() throws PluginServiceException {
		PropertiesValidatorResponse response = validator.validate(null);
		assertTrue(response.isValid());
	}

}
