package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass749 {

    @Ignore    private SampleClass750 sampleClass;

    public SampleClass749(){
        sampleClass = new SampleClass750();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}