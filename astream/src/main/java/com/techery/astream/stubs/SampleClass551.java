package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass551 {

    @Ignore    private SampleClass552 sampleClass;

    public SampleClass551(){
        sampleClass = new SampleClass552();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}