
package functions;

import com.microsoft.azure.serverless.functions.ExecutionContext;
import org.springframework.cloud.function.adapter.azure.AzureSpringBootRequestHandler;


public class AzureApplicationHandler extends AzureSpringBootRequestHandler<Foo, Bar> {

    public Bar execute(Foo foo, ExecutionContext context) {
        return handleRequest(foo, context);
    }

}
