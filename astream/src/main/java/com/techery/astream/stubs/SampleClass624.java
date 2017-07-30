package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass624 {

    @Ignore    private SampleClass625 sampleClass;

    public SampleClass624(){
        sampleClass = new SampleClass625();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}