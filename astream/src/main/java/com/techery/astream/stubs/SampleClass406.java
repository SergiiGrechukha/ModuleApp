package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass406 {

    @Ignore    private SampleClass407 sampleClass;

    public SampleClass406(){
        sampleClass = new SampleClass407();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}