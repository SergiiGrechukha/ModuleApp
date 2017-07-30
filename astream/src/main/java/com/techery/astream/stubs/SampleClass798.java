package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass798 {

    @Ignore    private SampleClass799 sampleClass;

    public SampleClass798(){
        sampleClass = new SampleClass799();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}