package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass77 {

    @Ignore    private SampleClass78 sampleClass;

    public SampleClass77(){
        sampleClass = new SampleClass78();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}