package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass643 {

    @Ignore    private SampleClass644 sampleClass;

    public SampleClass643(){
        sampleClass = new SampleClass644();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}