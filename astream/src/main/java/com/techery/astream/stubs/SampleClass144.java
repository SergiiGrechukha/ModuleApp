package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass144 {

    @Ignore    private SampleClass145 sampleClass;

    public SampleClass144(){
        sampleClass = new SampleClass145();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}