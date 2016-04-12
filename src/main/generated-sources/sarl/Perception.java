import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.core.Event;
import java.util.List;
import javax.annotation.Generated;
import org.eclipse.xtext.xbase.lib.Pure;
import tx52.environment.EnvironmentObject;
import tx52.environment.Position;
import tx52.environment.UID;

/**
 * @author Olivier
 */
@SarlSpecification("0.3")
@SuppressWarnings("all")
public class Perception extends Event {
  public final int time;
  
  public final List<EnvironmentObject> objects;
  
  public final Position pos;
  
  public final UID bodyId;
  
  public Perception(final int time, final UID bodyID, final List<EnvironmentObject> objects, final Position pos) {
    this.time = time;
    this.bodyId = bodyID;
    this.objects = objects;
    this.pos = pos;
  }
  
  @Override
  @Pure
  @Generated("io.sarl.lang.jvmmodel.SARLJvmModelInferrer")
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Perception other = (Perception) obj;
    if (other.time != this.time)
      return false;
    if (this.objects == null) {
      if (other.objects != null)
        return false;
    } else if (!this.objects.equals(other.objects))
      return false;
    if (this.pos == null) {
      if (other.pos != null)
        return false;
    } else if (!this.pos.equals(other.pos))
      return false;
    if (this.bodyId == null) {
      if (other.bodyId != null)
        return false;
    } else if (!this.bodyId.equals(other.bodyId))
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @Generated("io.sarl.lang.jvmmodel.SARLJvmModelInferrer")
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + this.time;
    result = prime * result + ((this.objects== null) ? 0 : this.objects.hashCode());
    result = prime * result + ((this.pos== null) ? 0 : this.pos.hashCode());
    result = prime * result + ((this.bodyId== null) ? 0 : this.bodyId.hashCode());
    return result;
  }
  
  /**
   * Returns a String representation of the Perception event's attributes only.
   */
  @Generated("io.sarl.lang.jvmmodel.SARLJvmModelInferrer")
  @Pure
  protected String attributesToString() {
    StringBuilder result = new StringBuilder(super.attributesToString());
    result.append("time  = ").append(this.time);
    result.append("objects  = ").append(this.objects);
    result.append("pos  = ").append(this.pos);
    result.append("bodyId  = ").append(this.bodyId);
    return result.toString();
  }
  
  @Generated("io.sarl.lang.jvmmodel.SARLJvmModelInferrer")
  private final static long serialVersionUID = -6403140481L;
}
