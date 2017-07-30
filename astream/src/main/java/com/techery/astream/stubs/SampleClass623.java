package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass623 {

    @Ignore    private SampleClass624 sampleClass;

    public SampleClass623(){
        sampleClass = new SampleClass624();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}