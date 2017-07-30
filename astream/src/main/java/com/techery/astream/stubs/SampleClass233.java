package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass233 {

    @Ignore    private SampleClass234 sampleClass;

    public SampleClass233(){
        sampleClass = new SampleClass234();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}