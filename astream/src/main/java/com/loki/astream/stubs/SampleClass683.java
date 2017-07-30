package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass683 {

    @Ignore    private SampleClass684 sampleClass;

    public SampleClass683(){
        sampleClass = new SampleClass684();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}