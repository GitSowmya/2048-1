package cat.santi.ttfe.presentation.interaction.usecase;

import cat.santi.mod.interaction.AbstractUseCase;
import cat.santi.mod.interaction.UseCaseResultImpl;
import cat.santi.ttfe.Engine;
import cat.santi.ttfe.core.interaction.Interactor;
import cat.santi.ttfe.core.interaction.UseCaseResult;

/**
 * @author Santiago Gonzalez
 */
public class ResetGameUseCaseImpl extends AbstractUseCase {

    public ResetGameUseCaseImpl(Interactor interactor) {
        super(interactor);
    }

    @Override
    public UseCaseResult execute() {

        Engine.getInstance().reset();
        return new UseCaseResultImpl.Builder()
                .setSuccess(true)
                .build();
    }
}