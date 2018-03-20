package io.osowa.anyfig;

import java.util.Arrays;
import java.util.List;

public class RootMechanism extends SequentialMechanism {

    private final List<Mechanism> policies = Arrays.asList(
        // TODO: web
        new EnvVarMechanism(),
        new PropertyMechanism(),
        new ArgsMechanism(),
        new ConstMechanism(),
        new LiteralMechanism()
    );

    @Override
    List<Mechanism> getMechanisms() {
        return policies;
    }

}
