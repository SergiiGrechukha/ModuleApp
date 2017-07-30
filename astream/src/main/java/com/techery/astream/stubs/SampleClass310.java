package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass310 {

    @Ignore    private SampleClass311 sampleClass;

    public SampleClass310(){
        sampleClass = new SampleClass311();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}