import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Event;
import javax.annotation.Generated;

@SarlSpecification("0.3")
@SuppressWarnings("all")
public class RunEndOfStep extends Event {
  /**
   * Construct an event. The source of the event is unknown.
   */
  @Generated("io.sarl.lang.jvmmodel.SARLJvmModelInferrer")
  public RunEndOfStep() {
    super();
  }
  
  /**
   * Construct an event.
   * @param source - address of the agent that is emitting this event.
   */
  @Generated("io.sarl.lang.jvmmodel.SARLJvmModelInferrer")
  public RunEndOfStep(final Address source) {
    super(source);
  }
  
  @Generated("io.sarl.lang.jvmmodel.SARLJvmModelInferrer")
  private final static long serialVersionUID = 588368462L;
}
