package ch.loway.oss.ari4java.generated.ari_1_9_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Tue Dec 19 09:55:49 CET 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * Event showing failure of a recording operation.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class RecordingFailed_impl_ari_1_9_0 extends Event_impl_ari_1_9_0 implements RecordingFailed, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Recording control object  */
  private LiveRecording recording;
 public LiveRecording getRecording() {
   return recording;
 }

 @JsonDeserialize( as=LiveRecording_impl_ari_1_9_0.class )
 public void setRecording(LiveRecording val ) {
   recording = val;
 }

/** No missing signatures from interface */
}

