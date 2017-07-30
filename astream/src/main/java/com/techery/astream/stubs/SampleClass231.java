package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass231 {

    @Ignore    private SampleClass232 sampleClass;

    public SampleClass231(){
        sampleClass = new SampleClass232();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}